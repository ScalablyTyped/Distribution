package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Unit extends js.Object

@JSGlobal("ej.datavisualization.Chart.Unit")
@js.native
object Unit extends js.Object {
  //string
  @js.native
  sealed trait Percentage extends Unit
  
  //string
  @js.native
  sealed trait Pixel extends Unit
  
  /* 0 */ val Percentage: typings.ejDotWebDotAll.ej.datavisualization.Chart.Unit.Percentage with Double = js.native
  /* 1 */ val Pixel: typings.ejDotWebDotAll.ej.datavisualization.Chart.Unit.Pixel with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Unit with Double] = js.native
}

