package typings
package fakerLib.FakerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var account: java.lang.String
  var amount: java.lang.String
  var business: java.lang.String
  var date: stdLib.Date
  var name: java.lang.String
  var `type`: java.lang.String
}

object Transaction {
  @scala.inline
  def apply(
    account: java.lang.String,
    amount: java.lang.String,
    business: java.lang.String,
    date: stdLib.Date,
    name: java.lang.String,
    `type`: java.lang.String
  ): Transaction = {
    val __obj = js.Dynamic.literal(account = account, amount = amount, business = business, date = date, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Transaction]
  }
}

