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
  
  val ClientMode: ClientMode with java.lang.String = js.native
  val ServerMode: ServerMode with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotNs.OperationalMode with java.lang.String] = js.native
}

