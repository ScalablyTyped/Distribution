package typings.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a SearchAgentsRequest. */
trait ISearchAgentsRequest extends js.Object {
  /** SearchAgentsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** SearchAgentsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  /** SearchAgentsRequest parent */
  var parent: js.UndefOr[String | Null] = js.undefined
}

object ISearchAgentsRequest {
  @scala.inline
  def apply(pageSize: Int | Double = null, pageToken: String = null, parent: String = null): ISearchAgentsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchAgentsRequest]
  }
}

