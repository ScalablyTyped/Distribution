package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportWarning extends StObject {
  
  /**
    * Describes the details of the warning message, in English.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the warning.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportWarning {
  
  inline def apply(): SchemaReportWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportWarning]
  }
  
  extension [Self <: SchemaReportWarning](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
