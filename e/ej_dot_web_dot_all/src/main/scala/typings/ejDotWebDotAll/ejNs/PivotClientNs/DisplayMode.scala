package typings.ejDotWebDotAll.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DisplayMode extends js.Object

@JSGlobal("ej.PivotClient.DisplayMode")
@js.native
object DisplayMode extends js.Object {
  ///To display both PivotChart and PivotGrid widgets.
  @js.native
  sealed trait ChartAndGrid extends DisplayMode
  
  ///To display only PivotChart widget.
  @js.native
  sealed trait ChartOnly extends DisplayMode
  
  ///To display only PivotGrid widget.
  @js.native
  sealed trait GridOnly extends DisplayMode
  
  /* 2 */ val ChartAndGrid: typings.ejDotWebDotAll.ejNs.PivotClientNs.DisplayMode.ChartAndGrid with Double = js.native
  /* 0 */ val ChartOnly: typings.ejDotWebDotAll.ejNs.PivotClientNs.DisplayMode.ChartOnly with Double = js.native
  /* 1 */ val GridOnly: typings.ejDotWebDotAll.ejNs.PivotClientNs.DisplayMode.GridOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DisplayMode with Double] = js.native
}

