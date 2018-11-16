package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HeatMapCell extends js.Object {
  /** Specifies whether the cell color can be visible or not.
               * @Default {true}
               */
  var showColor: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether the cell content can be visible or not.
               * @Default {ej.HeatMap.CellVisibility.Visible}
               */
  var showContent: js.UndefOr[CellVisibility | java.lang.String] = js.undefined
}

