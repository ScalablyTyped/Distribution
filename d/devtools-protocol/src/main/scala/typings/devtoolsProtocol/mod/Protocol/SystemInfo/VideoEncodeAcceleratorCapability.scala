package typings.devtoolsProtocol.mod.Protocol.SystemInfo

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoEncodeAcceleratorCapability extends js.Object {
  
  var maxFramerateDenominator: integer = js.native
  
  /**
    * Maximum encoding framerate in frames per second supported for this
    * |profile|, as fraction's numerator and denominator, e.g. 24/1 fps,
    * 24000/1001 fps, etc.
    */
  var maxFramerateNumerator: integer = js.native
  
  /**
    * Maximum video dimensions in pixels supported for this |profile|.
    */
  var maxResolution: Size = js.native
  
  /**
    * Video codec profile that is supported, e.g H264 Main.
    */
  var profile: String = js.native
}
object VideoEncodeAcceleratorCapability {
  
  @scala.inline
  def apply(
    maxFramerateDenominator: integer,
    maxFramerateNumerator: integer,
    maxResolution: Size,
    profile: String
  ): VideoEncodeAcceleratorCapability = {
    val __obj = js.Dynamic.literal(maxFramerateDenominator = maxFramerateDenominator.asInstanceOf[js.Any], maxFramerateNumerator = maxFramerateNumerator.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoEncodeAcceleratorCapability]
  }
  
  @scala.inline
  implicit class VideoEncodeAcceleratorCapabilityOps[Self <: VideoEncodeAcceleratorCapability] (val x: Self) extends AnyVal {
    
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
    def setMaxFramerateDenominator(value: integer): Self = this.set("maxFramerateDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFramerateNumerator(value: integer): Self = this.set("maxFramerateNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResolution(value: Size): Self = this.set("maxResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
  }
}
