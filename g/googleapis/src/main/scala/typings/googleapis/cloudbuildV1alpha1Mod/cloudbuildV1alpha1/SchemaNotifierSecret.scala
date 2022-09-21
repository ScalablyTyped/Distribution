package typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotifierSecret extends StObject {
  
  /**
    * Name is the local name of the secret, such as the verbatim string "my-smtp-password".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Value is interpreted to be a resource path for fetching the actual (versioned) secret data for this secret. For example, this would be a Google Cloud Secret Manager secret version resource path like: "projects/my-project/secrets/my-secret/versions/latest".
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaNotifierSecret {
  
  inline def apply(): SchemaNotifierSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotifierSecret]
  }
  
  extension [Self <: SchemaNotifierSecret](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
