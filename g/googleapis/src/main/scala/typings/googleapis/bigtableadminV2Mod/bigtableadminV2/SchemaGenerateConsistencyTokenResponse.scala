package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for
  * google.bigtable.admin.v2.BigtableTableAdmin.GenerateConsistencyToken
  */
trait SchemaGenerateConsistencyTokenResponse extends StObject {
  
  /**
    * The generated consistency token.
    */
  var consistencyToken: js.UndefOr[String] = js.undefined
}
object SchemaGenerateConsistencyTokenResponse {
  
  inline def apply(): SchemaGenerateConsistencyTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateConsistencyTokenResponse]
  }
  
  extension [Self <: SchemaGenerateConsistencyTokenResponse](x: Self) {
    
    inline def setConsistencyToken(value: String): Self = StObject.set(x, "consistencyToken", value.asInstanceOf[js.Any])
    
    inline def setConsistencyTokenUndefined: Self = StObject.set(x, "consistencyToken", js.undefined)
  }
}
