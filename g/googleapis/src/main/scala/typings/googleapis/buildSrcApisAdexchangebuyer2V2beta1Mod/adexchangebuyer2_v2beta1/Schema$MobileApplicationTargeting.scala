package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile application targeting settings.
  */
@js.native
trait Schema$MobileApplicationTargeting extends js.Object {
  /**
    * Publisher owned apps to be targeted or excluded by the publisher to
    * display the ads in.
    */
  var firstPartyTargeting: js.UndefOr[Schema$FirstPartyMobileApplicationTargeting] = js.native
}

object Schema$MobileApplicationTargeting {
  @scala.inline
  def apply(firstPartyTargeting: Schema$FirstPartyMobileApplicationTargeting = null): Schema$MobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    if (firstPartyTargeting != null) __obj.updateDynamic("firstPartyTargeting")(firstPartyTargeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MobileApplicationTargeting]
  }
}

