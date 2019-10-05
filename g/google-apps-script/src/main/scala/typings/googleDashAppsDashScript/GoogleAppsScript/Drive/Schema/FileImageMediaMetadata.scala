package typings.googleDashAppsDashScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileImageMediaMetadata extends js.Object {
  var aperture: js.UndefOr[Double] = js.undefined
  var cameraMake: js.UndefOr[String] = js.undefined
  var cameraModel: js.UndefOr[String] = js.undefined
  var colorSpace: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[String] = js.undefined
  var exposureBias: js.UndefOr[Double] = js.undefined
  var exposureMode: js.UndefOr[String] = js.undefined
  var exposureTime: js.UndefOr[Double] = js.undefined
  var flashUsed: js.UndefOr[Boolean] = js.undefined
  var focalLength: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var isoSpeed: js.UndefOr[Double] = js.undefined
  var lens: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[FileImageMediaMetadataLocation] = js.undefined
  var maxApertureValue: js.UndefOr[Double] = js.undefined
  var meteringMode: js.UndefOr[String] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var sensor: js.UndefOr[String] = js.undefined
  var subjectDistance: js.UndefOr[Double] = js.undefined
  var whiteBalance: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object FileImageMediaMetadata {
  @scala.inline
  def apply(
    aperture: Int | Double = null,
    cameraMake: String = null,
    cameraModel: String = null,
    colorSpace: String = null,
    date: String = null,
    exposureBias: Int | Double = null,
    exposureMode: String = null,
    exposureTime: Int | Double = null,
    flashUsed: js.UndefOr[Boolean] = js.undefined,
    focalLength: Int | Double = null,
    height: Int | Double = null,
    isoSpeed: Int | Double = null,
    lens: String = null,
    location: FileImageMediaMetadataLocation = null,
    maxApertureValue: Int | Double = null,
    meteringMode: String = null,
    rotation: Int | Double = null,
    sensor: String = null,
    subjectDistance: Int | Double = null,
    whiteBalance: String = null,
    width: Int | Double = null
  ): FileImageMediaMetadata = {
    val __obj = js.Dynamic.literal()
    if (aperture != null) __obj.updateDynamic("aperture")(aperture.asInstanceOf[js.Any])
    if (cameraMake != null) __obj.updateDynamic("cameraMake")(cameraMake)
    if (cameraModel != null) __obj.updateDynamic("cameraModel")(cameraModel)
    if (colorSpace != null) __obj.updateDynamic("colorSpace")(colorSpace)
    if (date != null) __obj.updateDynamic("date")(date)
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
    if (whiteBalance != null) __obj.updateDynamic("whiteBalance")(whiteBalance)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileImageMediaMetadata]
  }
}

