package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestIamPermissionsResponse extends StObject {
  
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object TestIamPermissionsResponse {
  
  @scala.inline
  def apply(): TestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestIamPermissionsResponse]
  }
  
  @scala.inline
  implicit class TestIamPermissionsResponseMutableBuilder[Self <: TestIamPermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
