package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListIntentsResponse. */
trait IListIntentsResponse extends js.Object {
  /** ListIntentsResponse intents */
  var intents: js.UndefOr[js.Array[IIntent] | Null] = js.undefined
  /** ListIntentsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}

object IListIntentsResponse {
  @scala.inline
  def apply(
    intents: js.UndefOr[Null | js.Array[IIntent]] = js.undefined,
    nextPageToken: js.UndefOr[Null | String] = js.undefined
  ): IListIntentsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(intents)) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    if (!js.isUndefined(nextPageToken)) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListIntentsResponse]
  }
}

