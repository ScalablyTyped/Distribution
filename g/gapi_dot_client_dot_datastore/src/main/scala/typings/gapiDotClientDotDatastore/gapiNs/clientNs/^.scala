package typings.gapiDotClientDotDatastore.gapiNs.clientNs

import typings.gapiDotClientDotDatastore.gapiDotClientDotDatastoreStrings.datastore
import typings.gapiDotClientDotDatastore.gapiDotClientDotDatastoreStrings.v1
import typings.gapiDotClientDotDatastore.gapiNs.clientNs.datastoreNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Google Cloud Datastore API v1 */
  def load(name: datastore, version: v1): js.Thenable[Unit] = js.native
  def load(name: datastore, version: v1, callback: js.Function0[_]): Unit = js.native
}

