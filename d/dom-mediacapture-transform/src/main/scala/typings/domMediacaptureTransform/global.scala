package typings.domMediacaptureTransform

import typings.domWebcodecs.AudioData
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("MediaStreamTrackGenerator")
  @js.native
  open class MediaStreamTrackGenerator protected ()
    extends StObject
       with MediaStreamAudioTrackGenerator {
    /** Constructor overrides based on the type of track. */
    def this(init: typings.domMediacaptureTransform.anon.MediaStreamTrackGenerator) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("MediaStreamTrackProcessor")
  @js.native
  open class MediaStreamTrackProcessor protected ()
    extends StObject
       with typings.domMediacaptureTransform.MediaStreamTrackProcessor[AudioData] {
    /** Constructor overrides based on the type of track. */
    def this(init: typings.domMediacaptureTransform.anon.MediaStreamTrackProcessor) = this()
    
    /**
      * Allows reading the frames flowing through the MediaStreamTrack provided to the constructor.
      */
    /* CompleteClass */
    override val readable: ReadableStream[AudioData] = js.native
    
    /** Allows sending control signals to the MediaStreamTrack provided to the constructor. */
    /* CompleteClass */
    override val writableControl: WritableStream[MediaStreamTrackSignal] = js.native
  }
}
