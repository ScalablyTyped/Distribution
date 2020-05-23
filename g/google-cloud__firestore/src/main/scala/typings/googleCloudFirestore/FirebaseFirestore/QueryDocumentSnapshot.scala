package typings.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryDocumentSnapshot[T] extends DocumentSnapshot[T] {
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

