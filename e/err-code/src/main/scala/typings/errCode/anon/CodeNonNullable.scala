package typings.errCode.anon

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeNonNullable extends js.Object {
  var code: NonNullable[String] = js.native
}

object CodeNonNullable {
  @scala.inline
  def apply(code: NonNullable[String]): CodeNonNullable = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeNonNullable]
  }
  @scala.inline
  implicit class CodeNonNullableOps[Self <: CodeNonNullable] (val x: Self) extends AnyVal {
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
    def setCode(value: NonNullable[String]): Self = this.set("code", value.asInstanceOf[js.Any])
  }
  
}

