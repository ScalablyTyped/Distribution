package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContent.anon.Alt
import typings.gapiClientContent.anon.Key
import typings.gapiClientContent.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountstatusesResource extends js.Object {
  def custombatch(request: Alt): Request[AccountstatusesCustomBatchResponse] = js.native
  /**
    * Retrieves the status of a Merchant Center account. This method can only be called for accounts to which the managing account has access: either the
    * managing account itself for any Merchant Center account, or any sub-account when the managing account is a multi-client account.
    */
  def get(request: Key): Request[AccountStatus] = js.native
  /** Lists the statuses of the sub-accounts in your Merchant Center account. This method can only be called for multi-client accounts. */
  def list(request: MaxResults): Request[AccountstatusesListResponse] = js.native
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
  @scala.inline
  implicit class AccountstatusesResourceOps[Self <: AccountstatusesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustombatch(value: Alt => Request[AccountstatusesCustomBatchResponse]): Self = this.set("custombatch", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[AccountStatus]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[AccountstatusesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

