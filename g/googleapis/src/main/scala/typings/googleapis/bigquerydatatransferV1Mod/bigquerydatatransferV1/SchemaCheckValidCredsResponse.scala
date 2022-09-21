package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCheckValidCredsResponse extends StObject {
  
  /**
    * If set to `true`, the credentials exist and are valid.
    */
  var hasValidCreds: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCheckValidCredsResponse {
  
  inline def apply(): SchemaCheckValidCredsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckValidCredsResponse]
  }
  
  extension [Self <: SchemaCheckValidCredsResponse](x: Self) {
    
    inline def setHasValidCreds(value: Boolean): Self = StObject.set(x, "hasValidCreds", value.asInstanceOf[js.Any])
    
    inline def setHasValidCredsNull: Self = StObject.set(x, "hasValidCreds", null)
    
    inline def setHasValidCredsUndefined: Self = StObject.set(x, "hasValidCreds", js.undefined)
  }
}
