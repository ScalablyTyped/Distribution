package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TrendlinesType extends js.Object

@JSGlobal("ej.datavisualization.Chart.TrendlinesType")
@js.native
object TrendlinesType extends js.Object {
  //string
  @js.native
  sealed trait Exponential extends TrendlinesType
  
  //string
  @js.native
  sealed trait Linear extends TrendlinesType
  
  //string
  @js.native
  sealed trait Logarithmic extends TrendlinesType
  
  //string
  @js.native
  sealed trait Polynomial extends TrendlinesType
  
  //string
  @js.native
  sealed trait Power extends TrendlinesType
  
  /* 1 */ val Exponential: typings.ejDotWebDotAll.ej.datavisualization.Chart.TrendlinesType.Exponential with Double = js.native
  /* 0 */ val Linear: typings.ejDotWebDotAll.ej.datavisualization.Chart.TrendlinesType.Linear with Double = js.native
  /* 2 */ val Logarithmic: typings.ejDotWebDotAll.ej.datavisualization.Chart.TrendlinesType.Logarithmic with Double = js.native
  /* 4 */ val Polynomial: typings.ejDotWebDotAll.ej.datavisualization.Chart.TrendlinesType.Polynomial with Double = js.native
  /* 3 */ val Power: typings.ejDotWebDotAll.ej.datavisualization.Chart.TrendlinesType.Power with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TrendlinesType with Double] = js.native
}

