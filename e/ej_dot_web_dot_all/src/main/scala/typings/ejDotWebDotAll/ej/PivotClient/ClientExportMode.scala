package typings.ejDotWebDotAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClientExportMode extends js.Object

@JSGlobal("ej.PivotClient.ClientExportMode")
@js.native
object ClientExportMode extends js.Object {
  ///Exports both the PivotChart and PivotGrid on exporting.
  @js.native
  sealed trait ChartAndGrid extends ClientExportMode
  
  ///Exports the PivotChart control alone on exporting.
  @js.native
  sealed trait ChartOnly extends ClientExportMode
  
  ///Exports the PivotGrid control alone on exporting.
  @js.native
  sealed trait GridOnly extends ClientExportMode
  
  /* 0 */ val ChartAndGrid: typings.ejDotWebDotAll.ej.PivotClient.ClientExportMode.ChartAndGrid with Double = js.native
  /* 1 */ val ChartOnly: typings.ejDotWebDotAll.ej.PivotClient.ClientExportMode.ChartOnly with Double = js.native
  /* 2 */ val GridOnly: typings.ejDotWebDotAll.ej.PivotClient.ClientExportMode.GridOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClientExportMode with Double] = js.native
}

