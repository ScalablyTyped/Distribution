package typings.gaeaDashModel.FitGaeaNs

import typings.gaeaDashModel.Anon_MapUniqueKey
import typings.gaeaDashModel.Anon_Source
import typings.gaeaDashModel.Anon_UniqueKey
import typings.gaeaDashModel.gaeaDashModelStrings.`new`
import typings.gaeaDashModel.gaeaDashModelStrings.combo
import typings.gaeaDashModel.gaeaDashModelStrings.viewport
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentDragComponentInfo extends js.Object {
  var comboInfo: js.UndefOr[Anon_Source] = js.undefined
  // 开始拖拽在父级中的位置
  var dragStartIndex: Double
  // 开始拖拽父级的 dom
  var dragStartParentElement: HTMLElement
  var newInfo: js.UndefOr[Anon_UniqueKey] = js.undefined
  // 类型
  var `type`: `new` | combo | viewport
  var viewportInfo: js.UndefOr[Anon_MapUniqueKey] = js.undefined
}

object CurrentDragComponentInfo {
  @scala.inline
  def apply(
    dragStartIndex: Double,
    dragStartParentElement: HTMLElement,
    `type`: `new` | combo | viewport,
    comboInfo: Anon_Source = null,
    newInfo: Anon_UniqueKey = null,
    viewportInfo: Anon_MapUniqueKey = null
  ): CurrentDragComponentInfo = {
    val __obj = js.Dynamic.literal(dragStartIndex = dragStartIndex, dragStartParentElement = dragStartParentElement)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comboInfo != null) __obj.updateDynamic("comboInfo")(comboInfo)
    if (newInfo != null) __obj.updateDynamic("newInfo")(newInfo)
    if (viewportInfo != null) __obj.updateDynamic("viewportInfo")(viewportInfo)
    __obj.asInstanceOf[CurrentDragComponentInfo]
  }
}

