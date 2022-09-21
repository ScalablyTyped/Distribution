package typings.googleapis.cloudbuildV1beta1Mod.cloudbuildV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotifierSecretRef extends StObject {
  
  /**
    * The value of `secret_ref` should be a `name` that is registered in a `Secret` in the `secrets` list of the `Spec`.
    */
  var secretRef: js.UndefOr[String | Null] = js.undefined
}
object SchemaNotifierSecretRef {
  
  inline def apply(): SchemaNotifierSecretRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotifierSecretRef]
  }
  
  extension [Self <: SchemaNotifierSecretRef](x: Self) {
    
    inline def setSecretRef(value: String): Self = StObject.set(x, "secretRef", value.asInstanceOf[js.Any])
    
    inline def setSecretRefNull: Self = StObject.set(x, "secretRef", null)
    
    inline def setSecretRefUndefined: Self = StObject.set(x, "secretRef", js.undefined)
  }
}
