package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportingMode extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.ExportingMode")
@js.native
object ExportingMode extends js.Object {
  //string
  @js.native
  sealed trait ClientSide extends ExportingMode
  
  //string
  @js.native
  sealed trait ServerSide extends ExportingMode
  
  /* 1 */ val ClientSide: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.ExportingMode.ClientSide with Double = js.native
  /* 0 */ val ServerSide: typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.ExportingMode.ServerSide with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportingMode with Double] = js.native
}

