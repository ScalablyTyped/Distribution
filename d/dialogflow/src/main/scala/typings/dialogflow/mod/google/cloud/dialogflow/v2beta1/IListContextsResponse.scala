package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListContextsResponse. */
trait IListContextsResponse extends js.Object {
  /** ListContextsResponse contexts */
  var contexts: js.UndefOr[js.Array[IContext] | Null] = js.undefined
  /** ListContextsResponse nextPageToken */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}

object IListContextsResponse {
  @scala.inline
  def apply(
    contexts: js.UndefOr[Null | js.Array[IContext]] = js.undefined,
    nextPageToken: js.UndefOr[Null | String] = js.undefined
  ): IListContextsResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contexts)) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (!js.isUndefined(nextPageToken)) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListContextsResponse]
  }
}

