package typings.googleapis.cloudfunctionsV2Mod.cloudfunctionsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecretEnvVar extends StObject {
  
  /**
    * Name of the environment variable.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Project identifier (preferably project number but can also be the project ID) of the project that contains the secret. If not set, it is assumed that the secret is in the same project as the function.
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the secret in secret manager (not the full resource name).
    */
  var secret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version of the secret (version number or the string 'latest'). It is recommended to use a numeric version for secret environment variables as any updates to the secret value is not reflected until new instances start.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecretEnvVar {
  
  inline def apply(): SchemaSecretEnvVar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecretEnvVar]
  }
  
  extension [Self <: SchemaSecretEnvVar](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretNull: Self = StObject.set(x, "secret", null)
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
