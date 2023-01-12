package typings.domMediacaptureTransform

import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined dom-mediacapture-transform.MediaStreamTrackGeneratorInit & {  kind :'audio',   signalTarget :dom-mediacapture-transform.MediaStreamAudioTrack | undefined} */
  trait MediaStreamTrackGenerator extends StObject {
    
    var kind: typings.domMediacaptureTransform.MediaStreamTrackGeneratorKind
    
    /**
      * (Optional) track to which the MediaStreamTrackGenerator will automatically forward control
      * signals. If signalTarget is provided and signalTarget.kind and kind do not match, the
      * MediaStreamTrackGenerator’s constructor will raise an exception.
      */
    var signalTarget: js.UndefOr[MediaStreamTrack] = js.undefined
  }
  object MediaStreamTrackGenerator {
    
    inline def apply(kind: typings.domMediacaptureTransform.MediaStreamTrackGeneratorKind): typings.domMediacaptureTransform.anon.MediaStreamTrackGenerator = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.domMediacaptureTransform.anon.MediaStreamTrackGenerator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.domMediacaptureTransform.anon.MediaStreamTrackGenerator] (val x: Self) extends AnyVal {
      
      inline def setKind(value: typings.domMediacaptureTransform.MediaStreamTrackGeneratorKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setSignalTarget(value: MediaStreamTrack): Self = StObject.set(x, "signalTarget", value.asInstanceOf[js.Any])
      
      inline def setSignalTargetUndefined: Self = StObject.set(x, "signalTarget", js.undefined)
    }
  }
  
  /* Inlined dom-mediacapture-transform.MediaStreamTrackGeneratorInit & {  kind :'video',   signalTarget :dom-mediacapture-transform.MediaStreamVideoTrack | undefined} */
  trait MediaStreamTrackGeneratorKind extends StObject {
    
    var kind: typings.domMediacaptureTransform.MediaStreamTrackGeneratorKind
    
    /**
      * (Optional) track to which the MediaStreamTrackGenerator will automatically forward control
      * signals. If signalTarget is provided and signalTarget.kind and kind do not match, the
      * MediaStreamTrackGenerator’s constructor will raise an exception.
      */
    var signalTarget: js.UndefOr[MediaStreamTrack] = js.undefined
  }
  object MediaStreamTrackGeneratorKind {
    
    inline def apply(kind: typings.domMediacaptureTransform.MediaStreamTrackGeneratorKind): typings.domMediacaptureTransform.anon.MediaStreamTrackGeneratorKind = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.domMediacaptureTransform.anon.MediaStreamTrackGeneratorKind]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.domMediacaptureTransform.anon.MediaStreamTrackGeneratorKind] (val x: Self) extends AnyVal {
      
      inline def setKind(value: typings.domMediacaptureTransform.MediaStreamTrackGeneratorKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setSignalTarget(value: MediaStreamTrack): Self = StObject.set(x, "signalTarget", value.asInstanceOf[js.Any])
      
      inline def setSignalTargetUndefined: Self = StObject.set(x, "signalTarget", js.undefined)
    }
  }
  
  /* Inlined dom-mediacapture-transform.MediaStreamTrackProcessorInit & {  track :dom-mediacapture-transform.MediaStreamAudioTrack} */
  trait MediaStreamTrackProcessor extends StObject {
    
    /**
      * If media frames are not read from MediaStreamTrackProcessor.readable quickly enough, the
      * MediaStreamTrackProcessor will internally buffer up to maxBufferSize of the frames produced
      * by the track. If the internal buffer is full, each time the track produces a new frame, the
      * oldest frame in the buffer will be dropped and the new frame will be added to the buffer.
      */
    var maxBufferSize: js.UndefOr[Double] = js.undefined
    
    var track: MediaStreamTrack
  }
  object MediaStreamTrackProcessor {
    
    inline def apply(track: MediaStreamTrack): typings.domMediacaptureTransform.anon.MediaStreamTrackProcessor = {
      val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.domMediacaptureTransform.anon.MediaStreamTrackProcessor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.domMediacaptureTransform.anon.MediaStreamTrackProcessor] (val x: Self) extends AnyVal {
      
      inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
      
      inline def setTrack(value: MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined dom-mediacapture-transform.MediaStreamTrackProcessorInit & {  track :dom-mediacapture-transform.MediaStreamVideoTrack} */
  trait MediaStreamTrackProcessorMaxBufferSize extends StObject {
    
    /**
      * If media frames are not read from MediaStreamTrackProcessor.readable quickly enough, the
      * MediaStreamTrackProcessor will internally buffer up to maxBufferSize of the frames produced
      * by the track. If the internal buffer is full, each time the track produces a new frame, the
      * oldest frame in the buffer will be dropped and the new frame will be added to the buffer.
      */
    var maxBufferSize: js.UndefOr[Double] = js.undefined
    
    var track: MediaStreamTrack
  }
  object MediaStreamTrackProcessorMaxBufferSize {
    
    inline def apply(track: MediaStreamTrack): MediaStreamTrackProcessorMaxBufferSize = {
      val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaStreamTrackProcessorMaxBufferSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaStreamTrackProcessorMaxBufferSize] (val x: Self) extends AnyVal {
      
      inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
      
      inline def setTrack(value: MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    }
  }
}
