package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestIamPermissionsRequest. */
@js.native
trait ITestIamPermissionsRequest extends StObject {
  
  /** TestIamPermissionsRequest permissions */
  var permissions: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** TestIamPermissionsRequest resource */
  var resource: js.UndefOr[String | Null] = js.native
}
object ITestIamPermissionsRequest {
  
  @scala.inline
  def apply(): ITestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestIamPermissionsRequest]
  }
  
  @scala.inline
  implicit class ITestIamPermissionsRequestMutableBuilder[Self <: ITestIamPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNull: Self = StObject.set(x, "resource", null)
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
