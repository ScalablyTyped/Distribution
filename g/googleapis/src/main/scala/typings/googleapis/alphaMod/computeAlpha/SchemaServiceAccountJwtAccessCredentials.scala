package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JWT credentials for a service account.
  */
@js.native
trait SchemaServiceAccountJwtAccessCredentials extends StObject {
  
  /**
    * Service account key.
    */
  var jsonKey: js.UndefOr[String] = js.native
  
  /**
    * The token lifetime seconds.
    */
  var tokenLifetimeSeconds: js.UndefOr[String] = js.native
}
object SchemaServiceAccountJwtAccessCredentials {
  
  @scala.inline
  def apply(): SchemaServiceAccountJwtAccessCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountJwtAccessCredentials]
  }
  
  @scala.inline
  implicit class SchemaServiceAccountJwtAccessCredentialsMutableBuilder[Self <: SchemaServiceAccountJwtAccessCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsonKey(value: String): Self = StObject.set(x, "jsonKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonKeyUndefined: Self = StObject.set(x, "jsonKey", js.undefined)
    
    @scala.inline
    def setTokenLifetimeSeconds(value: String): Self = StObject.set(x, "tokenLifetimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenLifetimeSecondsUndefined: Self = StObject.set(x, "tokenLifetimeSeconds", js.undefined)
  }
}
