package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs.ProjectsResource = js.native
  /** Load Google Cloud Datastore API v1 */
  def load(
    name: gapiDotClientDotDatastoreLib.gapiDotClientDotDatastoreLibStrings.datastore,
    version: gapiDotClientDotDatastoreLib.gapiDotClientDotDatastoreLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotDatastoreLib.gapiDotClientDotDatastoreLibStrings.datastore,
    version: gapiDotClientDotDatastoreLib.gapiDotClientDotDatastoreLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

