package typings.gestalt.mod

import typings.gestalt.gestaltStrings.column
import typings.gestalt.gestaltStrings.hidden
import typings.gestalt.gestaltStrings.row
import typings.gestalt.gestaltStrings.visible
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioGroupProps extends StObject {
  
  var children: ReactNode
  
  var direction: js.UndefOr[column | row] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var legend: String
  
  var legendDisplay: js.UndefOr[visible | hidden] = js.undefined
}
object RadioGroupProps {
  
  inline def apply(id: String, legend: String): RadioGroupProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupProps]
  }
  
  extension [Self <: RadioGroupProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDirection(value: column | row): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendDisplay(value: visible | hidden): Self = StObject.set(x, "legendDisplay", value.asInstanceOf[js.Any])
    
    inline def setLegendDisplayUndefined: Self = StObject.set(x, "legendDisplay", js.undefined)
  }
}
