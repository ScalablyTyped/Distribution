package typings.formatUnicorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait String extends js.Object {
  def formatUnicorn(replacements: js.Object): java.lang.String = js.native
}

object String {
  @scala.inline
  def apply(formatUnicorn: js.Object => java.lang.String): String = {
    val __obj = js.Dynamic.literal(formatUnicorn = js.Any.fromFunction1(formatUnicorn))
    __obj.asInstanceOf[String]
  }
  @scala.inline
  implicit class StringOps[Self <: String] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormatUnicorn(value: js.Object => java.lang.String): Self = this.set("formatUnicorn", js.Any.fromFunction1(value))
  }
  
}

