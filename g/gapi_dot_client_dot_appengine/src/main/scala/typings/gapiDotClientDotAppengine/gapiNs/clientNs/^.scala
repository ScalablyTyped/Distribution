package typings.gapiDotClientDotAppengine.gapiNs.clientNs

import typings.gapiDotClientDotAppengine.gapiDotClientDotAppengineStrings.appengine
import typings.gapiDotClientDotAppengine.gapiDotClientDotAppengineStrings.v1
import typings.gapiDotClientDotAppengine.gapiNs.clientNs.appengineNs.AppsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val apps: AppsResource = js.native
  /** Load Google App Engine Admin API v1 */
  def load(name: appengine, version: v1): js.Thenable[Unit] = js.native
  def load(name: appengine, version: v1, callback: js.Function0[_]): Unit = js.native
}

