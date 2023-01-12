package typings.domMediacaptureTransform

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Assert that getAudioTracks and getVideoTracks return the tracks with the appropriate kind. */
trait MediaStream extends StObject {
  
  def getAudioTracks(): js.Array[MediaStreamAudioTrack]
  
  def getVideoTracks(): js.Array[MediaStreamVideoTrack]
}
object MediaStream {
  
  inline def apply(
    getAudioTracks: () => js.Array[MediaStreamAudioTrack],
    getVideoTracks: () => js.Array[MediaStreamVideoTrack]
  ): MediaStream = {
    val __obj = js.Dynamic.literal(getAudioTracks = js.Any.fromFunction0(getAudioTracks), getVideoTracks = js.Any.fromFunction0(getVideoTracks))
    __obj.asInstanceOf[MediaStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaStream] (val x: Self) extends AnyVal {
    
    inline def setGetAudioTracks(value: () => js.Array[MediaStreamAudioTrack]): Self = StObject.set(x, "getAudioTracks", js.Any.fromFunction0(value))
    
    inline def setGetVideoTracks(value: () => js.Array[MediaStreamVideoTrack]): Self = StObject.set(x, "getVideoTracks", js.Any.fromFunction0(value))
  }
}
