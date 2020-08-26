package typings.googleAppsScript.GoogleAppsScript.Adsense.Collection.Accounts

import typings.googleAppsScript.GoogleAppsScript.Adsense.Schema.Payments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentsCollection extends js.Object {
  // List the payments for the specified AdSense account.
  def list(accountId: String): Payments = js.native
}

object PaymentsCollection {
  @scala.inline
  def apply(list: String => Payments): PaymentsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[PaymentsCollection]
  }
  @scala.inline
  implicit class PaymentsCollectionOps[Self <: PaymentsCollection] (val x: Self) extends AnyVal {
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
    def setList(value: String => Payments): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

