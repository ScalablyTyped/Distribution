package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val apps: gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs.AppsResource = js.native
  /** Load Google App Engine Admin API v1 */
  def load(
    name: gapiDotClientDotAppengineLib.gapiDotClientDotAppengineLibStrings.appengine,
    version: gapiDotClientDotAppengineLib.gapiDotClientDotAppengineLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotAppengineLib.gapiDotClientDotAppengineLibStrings.appengine,
    version: gapiDotClientDotAppengineLib.gapiDotClientDotAppengineLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

