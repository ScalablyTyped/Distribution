package typings.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.ListDocuments.
  */
@js.native
trait Schema$ListDocumentsResponse extends js.Object {
  /**
    * The Documents found.
    */
  var documents: js.UndefOr[js.Array[Schema$Document]] = js.native
  /**
    * The next page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListDocumentsResponse {
  @scala.inline
  def apply(documents: js.Array[Schema$Document] = null, nextPageToken: String = null): Schema$ListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (documents != null) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDocumentsResponse]
  }
}

