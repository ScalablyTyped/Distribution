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

@js.native
trait Diff extends js.Object {
  // 新增操作
  var add: js.UndefOr[Index] = js.native
  // 新增组合
  var addCombo: js.UndefOr[ComponentInfo] = js.native
  // 新增模板
  var addSource: js.UndefOr[ComponentInfo] = js.native
  // 内部交换顺序
  var exchange: js.UndefOr[NewIndex] = js.native
  // 操作组件的 mapUniqueKey
  var mapUniqueKey: String = js.native
  // 移动到另一个父元素
  var move: js.UndefOr[SourceIndex] = js.native
  // 粘贴操作
  var paste: js.UndefOr[DiffRemove] = js.native
  // 删除组件
  var remove: js.UndefOr[DiffRemove] = js.native
  // 重置组件
  var reset: js.UndefOr[BeforeName] = js.native
  // 操作类型
  var `type`: add | move | remove | exchange | update | paste | reset | addCombo | addSource = js.native
  // 更新操作
  var update: js.UndefOr[NewValue] = js.native
}

object Diff {
  @scala.inline
  def apply(
    mapUniqueKey: String,
    `type`: add | move | remove | exchange | update | paste | reset | addCombo | addSource
  ): Diff = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff]
  }
  @scala.inline
  implicit class DiffOps[Self <: Diff] (val x: Self) extends AnyVal {
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
    def setMapUniqueKey(value: String): Self = this.set("mapUniqueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: add | move | remove | exchange | update | paste | reset | addCombo | addSource): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdd(value: Index): Self = this.set("add", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    @scala.inline
    def setAddCombo(value: ComponentInfo): Self = this.set("addCombo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddCombo: Self = this.set("addCombo", js.undefined)
    @scala.inline
    def setAddSource(value: ComponentInfo): Self = this.set("addSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddSource: Self = this.set("addSource", js.undefined)
    @scala.inline
    def setExchange(value: NewIndex): Self = this.set("exchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExchange: Self = this.set("exchange", js.undefined)
    @scala.inline
    def setMove(value: SourceIndex): Self = this.set("move", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setPaste(value: DiffRemove): Self = this.set("paste", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaste: Self = this.set("paste", js.undefined)
    @scala.inline
    def setRemove(value: DiffRemove): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    @scala.inline
    def setReset(value: BeforeName): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setUpdate(value: NewValue): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

