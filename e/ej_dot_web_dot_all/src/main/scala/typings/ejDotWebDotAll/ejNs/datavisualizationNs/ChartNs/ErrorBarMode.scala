package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorBarMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.ErrorBarMode")
@js.native
object ErrorBarMode extends js.Object {
  //string
  @js.native
  sealed trait Both extends ErrorBarMode
  
  //string
  @js.native
  sealed trait Horizontal extends ErrorBarMode
  
  //string
  @js.native
  sealed trait Vertical extends ErrorBarMode
  
  /* 0 */ val Both: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ErrorBarMode.Both with Double = js.native
  /* 2 */ val Horizontal: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ErrorBarMode.Horizontal with Double = js.native
  /* 1 */ val Vertical: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.ErrorBarMode.Vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorBarMode with Double] = js.native
}

