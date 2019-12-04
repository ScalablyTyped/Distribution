package typings.dojo.dojox.grid.enhanced.plugins.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_FilterExpr.html
  *
  *
  */
@JSName("_FilterExpr")
trait _FilterExpr_ extends js.Object {
  /**
    *
    */
  def BooleanExpr(): Unit
  /**
    *
    */
  def Contains(): Unit
  /**
    *
    */
  def DateExpr(): Unit
  /**
    *
    */
  def EndsWith(): Unit
  /**
    *
    */
  def EqualTo(): Unit
  /**
    *
    */
  def IsEmpty(): Unit
  /**
    *
    */
  def LargerThan(): Unit
  /**
    *
    */
  def LargerThanOrEqualTo(): Unit
  /**
    *
    */
  def LessThan(): Unit
  /**
    *
    */
  def LessThanOrEqualTo(): Unit
  /**
    *
    */
  def LogicALL(): Unit
  /**
    *
    */
  def LogicAND(): Unit
  /**
    *
    */
  def LogicANY(): Unit
  /**
    *
    */
  def LogicNOT(): Unit
  /**
    *
    */
  def LogicOR(): Unit
  /**
    *
    */
  def LogicXOR(): Unit
  /**
    *
    */
  def Matches(): Unit
  /**
    *
    */
  def NumberExpr(): Unit
  /**
    *
    */
  def StartsWith(): Unit
  /**
    *
    */
  def StringExpr(): Unit
  /**
    *
    */
  def TimeExpr(): Unit
}

object _FilterExpr_ {
  @scala.inline
  def apply(
    BooleanExpr: () => Unit,
    Contains: () => Unit,
    DateExpr: () => Unit,
    EndsWith: () => Unit,
    EqualTo: () => Unit,
    IsEmpty: () => Unit,
    LargerThan: () => Unit,
    LargerThanOrEqualTo: () => Unit,
    LessThan: () => Unit,
    LessThanOrEqualTo: () => Unit,
    LogicALL: () => Unit,
    LogicAND: () => Unit,
    LogicANY: () => Unit,
    LogicNOT: () => Unit,
    LogicOR: () => Unit,
    LogicXOR: () => Unit,
    Matches: () => Unit,
    NumberExpr: () => Unit,
    StartsWith: () => Unit,
    StringExpr: () => Unit,
    TimeExpr: () => Unit
  ): _FilterExpr_ = {
    val __obj = js.Dynamic.literal(BooleanExpr = js.Any.fromFunction0(BooleanExpr), Contains = js.Any.fromFunction0(Contains), DateExpr = js.Any.fromFunction0(DateExpr), EndsWith = js.Any.fromFunction0(EndsWith), EqualTo = js.Any.fromFunction0(EqualTo), IsEmpty = js.Any.fromFunction0(IsEmpty), LargerThan = js.Any.fromFunction0(LargerThan), LargerThanOrEqualTo = js.Any.fromFunction0(LargerThanOrEqualTo), LessThan = js.Any.fromFunction0(LessThan), LessThanOrEqualTo = js.Any.fromFunction0(LessThanOrEqualTo), LogicALL = js.Any.fromFunction0(LogicALL), LogicAND = js.Any.fromFunction0(LogicAND), LogicANY = js.Any.fromFunction0(LogicANY), LogicNOT = js.Any.fromFunction0(LogicNOT), LogicOR = js.Any.fromFunction0(LogicOR), LogicXOR = js.Any.fromFunction0(LogicXOR), Matches = js.Any.fromFunction0(Matches), NumberExpr = js.Any.fromFunction0(NumberExpr), StartsWith = js.Any.fromFunction0(StartsWith), StringExpr = js.Any.fromFunction0(StringExpr), TimeExpr = js.Any.fromFunction0(TimeExpr))
  
    __obj.asInstanceOf[_FilterExpr_]
  }
}

