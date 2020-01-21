package typings.dojo.dojox.grid.enhanced.plugins.filter.FilterExpr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_FilterExpr.LogicANY.html
  *
  * A logic ANY condition expression, equals a sequence of logic ORs
  *
  */
@JSGlobal("dojox.grid.enhanced.plugins.filter._FilterExpr.LogicANY")
@js.native
class LogicANY () extends js.Object {
  /**
    *
    * @param datarow
    * @param getter
    */
  def applyRow(datarow: js.Object, getter: js.Function2[/* row */ js.Object, /* colIdx */ Double, js.Object]): js.Any = js.native
  /**
    * Get the name of this kind of expression.
    *
    */
  def getName(): js.Any = js.native
  /**
    * Overrided from _ConditionExpr.toObject
    *
    */
  def toObject(): js.Object = js.native
}

