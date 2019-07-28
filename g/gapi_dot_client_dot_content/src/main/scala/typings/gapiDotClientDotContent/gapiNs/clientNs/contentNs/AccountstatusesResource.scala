package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotContent.Anon_AccountIdAltFields
import typings.gapiDotClientDotContent.Anon_Alt
import typings.gapiDotClientDotContent.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesResource extends js.Object {
  def custombatch(request: Anon_Alt): Request[AccountstatusesCustomBatchResponse]
  /**
    * Retrieves the status of a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: Anon_AccountIdAltFields): Request[AccountStatus]
  /** Lists the statuses of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: Anon_AltFields): Request[AccountstatusesListResponse]
}

object AccountstatusesResource {
  @scala.inline
  def apply(
    custombatch: Anon_Alt => Request[AccountstatusesCustomBatchResponse],
    get: Anon_AccountIdAltFields => Request[AccountStatus],
    list: Anon_AltFields => Request[AccountstatusesListResponse]
  ): AccountstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AccountstatusesResource]
  }
}

