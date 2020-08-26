package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.EventFromData
import typings.devextreme.anon.ItemDataItemElement
import typings.devextreme.anon.ToData
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQuery
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDraggableOptions extends DraggableBaseOptions[dxDraggable] {
  /** @name dxDraggable.Options.clone */
  @JSName("clone")
  var clone_FdxDraggableOptions: js.UndefOr[Boolean] = js.native
  /** @name dxDraggable.Options.dragTemplate */
  var dragTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* dragInfo */ ItemDataItemElement, 
      /* containerElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** @name dxDraggable.Options.onDragEnd */
  var onDragEnd: js.UndefOr[js.Function1[/* e */ ToData, _]] = js.native
  /** @name dxDraggable.Options.onDragMove */
  var onDragMove: js.UndefOr[js.Function1[/* e */ ToData, _]] = js.native
  /** @name dxDraggable.Options.onDragStart */
  var onDragStart: js.UndefOr[js.Function1[/* e */ EventFromData, _]] = js.native
}

object dxDraggableOptions {
  @scala.inline
  def apply(): dxDraggableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDraggableOptions]
  }
  @scala.inline
  implicit class dxDraggableOptionsOps[Self <: dxDraggableOptions] (val x: Self) extends AnyVal {
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
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setDragTemplateFunction2(
      value: (/* dragInfo */ ItemDataItemElement, /* containerElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("dragTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def setDragTemplate(
      value: typings.devextreme.mod.DevExpress.core.template | (js.Function2[
          /* dragInfo */ ItemDataItemElement, 
          /* containerElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("dragTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragTemplate: Self = this.set("dragTemplate", js.undefined)
    @scala.inline
    def setOnDragEnd(value: /* e */ ToData => _): Self = this.set("onDragEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragEnd: Self = this.set("onDragEnd", js.undefined)
    @scala.inline
    def setOnDragMove(value: /* e */ ToData => _): Self = this.set("onDragMove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragMove: Self = this.set("onDragMove", js.undefined)
    @scala.inline
    def setOnDragStart(value: /* e */ EventFromData => _): Self = this.set("onDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDragStart: Self = this.set("onDragStart", js.undefined)
  }
  
}

