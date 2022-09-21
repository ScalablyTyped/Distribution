package typings.googleapis.analyticsdataV1alphaMod.analyticsdataV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStringFilter extends StObject {
  
  /**
    * If true, the string value is case sensitive.
    */
  var caseSensitive: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The match type for this filter.
    */
  var matchType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The string value used for the matching.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaStringFilter {
  
  inline def apply(): SchemaStringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStringFilter]
  }
  
  extension [Self <: SchemaStringFilter](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveNull: Self = StObject.set(x, "caseSensitive", null)
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    inline def setMatchTypeNull: Self = StObject.set(x, "matchType", null)
    
    inline def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
