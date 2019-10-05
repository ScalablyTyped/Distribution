package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CrosshairMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.CrosshairMode")
@js.native
object CrosshairMode extends js.Object {
  //string
  @js.native
  sealed trait Float extends CrosshairMode
  
  //string
  @js.native
  sealed trait Grouping extends CrosshairMode
  
  /* 0 */ val Float: typings.ejDotWebDotAll.ej.datavisualization.Chart.CrosshairMode.Float with Double = js.native
  /* 1 */ val Grouping: typings.ejDotWebDotAll.ej.datavisualization.Chart.CrosshairMode.Grouping with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CrosshairMode with Double] = js.native
}

