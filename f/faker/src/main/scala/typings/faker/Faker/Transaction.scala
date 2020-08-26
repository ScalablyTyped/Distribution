package typings.faker.Faker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  var account: String = js.native
  var amount: String = js.native
  var business: String = js.native
  var date: Date = js.native
  var name: String = js.native
  var `type`: String = js.native
}

object Transaction {
  @scala.inline
  def apply(account: String, amount: String, business: String, date: Date, name: String, `type`: String): Transaction = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], business = business.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
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
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setBusiness(value: String): Self = this.set("business", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

