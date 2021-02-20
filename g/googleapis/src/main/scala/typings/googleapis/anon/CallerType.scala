package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallerType extends StObject {
  
  var callerType: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var profileId: js.UndefOr[String] = js.native
}
object CallerType {
  
  @scala.inline
  def apply(): CallerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallerType]
  }
  
  @scala.inline
  implicit class CallerTypeMutableBuilder[Self <: CallerType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallerType(value: String): Self = StObject.set(x, "callerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerTypeUndefined: Self = StObject.set(x, "callerType", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
  }
}
