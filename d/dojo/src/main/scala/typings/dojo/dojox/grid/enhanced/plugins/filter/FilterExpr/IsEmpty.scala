package typings.dojo.dojox.grid.enhanced.plugins.filter.FilterExpr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_FilterExpr.IsEmpty.html
  *
  * Check empty
  *
  */
@JSGlobal("dojox.grid.enhanced.plugins.filter._FilterExpr.IsEmpty")
@js.native
class IsEmpty () extends js.Object {
  /**
    * Implement _ConditionExpr.applyRow.
    * Apply the restriction of "only one operand" and confirm the operand is a valid _ConditionExpr.
    * Then do the calculation of this operator.
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

