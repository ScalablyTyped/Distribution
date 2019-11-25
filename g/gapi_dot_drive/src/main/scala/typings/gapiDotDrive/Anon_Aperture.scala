package typings.gapiDotDrive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aperture extends js.Object {
  var aperture: Double
  var cameraMake: String
  var cameraModel: String
  var colorSpace: String
  var date: String
  var exposureBias: Double
  var exposureMode: String
  var exposureTime: Double
  var flashUsed: Boolean
  var focalLength: Double
  var height: Double
  var isoSpeed: Double
  var lens: String
  var location: Anon_Altitude
  var maxApertureValue: Double
  var meteringMode: String
  var rotation: Double
  var sensor: String
  var subjectDistance: Double
  var whiteBalance: String
  var width: Double
}

object Anon_Aperture {
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
    location: Anon_Altitude,
    maxApertureValue: Double,
    meteringMode: String,
    rotation: Double,
    sensor: String,
    subjectDistance: Double,
    whiteBalance: String,
    width: Double
  ): Anon_Aperture = {
    val __obj = js.Dynamic.literal(aperture = aperture.asInstanceOf[js.Any], cameraMake = cameraMake.asInstanceOf[js.Any], cameraModel = cameraModel.asInstanceOf[js.Any], colorSpace = colorSpace.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], exposureBias = exposureBias.asInstanceOf[js.Any], exposureMode = exposureMode.asInstanceOf[js.Any], exposureTime = exposureTime.asInstanceOf[js.Any], flashUsed = flashUsed.asInstanceOf[js.Any], focalLength = focalLength.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isoSpeed = isoSpeed.asInstanceOf[js.Any], lens = lens.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], maxApertureValue = maxApertureValue.asInstanceOf[js.Any], meteringMode = meteringMode.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], sensor = sensor.asInstanceOf[js.Any], subjectDistance = subjectDistance.asInstanceOf[js.Any], whiteBalance = whiteBalance.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Aperture]
  }
}

