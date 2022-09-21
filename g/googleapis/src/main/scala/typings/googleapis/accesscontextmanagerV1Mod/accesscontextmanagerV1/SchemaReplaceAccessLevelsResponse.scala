package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplaceAccessLevelsResponse extends StObject {
  
  /**
    * List of the Access Level instances.
    */
  var accessLevels: js.UndefOr[js.Array[SchemaAccessLevel]] = js.undefined
}
object SchemaReplaceAccessLevelsResponse {
  
  inline def apply(): SchemaReplaceAccessLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAccessLevelsResponse]
  }
  
  extension [Self <: SchemaReplaceAccessLevelsResponse](x: Self) {
    
    inline def setAccessLevels(value: js.Array[SchemaAccessLevel]): Self = StObject.set(x, "accessLevels", value.asInstanceOf[js.Any])
    
    inline def setAccessLevelsUndefined: Self = StObject.set(x, "accessLevels", js.undefined)
    
    inline def setAccessLevelsVarargs(value: SchemaAccessLevel*): Self = StObject.set(x, "accessLevels", js.Array(value*))
  }
}
