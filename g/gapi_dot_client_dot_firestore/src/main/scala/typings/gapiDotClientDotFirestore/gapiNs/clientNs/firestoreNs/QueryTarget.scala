package typings.gapiDotClientDotFirestore.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTarget extends js.Object {
  /**
    * The parent resource name. In the format:
    * `projects/{project_id}/databases/{database_id}/documents` or
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * For example:
    * `projects/my-project/databases/my-database/documents` or
    * `projects/my-project/databases/my-database/documents/chatrooms/my-chatroom`
    */
  var parent: js.UndefOr[String] = js.undefined
  /** A structured query. */
  var structuredQuery: js.UndefOr[StructuredQuery] = js.undefined
}

object QueryTarget {
  @scala.inline
  def apply(parent: String = null, structuredQuery: StructuredQuery = null): QueryTarget = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (structuredQuery != null) __obj.updateDynamic("structuredQuery")(structuredQuery)
    __obj.asInstanceOf[QueryTarget]
  }
}

