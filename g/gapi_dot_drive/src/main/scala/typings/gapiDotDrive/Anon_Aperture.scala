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
    val __obj = js.Dynamic.literal(aperture = aperture, cameraMake = cameraMake, cameraModel = cameraModel, colorSpace = colorSpace, date = date, exposureBias = exposureBias, exposureMode = exposureMode, exposureTime = exposureTime, flashUsed = flashUsed, focalLength = focalLength, height = height, isoSpeed = isoSpeed, lens = lens, location = location, maxApertureValue = maxApertureValue, meteringMode = meteringMode, rotation = rotation, sensor = sensor, subjectDistance = subjectDistance, whiteBalance = whiteBalance, width = width)
  
    __obj.asInstanceOf[Anon_Aperture]
  }
}

