package typings.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPlaybackRateResponse extends StObject {
  
  /**
    * Playback rate for animations on page.
    */
  var playbackRate: Double
}
object GetPlaybackRateResponse {
  
  inline def apply(playbackRate: Double): GetPlaybackRateResponse = {
    val __obj = js.Dynamic.literal(playbackRate = playbackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaybackRateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPlaybackRateResponse] (val x: Self) extends AnyVal {
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
  }
}
