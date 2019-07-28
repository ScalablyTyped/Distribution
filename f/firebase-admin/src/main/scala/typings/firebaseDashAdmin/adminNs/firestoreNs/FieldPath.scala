package typings.firebaseDashAdmin.adminNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/firestore", "FieldPath")
@js.native
class FieldPath protected ()
  extends typings.atGoogleDashCloudFirestore.FirebaseFirestoreNs.FieldPath {
  /**
    * Creates a FieldPath from the provided field names. If more than one field
    * name is provided, the path will point to a nested field in a document.
    *
    * @param fieldNames A list of field names.
    */
  def this(fieldNames: String*) = this()
}

/* static members */
@JSImport("@google-cloud/firestore", "FieldPath")
@js.native
object FieldPath extends js.Object {
  /**
    * Returns a special sentinel FieldPath to refer to the ID of a document.
    * It can be used in queries to sort or filter by the document ID.
    */
  def documentId(): typings.atGoogleDashCloudFirestore.FirebaseFirestoreNs.FieldPath = js.native
}

