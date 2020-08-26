package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentDropInsideItem
import typings.devextreme.anon.DropInsideItemElement
import typings.devextreme.anon.FromDataFromIndex
import typings.devextreme.anon.FromIndexItemData
import typings.devextreme.anon.ModelPromise
import typings.devextreme.anon.ModelToComponent
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.indicate
import typings.devextreme.devextremeStrings.push
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSortableOptions extends DraggableBaseOptions[dxSortable] {
  /** @name dxSortable.Options.allowDropInsideItem */
  var allowDropInsideItem: js.UndefOr[Boolean] = js.native
  /** @name dxSortable.Options.allowReordering */
  var allowReordering: js.UndefOr[Boolean] = js.native
  /** @name dxSortable.Options.dragTemplate */
  var dragTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* dragInfo */ FromIndexItemData, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** @name dxSortable.Options.dropFeedbackMode */
  var dropFeedbackMode: js.UndefOr[push | indicate] = js.native
  /** @name dxSortable.Options.filter */
  var filter: js.UndefOr[String] = js.native
  /** @name dxSortable.Options.itemOrientation */
  var itemOrientation: js.UndefOr[horizontal | vertical] = js.native
  /** @name dxSortable.Options.moveItemOnDrop */
  var moveItemOnDrop: js.UndefOr[Boolean] = js.native
  /** @name dxSortable.Options.onAdd */
  var onAdd: js.UndefOr[js.Function1[/* e */ ComponentDropInsideItem, _]] = js.native
  /** @name dxSortable.Options.onDragChange */
  var onDragChange: js.UndefOr[js.Function1[/* e */ DropInsideItemElement, _]] = js.native
  /** @name dxSortable.Options.onDragEnd */
  var onDragEnd: js.UndefOr[js.Function1[/* e */ DropInsideItemElement, _]] = js.native
  /** @name dxSortable.Options.onDragMove */
  var onDragMove: js.UndefOr[js.Function1[/* e */ DropInsideItemElement, _]] = js.native
  /** @name dxSortable.Options.onDragStart */
  var onDragStart: js.UndefOr[js.Function1[/* e */ FromDataFromIndex, _]] = js.native
  /** @name dxSortable.Options.onRemove */
  var onRemove: js.UndefOr[js.Function1[/* e */ ModelToComponent, _]] = js.native
  /** @name dxSortable.Options.onReorder */
  var onReorder: js.UndefOr[js.Function1[/* e */ ModelPromise, _]] = js.native
}

object dxSortableOptions {
  @scala.inline
  def apply(): dxSortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSortableOptions]
  }
  @scala.inline
  implicit class dxSortableOptionsOps[Self <: dxSortableOptions] (val x: Self) extends AnyVal {
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
    def setAllowDropInsideItem(value: Boolean): Self = this.set("allowDropInsideItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDropInsideItem: Self = this.set("allowDropInsideItem", js.undefined)
    @scala.inline
    def setAllowReordering(value: Boolean): Self = this.set("allowReordering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowReordering: Self = this.set("allowReordering", js.undefined)
    @scala.inline
    def setDragTemplateFunction2(
      value: (/* dragInfo */ FromIndexItemData, /* containerElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("dragTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setDragTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
          /* dragInfo */ FromIndexItemData, 
          /* containerElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("dragTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragTemplate: Self = this.set("dragTemplate", js.undefined)
    @scala.inline
    def setDropFeedbackMode(value: push | indicate): Self = this.set("dropFeedbackMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropFeedbackMode: Self = this.set("dropFeedbackMode", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setItemOrientation(value: horizontal | vertical): Self = this.set("itemOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemOrientation: Self = this.set("itemOrientation", js.undefined)
    @scala.inline
    def setMoveItemOnDrop(value: Boolean): Self = this.set("moveItemOnDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveItemOnDrop: Self = this.set("moveItemOnDrop", js.undefined)
    @scala.inline
    def setOnAdd(value: /* e */ ComponentDropInsideItem => _): Self = this.set("onAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    @scala.inline
    def setOnDragChange(value: /* e */ DropInsideItemElement => _): Self = this.set("onDragChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragChange: Self = this.set("onDragChange", js.undefined)
    @scala.inline
    def setOnDragEnd(value: /* e */ DropInsideItemElement => _): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragMove(value: /* e */ DropInsideItemElement => _): Self = this.set("onDragMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragMove: Self = this.set("onDragMove", js.undefined)
    @scala.inline
    def setOnDragStart(value: /* e */ FromDataFromIndex => _): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnRemove(value: /* e */ ModelToComponent => _): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    @scala.inline
    def setOnReorder(value: /* e */ ModelPromise => _): Self = this.set("onReorder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReorder: Self = this.set("onReorder", js.undefined)
  }
  
}

