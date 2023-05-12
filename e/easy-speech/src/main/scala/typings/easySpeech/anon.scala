package typings.easySpeech

import typings.easySpeech.mod.Handlers
import typings.std.SpeechSynthesis
import typings.std.SpeechSynthesisErrorEvent
import typings.std.SpeechSynthesisEvent
import typings.std.SpeechSynthesisVoice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Defaults extends StObject {
    
    var defaults: js.UndefOr[typings.easySpeech.mod.Defaults] = js.undefined
    
    var handlers: js.UndefOr[Handlers] = js.undefined
    
    var initialized: js.UndefOr[Boolean] = js.undefined
    
    var speechSynthesis: js.UndefOr[SpeechSynthesis] = js.undefined
    
    var speechSynthesisErrorEvent: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpeechSynthesisErrorEvent */ Any
      ] = js.undefined
    
    var speechSynthesisEvent: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpeechSynthesisEvent */ Any
      ] = js.undefined
    
    var speechSynthesisUtterance: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpeechSynthesisUtterance */ Any
      ] = js.undefined
    
    var speechSynthesisVoice: js.UndefOr[SpeechSynthesisVoice] = js.undefined
    
    var status: String
    
    var voices: js.UndefOr[js.Array[SpeechSynthesisVoice]] = js.undefined
  }
  object Defaults {
    
    inline def apply(status: String): Defaults = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Defaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Defaults] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: typings.easySpeech.mod.Defaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setHandlers(value: Handlers): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      inline def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
      
      inline def setSpeechSynthesis(value: SpeechSynthesis): Self = StObject.set(x, "speechSynthesis", value.asInstanceOf[js.Any])
      
      inline def setSpeechSynthesisErrorEvent(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpeechSynthesisErrorEvent */ Any
      ): Self = StObject.set(x, "speechSynthesisErrorEvent", value.asInstanceOf[js.Any])
      
      inline def setSpeechSynthesisErrorEventUndefined: Self = StObject.set(x, "speechSynthesisErrorEvent", js.undefined)
      
      inline def setSpeechSynthesisEvent(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpeechSynthesisEvent */ Any
      ): Self = StObject.set(x, "speechSynthesisEvent", value.asInstanceOf[js.Any])
      
      inline def setSpeechSynthesisEventUndefined: Self = StObject.set(x, "speechSynthesisEvent", js.undefined)
      
      inline def setSpeechSynthesisUndefined: Self = StObject.set(x, "speechSynthesis", js.undefined)
      
      inline def setSpeechSynthesisUtterance(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpeechSynthesisUtterance */ Any
      ): Self = StObject.set(x, "speechSynthesisUtterance", value.asInstanceOf[js.Any])
      
      inline def setSpeechSynthesisUtteranceUndefined: Self = StObject.set(x, "speechSynthesisUtterance", js.undefined)
      
      inline def setSpeechSynthesisVoice(value: SpeechSynthesisVoice): Self = StObject.set(x, "speechSynthesisVoice", value.asInstanceOf[js.Any])
      
      inline def setSpeechSynthesisVoiceUndefined: Self = StObject.set(x, "speechSynthesisVoice", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setVoices(value: js.Array[SpeechSynthesisVoice]): Self = StObject.set(x, "voices", value.asInstanceOf[js.Any])
      
      inline def setVoicesUndefined: Self = StObject.set(x, "voices", js.undefined)
      
      inline def setVoicesVarargs(value: SpeechSynthesisVoice*): Self = StObject.set(x, "voices", js.Array(value*))
    }
  }
  
  trait Interval extends StObject {
    
    /**
      * interval in ms to wait between voice reloads
      */
    var interval: js.UndefOr[Double] = js.undefined
    
    /**
      * max timeout in ms to wait for voices to be loaded
      */
    var maxTimeout: js.UndefOr[Double] = js.undefined
  }
  object Interval {
    
    inline def apply(): Interval = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Interval]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMaxTimeout(value: Double): Self = StObject.set(x, "maxTimeout", value.asInstanceOf[js.Any])
      
      inline def setMaxTimeoutUndefined: Self = StObject.set(x, "maxTimeout", js.undefined)
    }
  }
  
  trait Onboundary extends StObject {
    
    var onboundary: Boolean
    
    var onend: Boolean
    
    var onerror: Boolean
    
    var onmark: Boolean
    
    var onpause: Boolean
    
    var onresume: Boolean
    
    var onstart: Boolean
    
    var onvoiceschanged: Boolean
    
    var speechSynthesis: js.UndefOr[SpeechSynthesis] = js.undefined
    
    var speechSynthesisErrorEvent: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpeechSynthesisErrorEvent */ Any
      ] = js.undefined
    
    var speechSynthesisEvent: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpeechSynthesisEvent */ Any
      ] = js.undefined
    
    var speechSynthesisUtterance: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpeechSynthesisUtterance */ Any
      ] = js.undefined
    
    var speechSynthesisVoice: js.UndefOr[SpeechSynthesisVoice] = js.undefined
  }
  object Onboundary {
    
    inline def apply(
      onboundary: Boolean,
      onend: Boolean,
      onerror: Boolean,
      onmark: Boolean,
      onpause: Boolean,
      onresume: Boolean,
      onstart: Boolean,
      onvoiceschanged: Boolean
    ): Onboundary = {
      val __obj = js.Dynamic.literal(onboundary = onboundary.asInstanceOf[js.Any], onend = onend.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onmark = onmark.asInstanceOf[js.Any], onpause = onpause.asInstanceOf[js.Any], onresume = onresume.asInstanceOf[js.Any], onstart = onstart.asInstanceOf[js.Any], onvoiceschanged = onvoiceschanged.asInstanceOf[js.Any])
      __obj.asInstanceOf[Onboundary]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Onboundary] (val x: Self) extends AnyVal {
      
      inline def setOnboundary(value: Boolean): Self = StObject.set(x, "onboundary", value.asInstanceOf[js.Any])
      
      inline def setOnend(value: Boolean): Self = StObject.set(x, "onend", value.asInstanceOf[js.Any])
      
      inline def setOnerror(value: Boolean): Self = StObject.set(x, "onerror", value.asInstanceOf[js.Any])
      
      inline def setOnmark(value: Boolean): Self = StObject.set(x, "onmark", value.asInstanceOf[js.Any])
      
      inline def setOnpause(value: Boolean): Self = StObject.set(x, "onpause", value.asInstanceOf[js.Any])
      
      inline def setOnresume(value: Boolean): Self = StObject.set(x, "onresume", value.asInstanceOf[js.Any])
      
      inline def setOnstart(value: Boolean): Self = StObject.set(x, "onstart", value.asInstanceOf[js.Any])
      
      inline def setOnvoiceschanged(value: Boolean): Self = StObject.set(x, "onvoiceschanged", value.asInstanceOf[js.Any])
      
      inline def setSpeechSynthesis(value: SpeechSynthesis): Self = StObject.set(x, "speechSynthesis", value.asInstanceOf[js.Any])
      
      inline def setSpeechSynthesisErrorEvent(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpeechSynthesisErrorEvent */ Any
      ): Self = StObject.set(x, "speechSynthesisErrorEvent", value.asInstanceOf[js.Any])
      
      inline def setSpeechSynthesisErrorEventUndefined: Self = StObject.set(x, "speechSynthesisErrorEvent", js.undefined)
      
      inline def setSpeechSynthesisEvent(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpeechSynthesisEvent */ Any
      ): Self = StObject.set(x, "speechSynthesisEvent", value.asInstanceOf[js.Any])
      
      inline def setSpeechSynthesisEventUndefined: Self = StObject.set(x, "speechSynthesisEvent", js.undefined)
      
      inline def setSpeechSynthesisUndefined: Self = StObject.set(x, "speechSynthesis", js.undefined)
      
      inline def setSpeechSynthesisUtterance(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SpeechSynthesisUtterance */ Any
      ): Self = StObject.set(x, "speechSynthesisUtterance", value.asInstanceOf[js.Any])
      
      inline def setSpeechSynthesisUtteranceUndefined: Self = StObject.set(x, "speechSynthesisUtterance", js.undefined)
      
      inline def setSpeechSynthesisVoice(value: SpeechSynthesisVoice): Self = StObject.set(x, "speechSynthesisVoice", value.asInstanceOf[js.Any])
      
      inline def setSpeechSynthesisVoiceUndefined: Self = StObject.set(x, "speechSynthesisVoice", js.undefined)
    }
  }
  
  /* Inlined {  text :string,   voice :std.SpeechSynthesisVoice | undefined,   pitch :number | undefined,   rate :number | undefined,   volume :number | undefined,   force :boolean | undefined} & easy-speech.easy-speech.Handlers */
  trait textstringvoiceSpeechSynt extends StObject {
    
    var boundary: js.UndefOr[js.Function1[/* event */ SpeechSynthesisEvent, Unit]] = js.undefined
    
    var end: js.UndefOr[js.Function1[/* event */ SpeechSynthesisEvent, Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* event */ SpeechSynthesisErrorEvent, Unit]] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var mark: js.UndefOr[js.Function1[/* event */ SpeechSynthesisEvent, Unit]] = js.undefined
    
    var pause: js.UndefOr[js.Function1[/* event */ SpeechSynthesisEvent, Unit]] = js.undefined
    
    var pitch: js.UndefOr[Double] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
    
    var resume: js.UndefOr[js.Function1[/* event */ SpeechSynthesisEvent, Unit]] = js.undefined
    
    var start: js.UndefOr[js.Function1[/* event */ SpeechSynthesisEvent, Unit]] = js.undefined
    
    var text: String
    
    var voice: js.UndefOr[SpeechSynthesisVoice] = js.undefined
    
    var volume: js.UndefOr[Double] = js.undefined
  }
  object textstringvoiceSpeechSynt {
    
    inline def apply(text: String): textstringvoiceSpeechSynt = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[textstringvoiceSpeechSynt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: textstringvoiceSpeechSynt] (val x: Self) extends AnyVal {
      
      inline def setBoundary(value: /* event */ SpeechSynthesisEvent => Unit): Self = StObject.set(x, "boundary", js.Any.fromFunction1(value))
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setEnd(value: /* event */ SpeechSynthesisEvent => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setError(value: /* event */ SpeechSynthesisErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setMark(value: /* event */ SpeechSynthesisEvent => Unit): Self = StObject.set(x, "mark", js.Any.fromFunction1(value))
      
      inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
      
      inline def setPause(value: /* event */ SpeechSynthesisEvent => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
      
      inline def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
      
      inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      inline def setResume(value: /* event */ SpeechSynthesisEvent => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction1(value))
      
      inline def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
      
      inline def setStart(value: /* event */ SpeechSynthesisEvent => Unit): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setVoice(value: SpeechSynthesisVoice): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
      
      inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
}
