package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDocumentsResponse extends js.Object {
  var documents: js.UndefOr[js.Array[Document]] = js.undefined
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

