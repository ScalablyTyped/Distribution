package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListTopicsRequest. */
trait IListTopicsRequest extends js.Object {
  /** ListTopicsRequest pageSize */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  /** ListTopicsRequest pageToken */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  /** ListTopicsRequest project */
  var project: js.UndefOr[String | Null] = js.undefined
}

object IListTopicsRequest {
  @scala.inline
  def apply(
    pageSize: js.UndefOr[Null | Double] = js.undefined,
    pageToken: js.UndefOr[Null | String] = js.undefined,
    project: js.UndefOr[Null | String] = js.undefined
  ): IListTopicsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pageToken)) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(project)) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListTopicsRequest]
  }
}

