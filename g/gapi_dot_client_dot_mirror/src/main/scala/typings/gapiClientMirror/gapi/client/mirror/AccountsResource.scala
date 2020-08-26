package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMirror.anon.AccountName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  /** Inserts a new account for a user */
  def insert(request: AccountName): Request[Account] = js.native
}

object AccountsResource {
  @scala.inline
  def apply(insert: AccountName => Request[Account]): AccountsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[AccountsResource]
  }
  @scala.inline
  implicit class AccountsResourceOps[Self <: AccountsResource] (val x: Self) extends AnyVal {
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
    def setInsert(value: AccountName => Request[Account]): Self = this.set("insert", js.Any.fromFunction1(value))
  }
  
}

