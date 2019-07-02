package typings
package atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FirebaseFirestore.QueryDocumentSnapshot")
@js.native
class QueryDocumentSnapshot protected () extends DocumentSnapshot {
  /**
    * The time the document was created.
    */
  @JSName("createTime")
  val createTime_QueryDocumentSnapshot: Timestamp = js.native
  /**
    * The time the document was last updated (at the time the snapshot was
    * generated).
    */
  @JSName("updateTime")
  val updateTime_QueryDocumentSnapshot: Timestamp = js.native
}

