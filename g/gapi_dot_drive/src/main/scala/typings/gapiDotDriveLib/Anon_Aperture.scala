package typings
package gapiDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aperture extends js.Object {
  var aperture: scala.Double
  var cameraMake: java.lang.String
  var cameraModel: java.lang.String
  var colorSpace: java.lang.String
  var date: java.lang.String
  var exposureBias: scala.Double
  var exposureMode: java.lang.String
  var exposureTime: scala.Double
  var flashUsed: scala.Boolean
  var focalLength: scala.Double
  var height: scala.Double
  var isoSpeed: scala.Double
  var lens: java.lang.String
  var location: Anon_Altitude
  var maxApertureValue: scala.Double
  var meteringMode: java.lang.String
  var rotation: scala.Double
  var sensor: java.lang.String
  var subjectDistance: scala.Double
  var whiteBalance: java.lang.String
  var width: scala.Double
}

object Anon_Aperture {
  @scala.inline
  def apply(
    aperture: scala.Double,
    cameraMake: java.lang.String,
    cameraModel: java.lang.String,
    colorSpace: java.lang.String,
    date: java.lang.String,
    exposureBias: scala.Double,
    exposureMode: java.lang.String,
    exposureTime: scala.Double,
    flashUsed: scala.Boolean,
    focalLength: scala.Double,
    height: scala.Double,
    isoSpeed: scala.Double,
    lens: java.lang.String,
    location: Anon_Altitude,
    maxApertureValue: scala.Double,
    meteringMode: java.lang.String,
    rotation: scala.Double,
    sensor: java.lang.String,
    subjectDistance: scala.Double,
    whiteBalance: java.lang.String,
    width: scala.Double
  ): Anon_Aperture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aperture")(aperture)
    __obj.updateDynamic("cameraMake")(cameraMake)
    __obj.updateDynamic("cameraModel")(cameraModel)
    __obj.updateDynamic("colorSpace")(colorSpace)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("exposureBias")(exposureBias)
    __obj.updateDynamic("exposureMode")(exposureMode)
    __obj.updateDynamic("exposureTime")(exposureTime)
    __obj.updateDynamic("flashUsed")(flashUsed)
    __obj.updateDynamic("focalLength")(focalLength)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("isoSpeed")(isoSpeed)
    __obj.updateDynamic("lens")(lens)
    __obj.updateDynamic("location")(location)
    __obj.updateDynamic("maxApertureValue")(maxApertureValue)
    __obj.updateDynamic("meteringMode")(meteringMode)
    __obj.updateDynamic("rotation")(rotation)
    __obj.updateDynamic("sensor")(sensor)
    __obj.updateDynamic("subjectDistance")(subjectDistance)
    __obj.updateDynamic("whiteBalance")(whiteBalance)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Aperture]
  }
}

