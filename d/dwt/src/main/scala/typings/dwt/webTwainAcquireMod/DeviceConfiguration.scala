package typings.dwt.webTwainAcquireMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceConfiguration extends js.Object {
  /**
    * Whether to close the built-in User Interface after aquisition. Only valid when {IfShowUI} is true.
    */
  var IfDisableSourceAfterAcquire: js.UndefOr[Boolean] = js.native
  /**
    * Whether to scan one side or both sides of each paper.
    */
  var IfDuplexEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use the document feeder or the flatbed of the device.
    */
  var IfFeederEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether to retrieve extended information about the image after it's transferred.
    */
  var IfGetExtImageInfo: js.UndefOr[Boolean] = js.native
  /**
    * Whether to retrieve information about the image after it's transferred.
    */
  var IfGetImageInfo: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show the built-in User Interface from the device vendor
    */
  var IfShowUI: js.UndefOr[Boolean] = js.native
  /**
    * How a pixel is represented. Basically it means whether to scan in color, grey or black & white
    */
  var PixelType: js.UndefOr[EnumDWTPixelType | Double | String] = js.native
  /**
    * How detailed is the acquisition. Measured by dots per pixel (DPI)
    */
  var Resolution: js.UndefOr[Double] = js.native
  /**
    * How much extended information is retrieved. Only valid when {IfGetExtImageInfo} is true.
    */
  var extendedImageInfoQueryLevel: js.UndefOr[Double] = js.native
}

object DeviceConfiguration {
  @scala.inline
  def apply(): DeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfiguration]
  }
  @scala.inline
  implicit class DeviceConfigurationOps[Self <: DeviceConfiguration] (val x: Self) extends AnyVal {
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
    def setIfDisableSourceAfterAcquire(value: Boolean): Self = this.set("IfDisableSourceAfterAcquire", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfDisableSourceAfterAcquire: Self = this.set("IfDisableSourceAfterAcquire", js.undefined)
    @scala.inline
    def setIfDuplexEnabled(value: Boolean): Self = this.set("IfDuplexEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfDuplexEnabled: Self = this.set("IfDuplexEnabled", js.undefined)
    @scala.inline
    def setIfFeederEnabled(value: Boolean): Self = this.set("IfFeederEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfFeederEnabled: Self = this.set("IfFeederEnabled", js.undefined)
    @scala.inline
    def setIfGetExtImageInfo(value: Boolean): Self = this.set("IfGetExtImageInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfGetExtImageInfo: Self = this.set("IfGetExtImageInfo", js.undefined)
    @scala.inline
    def setIfGetImageInfo(value: Boolean): Self = this.set("IfGetImageInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfGetImageInfo: Self = this.set("IfGetImageInfo", js.undefined)
    @scala.inline
    def setIfShowUI(value: Boolean): Self = this.set("IfShowUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfShowUI: Self = this.set("IfShowUI", js.undefined)
    @scala.inline
    def setPixelType(value: EnumDWTPixelType | Double | String): Self = this.set("PixelType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelType: Self = this.set("PixelType", js.undefined)
    @scala.inline
    def setResolution(value: Double): Self = this.set("Resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("Resolution", js.undefined)
    @scala.inline
    def setExtendedImageInfoQueryLevel(value: Double): Self = this.set("extendedImageInfoQueryLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedImageInfoQueryLevel: Self = this.set("extendedImageInfoQueryLevel", js.undefined)
  }
  
}

