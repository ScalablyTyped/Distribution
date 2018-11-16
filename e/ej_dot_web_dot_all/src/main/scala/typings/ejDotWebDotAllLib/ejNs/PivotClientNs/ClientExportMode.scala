package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

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
  sealed trait ChartAndGrid
    extends ejDotWebDotAllLib.ejNs.PivotClientNs.ClientExportMode
  
  ///Exports the PivotChart control alone on exporting.
  @js.native
  sealed trait ChartOnly
    extends ejDotWebDotAllLib.ejNs.PivotClientNs.ClientExportMode
  
  ///Exports the PivotGrid control alone on exporting.
  @js.native
  sealed trait GridOnly
    extends ejDotWebDotAllLib.ejNs.PivotClientNs.ClientExportMode
  
  val ChartAndGrid: ChartAndGrid with java.lang.String = js.native
  val ChartOnly: ChartOnly with java.lang.String = js.native
  val GridOnly: GridOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotClientNs.ClientExportMode with java.lang.String] = js.native
}

