package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var dataBound: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.native
  var dataSource: js.UndefOr[js.Any] = js.native
  var icons: js.UndefOr[DropDownIcons] = js.native
  var iconsLibrary: js.UndefOr[String] = js.native
  var maxHeight: js.UndefOr[js.Any] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var selectedField: js.UndefOr[String] = js.native
  var textField: js.UndefOr[String] = js.native
  var uiLibrary: js.UndefOr[String] = js.native
  var valueField: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object DropDownSettings {
  @scala.inline
  def apply(): DropDownSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropDownSettings]
  }
  @scala.inline
  implicit class DropDownSettingsOps[Self <: DropDownSettings] (val x: Self) extends AnyVal {
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
    def setChange(value: /* e */ js.Any => _): Self = this.set("change", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    @scala.inline
    def setDataBound(value: /* e */ js.Any => _): Self = this.set("dataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setIcons(value: DropDownIcons): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setIconsLibrary(value: String): Self = this.set("iconsLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconsLibrary: Self = this.set("iconsLibrary", js.undefined)
    @scala.inline
    def setMaxHeight(value: js.Any): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setSelectedField(value: String): Self = this.set("selectedField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedField: Self = this.set("selectedField", js.undefined)
    @scala.inline
    def setTextField(value: String): Self = this.set("textField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextField: Self = this.set("textField", js.undefined)
    @scala.inline
    def setUiLibrary(value: String): Self = this.set("uiLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUiLibrary: Self = this.set("uiLibrary", js.undefined)
    @scala.inline
    def setValueField(value: String): Self = this.set("valueField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueField: Self = this.set("valueField", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

