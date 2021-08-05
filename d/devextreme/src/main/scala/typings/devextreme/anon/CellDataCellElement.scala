package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.events.event
import typings.devextreme.mod.DevExpress.ui.dxScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellDataCellElement extends StObject {
  
  var cellData: js.UndefOr[js.Any] = js.undefined
  
  var cellElement: js.UndefOr[dxElement] = js.undefined
  
  var component: js.UndefOr[dxScheduler] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var event: js.UndefOr[typings.devextreme.mod.DevExpress.events.event] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object CellDataCellElement {
  
  inline def apply(): CellDataCellElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellDataCellElement]
  }
  
  extension [Self <: CellDataCellElement](x: Self) {
    
    inline def setCellData(value: js.Any): Self = StObject.set(x, "cellData", value.asInstanceOf[js.Any])
    
    inline def setCellDataUndefined: Self = StObject.set(x, "cellData", js.undefined)
    
    inline def setCellElement(value: dxElement): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
    
    inline def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
    
    inline def setComponent(value: dxScheduler): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEvent(value: event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
