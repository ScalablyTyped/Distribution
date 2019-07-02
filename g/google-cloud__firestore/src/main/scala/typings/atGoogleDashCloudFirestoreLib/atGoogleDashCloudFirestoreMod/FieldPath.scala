package typings
package atGoogleDashCloudFirestoreLib.atGoogleDashCloudFirestoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/firestore", "FieldPath")
@js.native
class FieldPath protected ()
  extends atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs.FieldPath {
  /**
    * Creates a FieldPath from the provided field names. If more than one field
    * name is provided, the path will point to a nested field in a document.
    *
    * @param fieldNames A list of field names.
    */
  def this(fieldNames: java.lang.String*) = this()
}

/* static members */
@JSImport("@google-cloud/firestore", "FieldPath")
@js.native
object FieldPath extends js.Object {
  /**
    * Returns a special sentinel FieldPath to refer to the ID of a document.
    * It can be used in queries to sort or filter by the document ID.
    */
  def documentId(): atGoogleDashCloudFirestoreLib.FirebaseFirestoreNs.FieldPath = js.native
}

