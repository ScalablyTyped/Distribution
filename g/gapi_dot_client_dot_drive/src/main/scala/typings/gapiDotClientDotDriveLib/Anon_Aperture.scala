package typings
package gapiDotClientDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aperture extends js.Object {
  /** The aperture used to create the photo (f-number). */
  var aperture: js.UndefOr[scala.Double] = js.undefined
  /** The make of the camera used to create the photo. */
  var cameraMake: js.UndefOr[java.lang.String] = js.undefined
  /** The model of the camera used to create the photo. */
  var cameraModel: js.UndefOr[java.lang.String] = js.undefined
  /** The color space of the photo. */
  var colorSpace: js.UndefOr[java.lang.String] = js.undefined
  /** The exposure bias of the photo (APEX value). */
  var exposureBias: js.UndefOr[scala.Double] = js.undefined
  /** The exposure mode used to create the photo. */
  var exposureMode: js.UndefOr[java.lang.String] = js.undefined
  /** The length of the exposure, in seconds. */
  var exposureTime: js.UndefOr[scala.Double] = js.undefined
  /** Whether a flash was used to create the photo. */
  var flashUsed: js.UndefOr[scala.Boolean] = js.undefined
  /** The focal length used to create the photo, in millimeters. */
  var focalLength: js.UndefOr[scala.Double] = js.undefined
  /** The height of the image in pixels. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The ISO speed used to create the photo. */
  var isoSpeed: js.UndefOr[scala.Double] = js.undefined
  /** The lens used to create the photo. */
  var lens: js.UndefOr[java.lang.String] = js.undefined
  /** Geographic location information stored in the image. */
  var location: js.UndefOr[Anon_Altitude] = js.undefined
  /** The smallest f-number of the lens at the focal length used to create the photo (APEX value). */
  var maxApertureValue: js.UndefOr[scala.Double] = js.undefined
  /** The metering mode used to create the photo. */
  var meteringMode: js.UndefOr[java.lang.String] = js.undefined
  /** The rotation in clockwise degrees from the image's original orientation. */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /** The type of sensor used to create the photo. */
  var sensor: js.UndefOr[java.lang.String] = js.undefined
  /** The distance to the subject of the photo, in meters. */
  var subjectDistance: js.UndefOr[scala.Double] = js.undefined
  /** The date and time the photo was taken (EXIF DateTime). */
  var time: js.UndefOr[java.lang.String] = js.undefined
  /** The white balance mode used to create the photo. */
  var whiteBalance: js.UndefOr[java.lang.String] = js.undefined
  /** The width of the image in pixels. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Aperture {
  @scala.inline
  def apply(
    aperture: scala.Int | scala.Double = null,
    cameraMake: java.lang.String = null,
    cameraModel: java.lang.String = null,
    colorSpace: java.lang.String = null,
    exposureBias: scala.Int | scala.Double = null,
    exposureMode: java.lang.String = null,
    exposureTime: scala.Int | scala.Double = null,
    flashUsed: js.UndefOr[scala.Boolean] = js.undefined,
    focalLength: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    isoSpeed: scala.Int | scala.Double = null,
    lens: java.lang.String = null,
    location: Anon_Altitude = null,
    maxApertureValue: scala.Int | scala.Double = null,
    meteringMode: java.lang.String = null,
    rotation: scala.Int | scala.Double = null,
    sensor: java.lang.String = null,
    subjectDistance: scala.Int | scala.Double = null,
    time: java.lang.String = null,
    whiteBalance: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Anon_Aperture = {
    val __obj = js.Dynamic.literal()
    if (aperture != null) __obj.updateDynamic("aperture")(aperture.asInstanceOf[js.Any])
    if (cameraMake != null) __obj.updateDynamic("cameraMake")(cameraMake)
    if (cameraModel != null) __obj.updateDynamic("cameraModel")(cameraModel)
    if (colorSpace != null) __obj.updateDynamic("colorSpace")(colorSpace)
    if (exposureBias != null) __obj.updateDynamic("exposureBias")(exposureBias.asInstanceOf[js.Any])
    if (exposureMode != null) __obj.updateDynamic("exposureMode")(exposureMode)
    if (exposureTime != null) __obj.updateDynamic("exposureTime")(exposureTime.asInstanceOf[js.Any])
    if (!js.isUndefined(flashUsed)) __obj.updateDynamic("flashUsed")(flashUsed)
    if (focalLength != null) __obj.updateDynamic("focalLength")(focalLength.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (isoSpeed != null) __obj.updateDynamic("isoSpeed")(isoSpeed.asInstanceOf[js.Any])
    if (lens != null) __obj.updateDynamic("lens")(lens)
    if (location != null) __obj.updateDynamic("location")(location)
    if (maxApertureValue != null) __obj.updateDynamic("maxApertureValue")(maxApertureValue.asInstanceOf[js.Any])
    if (meteringMode != null) __obj.updateDynamic("meteringMode")(meteringMode)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (sensor != null) __obj.updateDynamic("sensor")(sensor)
    if (subjectDistance != null) __obj.updateDynamic("subjectDistance")(subjectDistance.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time)
    if (whiteBalance != null) __obj.updateDynamic("whiteBalance")(whiteBalance)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Aperture]
  }
}

