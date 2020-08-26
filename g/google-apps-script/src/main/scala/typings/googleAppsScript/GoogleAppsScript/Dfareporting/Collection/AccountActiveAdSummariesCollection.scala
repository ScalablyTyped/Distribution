package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountActiveAdSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountActiveAdSummariesCollection extends js.Object {
  // Gets the account's active ad summary by account ID.
  def get(profileId: String, summaryAccountId: String): AccountActiveAdSummary = js.native
}

object AccountActiveAdSummariesCollection {
  @scala.inline
  def apply(get: (String, String) => AccountActiveAdSummary): AccountActiveAdSummariesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[AccountActiveAdSummariesCollection]
  }
  @scala.inline
  implicit class AccountActiveAdSummariesCollectionOps[Self <: AccountActiveAdSummariesCollection] (val x: Self) extends AnyVal {
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
    def setGet(value: (String, String) => AccountActiveAdSummary): Self = this.set("get", js.Any.fromFunction2(value))
  }
  
}

