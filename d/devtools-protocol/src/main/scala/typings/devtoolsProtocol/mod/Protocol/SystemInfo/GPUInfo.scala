package typings.devtoolsProtocol.mod.Protocol.SystemInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPUInfo extends js.Object {
  /**
    * An optional dictionary of additional GPU related attributes.
    */
  var auxAttributes: js.UndefOr[js.Any] = js.native
  /**
    * The graphics devices on the system. Element 0 is the primary GPU.
    */
  var devices: js.Array[GPUDevice] = js.native
  /**
    * An optional array of GPU driver bug workarounds.
    */
  var driverBugWorkarounds: js.Array[String] = js.native
  /**
    * An optional dictionary of graphics features and their status.
    */
  var featureStatus: js.UndefOr[js.Any] = js.native
  /**
    * Supported accelerated image decoding capabilities.
    */
  var imageDecoding: js.Array[ImageDecodeAcceleratorCapability] = js.native
  /**
    * Supported accelerated video decoding capabilities.
    */
  var videoDecoding: js.Array[VideoDecodeAcceleratorCapability] = js.native
  /**
    * Supported accelerated video encoding capabilities.
    */
  var videoEncoding: js.Array[VideoEncodeAcceleratorCapability] = js.native
}

object GPUInfo {
  @scala.inline
  def apply(
    devices: js.Array[GPUDevice],
    driverBugWorkarounds: js.Array[String],
    imageDecoding: js.Array[ImageDecodeAcceleratorCapability],
    videoDecoding: js.Array[VideoDecodeAcceleratorCapability],
    videoEncoding: js.Array[VideoEncodeAcceleratorCapability]
  ): GPUInfo = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], driverBugWorkarounds = driverBugWorkarounds.asInstanceOf[js.Any], imageDecoding = imageDecoding.asInstanceOf[js.Any], videoDecoding = videoDecoding.asInstanceOf[js.Any], videoEncoding = videoEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUInfo]
  }
  @scala.inline
  implicit class GPUInfoOps[Self <: GPUInfo] (val x: Self) extends AnyVal {
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
    def setDevicesVarargs(value: GPUDevice*): Self = this.set("devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: js.Array[GPUDevice]): Self = this.set("devices", value.asInstanceOf[js.Any])
    @scala.inline
    def setDriverBugWorkaroundsVarargs(value: String*): Self = this.set("driverBugWorkarounds", js.Array(value :_*))
    @scala.inline
    def setDriverBugWorkarounds(value: js.Array[String]): Self = this.set("driverBugWorkarounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageDecodingVarargs(value: ImageDecodeAcceleratorCapability*): Self = this.set("imageDecoding", js.Array(value :_*))
    @scala.inline
    def setImageDecoding(value: js.Array[ImageDecodeAcceleratorCapability]): Self = this.set("imageDecoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoDecodingVarargs(value: VideoDecodeAcceleratorCapability*): Self = this.set("videoDecoding", js.Array(value :_*))
    @scala.inline
    def setVideoDecoding(value: js.Array[VideoDecodeAcceleratorCapability]): Self = this.set("videoDecoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoEncodingVarargs(value: VideoEncodeAcceleratorCapability*): Self = this.set("videoEncoding", js.Array(value :_*))
    @scala.inline
    def setVideoEncoding(value: js.Array[VideoEncodeAcceleratorCapability]): Self = this.set("videoEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuxAttributes(value: js.Any): Self = this.set("auxAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxAttributes: Self = this.set("auxAttributes", js.undefined)
    @scala.inline
    def setFeatureStatus(value: js.Any): Self = this.set("featureStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureStatus: Self = this.set("featureStatus", js.undefined)
  }
  
}

