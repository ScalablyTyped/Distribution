package typings.gestalt.mod

import typings.gestalt.gestaltStrings.hidden
import typings.gestalt.gestaltStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldsetProps extends StObject {
  
  var children: Node
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var legend: String
  
  var legendDisplay: js.UndefOr[visible | hidden] = js.undefined
}
object FieldsetProps {
  
  inline def apply(legend: String): FieldsetProps = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldsetProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldsetProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendDisplay(value: visible | hidden): Self = StObject.set(x, "legendDisplay", value.asInstanceOf[js.Any])
    
    inline def setLegendDisplayUndefined: Self = StObject.set(x, "legendDisplay", js.undefined)
  }
}
