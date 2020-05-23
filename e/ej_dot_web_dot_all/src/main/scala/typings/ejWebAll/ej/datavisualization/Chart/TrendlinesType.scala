package typings.ejWebAll.ej.datavisualization.Chart

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
  
}

