package typings.ejDotWebDotAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettings extends js.Object {
  /** Specifies the name of the action URL
    */
  var action: js.UndefOr[String] = js.undefined
  /** Specifies the downloading filename
    * @Default {DigitalGauge}
    */
  var filename: js.UndefOr[String] = js.undefined
  /** Specifies the mode of exporting
    * @Default {client}
    */
  var mode: js.UndefOr[ExportingMode | String] = js.undefined
  /** Specifies the format of the file to export
    * @Default {png}
    */
  var `type`: js.UndefOr[ExportingType | String] = js.undefined
}

object ExportSettings {
  @scala.inline
  def apply(
    action: String = null,
    filename: String = null,
    mode: ExportingMode | String = null,
    `type`: ExportingType | String = null
  ): ExportSettings = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettings]
  }
}

