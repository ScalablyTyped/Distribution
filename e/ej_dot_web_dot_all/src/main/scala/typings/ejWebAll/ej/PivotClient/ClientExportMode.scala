package typings.ejWebAll.ej.PivotClient

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClientExportMode with Double] = js.native
  /* 0 */ @js.native
  object ChartAndGrid extends TopLevel[ChartAndGrid with Double]
  
  /* 1 */ @js.native
  object ChartOnly extends TopLevel[ChartOnly with Double]
  
  /* 2 */ @js.native
  object GridOnly extends TopLevel[GridOnly with Double]
  
}

