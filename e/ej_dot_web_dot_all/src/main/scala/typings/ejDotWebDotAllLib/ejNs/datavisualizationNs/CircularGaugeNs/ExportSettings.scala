package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExportSettings extends js.Object {
  /** Specifies the name of the action URL
               */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the downloading filename
               * @Default {CircularGauge}
               */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mode of exporting
               * @Default {client}
               */
  var mode: js.UndefOr[ExportingMode | java.lang.String] = js.undefined
  /** Specifies the format of the file to export
               * @Default {png}
               */
  var `type`: js.UndefOr[ExportingType | java.lang.String] = js.undefined
}

