package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAccessLevelsResponse extends StObject {
  
  /**
    * List of the Access Level instances.
    */
  var accessLevels: js.UndefOr[js.Array[SchemaAccessLevel]] = js.undefined
  
  /**
    * The pagination token to retrieve the next page of results. If the value is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAccessLevelsResponse {
  
  inline def apply(): SchemaListAccessLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAccessLevelsResponse]
  }
  
  extension [Self <: SchemaListAccessLevelsResponse](x: Self) {
    
    inline def setAccessLevels(value: js.Array[SchemaAccessLevel]): Self = StObject.set(x, "accessLevels", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelsUndefined: Self = StObject.set(x, "accessLevels", js.undefined)
    
    inline def setAccessLevelsVarargs(value: SchemaAccessLevel*): Self = StObject.set(x, "accessLevels", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
