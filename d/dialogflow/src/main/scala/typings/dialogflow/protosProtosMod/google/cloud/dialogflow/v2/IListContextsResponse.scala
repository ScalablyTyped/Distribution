package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

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
  def apply(contexts: js.Array[IContext] = null, nextPageToken: String = null): IListContextsResponse = {
    val __obj = js.Dynamic.literal()
    if (contexts != null) __obj.updateDynamic("contexts")(contexts.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListContextsResponse]
  }
}

