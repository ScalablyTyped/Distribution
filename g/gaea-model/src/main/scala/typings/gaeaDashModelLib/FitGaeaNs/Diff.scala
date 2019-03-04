package typings
package gaeaDashModelLib.FitGaeaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diff extends js.Object {
  // 新增操作
  var add: js.UndefOr[gaeaDashModelLib.Anon_Index] = js.undefined
  // 新增组合
  var addCombo: js.UndefOr[gaeaDashModelLib.Anon_ComponentInfo] = js.undefined
  // 新增模板
  var addSource: js.UndefOr[gaeaDashModelLib.Anon_ComponentInfo] = js.undefined
  // 内部交换顺序
  var exchange: js.UndefOr[gaeaDashModelLib.Anon_NewIndex] = js.undefined
  // 操作组件的 mapUniqueKey
  var mapUniqueKey: java.lang.String
  // 移动到另一个父元素
  var move: js.UndefOr[gaeaDashModelLib.Anon_SourceIndex] = js.undefined
  // 粘贴操作
  var paste: js.UndefOr[DiffRemove] = js.undefined
  // 删除组件
  var remove: js.UndefOr[DiffRemove] = js.undefined
  // 重置组件
  var reset: js.UndefOr[gaeaDashModelLib.Anon_BeforeName] = js.undefined
  // 操作类型
  var `type`: gaeaDashModelLib.gaeaDashModelLibStrings.add | gaeaDashModelLib.gaeaDashModelLibStrings.move | gaeaDashModelLib.gaeaDashModelLibStrings.remove | gaeaDashModelLib.gaeaDashModelLibStrings.exchange | gaeaDashModelLib.gaeaDashModelLibStrings.update | gaeaDashModelLib.gaeaDashModelLibStrings.paste | gaeaDashModelLib.gaeaDashModelLibStrings.reset | gaeaDashModelLib.gaeaDashModelLibStrings.addCombo | gaeaDashModelLib.gaeaDashModelLibStrings.addSource
  // 更新操作
  var update: js.UndefOr[gaeaDashModelLib.Anon_NewValue] = js.undefined
}

object Diff {
  @scala.inline
  def apply(
    mapUniqueKey: java.lang.String,
    `type`: gaeaDashModelLib.gaeaDashModelLibStrings.add | gaeaDashModelLib.gaeaDashModelLibStrings.move | gaeaDashModelLib.gaeaDashModelLibStrings.remove | gaeaDashModelLib.gaeaDashModelLibStrings.exchange | gaeaDashModelLib.gaeaDashModelLibStrings.update | gaeaDashModelLib.gaeaDashModelLibStrings.paste | gaeaDashModelLib.gaeaDashModelLibStrings.reset | gaeaDashModelLib.gaeaDashModelLibStrings.addCombo | gaeaDashModelLib.gaeaDashModelLibStrings.addSource,
    add: gaeaDashModelLib.Anon_Index = null,
    addCombo: gaeaDashModelLib.Anon_ComponentInfo = null,
    addSource: gaeaDashModelLib.Anon_ComponentInfo = null,
    exchange: gaeaDashModelLib.Anon_NewIndex = null,
    move: gaeaDashModelLib.Anon_SourceIndex = null,
    paste: DiffRemove = null,
    remove: DiffRemove = null,
    reset: gaeaDashModelLib.Anon_BeforeName = null,
    update: gaeaDashModelLib.Anon_NewValue = null
  ): Diff = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (add != null) __obj.updateDynamic("add")(add)
    if (addCombo != null) __obj.updateDynamic("addCombo")(addCombo)
    if (addSource != null) __obj.updateDynamic("addSource")(addSource)
    if (exchange != null) __obj.updateDynamic("exchange")(exchange)
    if (move != null) __obj.updateDynamic("move")(move)
    if (paste != null) __obj.updateDynamic("paste")(paste)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (reset != null) __obj.updateDynamic("reset")(reset)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Diff]
  }
}

