package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetDocumentRequest. */
trait IGetDocumentRequest extends js.Object {
  /** GetDocumentRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IGetDocumentRequest {
  @scala.inline
  def apply(name: String = null): IGetDocumentRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetDocumentRequest]
  }
}

