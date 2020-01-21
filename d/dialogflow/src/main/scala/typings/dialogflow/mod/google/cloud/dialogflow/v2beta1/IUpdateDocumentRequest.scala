package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.protobuf.IFieldMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an UpdateDocumentRequest. */
trait IUpdateDocumentRequest extends js.Object {
  /** UpdateDocumentRequest document */
  var document: js.UndefOr[IDocument | Null] = js.undefined
  /** UpdateDocumentRequest updateMask */
  var updateMask: js.UndefOr[IFieldMask | Null] = js.undefined
}

object IUpdateDocumentRequest {
  @scala.inline
  def apply(document: IDocument = null, updateMask: IFieldMask = null): IUpdateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateDocumentRequest]
  }
}

