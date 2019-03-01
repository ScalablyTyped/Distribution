package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettings extends js.Object {
  /** Specifies the name of the action URL
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the angle for rotation
    * @Default {0}
    */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the downloading filename
    * @Default {chart}
    */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mode of exporting
    * @Default {client}
    */
  var mode: js.UndefOr[ExportingMode | java.lang.String] = js.undefined
  /** Enable/ disable the multiple excel exporting
    * @Default {false}
    */
  var multipleExport: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the orientation of the document
    * @Default {portrait}
    */
  var orientation: js.UndefOr[ExportingOrientation | java.lang.String] = js.undefined
  /** Specifies the format of the file to export
    * @Default {png}
    */
  var `type`: js.UndefOr[ExportingType | java.lang.String] = js.undefined
}

object ExportSettings {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    angle: scala.Int | scala.Double = null,
    filename: java.lang.String = null,
    mode: ExportingMode | java.lang.String = null,
    multipleExport: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: ExportingOrientation | java.lang.String = null,
    `type`: ExportingType | java.lang.String = null
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

