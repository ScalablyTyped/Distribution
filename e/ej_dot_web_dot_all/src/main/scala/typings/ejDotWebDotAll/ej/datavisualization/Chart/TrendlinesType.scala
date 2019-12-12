package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Chart.TrendlinesType.Exponential
import typings.ejDotWebDotAll.ej.datavisualization.Chart.TrendlinesType.Linear
import typings.ejDotWebDotAll.ej.datavisualization.Chart.TrendlinesType.Logarithmic
import typings.ejDotWebDotAll.ej.datavisualization.Chart.TrendlinesType.Polynomial
import typings.ejDotWebDotAll.ej.datavisualization.Chart.TrendlinesType.Power
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TrendlinesType with Double] = js.native
  /* 1 */ @js.native
  object Exponential extends TopLevel[Exponential with Double]
  
  /* 0 */ @js.native
  object Linear extends TopLevel[Linear with Double]
  
  /* 2 */ @js.native
  object Logarithmic extends TopLevel[Logarithmic with Double]
  
  /* 4 */ @js.native
  object Polynomial extends TopLevel[Polynomial with Double]
  
  /* 3 */ @js.native
  object Power extends TopLevel[Power with Double]
  
}

