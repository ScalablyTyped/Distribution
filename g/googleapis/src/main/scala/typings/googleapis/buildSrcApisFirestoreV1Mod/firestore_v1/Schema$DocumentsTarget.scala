package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A target specified by a set of documents names.
  */
@js.native
trait Schema$DocumentsTarget extends js.Object {
  /**
    * The names of the documents to retrieve. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    * The request will fail if any of the document is not a child resource of
    * the given `database`. Duplicate names will be elided.
    */
  var documents: js.UndefOr[js.Array[String]] = js.native
}

object Schema$DocumentsTarget {
  @scala.inline
  def apply(documents: js.Array[String] = null): Schema$DocumentsTarget = {
    val __obj = js.Dynamic.literal()
    if (documents != null) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DocumentsTarget]
  }
}

