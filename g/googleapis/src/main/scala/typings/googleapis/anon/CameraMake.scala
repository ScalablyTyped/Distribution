package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraMake extends js.Object {
  var aperture: js.UndefOr[Double] = js.native
  var cameraMake: js.UndefOr[String] = js.native
  var cameraModel: js.UndefOr[String] = js.native
  var colorSpace: js.UndefOr[String] = js.native
  var exposureBias: js.UndefOr[Double] = js.native
  var exposureMode: js.UndefOr[String] = js.native
  var exposureTime: js.UndefOr[Double] = js.native
  var flashUsed: js.UndefOr[Boolean] = js.native
  var focalLength: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var isoSpeed: js.UndefOr[Double] = js.native
  var lens: js.UndefOr[String] = js.native
  var location: js.UndefOr[Altitude] = js.native
  var maxApertureValue: js.UndefOr[Double] = js.native
  var meteringMode: js.UndefOr[String] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var sensor: js.UndefOr[String] = js.native
  var subjectDistance: js.UndefOr[Double] = js.native
  var time: js.UndefOr[String] = js.native
  var whiteBalance: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object CameraMake {
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
  ): CameraMake = {
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
    __obj.asInstanceOf[CameraMake]
  }
}

