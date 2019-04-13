package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotsOptions extends js.Object {
  var autoPaginate: js.UndefOr[scala.Boolean] = js.undefined
  var gaxOpts: js.UndefOr[atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.GAXNs.CallOptions] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GetSnapshotsOptions {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[scala.Boolean] = js.undefined,
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.GAXNs.CallOptions = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null
  ): GetSnapshotsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate)
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetSnapshotsOptions]
  }
}

