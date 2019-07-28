package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XAdsForce extends js.Object {
  var xAdsForce: js.UndefOr[Boolean] = js.undefined
}

object Anon_XAdsForce {
  @scala.inline
  def apply(xAdsForce: js.UndefOr[Boolean] = js.undefined): Anon_XAdsForce = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(xAdsForce)) __obj.updateDynamic("xAdsForce")(xAdsForce)
    __obj.asInstanceOf[Anon_XAdsForce]
  }
}

