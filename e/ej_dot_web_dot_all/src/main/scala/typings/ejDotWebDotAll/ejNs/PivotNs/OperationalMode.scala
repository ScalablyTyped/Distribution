package typings.ejDotWebDotAll.ejNs.PivotNs

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
  sealed trait ClientMode extends OperationalMode
  
  //To bind data source completely from server-side.
  @js.native
  sealed trait ServerMode extends OperationalMode
  
  /* 0 */ val ClientMode: typings.ejDotWebDotAll.ejNs.PivotNs.OperationalMode.ClientMode with Double = js.native
  /* 1 */ val ServerMode: typings.ejDotWebDotAll.ejNs.PivotNs.OperationalMode.ServerMode with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OperationalMode with Double] = js.native
}

