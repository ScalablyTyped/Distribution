package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCameraMake extends js.Object {
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
  var location: js.UndefOr[AnonAltitude] = js.native
  var maxApertureValue: js.UndefOr[Double] = js.native
  var meteringMode: js.UndefOr[String] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var sensor: js.UndefOr[String] = js.native
  var subjectDistance: js.UndefOr[Double] = js.native
  var time: js.UndefOr[String] = js.native
  var whiteBalance: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AnonCameraMake {
  @scala.inline
  def apply(
    aperture: Int | Double = null,
    cameraMake: String = null,
    cameraModel: String = null,
    colorSpace: String = null,
    exposureBias: Int | Double = null,
    exposureMode: String = null,
    exposureTime: Int | Double = null,
    flashUsed: js.UndefOr[Boolean] = js.undefined,
    focalLength: Int | Double = null,
    height: Int | Double = null,
    isoSpeed: Int | Double = null,
    lens: String = null,
    location: AnonAltitude = null,
    maxApertureValue: Int | Double = null,
    meteringMode: String = null,
    rotation: Int | Double = null,
    sensor: String = null,
    subjectDistance: Int | Double = null,
    time: String = null,
    whiteBalance: String = null,
    width: Int | Double = null
  ): AnonCameraMake = {
    val __obj = js.Dynamic.literal()
    if (aperture != null) __obj.updateDynamic("aperture")(aperture.asInstanceOf[js.Any])
    if (cameraMake != null) __obj.updateDynamic("cameraMake")(cameraMake.asInstanceOf[js.Any])
    if (cameraModel != null) __obj.updateDynamic("cameraModel")(cameraModel.asInstanceOf[js.Any])
    if (colorSpace != null) __obj.updateDynamic("colorSpace")(colorSpace.asInstanceOf[js.Any])
    if (exposureBias != null) __obj.updateDynamic("exposureBias")(exposureBias.asInstanceOf[js.Any])
    if (exposureMode != null) __obj.updateDynamic("exposureMode")(exposureMode.asInstanceOf[js.Any])
    if (exposureTime != null) __obj.updateDynamic("exposureTime")(exposureTime.asInstanceOf[js.Any])
    if (!js.isUndefined(flashUsed)) __obj.updateDynamic("flashUsed")(flashUsed.asInstanceOf[js.Any])
    if (focalLength != null) __obj.updateDynamic("focalLength")(focalLength.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (isoSpeed != null) __obj.updateDynamic("isoSpeed")(isoSpeed.asInstanceOf[js.Any])
    if (lens != null) __obj.updateDynamic("lens")(lens.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (maxApertureValue != null) __obj.updateDynamic("maxApertureValue")(maxApertureValue.asInstanceOf[js.Any])
    if (meteringMode != null) __obj.updateDynamic("meteringMode")(meteringMode.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (sensor != null) __obj.updateDynamic("sensor")(sensor.asInstanceOf[js.Any])
    if (subjectDistance != null) __obj.updateDynamic("subjectDistance")(subjectDistance.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (whiteBalance != null) __obj.updateDynamic("whiteBalance")(whiteBalance.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCameraMake]
  }
}

