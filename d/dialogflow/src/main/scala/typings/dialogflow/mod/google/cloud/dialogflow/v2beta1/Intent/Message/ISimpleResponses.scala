package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SimpleResponses. */
trait ISimpleResponses extends js.Object {
  /** SimpleResponses simpleResponses */
  var simpleResponses: js.UndefOr[js.Array[ISimpleResponse] | Null] = js.undefined
}

object ISimpleResponses {
  @scala.inline
  def apply(simpleResponses: js.UndefOr[Null | js.Array[ISimpleResponse]] = js.undefined): ISimpleResponses = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(simpleResponses)) __obj.updateDynamic("simpleResponses")(simpleResponses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimpleResponses]
  }
}

