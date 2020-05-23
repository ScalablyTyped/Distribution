package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContent.anon.Alt
import typings.gapiClientContent.anon.Key
import typings.gapiClientContent.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesResource extends js.Object {
  def custombatch(request: Alt): Request[AccountstatusesCustomBatchResponse]
  /**
    * Retrieves the status of a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: Key): Request[AccountStatus]
  /** Lists the statuses of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: MaxResults): Request[AccountstatusesListResponse]
}

object AccountstatusesResource {
  @scala.inline
  def apply(
    custombatch: Alt => Request[AccountstatusesCustomBatchResponse],
    get: Key => Request[AccountStatus],
    list: MaxResults => Request[AccountstatusesListResponse]
  ): AccountstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AccountstatusesResource]
  }
}

