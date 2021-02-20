package typings.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
