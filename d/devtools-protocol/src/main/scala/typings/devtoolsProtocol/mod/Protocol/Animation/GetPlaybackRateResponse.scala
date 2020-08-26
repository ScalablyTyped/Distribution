package typings.devtoolsProtocol.mod.Protocol.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPlaybackRateResponse extends js.Object {
  /**
    * Playback rate for animations on page.
    */
  var playbackRate: Double = js.native
}

object GetPlaybackRateResponse {
  @scala.inline
  def apply(playbackRate: Double): GetPlaybackRateResponse = {
    val __obj = js.Dynamic.literal(playbackRate = playbackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaybackRateResponse]
  }
  @scala.inline
  implicit class GetPlaybackRateResponseOps[Self <: GetPlaybackRateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlaybackRate(value: Double): Self = this.set("playbackRate", value.asInstanceOf[js.Any])
  }
  
}

