package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckConsistencyRequest extends StObject {
  
  /**
    * Required. The token created using GenerateConsistencyToken for the Table.
    */
  var consistencyToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaCheckConsistencyRequest {
  
  inline def apply(): SchemaCheckConsistencyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckConsistencyRequest]
  }
  
  extension [Self <: SchemaCheckConsistencyRequest](x: Self) {
    
    inline def setConsistencyToken(value: String): Self = StObject.set(x, "consistencyToken", value.asInstanceOf[js.Any])
    
    inline def setConsistencyTokenNull: Self = StObject.set(x, "consistencyToken", null)
    
    inline def setConsistencyTokenUndefined: Self = StObject.set(x, "consistencyToken", js.undefined)
  }
}
