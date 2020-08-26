package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileImageMediaMetadata extends js.Object {
  var aperture: js.UndefOr[Double] = js.native
  var cameraMake: js.UndefOr[String] = js.native
  var cameraModel: js.UndefOr[String] = js.native
  var colorSpace: js.UndefOr[String] = js.native
  var date: js.UndefOr[String] = js.native
  var exposureBias: js.UndefOr[Double] = js.native
  var exposureMode: js.UndefOr[String] = js.native
  var exposureTime: js.UndefOr[Double] = js.native
  var flashUsed: js.UndefOr[Boolean] = js.native
  var focalLength: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var isoSpeed: js.UndefOr[Double] = js.native
  var lens: js.UndefOr[String] = js.native
  var location: js.UndefOr[FileImageMediaMetadataLocation] = js.native
  var maxApertureValue: js.UndefOr[Double] = js.native
  var meteringMode: js.UndefOr[String] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var sensor: js.UndefOr[String] = js.native
  var subjectDistance: js.UndefOr[Double] = js.native
  var whiteBalance: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object FileImageMediaMetadata {
  @scala.inline
  def apply(): FileImageMediaMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileImageMediaMetadata]
  }
  @scala.inline
  implicit class FileImageMediaMetadataOps[Self <: FileImageMediaMetadata] (val x: Self) extends AnyVal {
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
    def setAperture(value: Double): Self = this.set("aperture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAperture: Self = this.set("aperture", js.undefined)
    @scala.inline
    def setCameraMake(value: String): Self = this.set("cameraMake", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraMake: Self = this.set("cameraMake", js.undefined)
    @scala.inline
    def setCameraModel(value: String): Self = this.set("cameraModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraModel: Self = this.set("cameraModel", js.undefined)
    @scala.inline
    def setColorSpace(value: String): Self = this.set("colorSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorSpace: Self = this.set("colorSpace", js.undefined)
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setExposureBias(value: Double): Self = this.set("exposureBias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposureBias: Self = this.set("exposureBias", js.undefined)
    @scala.inline
    def setExposureMode(value: String): Self = this.set("exposureMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposureMode: Self = this.set("exposureMode", js.undefined)
    @scala.inline
    def setExposureTime(value: Double): Self = this.set("exposureTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposureTime: Self = this.set("exposureTime", js.undefined)
    @scala.inline
    def setFlashUsed(value: Boolean): Self = this.set("flashUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashUsed: Self = this.set("flashUsed", js.undefined)
    @scala.inline
    def setFocalLength(value: Double): Self = this.set("focalLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocalLength: Self = this.set("focalLength", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIsoSpeed(value: Double): Self = this.set("isoSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsoSpeed: Self = this.set("isoSpeed", js.undefined)
    @scala.inline
    def setLens(value: String): Self = this.set("lens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLens: Self = this.set("lens", js.undefined)
    @scala.inline
    def setLocation(value: FileImageMediaMetadataLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMaxApertureValue(value: Double): Self = this.set("maxApertureValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxApertureValue: Self = this.set("maxApertureValue", js.undefined)
    @scala.inline
    def setMeteringMode(value: String): Self = this.set("meteringMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeteringMode: Self = this.set("meteringMode", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setSensor(value: String): Self = this.set("sensor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensor: Self = this.set("sensor", js.undefined)
    @scala.inline
    def setSubjectDistance(value: Double): Self = this.set("subjectDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubjectDistance: Self = this.set("subjectDistance", js.undefined)
    @scala.inline
    def setWhiteBalance(value: String): Self = this.set("whiteBalance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhiteBalance: Self = this.set("whiteBalance", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

