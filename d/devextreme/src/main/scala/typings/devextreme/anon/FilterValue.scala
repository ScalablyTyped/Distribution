package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterValue[T] extends js.Object {
  var component: js.UndefOr[T] = js.native
  var filterValue: js.UndefOr[js.Any] = js.native
  var text: js.UndefOr[String] = js.native
}

object FilterValue {
  @scala.inline
  def apply[T](): FilterValue[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterValue[T]]
  }
  @scala.inline
  implicit class FilterValueOps[Self <: FilterValue[_], T] (val x: Self with FilterValue[T]) extends AnyVal {
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
    def setComponent(value: T): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setFilterValue(value: js.Any): Self = this.set("filterValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterValue: Self = this.set("filterValue", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

