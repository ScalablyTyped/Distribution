package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAdsForce extends js.Object {
  var xAdsForce: js.UndefOr[Boolean] = js.undefined
}

object XAdsForce {
  @scala.inline
  def apply(xAdsForce: js.UndefOr[Boolean] = js.undefined): XAdsForce = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(xAdsForce)) __obj.updateDynamic("xAdsForce")(xAdsForce.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAdsForce]
  }
}

