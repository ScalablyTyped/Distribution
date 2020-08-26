package typings.filesizeParser.mod

import typings.filesizeParser.filesizeParserNumbers.`10`
import typings.filesizeParser.filesizeParserNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var base: `2` | `10` = js.native
}

object Options {
  @scala.inline
  def apply(base: `2` | `10`): Options = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBase(value: `2` | `10`): Self = this.set("base", value.asInstanceOf[js.Any])
  }
  
}

