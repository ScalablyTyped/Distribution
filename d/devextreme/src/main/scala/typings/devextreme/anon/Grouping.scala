package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grouping extends js.Object {
  var filtering: js.UndefOr[Boolean] = js.native
  var grouping: js.UndefOr[Boolean] = js.native
  var sorting: js.UndefOr[Boolean] = js.native
}

object Grouping {
  @scala.inline
  def apply(): Grouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grouping]
  }
  @scala.inline
  implicit class GroupingOps[Self <: Grouping] (val x: Self) extends AnyVal {
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
    def setFiltering(value: Boolean): Self = this.set("filtering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiltering: Self = this.set("filtering", js.undefined)
    @scala.inline
    def setGrouping(value: Boolean): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    @scala.inline
    def setSorting(value: Boolean): Self = this.set("sorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
  }
  
}

