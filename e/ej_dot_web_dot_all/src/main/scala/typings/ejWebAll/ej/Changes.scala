package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Changes extends js.Object {
  var added: js.UndefOr[js.Array[_]] = js.native
  var changed: js.UndefOr[js.Array[_]] = js.native
  var deleted: js.UndefOr[js.Array[_]] = js.native
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
    def setAddedVarargs(value: js.Any*): Self = this.set("added", js.Array(value :_*))
    @scala.inline
    def setAdded(value: js.Array[_]): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdded: Self = this.set("added", js.undefined)
    @scala.inline
    def setChangedVarargs(value: js.Any*): Self = this.set("changed", js.Array(value :_*))
    @scala.inline
    def setChanged(value: js.Array[_]): Self = this.set("changed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChanged: Self = this.set("changed", js.undefined)
    @scala.inline
    def setDeletedVarargs(value: js.Any*): Self = this.set("deleted", js.Array(value :_*))
    @scala.inline
    def setDeleted(value: js.Array[_]): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
  }
  
}

