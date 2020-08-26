package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AddedItemsComponent
import typings.devextreme.anon.ElementModelValue
import typings.devextreme.anon.MultiTagElement
import typings.devextreme.devextremeStrings.allPages
import typings.devextreme.devextremeStrings.page
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTagBoxOptions extends dxSelectBoxOptions[dxTagBox] {
  /** @name dxTagBox.Options.hideSelectedItems */
  var hideSelectedItems: js.UndefOr[Boolean] = js.native
  /** @name dxTagBox.Options.maxDisplayedTags */
  var maxDisplayedTags: js.UndefOr[Double] = js.native
  /** @name dxTagBox.Options.multiline */
  var multiline: js.UndefOr[Boolean] = js.native
  /** @name dxTagBox.Options.onMultiTagPreparing */
  var onMultiTagPreparing: js.UndefOr[js.Function1[/* e */ MultiTagElement, _]] = js.native
  /** @name dxTagBox.Options.onSelectAllValueChanged */
  var onSelectAllValueChanged: js.UndefOr[js.Function1[/* e */ ElementModelValue, _]] = js.native
  /** @name dxTagBox.Options.onSelectionChanged */
  @JSName("onSelectionChanged")
  var onSelectionChanged_dxTagBoxOptions: js.UndefOr[js.Function1[/* e */ AddedItemsComponent, _]] = js.native
  /** @name dxTagBox.Options.selectAllMode */
  var selectAllMode: js.UndefOr[allPages | page] = js.native
  /** @name dxTagBox.Options.selectedItems */
  var selectedItems: js.UndefOr[js.Array[String | Double | _]] = js.native
  /** @name dxTagBox.Options.showMultiTagOnly */
  var showMultiTagOnly: js.UndefOr[Boolean] = js.native
  /** @name dxTagBox.Options.tagTemplate */
  var tagTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* itemData */ js.Any, /* itemElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** @name dxTagBox.Options.value */
  @JSName("value")
  var value_dxTagBoxOptions: js.UndefOr[js.Array[String | Double | _]] = js.native
}

object dxTagBoxOptions {
  @scala.inline
  def apply(): dxTagBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTagBoxOptions]
  }
  @scala.inline
  implicit class dxTagBoxOptionsOps[Self <: dxTagBoxOptions] (val x: Self) extends AnyVal {
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
    def setHideSelectedItems(value: Boolean): Self = this.set("hideSelectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideSelectedItems: Self = this.set("hideSelectedItems", js.undefined)
    @scala.inline
    def setMaxDisplayedTags(value: Double): Self = this.set("maxDisplayedTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDisplayedTags: Self = this.set("maxDisplayedTags", js.undefined)
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    @scala.inline
    def setOnMultiTagPreparing(value: /* e */ MultiTagElement => _): Self = this.set("onMultiTagPreparing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMultiTagPreparing: Self = this.set("onMultiTagPreparing", js.undefined)
    @scala.inline
    def setOnSelectAllValueChanged(value: /* e */ ElementModelValue => _): Self = this.set("onSelectAllValueChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectAllValueChanged: Self = this.set("onSelectAllValueChanged", js.undefined)
    @scala.inline
    def setOnSelectionChanged(value: /* e */ AddedItemsComponent => _): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    @scala.inline
    def setSelectAllMode(value: allPages | page): Self = this.set("selectAllMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllMode: Self = this.set("selectAllMode", js.undefined)
    @scala.inline
    def setSelectedItemsVarargs(value: (String | Double | js.Any)*): Self = this.set("selectedItems", js.Array(value :_*))
    @scala.inline
    def setSelectedItems(value: js.Array[String | Double | _]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    @scala.inline
    def setShowMultiTagOnly(value: Boolean): Self = this.set("showMultiTagOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMultiTagOnly: Self = this.set("showMultiTagOnly", js.undefined)
    @scala.inline
    def setTagTemplateFunction2(value: (/* itemData */ js.Any, /* itemElement */ dxElement) => String | Element | JQuery): Self = this.set("tagTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setTagTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* itemData */ js.Any, /* itemElement */ dxElement, String | Element | JQuery])
    ): Self = this.set("tagTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagTemplate: Self = this.set("tagTemplate", js.undefined)
    @scala.inline
    def setValueVarargs(value: (String | Double | js.Any)*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[String | Double | _]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

