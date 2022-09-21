package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaItemStructuredData extends StObject {
  
  /**
    * Hashing value provided by the API caller. This can be used with the items.push method to calculate modified state. The maximum length is 2048 characters.
    */
  var hash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The structured data object that should conform to a registered object definition in the schema for the data source.
    */
  var `object`: js.UndefOr[SchemaStructuredDataObject] = js.undefined
}
object SchemaItemStructuredData {
  
  inline def apply(): SchemaItemStructuredData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemStructuredData]
  }
  
  extension [Self <: SchemaItemStructuredData](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashNull: Self = StObject.set(x, "hash", null)
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setObject(value: SchemaStructuredDataObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
  }
}
