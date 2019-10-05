package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettings extends js.Object {
  /** Specifies the name of the action URL
    */
  var action: js.UndefOr[String] = js.undefined
  /** Specifies the angle for rotation
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.undefined
  /** Specifies the downloading filename
    * @Default {chart}
    */
  var filename: js.UndefOr[String] = js.undefined
  /** Specifies the mode of exporting
    * @Default {client}
    */
  var mode: js.UndefOr[ExportingMode | String] = js.undefined
  /** Enable/ disable the multiple excel exporting
    * @Default {false}
    */
  var multipleExport: js.UndefOr[Boolean] = js.undefined
  /** Specifies the orientation of the document
    * @Default {portrait}
    */
  var orientation: js.UndefOr[ExportingOrientation | String] = js.undefined
  /** Specifies the format of the file to export
    * @Default {png}
    */
  var `type`: js.UndefOr[ExportingType | String] = js.undefined
}

object ExportSettings {
  @scala.inline
  def apply(
    action: String = null,
    angle: Int | Double = null,
    filename: String = null,
    mode: ExportingMode | String = null,
    multipleExport: js.UndefOr[Boolean] = js.undefined,
    orientation: ExportingOrientation | String = null,
    `type`: ExportingType | String = null
  ): ExportSettings = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleExport)) __obj.updateDynamic("multipleExport")(multipleExport)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettings]
  }
}

