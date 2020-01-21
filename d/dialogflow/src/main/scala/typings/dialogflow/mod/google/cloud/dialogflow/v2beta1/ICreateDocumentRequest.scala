package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CreateDocumentRequest. */
trait ICreateDocumentRequest extends js.Object {
  /** CreateDocumentRequest document */
  var document: js.UndefOr[IDocument | Null] = js.undefined
  /** CreateDocumentRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object ICreateDocumentRequest {
  @scala.inline
  def apply(document: IDocument = null, parent: String = null): ICreateDocumentRequest = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateDocumentRequest]
  }
}

