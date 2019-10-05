package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineCap extends js.Object

@JSGlobal("ej.datavisualization.Chart.LineCap")
@js.native
object LineCap extends js.Object {
  //string
  @js.native
  sealed trait Butt extends LineCap
  
  //string
  @js.native
  sealed trait Round extends LineCap
  
  //string
  @js.native
  sealed trait Square extends LineCap
  
  /* 0 */ val Butt: typings.ejDotWebDotAll.ej.datavisualization.Chart.LineCap.Butt with Double = js.native
  /* 1 */ val Round: typings.ejDotWebDotAll.ej.datavisualization.Chart.LineCap.Round with Double = js.native
  /* 2 */ val Square: typings.ejDotWebDotAll.ej.datavisualization.Chart.LineCap.Square with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineCap with Double] = js.native
}

