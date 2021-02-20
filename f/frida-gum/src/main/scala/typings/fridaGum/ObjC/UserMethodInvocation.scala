package typings.fridaGum.ObjC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserMethodInvocation[D, T, S] extends StObject {
  
  var data: D = js.native
  
  var self: T = js.native
  
  var `super`: S = js.native
}
object UserMethodInvocation {
  
  @scala.inline
  def apply[D, T, S](data: D, self: T, `super`: S): UserMethodInvocation[D, T, S] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.updateDynamic("super")(`super`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserMethodInvocation[D, T, S]]
  }
  
  @scala.inline
  implicit class UserMethodInvocationMutableBuilder[Self <: UserMethodInvocation[_, _, _], D, T, S] (val x: Self with (UserMethodInvocation[D, T, S])) extends AnyVal {
    
    @scala.inline
    def setData(value: D): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: T): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuper(value: S): Self = StObject.set(x, "super", value.asInstanceOf[js.Any])
  }
}
