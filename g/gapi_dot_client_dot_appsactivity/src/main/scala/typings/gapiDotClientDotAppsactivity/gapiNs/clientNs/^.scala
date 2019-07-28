package typings.gapiDotClientDotAppsactivity.gapiNs.clientNs

import typings.gapiDotClientDotAppsactivity.gapiDotClientDotAppsactivityStrings.appsactivity
import typings.gapiDotClientDotAppsactivity.gapiDotClientDotAppsactivityStrings.v1
import typings.gapiDotClientDotAppsactivity.gapiNs.clientNs.appsactivityNs.ActivitiesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val activities: ActivitiesResource = js.native
  /** Load G Suite Activity API v1 */
  def load(name: appsactivity, version: v1): js.Thenable[Unit] = js.native
  def load(name: appsactivity, version: v1, callback: js.Function0[_]): Unit = js.native
}

