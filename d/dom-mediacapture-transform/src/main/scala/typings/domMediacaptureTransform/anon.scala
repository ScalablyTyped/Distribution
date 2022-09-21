package typings.domMediacaptureTransform

import typings.domMediacaptureTransform.domMediacaptureTransformStrings.audio
import typings.domMediacaptureTransform.domMediacaptureTransformStrings.video
import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined dom-mediacapture-transform.MediaStreamTrackGeneratorInit & {  kind :'audio',   signalTarget :dom-mediacapture-transform.MediaStreamAudioTrack | undefined} */
  trait MediaStreamTrackGenerator extends StObject {
    
    var kind: typings.domMediacaptureTransform.MediaStreamTrackGeneratorKind & audio
    
    /**
      * (Optional) track to which the MediaStreamTrackGenerator will automatically forward control
      * signals. If signalTarget is provided and signalTarget.kind and kind do not match, the
      * MediaStreamTrackGenerator’s constructor will raise an exception.
      */
    var signalTarget: js.UndefOr[MediaStreamTrack] & js.UndefOr[MediaStreamAudioTrack]
  }
  object MediaStreamTrackGenerator {
    
    inline def apply(
      kind: typings.domMediacaptureTransform.MediaStreamTrackGeneratorKind & audio,
      signalTarget: js.UndefOr[MediaStreamTrack] & js.UndefOr[MediaStreamAudioTrack]
    ): typings.domMediacaptureTransform.anon.MediaStreamTrackGenerator = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], signalTarget = signalTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.domMediacaptureTransform.anon.MediaStreamTrackGenerator]
    }
    
    extension [Self <: typings.domMediacaptureTransform.anon.MediaStreamTrackGenerator](x: Self) {
      
      inline def setKind(value: typings.domMediacaptureTransform.MediaStreamTrackGeneratorKind & audio): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setSignalTarget(value: js.UndefOr[MediaStreamTrack] & js.UndefOr[MediaStreamAudioTrack]): Self = StObject.set(x, "signalTarget", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined dom-mediacapture-transform.MediaStreamTrackGeneratorInit & {  kind :'video',   signalTarget :dom-mediacapture-transform.MediaStreamVideoTrack | undefined} */
  trait MediaStreamTrackGeneratorKind extends StObject {
    
    var kind: typings.domMediacaptureTransform.MediaStreamTrackGeneratorKind & video
    
    /**
      * (Optional) track to which the MediaStreamTrackGenerator will automatically forward control
      * signals. If signalTarget is provided and signalTarget.kind and kind do not match, the
      * MediaStreamTrackGenerator’s constructor will raise an exception.
      */
    var signalTarget: js.UndefOr[MediaStreamTrack] & js.UndefOr[MediaStreamVideoTrack]
  }
  object MediaStreamTrackGeneratorKind {
    
    inline def apply(
      kind: typings.domMediacaptureTransform.MediaStreamTrackGeneratorKind & video,
      signalTarget: js.UndefOr[MediaStreamTrack] & js.UndefOr[MediaStreamVideoTrack]
    ): typings.domMediacaptureTransform.anon.MediaStreamTrackGeneratorKind = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], signalTarget = signalTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.domMediacaptureTransform.anon.MediaStreamTrackGeneratorKind]
    }
    
    extension [Self <: typings.domMediacaptureTransform.anon.MediaStreamTrackGeneratorKind](x: Self) {
      
      inline def setKind(value: typings.domMediacaptureTransform.MediaStreamTrackGeneratorKind & video): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setSignalTarget(value: js.UndefOr[MediaStreamTrack] & js.UndefOr[MediaStreamVideoTrack]): Self = StObject.set(x, "signalTarget", value.asInstanceOf[js.Any])
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
    
    var track: MediaStreamTrack & MediaStreamAudioTrack
  }
  object MediaStreamTrackProcessor {
    
    inline def apply(track: MediaStreamTrack & MediaStreamAudioTrack): typings.domMediacaptureTransform.anon.MediaStreamTrackProcessor = {
      val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.domMediacaptureTransform.anon.MediaStreamTrackProcessor]
    }
    
    extension [Self <: typings.domMediacaptureTransform.anon.MediaStreamTrackProcessor](x: Self) {
      
      inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
      
      inline def setTrack(value: MediaStreamTrack & MediaStreamAudioTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
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
    
    var track: MediaStreamTrack & MediaStreamVideoTrack
  }
  object MediaStreamTrackProcessorMaxBufferSize {
    
    inline def apply(track: MediaStreamTrack & MediaStreamVideoTrack): MediaStreamTrackProcessorMaxBufferSize = {
      val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaStreamTrackProcessorMaxBufferSize]
    }
    
    extension [Self <: MediaStreamTrackProcessorMaxBufferSize](x: Self) {
      
      inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
      
      inline def setTrack(value: MediaStreamTrack & MediaStreamVideoTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    }
  }
}
