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
  def apply(
    document: js.UndefOr[Null | IDocument] = js.undefined,
    updateMask: js.UndefOr[Null | IFieldMask] = js.undefined
  ): IUpdateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(document)) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (!js.isUndefined(updateMask)) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateDocumentRequest]
  }
}

