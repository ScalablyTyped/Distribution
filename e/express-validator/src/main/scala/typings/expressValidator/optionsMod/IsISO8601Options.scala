package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsISO8601Options extends js.Object {
  var strict: Boolean = js.native
}

object IsISO8601Options {
  @scala.inline
  def apply(strict: Boolean): IsISO8601Options = {
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsISO8601Options]
  }
  @scala.inline
  implicit class IsISO8601OptionsOps[Self <: IsISO8601Options] (val x: Self) extends AnyVal {
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
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
  }
  
}

