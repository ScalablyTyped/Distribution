package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckConsistencyResponse extends StObject {
  
  /**
    * True only if the token is consistent. A token is consistent if replication has caught up with the restrictions specified in the request.
    */
  var consistent: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCheckConsistencyResponse {
  
  inline def apply(): SchemaCheckConsistencyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckConsistencyResponse]
  }
  
  extension [Self <: SchemaCheckConsistencyResponse](x: Self) {
    
    inline def setConsistent(value: Boolean): Self = StObject.set(x, "consistent", value.asInstanceOf[js.Any])
    
    inline def setConsistentNull: Self = StObject.set(x, "consistent", null)
    
    inline def setConsistentUndefined: Self = StObject.set(x, "consistent", js.undefined)
  }
}
