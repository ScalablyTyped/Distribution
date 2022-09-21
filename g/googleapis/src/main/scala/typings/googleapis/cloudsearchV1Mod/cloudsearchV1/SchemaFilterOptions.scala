package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFilterOptions extends StObject {
  
  /**
    * Generic filter to restrict the search, such as `lang:en`, `site:xyz`.
    */
  var filter: js.UndefOr[SchemaFilter] = js.undefined
  
  /**
    * If object_type is set, only objects of that type are returned. This should correspond to the name of the object that was registered within the definition of schema. The maximum length is 256 characters.
    */
  var objectType: js.UndefOr[String | Null] = js.undefined
}
object SchemaFilterOptions {
  
  inline def apply(): SchemaFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterOptions]
  }
  
  extension [Self <: SchemaFilterOptions](x: Self) {
    
    inline def setFilter(value: SchemaFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNull: Self = StObject.set(x, "objectType", null)
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
  }
}
