package typings.gaeaModel.FitGaea

import typings.gaeaModel.anon.MapUniqueKey
import typings.gaeaModel.anon.Source
import typings.gaeaModel.anon.UniqueKey
import typings.gaeaModel.gaeaModelStrings.`new`
import typings.gaeaModel.gaeaModelStrings.combo
import typings.gaeaModel.gaeaModelStrings.viewport
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentDragComponentInfo extends js.Object {
  var comboInfo: js.UndefOr[Source] = js.native
  // 开始拖拽在父级中的位置
  var dragStartIndex: Double = js.native
  // 开始拖拽父级的 dom
  var dragStartParentElement: HTMLElement = js.native
  var newInfo: js.UndefOr[UniqueKey] = js.native
  // 类型
  var `type`: `new` | combo | viewport = js.native
  var viewportInfo: js.UndefOr[MapUniqueKey] = js.native
}

object CurrentDragComponentInfo {
  @scala.inline
  def apply(dragStartIndex: Double, dragStartParentElement: HTMLElement, `type`: `new` | combo | viewport): CurrentDragComponentInfo = {
    val __obj = js.Dynamic.literal(dragStartIndex = dragStartIndex.asInstanceOf[js.Any], dragStartParentElement = dragStartParentElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentDragComponentInfo]
  }
  @scala.inline
  implicit class CurrentDragComponentInfoOps[Self <: CurrentDragComponentInfo] (val x: Self) extends AnyVal {
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
    def setDragStartIndex(value: Double): Self = this.set("dragStartIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragStartParentElement(value: HTMLElement): Self = this.set("dragStartParentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `new` | combo | viewport): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setComboInfo(value: Source): Self = this.set("comboInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComboInfo: Self = this.set("comboInfo", js.undefined)
    @scala.inline
    def setNewInfo(value: UniqueKey): Self = this.set("newInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewInfo: Self = this.set("newInfo", js.undefined)
    @scala.inline
    def setViewportInfo(value: MapUniqueKey): Self = this.set("viewportInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportInfo: Self = this.set("viewportInfo", js.undefined)
  }
  
}

