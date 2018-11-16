package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Diff extends js.Object {
  // 新增操作
  var add: js.UndefOr[gaeaDashModelLib.Anon_UniqueId] = js.undefined
  // 新增组合
  var addCombo: js.UndefOr[gaeaDashModelLib.Anon_ComponentInfo] = js.undefined
  // 新增模板
  var addSource: js.UndefOr[gaeaDashModelLib.Anon_ComponentInfo] = js.undefined
  // 内部交换顺序
  var exchange: js.UndefOr[gaeaDashModelLib.Anon_NewIndex] = js.undefined
  // 操作组件的 mapUniqueKey
  var mapUniqueKey: java.lang.String
  // 移动到另一个父元素
  var move: js.UndefOr[gaeaDashModelLib.Anon_TargetIndexSourceParentMapUniqueKey] = js.undefined
  // 粘贴操作
  var paste: js.UndefOr[DiffRemove] = js.undefined
  // 删除组件
  var remove: js.UndefOr[DiffRemove] = js.undefined
  // 重置组件
  var reset: js.UndefOr[gaeaDashModelLib.Anon_BeforeName] = js.undefined
  // 操作类型
  var `type`: gaeaDashModelLib.gaeaDashModelLibStrings.add | gaeaDashModelLib.gaeaDashModelLibStrings.move | gaeaDashModelLib.gaeaDashModelLibStrings.remove | gaeaDashModelLib.gaeaDashModelLibStrings.exchange | gaeaDashModelLib.gaeaDashModelLibStrings.update | gaeaDashModelLib.gaeaDashModelLibStrings.paste | gaeaDashModelLib.gaeaDashModelLibStrings.reset | gaeaDashModelLib.gaeaDashModelLibStrings.addCombo | gaeaDashModelLib.gaeaDashModelLibStrings.addSource
  // 更新操作
  var update: js.UndefOr[gaeaDashModelLib.Anon_OldValue] = js.undefined
}

