package typings.googleCloudPubsub.srcPubsubMod

import typings.googleGax.gaxMod.CallOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageOptions extends js.Object {
  var autoPaginate: js.UndefOr[Boolean] = js.undefined
  var gaxOpts: js.UndefOr[CallOptions] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var pageToken: js.UndefOr[String] = js.undefined
}

object PageOptions {
  @scala.inline
  def apply(
    autoPaginate: js.UndefOr[Boolean] = js.undefined,
    gaxOpts: CallOptions = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageToken: String = null
  ): PageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoPaginate)) __obj.updateDynamic("autoPaginate")(autoPaginate.get.asInstanceOf[js.Any])
    if (gaxOpts != null) __obj.updateDynamic("gaxOpts")(gaxOpts.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageOptions]
  }
}

