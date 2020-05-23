package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

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
  def apply(
    documents: js.UndefOr[Null | js.Array[IDocument]] = js.undefined,
    nextPageToken: js.UndefOr[Null | String] = js.undefined
  ): IListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(documents)) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    if (!js.isUndefined(nextPageToken)) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListDocumentsResponse]
  }
}

