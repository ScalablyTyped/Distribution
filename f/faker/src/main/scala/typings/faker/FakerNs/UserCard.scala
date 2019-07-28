package typings.faker.FakerNs

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
    val __obj = js.Dynamic.literal(address = address, company = company, email = email, name = name, phone = phone, username = username, website = website)
  
    __obj.asInstanceOf[UserCard]
  }
}

