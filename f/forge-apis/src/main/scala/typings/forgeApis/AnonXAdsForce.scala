package typings.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXAdsForce extends js.Object {
  var xAdsForce: js.UndefOr[Boolean] = js.undefined
}

object AnonXAdsForce {
  @scala.inline
  def apply(xAdsForce: js.UndefOr[Boolean] = js.undefined): AnonXAdsForce = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(xAdsForce)) __obj.updateDynamic("xAdsForce")(xAdsForce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXAdsForce]
  }
}

