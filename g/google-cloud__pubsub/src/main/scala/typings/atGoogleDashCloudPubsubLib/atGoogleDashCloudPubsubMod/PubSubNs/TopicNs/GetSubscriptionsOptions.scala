package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.TopicNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Options are SLIGHTLY different to PubSub.getSubscriptions(...), so we can't just reuse it
trait GetSubscriptionsOptions extends js.Object {
  var autoPaginate: js.UndefOr[scala.Boolean] = js.undefined
  var gaxOpts: js.UndefOr[atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

