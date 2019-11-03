package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListContextsRequest. */
trait IListContextsRequest extends js.Object {
  /** ListContextsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** ListContextsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  /** ListContextsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object IListContextsRequest {
  @scala.inline
  def apply(pageSize: Int | Double = null, pageToken: String = null, parent: String = null): IListContextsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[IListContextsRequest]
  }
}

