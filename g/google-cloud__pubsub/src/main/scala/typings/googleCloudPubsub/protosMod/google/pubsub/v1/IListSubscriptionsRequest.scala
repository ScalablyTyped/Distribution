package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListSubscriptionsRequest. */
trait IListSubscriptionsRequest extends js.Object {
  /** ListSubscriptionsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** ListSubscriptionsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  /** ListSubscriptionsRequest project */
  var project: js.UndefOr[String | Null] = js.undefined
}

object IListSubscriptionsRequest {
  @scala.inline
  def apply(
    pageSize: js.UndefOr[Null | Double] = js.undefined,
    pageToken: js.UndefOr[Null | String] = js.undefined,
    project: js.UndefOr[Null | String] = js.undefined
  ): IListSubscriptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pageToken)) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(project)) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListSubscriptionsRequest]
  }
}

