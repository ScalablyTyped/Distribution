package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AccountsAuthInfoResponse extends js.Object {
  /**
    * The account identifiers corresponding to the authenticated user. - For an
    * individual account: only the merchant ID is defined - For an aggregator:
    * only the aggregator ID is defined - For a subaccount of an MCA: both the
    * merchant ID and the aggregator ID are defined.
    */
  var accountIdentifiers: js.UndefOr[js.Array[Schema$AccountIdentifier]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountsAuthInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$AccountsAuthInfoResponse {
  @scala.inline
  def apply(accountIdentifiers: js.Array[Schema$AccountIdentifier] = null, kind: String = null): Schema$AccountsAuthInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (accountIdentifiers != null) __obj.updateDynamic("accountIdentifiers")(accountIdentifiers.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountsAuthInfoResponse]
  }
}

