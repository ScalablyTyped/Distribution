package typings.eslint.anon

import typings.eslint.mod.Rule.SuggestionDescriptorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Desc extends SuggestionDescriptorMessage {
  var desc: String = js.native
}

object Desc {
  @scala.inline
  def apply(desc: String): Desc = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desc]
  }
  @scala.inline
  implicit class DescOps[Self <: Desc] (val x: Self) extends AnyVal {
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
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
  }
  
}

