package typings.dojo.dojox.grid.enhanced.plugins.filter.FilterExpr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_FilterExpr._ConditionExpr.html
  *
  * The most abstract class for all condition expressions.
  * A condition expression can be applied on a data row (e.g. an item in a store)
  * and generate a result condition expression.
  *
  */
@JSGlobal("dojox.grid.enhanced.plugins.filter._FilterExpr._ConditionExpr")
@js.native
class ConditionExpr () extends js.Object {
  /**
    * Unimplemented Interface
    * Apply this condition expression on the given datarow, return a result expression.
    *
    * @param datarow A data item of a store.
    * @param getter A user defined function that extract cell data from datarow.colArg is an argument that provides a kind of column information.It is defined by user in the constructor of a _DataExpr object.
    */
  def applyRow(datarow: js.Object, getter: js.Function2[/* row */ js.Object, /* colArg */ js.Object, js.Object]): js.Any = js.native
  /**
    * Get the name of this kind of expression.
    *
    */
  def getName(): js.Any = js.native
  /**
    * Convert this data expression to a simple object. Mainly used for serialization.
    *
    */
  def toObject(): js.Any = js.native
}

