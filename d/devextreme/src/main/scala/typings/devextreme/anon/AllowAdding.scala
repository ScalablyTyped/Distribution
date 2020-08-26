package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowAdding extends js.Object {
  var allowAdding: js.UndefOr[Boolean] = js.native
  var allowDeleting: js.UndefOr[Boolean] = js.native
  var allowDragging: js.UndefOr[Boolean] = js.native
  var allowEditingTimeZones: js.UndefOr[Boolean] = js.native
  var allowResizing: js.UndefOr[Boolean] = js.native
  var allowTimeZoneEditing: js.UndefOr[Boolean] = js.native
  var allowUpdating: js.UndefOr[Boolean] = js.native
}

object AllowAdding {
  @scala.inline
  def apply(): AllowAdding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowAdding]
  }
  @scala.inline
  implicit class AllowAddingOps[Self <: AllowAdding] (val x: Self) extends AnyVal {
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
    def setAllowAdding(value: Boolean): Self = this.set("allowAdding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAdding: Self = this.set("allowAdding", js.undefined)
    @scala.inline
    def setAllowDeleting(value: Boolean): Self = this.set("allowDeleting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDeleting: Self = this.set("allowDeleting", js.undefined)
    @scala.inline
    def setAllowDragging(value: Boolean): Self = this.set("allowDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDragging: Self = this.set("allowDragging", js.undefined)
    @scala.inline
    def setAllowEditingTimeZones(value: Boolean): Self = this.set("allowEditingTimeZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowEditingTimeZones: Self = this.set("allowEditingTimeZones", js.undefined)
    @scala.inline
    def setAllowResizing(value: Boolean): Self = this.set("allowResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowResizing: Self = this.set("allowResizing", js.undefined)
    @scala.inline
    def setAllowTimeZoneEditing(value: Boolean): Self = this.set("allowTimeZoneEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTimeZoneEditing: Self = this.set("allowTimeZoneEditing", js.undefined)
    @scala.inline
    def setAllowUpdating(value: Boolean): Self = this.set("allowUpdating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowUpdating: Self = this.set("allowUpdating", js.undefined)
  }
  
}

