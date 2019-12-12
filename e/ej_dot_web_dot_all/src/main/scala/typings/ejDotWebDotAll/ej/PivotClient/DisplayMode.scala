package typings.ejDotWebDotAll.ej.PivotClient

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.PivotClient.DisplayMode.ChartAndGrid
import typings.ejDotWebDotAll.ej.PivotClient.DisplayMode.ChartOnly
import typings.ejDotWebDotAll.ej.PivotClient.DisplayMode.GridOnly
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DisplayMode with Double] = js.native
  /* 2 */ @js.native
  object ChartAndGrid extends TopLevel[ChartAndGrid with Double]
  
  /* 0 */ @js.native
  object ChartOnly extends TopLevel[ChartOnly with Double]
  
  /* 1 */ @js.native
  object GridOnly extends TopLevel[GridOnly with Double]
  
}

