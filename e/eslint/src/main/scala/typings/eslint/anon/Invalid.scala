package typings.eslint.anon

import typings.eslint.mod.RuleTester.InvalidTestCase
import typings.eslint.mod.RuleTester.ValidTestCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invalid extends js.Object {
  var invalid: js.UndefOr[js.Array[InvalidTestCase]] = js.native
  var valid: js.UndefOr[js.Array[String | ValidTestCase]] = js.native
}

object Invalid {
  @scala.inline
  def apply(): Invalid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invalid]
  }
  @scala.inline
  implicit class InvalidOps[Self <: Invalid] (val x: Self) extends AnyVal {
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
    def setInvalidVarargs(value: InvalidTestCase*): Self = this.set("invalid", js.Array(value :_*))
    @scala.inline
    def setInvalid(value: js.Array[InvalidTestCase]): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    @scala.inline
    def setValidVarargs(value: (String | ValidTestCase)*): Self = this.set("valid", js.Array(value :_*))
    @scala.inline
    def setValid(value: js.Array[String | ValidTestCase]): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValid: Self = this.set("valid", js.undefined)
  }
  
}

