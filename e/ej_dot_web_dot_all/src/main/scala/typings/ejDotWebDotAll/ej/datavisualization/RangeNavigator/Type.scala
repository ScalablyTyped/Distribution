package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.Type")
@js.native
object Type extends js.Object {
  //string
  @js.native
  sealed trait Area extends Type
  
  //string
  @js.native
  sealed trait Line extends Type
  
  //string
  @js.native
  sealed trait Spline extends Type
  
  //string
  @js.native
  sealed trait SplineArea extends Type
  
  //string
  @js.native
  sealed trait StepArea extends Type
  
  //string
  @js.native
  sealed trait StepLine extends Type
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  /* 0 */ @js.native
  object Area extends TopLevel[Area with Double]
  
  /* 1 */ @js.native
  object Line extends TopLevel[Line with Double]
  
  /* 2 */ @js.native
  object Spline extends TopLevel[Spline with Double]
  
  /* 4 */ @js.native
  object SplineArea extends TopLevel[SplineArea with Double]
  
  /* 3 */ @js.native
  object StepArea extends TopLevel[StepArea with Double]
  
  /* 5 */ @js.native
  object StepLine extends TopLevel[StepLine with Double]
  
}

