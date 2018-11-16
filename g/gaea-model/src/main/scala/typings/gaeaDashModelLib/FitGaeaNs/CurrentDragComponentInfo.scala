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
  var viewportInfo: js.UndefOr[gaeaDashModelLib.Anon_TargetIndex] = js.undefined
}

