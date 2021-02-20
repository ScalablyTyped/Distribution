package typings.googleGax.iamServiceMod.google.iam.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a TestIamPermissionsResponse. */
@js.native
trait ITestIamPermissionsResponse extends StObject {
  
  /** TestIamPermissionsResponse permissions */
  var permissions: js.UndefOr[js.Array[String] | Null] = js.native
}
object ITestIamPermissionsResponse {
  
  @scala.inline
  def apply(): ITestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITestIamPermissionsResponse]
  }
  
  @scala.inline
  implicit class ITestIamPermissionsResponseMutableBuilder[Self <: ITestIamPermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
