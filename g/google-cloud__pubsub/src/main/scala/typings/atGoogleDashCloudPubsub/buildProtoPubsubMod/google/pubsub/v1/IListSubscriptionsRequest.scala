package typings.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1

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
  def apply(pageSize: Int | Double = null, pageToken: String = null, project: String = null): IListSubscriptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[IListSubscriptionsRequest]
  }
}

