package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property extends StObject {
  
  var attributeName: String
  
  var displayCategory: String
  
  var displayName: String
  
  var displayValue: String | Double
  
  var hidden: Boolean
  
  var precision: js.UndefOr[Double] = js.undefined
  
  var `type`: Double
  
  var units: String | Null
}
object Property {
  
  inline def apply(
    attributeName: String,
    displayCategory: String,
    displayName: String,
    displayValue: String | Double,
    hidden: Boolean,
    `type`: Double
  ): Property = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], displayCategory = displayCategory.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayValue = displayValue.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], units = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  
  extension [Self <: Property](x: Self) {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    inline def setDisplayCategory(value: String): Self = StObject.set(x, "displayCategory", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayValue(value: String | Double): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    
    inline def setUnitsNull: Self = StObject.set(x, "units", null)
  }
}
