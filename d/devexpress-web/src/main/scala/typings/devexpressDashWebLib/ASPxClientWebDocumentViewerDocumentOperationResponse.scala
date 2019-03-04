package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the result of preforming a custom document operation on the client side.
  */
trait ASPxClientWebDocumentViewerDocumentOperationResponse extends js.Object {
  /**
    * Specifies custom data associated with the performed document operation.
    * Value: A string containing information associated with the document operation.
    */
  var customData: java.lang.String
  /**
    * Specifies the document ID.
    * Value: A string that specifies the document ID.
    */
  var documentId: java.lang.String
  /**
    * Specifies the error message to display if performing a document operation fails.
    * Value: A string specifying the text of the error message.
    */
  var message: java.lang.String
  /**
    * Specifies whether a document operation has been successfully performed.
    * Value: true, if the document operation has been successfully performed; otherwise, false.
    */
  var succeeded: scala.Boolean
}

object ASPxClientWebDocumentViewerDocumentOperationResponse {
  @scala.inline
  def apply(
    customData: java.lang.String,
    documentId: java.lang.String,
    message: java.lang.String,
    succeeded: scala.Boolean
  ): ASPxClientWebDocumentViewerDocumentOperationResponse = {
    val __obj = js.Dynamic.literal(customData = customData, documentId = documentId, message = message, succeeded = succeeded)
  
    __obj.asInstanceOf[ASPxClientWebDocumentViewerDocumentOperationResponse]
  }
}

