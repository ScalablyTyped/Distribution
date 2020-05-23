package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

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
  def apply(
    pageSize: js.UndefOr[Null | Double] = js.undefined,
    pageToken: js.UndefOr[Null | String] = js.undefined,
    parent: js.UndefOr[Null | String] = js.undefined
  ): ISearchAgentsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pageToken)) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchAgentsRequest]
  }
}

