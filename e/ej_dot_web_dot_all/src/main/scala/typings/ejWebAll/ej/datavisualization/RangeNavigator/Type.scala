package typings.ejWebAll.ej.datavisualization.RangeNavigator

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
  
}

