package typings.googleapis.buildSrcApisPubsubV1beta2Mod.pubsub_v1beta2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarTopicsDollarSubscriptionsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Maximum number of subscription names to return.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value returned by the last `ListTopicSubscriptionsResponse`;
    * indicates that this is a continuation of a prior `ListTopicSubscriptions`
    * call, and that the system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the topic that subscriptions are attached to.
    */
  var topic: js.UndefOr[String] = js.native
}

