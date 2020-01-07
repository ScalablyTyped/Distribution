package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for Documents.ListDocuments.
  */
@js.native
trait Schema$GoogleCloudDialogflowV2beta1ListDocumentsResponse extends js.Object {
  /**
    * The list of documents.
    */
  var documents: js.UndefOr[js.Array[Schema$GoogleCloudDialogflowV2beta1Document]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudDialogflowV2beta1ListDocumentsResponse {
  @scala.inline
  def apply(
    documents: js.Array[Schema$GoogleCloudDialogflowV2beta1Document] = null,
    nextPageToken: String = null
  ): Schema$GoogleCloudDialogflowV2beta1ListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    if (documents != null) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudDialogflowV2beta1ListDocumentsResponse]
  }
}

