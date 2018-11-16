package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val projects: gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs.ProjectsResource = js.native
  /** Load Google Cloud Firestore API v1beta1 */
  def load(
    name: gapiDotClientDotFirestoreLib.gapiDotClientDotFirestoreLibStrings.firestore,
    version: gapiDotClientDotFirestoreLib.gapiDotClientDotFirestoreLibStrings.v1beta1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotFirestoreLib.gapiDotClientDotFirestoreLibStrings.firestore,
    version: gapiDotClientDotFirestoreLib.gapiDotClientDotFirestoreLibStrings.v1beta1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

