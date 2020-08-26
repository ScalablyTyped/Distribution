package typings.formSerializer.FormSerializer

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormSerializerPatterns extends js.Object {
  var fixed: RegExp = js.native
  var key: RegExp = js.native
  var named: RegExp = js.native
  var push: RegExp = js.native
  var validate: RegExp = js.native
}

object FormSerializerPatterns {
  @scala.inline
  def apply(fixed: RegExp, key: RegExp, named: RegExp, push: RegExp, validate: RegExp): FormSerializerPatterns = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any], push = push.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSerializerPatterns]
  }
  @scala.inline
  implicit class FormSerializerPatternsOps[Self <: FormSerializerPatterns] (val x: Self) extends AnyVal {
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
    def setFixed(value: RegExp): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: RegExp): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamed(value: RegExp): Self = this.set("named", value.asInstanceOf[js.Any])
    @scala.inline
    def setPush(value: RegExp): Self = this.set("push", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidate(value: RegExp): Self = this.set("validate", value.asInstanceOf[js.Any])
  }
  
}

