package typings.firebase.anon

import typings.firebase.mod.firebase.auth.MultiFactorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @deprecated
    * This field is deprecated in favor of previousEmail.
    */
  var fromEmail: js.UndefOr[String | Null] = js.undefined
  
  var multiFactorInfo: js.UndefOr[MultiFactorInfo | Null] = js.undefined
  
  var previousEmail: js.UndefOr[String | Null] = js.undefined
}
object Email {
  
  @scala.inline
  def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  
  @scala.inline
  implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNull: Self = StObject.set(x, "email", null)
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFromEmail(value: String): Self = StObject.set(x, "fromEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromEmailNull: Self = StObject.set(x, "fromEmail", null)
    
    @scala.inline
    def setFromEmailUndefined: Self = StObject.set(x, "fromEmail", js.undefined)
    
    @scala.inline
    def setMultiFactorInfo(value: MultiFactorInfo): Self = StObject.set(x, "multiFactorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiFactorInfoNull: Self = StObject.set(x, "multiFactorInfo", null)
    
    @scala.inline
    def setMultiFactorInfoUndefined: Self = StObject.set(x, "multiFactorInfo", js.undefined)
    
    @scala.inline
    def setPreviousEmail(value: String): Self = StObject.set(x, "previousEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousEmailNull: Self = StObject.set(x, "previousEmail", null)
    
    @scala.inline
    def setPreviousEmailUndefined: Self = StObject.set(x, "previousEmail", js.undefined)
  }
}
