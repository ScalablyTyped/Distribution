package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQueryPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomItem[T] extends js.Object {
  var component: js.UndefOr[T] = js.native
  var customItem: js.UndefOr[String | js.Any | typings.devextreme.mod.global.Promise[_] | JQueryPromise[_]] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var text: js.UndefOr[String] = js.native
}

object CustomItem {
  @scala.inline
  def apply[T](): CustomItem[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomItem[T]]
  }
  @scala.inline
  implicit class CustomItemOps[Self <: CustomItem[_], T] (val x: Self with CustomItem[T]) extends AnyVal {
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
    def setCustomItem(value: String | js.Any | typings.devextreme.mod.global.Promise[_] | JQueryPromise[_]): Self = this.set("customItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomItem: Self = this.set("customItem", js.undefined)
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

