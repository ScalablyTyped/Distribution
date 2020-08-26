package typings.faker.Faker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextualCard extends js.Object {
  var address: Address = js.native
  var avatar: String = js.native
  var company: Company = js.native
  var dob: Date = js.native
  var email: String = js.native
  var name: String = js.native
  var phone: String = js.native
  var username: String = js.native
  var website: String = js.native
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
  @scala.inline
  implicit class ContextualCardOps[Self <: ContextualCard] (val x: Self) extends AnyVal {
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
    def setAddress(value: Address): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatar(value: String): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompany(value: Company): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def setDob(value: Date): Self = this.set("dob", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
  }
  
}

