package typings.gapiDotClientDotAppstate.gapiNs.clientNs

import typings.gapiDotClientDotAppstate.gapiDotClientDotAppstateStrings.appstate
import typings.gapiDotClientDotAppstate.gapiDotClientDotAppstateStrings.v1
import typings.gapiDotClientDotAppstate.gapiNs.clientNs.appstateNs.StatesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val states: StatesResource = js.native
  /** Load Google App State API v1 */
  def load(name: appstate, version: v1): js.Thenable[Unit] = js.native
  def load(name: appstate, version: v1, callback: js.Function0[_]): Unit = js.native
}

