package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIamV1TestIamPermissionsResponse extends StObject {
  
  /**
    * A subset of `TestPermissionsRequest.permissions` that the caller is allowed.
    */
  var permissions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleIamV1TestIamPermissionsResponse {
  
  inline def apply(): SchemaGoogleIamV1TestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV1TestIamPermissionsResponse]
  }
  
  extension [Self <: SchemaGoogleIamV1TestIamPermissionsResponse](x: Self) {
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
