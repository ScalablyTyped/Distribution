package typings.gapiClientDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aperture extends js.Object {
  /** The aperture used to create the photo (f-number). */
  var aperture: js.UndefOr[Double] = js.undefined
  /** The make of the camera used to create the photo. */
  var cameraMake: js.UndefOr[String] = js.undefined
  /** The model of the camera used to create the photo. */
  var cameraModel: js.UndefOr[String] = js.undefined
  /** The color space of the photo. */
  var colorSpace: js.UndefOr[String] = js.undefined
  /** The exposure bias of the photo (APEX value). */
  var exposureBias: js.UndefOr[Double] = js.undefined
  /** The exposure mode used to create the photo. */
  var exposureMode: js.UndefOr[String] = js.undefined
  /** The length of the exposure, in seconds. */
  var exposureTime: js.UndefOr[Double] = js.undefined
  /** Whether a flash was used to create the photo. */
  var flashUsed: js.UndefOr[Boolean] = js.undefined
  /** The focal length used to create the photo, in millimeters. */
  var focalLength: js.UndefOr[Double] = js.undefined
  /** The height of the image in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  /** The ISO speed used to create the photo. */
  var isoSpeed: js.UndefOr[Double] = js.undefined
  /** The lens used to create the photo. */
  var lens: js.UndefOr[String] = js.undefined
  /** Geographic location information stored in the image. */
  var location: js.UndefOr[Altitude] = js.undefined
  /** The smallest f-number of the lens at the focal length used to create the photo (APEX value). */
  var maxApertureValue: js.UndefOr[Double] = js.undefined
  /** The metering mode used to create the photo. */
  var meteringMode: js.UndefOr[String] = js.undefined
  /** The rotation in clockwise degrees from the image's original orientation. */
  var rotation: js.UndefOr[Double] = js.undefined
  /** The type of sensor used to create the photo. */
  var sensor: js.UndefOr[String] = js.undefined
  /** The distance to the subject of the photo, in meters. */
  var subjectDistance: js.UndefOr[Double] = js.undefined
  /** The date and time the photo was taken (EXIF DateTime). */
  var time: js.UndefOr[String] = js.undefined
  /** The white balance mode used to create the photo. */
  var whiteBalance: js.UndefOr[String] = js.undefined
  /** The width of the image in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}

object Aperture {
  @scala.inline
  def apply(
    aperture: js.UndefOr[Double] = js.undefined,
    cameraMake: String = null,
    cameraModel: String = null,
    colorSpace: String = null,
    exposureBias: js.UndefOr[Double] = js.undefined,
    exposureMode: String = null,
    exposureTime: js.UndefOr[Double] = js.undefined,
    flashUsed: js.UndefOr[Boolean] = js.undefined,
    focalLength: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    isoSpeed: js.UndefOr[Double] = js.undefined,
    lens: String = null,
    location: Altitude = null,
    maxApertureValue: js.UndefOr[Double] = js.undefined,
    meteringMode: String = null,
    rotation: js.UndefOr[Double] = js.undefined,
    sensor: String = null,
    subjectDistance: js.UndefOr[Double] = js.undefined,
    time: String = null,
    whiteBalance: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): Aperture = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aperture)) __obj.updateDynamic("aperture")(aperture.get.asInstanceOf[js.Any])
    if (cameraMake != null) __obj.updateDynamic("cameraMake")(cameraMake.asInstanceOf[js.Any])
    if (cameraModel != null) __obj.updateDynamic("cameraModel")(cameraModel.asInstanceOf[js.Any])
    if (colorSpace != null) __obj.updateDynamic("colorSpace")(colorSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(exposureBias)) __obj.updateDynamic("exposureBias")(exposureBias.get.asInstanceOf[js.Any])
    if (exposureMode != null) __obj.updateDynamic("exposureMode")(exposureMode.asInstanceOf[js.Any])
    if (!js.isUndefined(exposureTime)) __obj.updateDynamic("exposureTime")(exposureTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flashUsed)) __obj.updateDynamic("flashUsed")(flashUsed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focalLength)) __obj.updateDynamic("focalLength")(focalLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isoSpeed)) __obj.updateDynamic("isoSpeed")(isoSpeed.get.asInstanceOf[js.Any])
    if (lens != null) __obj.updateDynamic("lens")(lens.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(maxApertureValue)) __obj.updateDynamic("maxApertureValue")(maxApertureValue.get.asInstanceOf[js.Any])
    if (meteringMode != null) __obj.updateDynamic("meteringMode")(meteringMode.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (sensor != null) __obj.updateDynamic("sensor")(sensor.asInstanceOf[js.Any])
    if (!js.isUndefined(subjectDistance)) __obj.updateDynamic("subjectDistance")(subjectDistance.get.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (whiteBalance != null) __obj.updateDynamic("whiteBalance")(whiteBalance.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aperture]
  }
}

