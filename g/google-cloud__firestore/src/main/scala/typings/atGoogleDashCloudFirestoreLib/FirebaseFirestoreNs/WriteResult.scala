package typings
package atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FirebaseFirestore.WriteResult")
@js.native
class WriteResult protected () extends js.Object {
  /**
    * The write time as set by the Firestore servers.
    */
  val writeTime: Timestamp = js.native
  /**
    * Returns true if this `WriteResult` is equal to the provided one.
    *
    * @param other The `WriteResult` to compare against.
    * @return true if this `WriteResult` is equal to the provided one.
    */
  def isEqual(other: WriteResult): scala.Boolean = js.native
}

