package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSubscriptionsOptions extends js.Object {
  var autoPaginate: js.UndefOr[scala.Boolean] = js.undefined
  var gaxOpts: js.UndefOr[atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  var topic: js.UndefOr[
    atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.Topic | java.lang.String
  ] = js.undefined
}

object GetSubscriptionsOptions {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[scala.Boolean] = js.undefined,
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    topic: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.Topic | java.lang.String = null
  ): GetSubscriptionsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate)
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionsOptions]
  }
}

