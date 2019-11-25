package typings.googleapisDashCommon.buildSrcDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoveryOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var includePrivate: js.UndefOr[Boolean] = js.undefined
}

object DiscoveryOptions {
  @scala.inline
  def apply(debug: js.UndefOr[Boolean] = js.undefined, includePrivate: js.UndefOr[Boolean] = js.undefined): DiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(includePrivate)) __obj.updateDynamic("includePrivate")(includePrivate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoveryOptions]
  }
}

