package typings.faker.Faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Card extends js.Object {
  var accountHistory: js.Array[String] = js.native
  var address: FullAddress = js.native
  var company: Company = js.native
  var email: String = js.native
  var name: String = js.native
  var phone: String = js.native
  var posts: js.Array[Post] = js.native
  var username: String = js.native
  var website: String = js.native
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
    val __obj = js.Dynamic.literal(accountHistory = accountHistory.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  @scala.inline
  implicit class CardOps[Self <: Card] (val x: Self) extends AnyVal {
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
    def setAccountHistoryVarargs(value: String*): Self = this.set("accountHistory", js.Array(value :_*))
    @scala.inline
    def setAccountHistory(value: js.Array[String]): Self = this.set("accountHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress(value: FullAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompany(value: Company): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostsVarargs(value: Post*): Self = this.set("posts", js.Array(value :_*))
    @scala.inline
    def setPosts(value: js.Array[Post]): Self = this.set("posts", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
  }
  
}

