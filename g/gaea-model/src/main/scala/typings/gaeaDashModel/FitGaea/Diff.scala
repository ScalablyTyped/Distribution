package typings.gaeaDashModel.FitGaea

import typings.gaeaDashModel.Anon_BeforeName
import typings.gaeaDashModel.Anon_ComponentInfo
import typings.gaeaDashModel.Anon_Index
import typings.gaeaDashModel.Anon_NewIndex
import typings.gaeaDashModel.Anon_NewValue
import typings.gaeaDashModel.Anon_SourceIndex
import typings.gaeaDashModel.gaeaDashModelStrings.add
import typings.gaeaDashModel.gaeaDashModelStrings.addCombo
import typings.gaeaDashModel.gaeaDashModelStrings.addSource
import typings.gaeaDashModel.gaeaDashModelStrings.exchange
import typings.gaeaDashModel.gaeaDashModelStrings.move
import typings.gaeaDashModel.gaeaDashModelStrings.paste
import typings.gaeaDashModel.gaeaDashModelStrings.remove
import typings.gaeaDashModel.gaeaDashModelStrings.reset
import typings.gaeaDashModel.gaeaDashModelStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diff extends js.Object {
  // 新增操作
  var add: js.UndefOr[Anon_Index] = js.undefined
  // 新增组合
  var addCombo: js.UndefOr[Anon_ComponentInfo] = js.undefined
  // 新增模板
  var addSource: js.UndefOr[Anon_ComponentInfo] = js.undefined
  // 内部交换顺序
  var exchange: js.UndefOr[Anon_NewIndex] = js.undefined
  // 操作组件的 mapUniqueKey
  var mapUniqueKey: String
  // 移动到另一个父元素
  var move: js.UndefOr[Anon_SourceIndex] = js.undefined
  // 粘贴操作
  var paste: js.UndefOr[DiffRemove] = js.undefined
  // 删除组件
  var remove: js.UndefOr[DiffRemove] = js.undefined
  // 重置组件
  var reset: js.UndefOr[Anon_BeforeName] = js.undefined
  // 操作类型
  var `type`: add | move | remove | exchange | update | paste | reset | addCombo | addSource
  // 更新操作
  var update: js.UndefOr[Anon_NewValue] = js.undefined
}

object Diff {
  @scala.inline
  def apply(
    mapUniqueKey: String,
    `type`: add | move | remove | exchange | update | paste | reset | addCombo | addSource,
    add: Anon_Index = null,
    addCombo: Anon_ComponentInfo = null,
    addSource: Anon_ComponentInfo = null,
    exchange: Anon_NewIndex = null,
    move: Anon_SourceIndex = null,
    paste: DiffRemove = null,
    remove: DiffRemove = null,
    reset: Anon_BeforeName = null,
    update: Anon_NewValue = null
  ): Diff = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (addCombo != null) __obj.updateDynamic("addCombo")(addCombo.asInstanceOf[js.Any])
    if (addSource != null) __obj.updateDynamic("addSource")(addSource.asInstanceOf[js.Any])
    if (exchange != null) __obj.updateDynamic("exchange")(exchange.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(paste.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (reset != null) __obj.updateDynamic("reset")(reset.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff]
  }
}

