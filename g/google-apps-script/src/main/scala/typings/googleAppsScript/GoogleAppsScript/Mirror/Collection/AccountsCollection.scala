package typings.googleAppsScript.GoogleAppsScript.Mirror.Collection

import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsCollection extends js.Object {
  // Inserts a new account for a user
  def insert(resource: Account, userToken: String, accountType: String, accountName: String): Account = js.native
}

object AccountsCollection {
  @scala.inline
  def apply(insert: (Account, String, String, String) => Account): AccountsCollection = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction4(insert))
    __obj.asInstanceOf[AccountsCollection]
  }
  @scala.inline
  implicit class AccountsCollectionOps[Self <: AccountsCollection] (val x: Self) extends AnyVal {
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
    def setInsert(value: (Account, String, String, String) => Account): Self = this.set("insert", js.Any.fromFunction4(value))
  }
  
}

