package typings.faker.Faker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextualCard extends js.Object {
  var address: Address
  var avatar: String
  var company: Company
  var dob: Date
  var email: String
  var name: String
  var phone: String
  var username: String
  var website: String
}

object ContextualCard {
  @scala.inline
  def apply(
    address: Address,
    avatar: String,
    company: Company,
    dob: Date,
    email: String,
    name: String,
    phone: String,
    username: String,
    website: String
  ): ContextualCard = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], dob = dob.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContextualCard]
  }
}

