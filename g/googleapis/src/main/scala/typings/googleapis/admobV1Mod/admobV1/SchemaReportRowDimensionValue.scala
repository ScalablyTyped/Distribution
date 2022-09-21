package typings.googleapis.admobV1Mod.admobV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportRowDimensionValue extends StObject {
  
  /**
    * The localized string representation of the value. If unspecified, the display label should be derived from the value.
    */
  var displayLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dimension value in the format specified in the report's spec Dimension enum.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportRowDimensionValue {
  
  inline def apply(): SchemaReportRowDimensionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportRowDimensionValue]
  }
  
  extension [Self <: SchemaReportRowDimensionValue](x: Self) {
    
    inline def setDisplayLabel(value: String): Self = StObject.set(x, "displayLabel", value.asInstanceOf[js.Any])
    
    inline def setDisplayLabelNull: Self = StObject.set(x, "displayLabel", null)
    
    inline def setDisplayLabelUndefined: Self = StObject.set(x, "displayLabel", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
