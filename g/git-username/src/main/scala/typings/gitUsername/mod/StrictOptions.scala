package typings.gitUsername.mod

import typings.gitUsername.gitUsernameBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictOptions extends BaseOptions {
  @JSName("strict")
  var strict_StrictOptions: `true` = js.native
}

object StrictOptions {
  @scala.inline
  def apply(strict: `true`): StrictOptions = {
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictOptions]
  }
  @scala.inline
  implicit class StrictOptionsOps[Self <: StrictOptions] (val x: Self) extends AnyVal {
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
    def setStrict(value: `true`): Self = this.set("strict", value.asInstanceOf[js.Any])
  }
  
}

