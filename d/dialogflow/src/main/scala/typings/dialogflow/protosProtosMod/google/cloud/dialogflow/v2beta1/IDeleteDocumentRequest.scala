package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteDocumentRequest. */
trait IDeleteDocumentRequest extends js.Object {
  /** DeleteDocumentRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IDeleteDocumentRequest {
  @scala.inline
  def apply(name: String = null): IDeleteDocumentRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeleteDocumentRequest]
  }
}

