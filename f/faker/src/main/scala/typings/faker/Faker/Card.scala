package typings.faker.Faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  var accountHistory: js.Array[String]
  var address: FullAddress
  var company: Company
  var email: String
  var name: String
  var phone: String
  var posts: js.Array[Post]
  var username: String
  var website: String
}

object Card {
  @scala.inline
  def apply(
    accountHistory: js.Array[String],
    address: FullAddress,
    company: Company,
    email: String,
    name: String,
    phone: String,
    posts: js.Array[Post],
    username: String,
    website: String
  ): Card = {
    val __obj = js.Dynamic.literal(accountHistory = accountHistory, address = address, company = company, email = email, name = name, phone = phone, posts = posts, username = username, website = website)
  
    __obj.asInstanceOf[Card]
  }
}

