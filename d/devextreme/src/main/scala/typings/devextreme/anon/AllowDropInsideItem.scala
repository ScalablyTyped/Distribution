package typings.devextreme.anon

import typings.devextreme.devextremeStrings.both
import typings.devextreme.devextremeStrings.horizontal
import typings.devextreme.devextremeStrings.indicate
import typings.devextreme.devextremeStrings.push
import typings.devextreme.devextremeStrings.vertical
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowDropInsideItem extends js.Object {
  var allowDropInsideItem: js.UndefOr[Boolean] = js.native
  var allowReordering: js.UndefOr[Boolean] = js.native
  var autoScroll: js.UndefOr[Boolean] = js.native
  var boundary: js.UndefOr[String | typings.std.Element | JQuery] = js.native
  var container: js.UndefOr[String | typings.std.Element | JQuery] = js.native
  var cursorOffset: js.UndefOr[String | Y] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dragDirection: js.UndefOr[both | horizontal | vertical] = js.native
  var dragTemplate: js.UndefOr[
    template | (js.Function2[
      /* dragInfo */ ItemDataItemElement, 
      /* containerElement */ dxElement, 
      String | typings.std.Element | JQuery
    ])
  ] = js.native
  var dropFeedbackMode: js.UndefOr[push | indicate] = js.native
  var filter: js.UndefOr[String] = js.native
  var group: js.UndefOr[String] = js.native
  var handle: js.UndefOr[String] = js.native
  var onAdd: js.UndefOr[js.Function1[/* e */ DropInsideItem, _]] = js.native
  var onDragChange: js.UndefOr[js.Function1[/* e */ FromComponent, _]] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* e */ FromComponent, _]] = js.native
  var onDragMove: js.UndefOr[js.Function1[/* e */ FromComponent, _]] = js.native
  var onDragStart: js.UndefOr[js.Function1[/* e */ FromData, _]] = js.native
  var onRemove: js.UndefOr[js.Function1[/* e */ FromIndex, _]] = js.native
  var onReorder: js.UndefOr[js.Function1[/* e */ ToComponent, _]] = js.native
  var scrollSensitivity: js.UndefOr[Double] = js.native
  var scrollSpeed: js.UndefOr[Double] = js.native
  var showDragIcons: js.UndefOr[Boolean] = js.native
}

object AllowDropInsideItem {
  @scala.inline
  def apply(): AllowDropInsideItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowDropInsideItem]
  }
  @scala.inline
  implicit class AllowDropInsideItemOps[Self <: AllowDropInsideItem] (val x: Self) extends AnyVal {
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
    def setAutoScroll(value: Boolean): Self = this.set("autoScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScroll: Self = this.set("autoScroll", js.undefined)
    @scala.inline
    def setBoundary(value: String | typings.std.Element | JQuery): Self = this.set("boundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
    @scala.inline
    def setContainer(value: String | typings.std.Element | JQuery): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setCursorOffset(value: String | Y): Self = this.set("cursorOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorOffset: Self = this.set("cursorOffset", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDragDirection(value: both | horizontal | vertical): Self = this.set("dragDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragDirection: Self = this.set("dragDirection", js.undefined)
    @scala.inline
    def setDragTemplateFunction2(
      value: (/* dragInfo */ ItemDataItemElement, /* containerElement */ dxElement) => String | typings.std.Element | JQuery
    ): Self = this.set("dragTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setDragTemplate(
      value: template | (js.Function2[
          /* dragInfo */ ItemDataItemElement, 
          /* containerElement */ dxElement, 
          String | typings.std.Element | JQuery
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
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setOnAdd(value: /* e */ DropInsideItem => _): Self = this.set("onAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    @scala.inline
    def setOnDragChange(value: /* e */ FromComponent => _): Self = this.set("onDragChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragChange: Self = this.set("onDragChange", js.undefined)
    @scala.inline
    def setOnDragEnd(value: /* e */ FromComponent => _): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragMove(value: /* e */ FromComponent => _): Self = this.set("onDragMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragMove: Self = this.set("onDragMove", js.undefined)
    @scala.inline
    def setOnDragStart(value: /* e */ FromData => _): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
    @scala.inline
    def setOnRemove(value: /* e */ FromIndex => _): Self = this.set("onRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    @scala.inline
    def setOnReorder(value: /* e */ ToComponent => _): Self = this.set("onReorder", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReorder: Self = this.set("onReorder", js.undefined)
    @scala.inline
    def setScrollSensitivity(value: Double): Self = this.set("scrollSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSensitivity: Self = this.set("scrollSensitivity", js.undefined)
    @scala.inline
    def setScrollSpeed(value: Double): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
    @scala.inline
    def setShowDragIcons(value: Boolean): Self = this.set("showDragIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDragIcons: Self = this.set("showDragIcons", js.undefined)
  }
  
}

