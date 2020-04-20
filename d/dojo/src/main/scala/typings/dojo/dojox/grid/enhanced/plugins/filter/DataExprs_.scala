package typings.dojo.dojox.grid.enhanced.plugins.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs.html
  *
  *
  */
trait DataExprs_ extends js.Object {
  /**
    *
    */
  def BooleanExpr(): Unit
  /**
    *
    */
  def DateExpr(): Unit
  /**
    *
    */
  def NumberExpr(): Unit
  /**
    *
    */
  def StringExpr(): Unit
  /**
    *
    */
  def TimeExpr(): Unit
}

object DataExprs_ {
  @scala.inline
  def apply(
    BooleanExpr: () => Unit,
    DateExpr: () => Unit,
    NumberExpr: () => Unit,
    StringExpr: () => Unit,
    TimeExpr: () => Unit
  ): DataExprs_ = {
    val __obj = js.Dynamic.literal(BooleanExpr = js.Any.fromFunction0(BooleanExpr), DateExpr = js.Any.fromFunction0(DateExpr), NumberExpr = js.Any.fromFunction0(NumberExpr), StringExpr = js.Any.fromFunction0(StringExpr), TimeExpr = js.Any.fromFunction0(TimeExpr))
    __obj.asInstanceOf[DataExprs_]
  }
}

