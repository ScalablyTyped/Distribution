package typings.easySpeech

import org.scalablytyped.runtime.Shortcut
import typings.easySpeech.anon.Interval
import typings.easySpeech.anon.Onboundary
import typings.easySpeech.anon.textstringvoiceSpeechSynt
import typings.std.SpeechSynthesisErrorEvent
import typings.std.SpeechSynthesisEvent
import typings.std.SpeechSynthesisVoice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("easy-speech", JSImport.Default)
  @js.native
  val default: EasySpeech = js.native
  
  trait Defaults extends StObject {
    
    var pitch: js.UndefOr[Double] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
    
    var voice: js.UndefOr[SpeechSynthesisVoice | Null] = js.undefined
    
    var volume: js.UndefOr[Double] = js.undefined
  }
  object Defaults {
    
    inline def apply(): Defaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Defaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Defaults] (val x: Self) extends AnyVal {
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setVoice(value: SpeechSynthesisVoice): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
      
      inline def setVoiceNull: Self = StObject.set(x, "voice", null)
      
      inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  /**
    * Cross browser Speech Synthesis with easy API.
    * This project was created, because it's always a struggle to get the synthesis
    * part of `Web Speech API` running on most major browsers.
    *
    * Setup is very straight forward (see example).
    *
    * @example
    * import EasySpeech from 'easy-speech'
    *
    * const example = async () => {
    *   await EasySpeech.init() // required
    *   await EasySpeech.speak({ 'Hello, world' })
    * }
    *
    * @see https://wicg.github.io/speech-api/#tts-section
    * @see https://developer.mozilla.org/en-US/docs/Web/API/SpeechSynthesis
    */
  @js.native
  trait EasySpeech extends StObject {
    
    /**
      * Cancels the current speaking, if any running
      *
      * condition: `EasySpeech.init` must have been called and resolved to `true`
      */
    def cancel(): Unit = js.native
    
    /*******************************************************************************
      *
      * AVAILABLE WITHOUT INIT
      *
      ******************************************************************************/
    /**
      * Enable module-internal debugging by passing your own callback function.
      * Debug will automatically pass through all updates to `status`
      *
      * @example
      * import EasySpeech from 'easy-speech'
      * import Log from '/path/to/my/Log'
      *
      * EasySpeech.debug(arg => Log.debug('EasySpeech:', arg))
      *
      * @param  fn A function, which always receives one argument, that
      *  represents a current debug message
      */
    def debug(fn: js.Function1[/* arg */ String, Unit]): Unit = js.native
    
    /**
      * Sets defaults for utterances. Invalid values will be ignored without error
      * or warning.
      *
      * condition: `EasySpeech.init` must have been called and resolved to `true`
      *
      * @see https://wicg.github.io/speech-api/#utterance-attributes
      * @param  options - Optional object containing values to set values
      * @param  options.voice - Optional `SpeechSynthesisVoice` instance or
      *  `SpeechSynthesisVoice`-like Object
      * @param  options.pitch - Optional pitch value >= 0 and <= 2
      * @param  options.rate - Optional rate value >= 0.1 and <= 10
      * @param  options.volume - Optional volume value >= 0 and <= 1
      *
      * @return  a shallow copy of the current defaults
      */
    def defaults(options: Defaults): Defaults = js.native
    
    /**
      * Detects all possible occurrences of the main Web Speech API components
      * in the global scope.
      *
      * The returning object will have the following structure (see example).
      *
      * @example
      * EasySpeech.detect()
      *
      * {
      *     speechSynthesis: SpeechSynthesis|undefined,
      *     speechSynthesisUtterance: SpeechSynthesisUtterance|undefined, (constructor)
      *     speechSynthesisVoice: SpeechSynthesisVoice|undefined,
      *     speechSynthesisEvent: SpeechSynthesisEvent|undefined, (constructor)
      *     speechSynthesisErrorEvent: SpeechSynthesisErrorEvent|undefined, (constructor)
      *     onvoiceschanged: Boolean,
      *     onboundary: Boolean,
      *     onend: Boolean,
      *     onerror: Boolean,
      *     onmark: Boolean,
      *     onpause: Boolean,
      *     onresume: Boolean,
      *     onstart: Boolean
      * }
      *
      * @returns  An object containing all possible features and their status
      */
    def detect(): Onboundary = js.native
    
    /**
      * This is the function you need to run, before being able to speak.
      * It includes:
      * - feature detection
      * - feature assignment (into internal state)
      * - voices loading
      * - state update
      * - inform caller about success
      *
      * It will load voices by a variety of strategies:
      *
      * - detect and that SpeechSynthesis is basically supported, if not -> fail
      * - load voices directly
      * - if not loaded but `onvoiceschanged` is available: use `onvoiceschanged`
      * - if `onvoiceschanged` is not available: fallback to timeout
      * - if `onvoiceschanged` is fired but no voices available: fallback to timeout
      * - timeout reloads voices in a given `interval` until a `maxTimeout` is reached
      * - if voices are loaded until then -> complete
      * - if no voices found -> fail
      *
      * Note: if once initialized you can't re-init (will skip and resolve to
      * `false`) unless you run `EasySpeech.reset()`.
      *
      * @return
      * fulfil:  true, if initialized, false, if skipped (because already
      *   initialized)
      * reject: The error `message` property will always begin with
      *   `EasySpeech: ` and contain one of the following:
      *
      *   - `browser misses features` - The browser will not be able to use speech
      *      synthesis at all as it misses crucial features
      *   - `browser has no voices (timeout)` - No voice could be loaded with neither
      *      of the given strategies; chances are high the browser does not have
      *      any voices embedded (example: Chromium on *buntu os')
      */
    def init(): js.Promise[Boolean] = js.native
    def init(options: Interval): js.Promise[Boolean] = js.native
    
    /**
      * Attaches global/default handlers to every utterance instance. The handlers
      * will run in parallel to any additional handlers, attached when calling
      * `EasySpeech.speak`
      *
      * condition: `EasySpeech.init` must have been called and resolved to `true`
      *
      * @param  handlers
      * @param  handlers.boundary - optional, event handler
      * @param  handlers.end - optional, event handler
      * @param  handlers.error - optional, event handler
      * @param  handlers.mark - optional, event handler
      * @param  handlers.pause - optional, event handler
      * @param  handlers.resume - optional, event handler
      * @param  handlers.start - optional, event handler
      *
      * @return  a shallow copy of the Object, containing all global handlers
      */
    def on(handlers: Handlers): Handlers = js.native
    
    /**
      * Pauses the current speaking, if any running
      *
      * condition: `EasySpeech.init` must have been called and resolved to `true`
      */
    def pause(): Unit = js.native
    
    /**
      * Resets the internal state to a default-uninitialized state
      *
      * condition: `EasySpeech.init` must have been called and resolved to `true`
      */
    def reset(): Unit = js.native
    
    /**
      * Resumes to speak, if any paused
      *
      * condition: `EasySpeech.init` must have been called and resolved to `true`
      */
    def resume(): Unit = js.native
    
    /**
      * Speaks a voice by given parameters, constructs utterance by best possible
      * combinations of parameters and defaults.
      *
      * condition: `EasySpeech.init` must have been called and resolved to `true`
      *
      * If the given utterance parameters are missing or invalid, defaults will be
      * used as fallback.
      *
      * @example
      * const voice = EasySpeech.voices()[10] // get a voice you like
      *
      * EasySpeech.speak({
      *   text: 'Hello, world',
      *   voice: voice,
      *   pitch: 1.2,  // a little bit higher
      *   rate: 1.7, // a little bit faster
      *   boundary: event => console.debug('word boundary reached', event.charIndex),
      *   error: e => notify(e)
      * })
      *
      * @param  options - required options
      * @param  options.text - required text to speak
      * @param  options.voice - optional `SpeechSynthesisVoice` instance or
      *   structural similar object (if `SpeechSynthesisUtterance` is not supported)
      * @param  options.pitch - Optional pitch value >= 0 and <= 2
      * @param  options.rate - Optional rate value >= 0.1 and <= 10
      * @param  options.volume - Optional volume value >= 0 and <= 1
      * @param  options.force - Optional set to true to force speaking, no matter the internal state
      * @param  handlers - optional additional local handlers, can be
      *   directly added as top-level properties of the options
      * @param  handlers.boundary - optional, event handler
      * @param  handlers.end - optional, event handler
      * @param  handlers.error - optional, event handler
      * @param  handlers.mark - optional, event handler
      * @param  handlers.pause - optional, event handler
      * @param  handlers.resume - optional, event handler
      * @param  handlers.start - optional, event handler
      *
      *
      * @return
      * fulfill:  Resolves to the `end` event
      * reject:  rejects using the `error` event
      */
    def speak(options: textstringvoiceSpeechSynt): js.Promise[SpeechSynthesisEvent | SpeechSynthesisErrorEvent] = js.native
    
    /**
      * Returns a shallow copy of the current internal status. Depending of the
      * current state this might return an object with only a single field `status`
      * or a complete Object, including detected features, `defaults`, `handlers`
      * and supported `voices`.
      *
      * @example
      * import EasySpeech from 'easy-speech'
      *
      * // uninitialized
      * EasySpeech.status() // { status: 'created' }
      *
      * // after EasySpeech.init
      * EasySpeech.status()
      *
      * {
      *   status: 'init: complete',
      *   initialized: true,
      *   speechSynthesis: speechSynthesis,
      *   speechSynthesisUtterance: SpeechSynthesisUtterance,
      *   speechSynthesisVoice: SpeechSynthesisVoice,
      *   speechSynthesisEvent: SpeechSynthesisEvent,
      *   speechSynthesisErrorEvent: SpeechSynthesisErrorEvent,
      *   voices: [...],
      *   defaults: {
      *     pitch: 1,
      *     rate: 1,
      *     volume: 1,
      *     voice: null
      *   },
      *   handlers: {}
      * }
      *
      * @return  the internal status
      */
    def status(): typings.easySpeech.anon.Defaults = js.native
    
    /*******************************************************************************
      *
      * AVAILABLE ONLY AFTER INIT
      * (will throw an error otherwise)
      *
      ******************************************************************************/
    /**
      * Returns all available voices.
      *
      * condition: `EasySpeech.init` must have been called and resolved to `true`
      * @return
      */
    def voices(): js.Array[SpeechSynthesisVoice] = js.native
  }
  
  trait Handlers extends StObject {
    
    var boundary: js.UndefOr[js.Function1[/* event */ SpeechSynthesisEvent, Unit]] = js.undefined
    
    var end: js.UndefOr[js.Function1[/* event */ SpeechSynthesisEvent, Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* event */ SpeechSynthesisErrorEvent, Unit]] = js.undefined
    
    var mark: js.UndefOr[js.Function1[/* event */ SpeechSynthesisEvent, Unit]] = js.undefined
    
    var pause: js.UndefOr[js.Function1[/* event */ SpeechSynthesisEvent, Unit]] = js.undefined
    
    var resume: js.UndefOr[js.Function1[/* event */ SpeechSynthesisEvent, Unit]] = js.undefined
    
    var start: js.UndefOr[js.Function1[/* event */ SpeechSynthesisEvent, Unit]] = js.undefined
  }
  object Handlers {
    
    inline def apply(): Handlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Handlers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Handlers] (val x: Self) extends AnyVal {
      
      inline def setBoundary(value: /* event */ SpeechSynthesisEvent => Unit): Self = StObject.set(x, "boundary", js.Any.fromFunction1(value))
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setEnd(value: /* event */ SpeechSynthesisEvent => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setError(value: /* event */ SpeechSynthesisErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMark(value: /* event */ SpeechSynthesisEvent => Unit): Self = StObject.set(x, "mark", js.Any.fromFunction1(value))
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setPause(value: /* event */ SpeechSynthesisEvent => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setResume(value: /* event */ SpeechSynthesisEvent => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction1(value))
      
      inline def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
      
      inline def setStart(value: /* event */ SpeechSynthesisEvent => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  type _To = EasySpeech
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: EasySpeech = default
}
