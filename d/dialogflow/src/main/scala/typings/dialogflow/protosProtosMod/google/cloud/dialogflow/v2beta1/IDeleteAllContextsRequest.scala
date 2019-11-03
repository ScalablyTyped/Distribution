package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteAllContextsRequest. */
trait IDeleteAllContextsRequest extends js.Object {
  /** DeleteAllContextsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IDeleteAllContextsRequest {
  @scala.inline
  def apply(parent: String = null): IDeleteAllContextsRequest = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[IDeleteAllContextsRequest]
  }
}

