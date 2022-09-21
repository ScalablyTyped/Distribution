package typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecretManagerSecret extends StObject {
  
  /**
    * Environment variable name to associate with the secret. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step.
    */
  var env: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of the SecretVersion. In format: projects/x/secrets/x/versions/x
    */
  var versionName: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecretManagerSecret {
  
  inline def apply(): SchemaSecretManagerSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecretManagerSecret]
  }
  
  extension [Self <: SchemaSecretManagerSecret](x: Self) {
    
    inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvNull: Self = StObject.set(x, "env", null)
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameNull: Self = StObject.set(x, "versionName", null)
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}
