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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diff extends StObject {
  
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
  
  inline def apply(
    mapUniqueKey: String,
    `type`: add | move | remove | exchange | update | paste | reset | addCombo | addSource
  ): Diff = {
    val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff]
  }
  
  extension [Self <: Diff](x: Self) {
    
    inline def setAdd(value: Index): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddCombo(value: ComponentInfo): Self = StObject.set(x, "addCombo", value.asInstanceOf[js.Any])
    
    inline def setAddComboUndefined: Self = StObject.set(x, "addCombo", js.undefined)
    
    inline def setAddSource(value: ComponentInfo): Self = StObject.set(x, "addSource", value.asInstanceOf[js.Any])
    
    inline def setAddSourceUndefined: Self = StObject.set(x, "addSource", js.undefined)
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setExchange(value: NewIndex): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    inline def setMapUniqueKey(value: String): Self = StObject.set(x, "mapUniqueKey", value.asInstanceOf[js.Any])
    
    inline def setMove(value: SourceIndex): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setPaste(value: DiffRemove): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
    
    inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
    
    inline def setRemove(value: DiffRemove): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setReset(value: BeforeName): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setType(value: add | move | remove | exchange | update | paste | reset | addCombo | addSource): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: NewValue): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
