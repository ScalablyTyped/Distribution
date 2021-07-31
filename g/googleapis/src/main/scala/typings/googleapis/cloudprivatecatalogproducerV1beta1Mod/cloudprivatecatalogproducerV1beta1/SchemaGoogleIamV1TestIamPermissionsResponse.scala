package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for `TestIamPermissions` method.
  */
trait SchemaGoogleIamV1TestIamPermissionsResponse extends StObject {
  
  /**
    * A subset of `TestPermissionsRequest.permissions` that the caller is
    * allowed.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaGoogleIamV1TestIamPermissionsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleIamV1TestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV1TestIamPermissionsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleIamV1TestIamPermissionsResponseMutableBuilder[Self <: SchemaGoogleIamV1TestIamPermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
