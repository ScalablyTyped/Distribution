package typings.gapiDotClientDotFirestore.gapiNs.clientNs

import typings.gapiDotClientDotFirestore.gapiDotClientDotFirestoreStrings.firestore
import typings.gapiDotClientDotFirestore.gapiDotClientDotFirestoreStrings.v1beta1
import typings.gapiDotClientDotFirestore.gapiNs.clientNs.firestoreNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val projects: ProjectsResource = js.native
  /** Load Google Cloud Firestore API v1beta1 */
  def load(name: firestore, version: v1beta1): js.Thenable[Unit] = js.native
  def load(name: firestore, version: v1beta1, callback: js.Function0[_]): Unit = js.native
}

