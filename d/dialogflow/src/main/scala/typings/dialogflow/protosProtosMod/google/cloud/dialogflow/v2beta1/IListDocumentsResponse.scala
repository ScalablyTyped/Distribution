package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListDocumentsResponse. */
trait IListDocumentsResponse extends js.Object {
  /** ListDocumentsResponse documents */
  var documents: js.UndefOr[js.Array[IDocument] | Null] = js.undefined
  /** ListDocumentsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}

object IListDocumentsResponse {
  @scala.inline
  def apply(documents: js.Array[IDocument] = null, nextPageToken: String = null): IListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (documents != null) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListDocumentsResponse]
  }
}

