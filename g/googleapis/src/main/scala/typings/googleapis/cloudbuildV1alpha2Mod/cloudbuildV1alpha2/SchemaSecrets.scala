package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecrets extends StObject {
  
  /**
    * Secrets encrypted with KMS key and the associated secret environment variable.
    */
  var `inline`: js.UndefOr[js.Array[SchemaInlineSecret]] = js.undefined
  
  /**
    * Secrets in Secret Manager and associated secret environment variable.
    */
  var secretManager: js.UndefOr[js.Array[SchemaSecretManagerSecret]] = js.undefined
}
object SchemaSecrets {
  
  inline def apply(): SchemaSecrets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecrets]
  }
  
  extension [Self <: SchemaSecrets](x: Self) {
    
    inline def setInline(value: js.Array[SchemaInlineSecret]): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setInlineVarargs(value: SchemaInlineSecret*): Self = StObject.set(x, "inline", js.Array(value*))
    
    inline def setSecretManager(value: js.Array[SchemaSecretManagerSecret]): Self = StObject.set(x, "secretManager", value.asInstanceOf[js.Any])
    
    inline def setSecretManagerUndefined: Self = StObject.set(x, "secretManager", js.undefined)
    
    inline def setSecretManagerVarargs(value: SchemaSecretManagerSecret*): Self = StObject.set(x, "secretManager", js.Array(value*))
  }
}
