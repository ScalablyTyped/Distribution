package typings.faker.Faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Company extends js.Object {
  var bs: String = js.native
  var catchPhrase: String = js.native
  var name: String = js.native
}

object Company {
  @scala.inline
  def apply(bs: String, catchPhrase: String, name: String): Company = {
    val __obj = js.Dynamic.literal(bs = bs.asInstanceOf[js.Any], catchPhrase = catchPhrase.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Company]
  }
  @scala.inline
  implicit class CompanyOps[Self <: Company] (val x: Self) extends AnyVal {
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
    def setBs(value: String): Self = this.set("bs", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatchPhrase(value: String): Self = this.set("catchPhrase", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

