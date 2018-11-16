package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

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
  sealed trait ChartAndGrid
    extends ejDotWebDotAllLib.ejNs.PivotClientNs.DisplayMode
  
  ///To display only PivotChart widget.
  @js.native
  sealed trait ChartOnly
    extends ejDotWebDotAllLib.ejNs.PivotClientNs.DisplayMode
  
  ///To display only PivotGrid widget.
  @js.native
  sealed trait GridOnly
    extends ejDotWebDotAllLib.ejNs.PivotClientNs.DisplayMode
  
  val ChartAndGrid: ChartAndGrid with java.lang.String = js.native
  val ChartOnly: ChartOnly with java.lang.String = js.native
  val GridOnly: GridOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotClientNs.DisplayMode with java.lang.String] = js.native
}

