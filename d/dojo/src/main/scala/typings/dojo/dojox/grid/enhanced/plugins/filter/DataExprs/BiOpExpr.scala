package typings.dojo.dojox.grid.enhanced.plugins.filter.DataExprs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs._BiOpExpr.html
  *
  * The most abstract class for all bi-operator expressions.
  * A bi-operator expression is an _OperatorExpr that allow and only allow two operands.
  *
  */
@JSGlobal("dojox.grid.enhanced.plugins.filter._DataExprs._BiOpExpr")
@js.native
class BiOpExpr () extends js.Object {
  /**
    * Implement _ConditionExpr.applyRow.
    * Apply the restriction of "two operands" and confirm operands are valid _ConditionExpr's.
    *
    * @param datarow
    * @param getter
    */
  def applyRow(datarow: js.Object, getter: js.Function2[/* row */ js.Object, /* colArg */ js.Object, js.Object]): js.Any = js.native
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

