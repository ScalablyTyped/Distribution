package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message from a BatchUpdateDocument request.
  */
@js.native
trait Schema$BatchUpdateDocumentResponse extends js.Object {
  /**
    * The ID of the document to which the updates were applied to.
    */
  var documentId: js.UndefOr[String] = js.native
  /**
    * The reply of the updates. This maps 1:1 with the updates, although
    * replies to some requests may be empty.
    */
  var replies: js.UndefOr[js.Array[Schema$Response]] = js.native
  /**
    * The updated write control after applying the request.
    */
  var writeControl: js.UndefOr[Schema$WriteControl] = js.native
}

object Schema$BatchUpdateDocumentResponse {
  @scala.inline
  def apply(
    documentId: String = null,
    replies: js.Array[Schema$Response] = null,
    writeControl: Schema$WriteControl = null
  ): Schema$BatchUpdateDocumentResponse = {
    val __obj = js.Dynamic.literal()
    if (documentId != null) __obj.updateDynamic("documentId")(documentId.asInstanceOf[js.Any])
    if (replies != null) __obj.updateDynamic("replies")(replies.asInstanceOf[js.Any])
    if (writeControl != null) __obj.updateDynamic("writeControl")(writeControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchUpdateDocumentResponse]
  }
}

