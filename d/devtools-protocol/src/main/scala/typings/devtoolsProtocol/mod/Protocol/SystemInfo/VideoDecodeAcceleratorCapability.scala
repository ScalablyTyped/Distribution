package typings.devtoolsProtocol.mod.Protocol.SystemInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoDecodeAcceleratorCapability extends js.Object {
  /**
    * Maximum video dimensions in pixels supported for this |profile|.
    */
  var maxResolution: Size = js.native
  /**
    * Minimum video dimensions in pixels supported for this |profile|.
    */
  var minResolution: Size = js.native
  /**
    * Video codec profile that is supported, e.g. VP9 Profile 2.
    */
  var profile: String = js.native
}

object VideoDecodeAcceleratorCapability {
  @scala.inline
  def apply(maxResolution: Size, minResolution: Size, profile: String): VideoDecodeAcceleratorCapability = {
    val __obj = js.Dynamic.literal(maxResolution = maxResolution.asInstanceOf[js.Any], minResolution = minResolution.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDecodeAcceleratorCapability]
  }
  @scala.inline
  implicit class VideoDecodeAcceleratorCapabilityOps[Self <: VideoDecodeAcceleratorCapability] (val x: Self) extends AnyVal {
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
    def setMaxResolution(value: Size): Self = this.set("maxResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinResolution(value: Size): Self = this.set("minResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
  }
  
}

