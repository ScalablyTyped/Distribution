package typings.dojo.dojox.grid.enhanced.plugins.filter._FilterExpr

import typings.dojo.Fn_ColIdx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_FilterExpr.BooleanExpr.html
  *
  * A condition expression wrapper for boolean values
  *
  * @param dataValue If isColumn is a boolean true, then it should be a kind of column information, like field nameor column index. Otherwise, it is regarded as a pure value, and the getValue method will simplyreturn it.
  * @param isColumn       OptionalOptional. To specify whether this _DataExpr represents a column or a pure value.
  * @param convertArgs
  */
@JSGlobal("dojox.grid.enhanced.plugins.filter._FilterExpr.BooleanExpr")
@js.native
class BooleanExpr () extends js.Object {
  def this(dataValue: js.Any) = this()
  def this(dataValue: js.Any, isColumn: Boolean) = this()
  def this(dataValue: js.Any, isColumn: Boolean, convertArgs: js.Object) = this()
  /**
    * Implement _ConditionExpr.applyRow.
    * If this is a pure value, simply return self.
    * Otherwise, extract the cell data from datarow using the given getter function,
    * and then convert this cell data to a _DataExpr and return the expression.
    * An object with the following properties:_nameapplyRow: Unimplemented Interface
    * Apply this condition expression on the given datarow, return a result expression.
    * toObject: Convert this data expression to a simple object. Mainly used for serialization.
    * getName: Get the name of this kind of expression.
    *
    * @param datarow
    * @param getter
    */
  def applyRow(datarow: js.Object, getter: Fn_ColIdx): js.Object = js.native
  /**
    * Get the name of this kind of expression.
    *
    */
  def getName(): js.Any = js.native
  /**
    * If this is a pure value wrapper, simply return the value.
    * Otherwise (it's a column), return is undefined.
    *
    */
  def getValue(): js.Any = js.native
  /**
    * Overrided from _ConditionExpr.toObject
    *
    */
  def toObject(): String = js.native
}

