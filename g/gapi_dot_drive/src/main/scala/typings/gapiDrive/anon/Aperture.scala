package typings.gapiDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aperture extends js.Object {
  var aperture: Double = js.native
  var cameraMake: String = js.native
  var cameraModel: String = js.native
  var colorSpace: String = js.native
  var date: String = js.native
  var exposureBias: Double = js.native
  var exposureMode: String = js.native
  var exposureTime: Double = js.native
  var flashUsed: Boolean = js.native
  var focalLength: Double = js.native
  var height: Double = js.native
  var isoSpeed: Double = js.native
  var lens: String = js.native
  var location: Altitude = js.native
  var maxApertureValue: Double = js.native
  var meteringMode: String = js.native
  var rotation: Double = js.native
  var sensor: String = js.native
  var subjectDistance: Double = js.native
  var whiteBalance: String = js.native
  var width: Double = js.native
}

object Aperture {
  @scala.inline
  def apply(
    aperture: Double,
    cameraMake: String,
    cameraModel: String,
    colorSpace: String,
    date: String,
    exposureBias: Double,
    exposureMode: String,
    exposureTime: Double,
    flashUsed: Boolean,
    focalLength: Double,
    height: Double,
    isoSpeed: Double,
    lens: String,
    location: Altitude,
    maxApertureValue: Double,
    meteringMode: String,
    rotation: Double,
    sensor: String,
    subjectDistance: Double,
    whiteBalance: String,
    width: Double
  ): Aperture = {
    val __obj = js.Dynamic.literal(aperture = aperture.asInstanceOf[js.Any], cameraMake = cameraMake.asInstanceOf[js.Any], cameraModel = cameraModel.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], exposureBias = exposureBias.asInstanceOf[js.Any], exposureMode = exposureMode.asInstanceOf[js.Any], exposureTime = exposureTime.asInstanceOf[js.Any], flashUsed = flashUsed.asInstanceOf[js.Any], focalLength = focalLength.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isoSpeed = isoSpeed.asInstanceOf[js.Any], lens = lens.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], maxApertureValue = maxApertureValue.asInstanceOf[js.Any], meteringMode = meteringMode.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], sensor = sensor.asInstanceOf[js.Any], subjectDistance = subjectDistance.asInstanceOf[js.Any], whiteBalance = whiteBalance.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
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
    def setCameraMake(value: String): Self = this.set("cameraMake", value.asInstanceOf[js.Any])
    @scala.inline
    def setCameraModel(value: String): Self = this.set("cameraModel", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorSpace(value: String): Self = this.set("colorSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setExposureBias(value: Double): Self = this.set("exposureBias", value.asInstanceOf[js.Any])
    @scala.inline
    def setExposureMode(value: String): Self = this.set("exposureMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setExposureTime(value: Double): Self = this.set("exposureTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlashUsed(value: Boolean): Self = this.set("flashUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocalLength(value: Double): Self = this.set("focalLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsoSpeed(value: Double): Self = this.set("isoSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def setLens(value: String): Self = this.set("lens", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Altitude): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxApertureValue(value: Double): Self = this.set("maxApertureValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeteringMode(value: String): Self = this.set("meteringMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSensor(value: String): Self = this.set("sensor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubjectDistance(value: Double): Self = this.set("subjectDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhiteBalance(value: String): Self = this.set("whiteBalance", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

