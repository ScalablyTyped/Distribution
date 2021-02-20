package typings.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetPlaybackRateRequest extends StObject {
  
  /**
    * Playback rate for animations on page
    */
  var playbackRate: Double = js.native
}
object SetPlaybackRateRequest {
  
  @scala.inline
  def apply(playbackRate: Double): SetPlaybackRateRequest = {
    val __obj = js.Dynamic.literal(playbackRate = playbackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetPlaybackRateRequest]
  }
  
  @scala.inline
  implicit class SetPlaybackRateRequestMutableBuilder[Self <: SetPlaybackRateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
  }
}
