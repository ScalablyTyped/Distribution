package typings.gaeaModel.FitGaea

import typings.gaeaModel.AnonMapUniqueKey
import typings.gaeaModel.AnonSource
import typings.gaeaModel.AnonUniqueKey
import typings.gaeaModel.gaeaModelStrings.`new`
import typings.gaeaModel.gaeaModelStrings.combo
import typings.gaeaModel.gaeaModelStrings.viewport
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentDragComponentInfo extends js.Object {
  var comboInfo: js.UndefOr[AnonSource] = js.undefined
  // 开始拖拽在父级中的位置
  var dragStartIndex: Double
  // 开始拖拽父级的 dom
  var dragStartParentElement: HTMLElement
  var newInfo: js.UndefOr[AnonUniqueKey] = js.undefined
  // 类型
  var `type`: `new` | combo | viewport
  var viewportInfo: js.UndefOr[AnonMapUniqueKey] = js.undefined
}

object CurrentDragComponentInfo {
  @scala.inline
  def apply(
    dragStartIndex: Double,
    dragStartParentElement: HTMLElement,
    `type`: `new` | combo | viewport,
    comboInfo: AnonSource = null,
    newInfo: AnonUniqueKey = null,
    viewportInfo: AnonMapUniqueKey = null
  ): CurrentDragComponentInfo = {
    val __obj = js.Dynamic.literal(dragStartIndex = dragStartIndex.asInstanceOf[js.Any], dragStartParentElement = dragStartParentElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comboInfo != null) __obj.updateDynamic("comboInfo")(comboInfo.asInstanceOf[js.Any])
    if (newInfo != null) __obj.updateDynamic("newInfo")(newInfo.asInstanceOf[js.Any])
    if (viewportInfo != null) __obj.updateDynamic("viewportInfo")(viewportInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentDragComponentInfo]
  }
}

