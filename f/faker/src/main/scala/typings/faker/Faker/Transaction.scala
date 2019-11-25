package typings.faker.Faker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var account: String
  var amount: String
  var business: String
  var date: Date
  var name: String
  var `type`: String
}

object Transaction {
  @scala.inline
  def apply(account: String, amount: String, business: String, date: Date, name: String, `type`: String): Transaction = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], business = business.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

