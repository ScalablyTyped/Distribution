package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a DeleteContextRequest. */
trait IDeleteContextRequest extends js.Object {
  /** DeleteContextRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IDeleteContextRequest {
  @scala.inline
  def apply(name: String = null): IDeleteContextRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IDeleteContextRequest]
  }
}

