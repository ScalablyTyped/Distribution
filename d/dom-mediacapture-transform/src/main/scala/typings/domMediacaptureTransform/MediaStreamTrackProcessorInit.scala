package typings.domMediacaptureTransform

import typings.std.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaStreamTrackProcessorInit extends StObject {
  
  /**
    * If media frames are not read from MediaStreamTrackProcessor.readable quickly enough, the
    * MediaStreamTrackProcessor will internally buffer up to maxBufferSize of the frames produced
    * by the track. If the internal buffer is full, each time the track produces a new frame, the
    * oldest frame in the buffer will be dropped and the new frame will be added to the buffer.
    */
  var maxBufferSize: js.UndefOr[Double] = js.undefined
  
  var track: MediaStreamTrack
}
object MediaStreamTrackProcessorInit {
  
  inline def apply(track: MediaStreamTrack): MediaStreamTrackProcessorInit = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamTrackProcessorInit]
  }
  
  extension [Self <: MediaStreamTrackProcessorInit](x: Self) {
    
    inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
    
    inline def setTrack(value: MediaStreamTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
