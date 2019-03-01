package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentDragComponentInfo extends js.Object {
  var comboInfo: js.UndefOr[gaeaDashModelLib.Anon_Source] = js.undefined
  // 开始拖拽在父级中的位置
  var dragStartIndex: scala.Double
  // 开始拖拽父级的 dom
  var dragStartParentElement: reactLib.HTMLElement
  var newInfo: js.UndefOr[gaeaDashModelLib.Anon_UniqueKey] = js.undefined
  // 类型
  var `type`: gaeaDashModelLib.gaeaDashModelLibStrings.`new` | gaeaDashModelLib.gaeaDashModelLibStrings.combo | gaeaDashModelLib.gaeaDashModelLibStrings.viewport
  var viewportInfo: js.UndefOr[gaeaDashModelLib.Anon_MapUniqueKey] = js.undefined
}

object CurrentDragComponentInfo {
  @scala.inline
  def apply(
    dragStartIndex: scala.Double,
    dragStartParentElement: reactLib.HTMLElement,
    `type`: gaeaDashModelLib.gaeaDashModelLibStrings.`new` | gaeaDashModelLib.gaeaDashModelLibStrings.combo | gaeaDashModelLib.gaeaDashModelLibStrings.viewport,
    comboInfo: gaeaDashModelLib.Anon_Source = null,
    newInfo: gaeaDashModelLib.Anon_UniqueKey = null,
    viewportInfo: gaeaDashModelLib.Anon_MapUniqueKey = null
  ): CurrentDragComponentInfo = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("dragStartIndex")(dragStartIndex)
    __obj.updateDynamic("dragStartParentElement")(dragStartParentElement)
    if (comboInfo != null) __obj.updateDynamic("comboInfo")(comboInfo)
    if (newInfo != null) __obj.updateDynamic("newInfo")(newInfo)
    if (viewportInfo != null) __obj.updateDynamic("viewportInfo")(viewportInfo)
    __obj.asInstanceOf[CurrentDragComponentInfo]
  }
}

