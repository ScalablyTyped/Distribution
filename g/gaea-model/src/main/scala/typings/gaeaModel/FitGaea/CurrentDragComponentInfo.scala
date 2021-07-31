package typings.gaeaModel.FitGaea

import typings.gaeaModel.anon.MapUniqueKey
import typings.gaeaModel.anon.Source
import typings.gaeaModel.anon.UniqueKey
import typings.gaeaModel.gaeaModelStrings.`new`
import typings.gaeaModel.gaeaModelStrings.combo
import typings.gaeaModel.gaeaModelStrings.viewport
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentDragComponentInfo extends StObject {
  
  var comboInfo: js.UndefOr[Source] = js.undefined
  
  // 开始拖拽在父级中的位置
  var dragStartIndex: Double
  
  // 开始拖拽父级的 dom
  var dragStartParentElement: HTMLElement
  
  var newInfo: js.UndefOr[UniqueKey] = js.undefined
  
  // 类型
  var `type`: `new` | combo | viewport
  
  var viewportInfo: js.UndefOr[MapUniqueKey] = js.undefined
}
object CurrentDragComponentInfo {
  
  @scala.inline
  def apply(dragStartIndex: Double, dragStartParentElement: HTMLElement, `type`: `new` | combo | viewport): CurrentDragComponentInfo = {
    val __obj = js.Dynamic.literal(dragStartIndex = dragStartIndex.asInstanceOf[js.Any], dragStartParentElement = dragStartParentElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentDragComponentInfo]
  }
  
  @scala.inline
  implicit class CurrentDragComponentInfoMutableBuilder[Self <: CurrentDragComponentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComboInfo(value: Source): Self = StObject.set(x, "comboInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComboInfoUndefined: Self = StObject.set(x, "comboInfo", js.undefined)
    
    @scala.inline
    def setDragStartIndex(value: Double): Self = StObject.set(x, "dragStartIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragStartParentElement(value: HTMLElement): Self = StObject.set(x, "dragStartParentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewInfo(value: UniqueKey): Self = StObject.set(x, "newInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewInfoUndefined: Self = StObject.set(x, "newInfo", js.undefined)
    
    @scala.inline
    def setType(value: `new` | combo | viewport): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportInfo(value: MapUniqueKey): Self = StObject.set(x, "viewportInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportInfoUndefined: Self = StObject.set(x, "viewportInfo", js.undefined)
  }
}
