package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivilegeName extends StObject {
  
  var privilegeName: js.UndefOr[String] = js.native
  
  var serviceId: js.UndefOr[String] = js.native
}
object PrivilegeName {
  
  @scala.inline
  def apply(): PrivilegeName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivilegeName]
  }
  
  @scala.inline
  implicit class PrivilegeNameMutableBuilder[Self <: PrivilegeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivilegeName(value: String): Self = StObject.set(x, "privilegeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivilegeNameUndefined: Self = StObject.set(x, "privilegeName", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
