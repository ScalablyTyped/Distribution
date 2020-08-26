package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aperture extends js.Object {
  /** The aperture used to create the photo (f-number). */
  var aperture: js.UndefOr[Double] = js.native
  /** The make of the camera used to create the photo. */
  var cameraMake: js.UndefOr[String] = js.native
  /** The model of the camera used to create the photo. */
  var cameraModel: js.UndefOr[String] = js.native
  /** The color space of the photo. */
  var colorSpace: js.UndefOr[String] = js.native
  /** The exposure bias of the photo (APEX value). */
  var exposureBias: js.UndefOr[Double] = js.native
  /** The exposure mode used to create the photo. */
  var exposureMode: js.UndefOr[String] = js.native
  /** The length of the exposure, in seconds. */
  var exposureTime: js.UndefOr[Double] = js.native
  /** Whether a flash was used to create the photo. */
  var flashUsed: js.UndefOr[Boolean] = js.native
  /** The focal length used to create the photo, in millimeters. */
  var focalLength: js.UndefOr[Double] = js.native
  /** The height of the image in pixels. */
  var height: js.UndefOr[Double] = js.native
  /** The ISO speed used to create the photo. */
  var isoSpeed: js.UndefOr[Double] = js.native
  /** The lens used to create the photo. */
  var lens: js.UndefOr[String] = js.native
  /** Geographic location information stored in the image. */
  var location: js.UndefOr[Altitude] = js.native
  /** The smallest f-number of the lens at the focal length used to create the photo (APEX value). */
  var maxApertureValue: js.UndefOr[Double] = js.native
  /** The metering mode used to create the photo. */
  var meteringMode: js.UndefOr[String] = js.native
  /** The number of clockwise 90 degree rotations applied from the image's original orientation. */
  var rotation: js.UndefOr[Double] = js.native
  /** The type of sensor used to create the photo. */
  var sensor: js.UndefOr[String] = js.native
  /** The distance to the subject of the photo, in meters. */
  var subjectDistance: js.UndefOr[Double] = js.native
  /** The date and time the photo was taken (EXIF DateTime). */
  var time: js.UndefOr[String] = js.native
  /** The white balance mode used to create the photo. */
  var whiteBalance: js.UndefOr[String] = js.native
  /** The width of the image in pixels. */
  var width: js.UndefOr[Double] = js.native
}

object Aperture {
  @scala.inline
  def apply(): Aperture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aperture]
  }
  @scala.inline
  implicit class ApertureOps[Self <: Aperture] (val x: Self) extends AnyVal {
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
    def setLocation(value: Altitude): Self = this.set("location", value.asInstanceOf[js.Any])
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
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
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

