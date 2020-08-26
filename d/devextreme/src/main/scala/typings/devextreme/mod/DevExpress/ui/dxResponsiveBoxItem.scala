package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Col
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxResponsiveBoxItem extends CollectionWidgetItem {
  /** @name dxResponsiveBoxItem.location */
  var location: js.UndefOr[Col | js.Array[Col]] = js.native
}

object dxResponsiveBoxItem {
  @scala.inline
  def apply(): dxResponsiveBoxItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxResponsiveBoxItem]
  }
  @scala.inline
  implicit class dxResponsiveBoxItemOps[Self <: dxResponsiveBoxItem] (val x: Self) extends AnyVal {
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
    def setLocationVarargs(value: Col*): Self = this.set("location", js.Array(value :_*))
    @scala.inline
    def setLocation(value: Col | js.Array[Col]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

