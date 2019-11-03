package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetContextRequest. */
trait IGetContextRequest extends js.Object {
  /** GetContextRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IGetContextRequest {
  @scala.inline
  def apply(name: String = null): IGetContextRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IGetContextRequest]
  }
}

