package typings.ejWebAll.ej.PivotSchemaDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Olap extends js.Object {
  /** Allows the user to view the KPI elements in tree-view inside PivotTable Field List. This is only applicable for OLAP datasource.
    * @Default {false}
    */
  var showKPI: js.UndefOr[Boolean] = js.undefined
  /** Allows the user to view the named sets in tree-view inside PivotTable Field List. This is only applicable for OLAP datasource.
    * @Default {false}
    */
  var showNamedSets: js.UndefOr[Boolean] = js.undefined
}

object Olap {
  @scala.inline
  def apply(showKPI: js.UndefOr[Boolean] = js.undefined, showNamedSets: js.UndefOr[Boolean] = js.undefined): Olap = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showKPI)) __obj.updateDynamic("showKPI")(showKPI.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNamedSets)) __obj.updateDynamic("showNamedSets")(showNamedSets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Olap]
  }
}

