package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileImageMediaMetadata extends js.Object {
  var aperture: js.UndefOr[stdLib.Number] = js.undefined
  var cameraMake: js.UndefOr[java.lang.String] = js.undefined
  var cameraModel: js.UndefOr[java.lang.String] = js.undefined
  var colorSpace: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[java.lang.String] = js.undefined
  var exposureBias: js.UndefOr[stdLib.Number] = js.undefined
  var exposureMode: js.UndefOr[java.lang.String] = js.undefined
  var exposureTime: js.UndefOr[stdLib.Number] = js.undefined
  var flashUsed: js.UndefOr[scala.Boolean] = js.undefined
  var focalLength: js.UndefOr[stdLib.Number] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var isoSpeed: js.UndefOr[scala.Double] = js.undefined
  var lens: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[FileImageMediaMetadataLocation] = js.undefined
  var maxApertureValue: js.UndefOr[stdLib.Number] = js.undefined
  var meteringMode: js.UndefOr[java.lang.String] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var sensor: js.UndefOr[java.lang.String] = js.undefined
  var subjectDistance: js.UndefOr[scala.Double] = js.undefined
  var whiteBalance: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object FileImageMediaMetadata {
  @scala.inline
  def apply(
    aperture: stdLib.Number = null,
    cameraMake: java.lang.String = null,
    cameraModel: java.lang.String = null,
    colorSpace: java.lang.String = null,
    date: java.lang.String = null,
    exposureBias: stdLib.Number = null,
    exposureMode: java.lang.String = null,
    exposureTime: stdLib.Number = null,
    flashUsed: js.UndefOr[scala.Boolean] = js.undefined,
    focalLength: stdLib.Number = null,
    height: scala.Int | scala.Double = null,
    isoSpeed: scala.Int | scala.Double = null,
    lens: java.lang.String = null,
    location: FileImageMediaMetadataLocation = null,
    maxApertureValue: stdLib.Number = null,
    meteringMode: java.lang.String = null,
    rotation: scala.Int | scala.Double = null,
    sensor: java.lang.String = null,
    subjectDistance: scala.Int | scala.Double = null,
    whiteBalance: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): FileImageMediaMetadata = {
    val __obj = js.Dynamic.literal()
    if (aperture != null) __obj.updateDynamic("aperture")(aperture)
    if (cameraMake != null) __obj.updateDynamic("cameraMake")(cameraMake)
    if (cameraModel != null) __obj.updateDynamic("cameraModel")(cameraModel)
    if (colorSpace != null) __obj.updateDynamic("colorSpace")(colorSpace)
    if (date != null) __obj.updateDynamic("date")(date)
    if (exposureBias != null) __obj.updateDynamic("exposureBias")(exposureBias)
    if (exposureMode != null) __obj.updateDynamic("exposureMode")(exposureMode)
    if (exposureTime != null) __obj.updateDynamic("exposureTime")(exposureTime)
    if (!js.isUndefined(flashUsed)) __obj.updateDynamic("flashUsed")(flashUsed)
    if (focalLength != null) __obj.updateDynamic("focalLength")(focalLength)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (isoSpeed != null) __obj.updateDynamic("isoSpeed")(isoSpeed.asInstanceOf[js.Any])
    if (lens != null) __obj.updateDynamic("lens")(lens)
    if (location != null) __obj.updateDynamic("location")(location)
    if (maxApertureValue != null) __obj.updateDynamic("maxApertureValue")(maxApertureValue)
    if (meteringMode != null) __obj.updateDynamic("meteringMode")(meteringMode)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (sensor != null) __obj.updateDynamic("sensor")(sensor)
    if (subjectDistance != null) __obj.updateDynamic("subjectDistance")(subjectDistance.asInstanceOf[js.Any])
    if (whiteBalance != null) __obj.updateDynamic("whiteBalance")(whiteBalance)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileImageMediaMetadata]
  }
}

