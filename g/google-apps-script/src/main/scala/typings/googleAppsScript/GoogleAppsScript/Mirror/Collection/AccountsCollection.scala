package typings.googleAppsScript.GoogleAppsScript.Mirror.Collection

import typings.googleAppsScript.GoogleAppsScript.Mirror.Schema.Account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCollection extends js.Object {
  // Inserts a new account for a user
  def insert(resource: Account, userToken: String, accountType: String, accountName: String): Account
}

object AccountsCollection {
  @scala.inline
  def apply(insert: (Account, String, String, String) => Account): AccountsCollection = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction4(insert))
  
    __obj.asInstanceOf[AccountsCollection]
  }
}

