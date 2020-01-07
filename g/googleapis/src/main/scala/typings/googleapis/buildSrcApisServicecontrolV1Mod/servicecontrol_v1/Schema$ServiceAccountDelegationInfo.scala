package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identity delegation history of an authenticated service account.
  */
@js.native
trait Schema$ServiceAccountDelegationInfo extends js.Object {
  /**
    * First party (Google) identity as the real authority.
    */
  var firstPartyPrincipal: js.UndefOr[Schema$FirstPartyPrincipal] = js.native
  /**
    * Third party identity as the real authority.
    */
  var thirdPartyPrincipal: js.UndefOr[Schema$ThirdPartyPrincipal] = js.native
}

object Schema$ServiceAccountDelegationInfo {
  @scala.inline
  def apply(
    firstPartyPrincipal: Schema$FirstPartyPrincipal = null,
    thirdPartyPrincipal: Schema$ThirdPartyPrincipal = null
  ): Schema$ServiceAccountDelegationInfo = {
    val __obj = js.Dynamic.literal()
    if (firstPartyPrincipal != null) __obj.updateDynamic("firstPartyPrincipal")(firstPartyPrincipal.asInstanceOf[js.Any])
    if (thirdPartyPrincipal != null) __obj.updateDynamic("thirdPartyPrincipal")(thirdPartyPrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ServiceAccountDelegationInfo]
  }
}

