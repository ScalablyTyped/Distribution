package typings
package ejDotWebDotAllLib.ejNs.PivotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OperationalMode extends js.Object

@JSGlobal("ej.Pivot.OperationalMode")
@js.native
object OperationalMode extends js.Object {
  //To bind data source completely from client-side.
  @js.native
  sealed trait ClientMode
    extends ejDotWebDotAllLib.ejNs.PivotNs.OperationalMode
  
  //To bind data source completely from server-side.
  @js.native
  sealed trait ServerMode
    extends ejDotWebDotAllLib.ejNs.PivotNs.OperationalMode
  
  /* 0 */ val ClientMode: ClientMode with scala.Double = js.native
  /* 1 */ val ServerMode: ServerMode with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotNs.OperationalMode with scala.Double] = js.native
}

