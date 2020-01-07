package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of targeted and excluded mobile application IDs that
  * publishers own. Mobile application IDs are from App Store and Google Play
  * Store. Android App ID, for example, com.google.android.apps.maps, can be
  * found in Google Play Store URL. iOS App ID (which is a number) can be found
  * at the end of iTunes store URL. First party mobile applications is either
  * included or excluded.
  */
@js.native
trait Schema$FirstPartyMobileApplicationTargeting extends js.Object {
  /**
    * A list of application IDs to be excluded.
    */
  var excludedAppIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of application IDs to be included.
    */
  var targetedAppIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$FirstPartyMobileApplicationTargeting {
  @scala.inline
  def apply(excludedAppIds: js.Array[String] = null, targetedAppIds: js.Array[String] = null): Schema$FirstPartyMobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    if (excludedAppIds != null) __obj.updateDynamic("excludedAppIds")(excludedAppIds.asInstanceOf[js.Any])
    if (targetedAppIds != null) __obj.updateDynamic("targetedAppIds")(targetedAppIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FirstPartyMobileApplicationTargeting]
  }
}

