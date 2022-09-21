package typings.googleapis.apikeysV2Mod.apikeysV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV2LookupKeyResponse extends StObject {
  
  /**
    * The resource name of the API key. If the API key has been purged, resource name is empty.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The project that owns the key with the value specified in the request.
    */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object SchemaV2LookupKeyResponse {
  
  inline def apply(): SchemaV2LookupKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV2LookupKeyResponse]
  }
  
  extension [Self <: SchemaV2LookupKeyResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
