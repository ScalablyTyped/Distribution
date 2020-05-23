package typings.gaeaModel.FitGaea

import typings.gaeaModel.anon.BeforeName
import typings.gaeaModel.anon.ComponentInfo
import typings.gaeaModel.anon.Index
import typings.gaeaModel.anon.NewIndex
import typings.gaeaModel.anon.NewValue
import typings.gaeaModel.anon.SourceIndex
import typings.gaeaModel.gaeaModelStrings.add
import typings.gaeaModel.gaeaModelStrings.addCombo
import typings.gaeaModel.gaeaModelStrings.addSource
import typings.gaeaModel.gaeaModelStrings.exchange
import typings.gaeaModel.gaeaModelStrings.move
import typings.gaeaModel.gaeaModelStrings.paste
import typings.gaeaModel.gaeaModelStrings.remove
import typings.gaeaModel.gaeaModelStrings.reset
import typings.gaeaModel.gaeaModelStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diff extends js.Object {
  // 新增操作
  var add: js.UndefOr[Index] = js.undefined
  // 新增组合
  var addCombo: js.UndefOr[ComponentInfo] = js.undefined
  // 新增模板
  var addSource: js.UndefOr[ComponentInfo] = js.undefined
  // 内部交换顺序
  var exchange: js.UndefOr[NewIndex] = js.undefined
  // 操作组件的 mapUniqueKey
  var mapUniqueKey: String
  // 移动到另一个父元素
  var move: js.UndefOr[SourceIndex] = js.undefined
  // 粘贴操作
  var paste: js.UndefOr[DiffRemove] = js.undefined
  // 删除组件
  var remove: js.UndefOr[DiffRemove] = js.undefined
  // 重置组件
  var reset: js.UndefOr[BeforeName] = js.undefined
  // 操作类型
  var `type`: add | move | remove | exchange | update | paste | reset | addCombo | addSource
  // 更新操作
  var update: js.UndefOr[NewValue] = js.undefined
}

object Diff {
  @scala.inline
  def apply(
    mapUniqueKey: String,
    `type`: add | move | remove | exchange | update | paste | reset | addCombo | addSource,
    add: Index = null,
    addCombo: ComponentInfo = null,
    addSource: ComponentInfo = null,
    exchange: NewIndex = null,
    move: SourceIndex = null,
    paste: DiffRemove = null,
    remove: DiffRemove = null,
    reset: BeforeName = null,
    update: NewValue = null
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

