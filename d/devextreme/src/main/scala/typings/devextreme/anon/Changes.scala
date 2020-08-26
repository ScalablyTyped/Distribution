package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Changes extends js.Object {
  var changes: js.UndefOr[js.Array[_]] = js.native
}

object Changes {
  @scala.inline
  def apply(): Changes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Changes]
  }
  @scala.inline
  implicit class ChangesOps[Self <: Changes] (val x: Self) extends AnyVal {
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
    def setChangesVarargs(value: js.Any*): Self = this.set("changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: js.Array[_]): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChanges: Self = this.set("changes", js.undefined)
  }
  
}

