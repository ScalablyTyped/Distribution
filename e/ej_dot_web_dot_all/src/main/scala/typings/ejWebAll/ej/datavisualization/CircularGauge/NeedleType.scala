package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NeedleType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.NeedleType")
@js.native
object NeedleType extends js.Object {
  //string
  @js.native
  sealed trait Arrow extends NeedleType
  
  //string
  @js.native
  sealed trait Image extends NeedleType
  
  //string
  @js.native
  sealed trait Rectangle extends NeedleType
  
  //string
  @js.native
  sealed trait Trapezoid extends NeedleType
  
  //string
  @js.native
  sealed trait Triangle extends NeedleType
  
}

