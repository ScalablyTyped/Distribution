package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JWT credentials for a service account.
  */
trait SchemaServiceAccountJwtAccessCredentials extends StObject {
  
  /**
    * Service account key.
    */
  var jsonKey: js.UndefOr[String] = js.undefined
  
  /**
    * The token lifetime seconds.
    */
  var tokenLifetimeSeconds: js.UndefOr[String] = js.undefined
}
object SchemaServiceAccountJwtAccessCredentials {
  
  inline def apply(): SchemaServiceAccountJwtAccessCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountJwtAccessCredentials]
  }
  
  extension [Self <: SchemaServiceAccountJwtAccessCredentials](x: Self) {
    
    inline def setJsonKey(value: String): Self = StObject.set(x, "jsonKey", value.asInstanceOf[js.Any])
    
    inline def setJsonKeyUndefined: Self = StObject.set(x, "jsonKey", js.undefined)
    
    inline def setTokenLifetimeSeconds(value: String): Self = StObject.set(x, "tokenLifetimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setTokenLifetimeSecondsUndefined: Self = StObject.set(x, "tokenLifetimeSeconds", js.undefined)
  }
}
