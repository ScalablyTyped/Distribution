package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupData extends StObject {
  
  var component: js.UndefOr[dxList] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var groupData: js.UndefOr[js.Any] = js.undefined
  
  var groupElement: js.UndefOr[dxElement] = js.undefined
  
  var groupIndex: js.UndefOr[Double] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object GroupData {
  
  inline def apply(): GroupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupData]
  }
  
  extension [Self <: GroupData](x: Self) {
    
    inline def setComponent(value: dxList): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setGroupData(value: js.Any): Self = StObject.set(x, "groupData", value.asInstanceOf[js.Any])
    
    inline def setGroupDataUndefined: Self = StObject.set(x, "groupData", js.undefined)
    
    inline def setGroupElement(value: dxElement): Self = StObject.set(x, "groupElement", value.asInstanceOf[js.Any])
    
    inline def setGroupElementUndefined: Self = StObject.set(x, "groupElement", js.undefined)
    
    inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
