package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecret extends StObject {
  
  /**
    * Cloud KMS key name to use to decrypt these envs.
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step. Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build's secrets.
    */
  var secretEnv: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaSecret {
  
  inline def apply(): SchemaSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecret]
  }
  
  extension [Self <: SchemaSecret](x: Self) {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setSecretEnv(value: StringDictionary[String]): Self = StObject.set(x, "secretEnv", value.asInstanceOf[js.Any])
    
    inline def setSecretEnvNull: Self = StObject.set(x, "secretEnv", null)
    
    inline def setSecretEnvUndefined: Self = StObject.set(x, "secretEnv", js.undefined)
  }
}
