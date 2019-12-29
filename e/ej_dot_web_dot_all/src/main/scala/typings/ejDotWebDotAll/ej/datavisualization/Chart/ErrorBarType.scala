package typings.ejDotWebDotAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorBarType extends js.Object

@JSGlobal("ej.datavisualization.Chart.ErrorBarType")
@js.native
object ErrorBarType extends js.Object {
  //string
  @js.native
  sealed trait FixedValue extends ErrorBarType
  
  //string
  @js.native
  sealed trait Percentage extends ErrorBarType
  
  //string
  @js.native
  sealed trait StandardDeviation extends ErrorBarType
  
  //string
  @js.native
  sealed trait StandardError extends ErrorBarType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorBarType with Double] = js.native
  /* 0 */ @js.native
  object FixedValue extends TopLevel[FixedValue with Double]
  
  /* 1 */ @js.native
  object Percentage extends TopLevel[Percentage with Double]
  
  /* 2 */ @js.native
  object StandardDeviation extends TopLevel[StandardDeviation with Double]
  
  /* 3 */ @js.native
  object StandardError extends TopLevel[StandardError with Double]
  
}

