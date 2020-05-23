package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientWebDocumentViewerDocumentOperationResponse extends js.Object {
  var customData: String
  var documentId: String
  var message: String
  var succeeded: Boolean
}

object ASPxClientWebDocumentViewerDocumentOperationResponse {
  @scala.inline
  def apply(customData: String, documentId: String, message: String, succeeded: Boolean): ASPxClientWebDocumentViewerDocumentOperationResponse = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], documentId = documentId.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerDocumentOperationResponse]
  }
}

