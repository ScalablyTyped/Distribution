package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnitTextPlacement extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.UnitTextPlacement")
@js.native
object UnitTextPlacement extends js.Object {
  //string
  @js.native
  sealed trait Back extends UnitTextPlacement
  
  //string
  @js.native
  sealed trait From extends UnitTextPlacement
  
  /* 0 */ val Back: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.UnitTextPlacement.Back with Double = js.native
  /* 1 */ val From: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.UnitTextPlacement.From with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnitTextPlacement with Double] = js.native
}

