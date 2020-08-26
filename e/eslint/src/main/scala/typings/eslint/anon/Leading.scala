package typings.eslint.anon

import typings.estree.mod.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Leading extends js.Object {
  var leading: js.Array[Comment] = js.native
  var trailing: js.Array[Comment] = js.native
}

object Leading {
  @scala.inline
  def apply(leading: js.Array[Comment], trailing: js.Array[Comment]): Leading = {
    val __obj = js.Dynamic.literal(leading = leading.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leading]
  }
  @scala.inline
  implicit class LeadingOps[Self <: Leading] (val x: Self) extends AnyVal {
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
    def setLeadingVarargs(value: Comment*): Self = this.set("leading", js.Array(value :_*))
    @scala.inline
    def setLeading(value: js.Array[Comment]): Self = this.set("leading", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrailingVarargs(value: Comment*): Self = this.set("trailing", js.Array(value :_*))
    @scala.inline
    def setTrailing(value: js.Array[Comment]): Self = this.set("trailing", value.asInstanceOf[js.Any])
  }
  
}

