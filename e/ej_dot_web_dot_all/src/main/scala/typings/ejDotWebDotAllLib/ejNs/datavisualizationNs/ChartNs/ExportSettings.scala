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

