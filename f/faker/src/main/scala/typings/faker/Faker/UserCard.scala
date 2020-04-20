package typings.faker.Faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserCard extends js.Object {
  var address: Address
  var company: Company
  var email: String
  var name: String
  var phone: String
  var username: String
  var website: String
}

object UserCard {
  @scala.inline
  def apply(
    address: Address,
    company: Company,
    email: String,
    name: String,
    phone: String,
    username: String,
    website: String
  ): UserCard = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserCard]
  }
}

