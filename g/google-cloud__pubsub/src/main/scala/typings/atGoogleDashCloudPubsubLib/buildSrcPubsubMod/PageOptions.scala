package typings
package atGoogleDashCloudPubsubLib.buildSrcPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageOptions extends js.Object {
  var autoPaginate: js.UndefOr[scala.Boolean] = js.undefined
  var gaxOpts: js.UndefOr[googleDashGaxLib.buildSrcGaxMod.CallOptions] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

object PageOptions {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[scala.Boolean] = js.undefined,
    gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null
  ): PageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate)
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[PageOptions]
  }
}

