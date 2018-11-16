package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefaultView extends js.Object

@JSGlobal("ej.PivotClient.DefaultView")
@js.native
object DefaultView extends js.Object {
  ///To set PivotChart as a default control in view.
  @js.native
  sealed trait Chart
    extends ejDotWebDotAllLib.ejNs.PivotClientNs.DefaultView
  
  ///To set PivotGrid as a default control in view.
  @js.native
  sealed trait Grid
    extends ejDotWebDotAllLib.ejNs.PivotClientNs.DefaultView
  
  val Chart: Chart with java.lang.String = js.native
  val Grid: Grid with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotClientNs.DefaultView with java.lang.String] = js.native
}

