package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CrosshairType extends js.Object

@JSGlobal("ej.datavisualization.Chart.CrosshairType")
@js.native
object CrosshairType extends js.Object {
  //string
  @js.native
  sealed trait Crosshair extends CrosshairType
  
  //string
  @js.native
  sealed trait Trackball extends CrosshairType
  
  /* 0 */ val Crosshair: typings.ejDotWebDotAll.ej.datavisualization.Chart.CrosshairType.Crosshair with Double = js.native
  /* 1 */ val Trackball: typings.ejDotWebDotAll.ej.datavisualization.Chart.CrosshairType.Trackball with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CrosshairType with Double] = js.native
}

