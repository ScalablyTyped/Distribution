package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AxisOrientation extends js.Object

@JSGlobal("ej.datavisualization.Chart.AxisOrientation")
@js.native
object AxisOrientation extends js.Object {
  //string
  @js.native
  sealed trait Horizontal extends AxisOrientation
  
  //string
  @js.native
  sealed trait Vertical extends AxisOrientation
  
  /* 0 */ val Horizontal: typings.ejDotWebDotAll.ej.datavisualization.Chart.AxisOrientation.Horizontal with Double = js.native
  /* 1 */ val Vertical: typings.ejDotWebDotAll.ej.datavisualization.Chart.AxisOrientation.Vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AxisOrientation with Double] = js.native
}

