package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsAuthInfoResponse extends js.Object {
  /**
    * The account identifiers corresponding to the authenticated user.
    * - For an individual account: only the merchant ID is defined
    * - For an aggregator: only the aggregator ID is defined
    * - For a subaccount of an MCA: both the merchant ID and the aggregator ID are defined.
    */
  var accountIdentifiers: js.UndefOr[js.Array[AccountIdentifier]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountsAuthInfoResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object AccountsAuthInfoResponse {
  @scala.inline
  def apply(accountIdentifiers: js.Array[AccountIdentifier] = null, kind: String = null): AccountsAuthInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (accountIdentifiers != null) __obj.updateDynamic("accountIdentifiers")(accountIdentifiers)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccountsAuthInfoResponse]
  }
}

