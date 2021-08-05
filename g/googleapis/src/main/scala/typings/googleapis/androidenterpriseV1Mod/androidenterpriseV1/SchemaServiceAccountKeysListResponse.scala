package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceAccountKeysListResponse extends StObject {
  
  /**
    * The service account credentials.
    */
  var serviceAccountKey: js.UndefOr[js.Array[SchemaServiceAccountKey]] = js.undefined
}
object SchemaServiceAccountKeysListResponse {
  
  inline def apply(): SchemaServiceAccountKeysListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountKeysListResponse]
  }
  
  extension [Self <: SchemaServiceAccountKeysListResponse](x: Self) {
    
    inline def setServiceAccountKey(value: js.Array[SchemaServiceAccountKey]): Self = StObject.set(x, "serviceAccountKey", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountKeyUndefined: Self = StObject.set(x, "serviceAccountKey", js.undefined)
    
    inline def setServiceAccountKeyVarargs(value: SchemaServiceAccountKey*): Self = StObject.set(x, "serviceAccountKey", js.Array(value :_*))
  }
}
