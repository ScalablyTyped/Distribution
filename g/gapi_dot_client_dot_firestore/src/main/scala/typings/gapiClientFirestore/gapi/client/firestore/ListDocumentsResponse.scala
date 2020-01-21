package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDocumentsResponse extends js.Object {
  /** The Documents found. */
  var documents: js.UndefOr[js.Array[Document]] = js.undefined
  /** The next page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListDocumentsResponse {
  @scala.inline
  def apply(documents: js.Array[Document] = null, nextPageToken: String = null): ListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (documents != null) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDocumentsResponse]
  }
}

