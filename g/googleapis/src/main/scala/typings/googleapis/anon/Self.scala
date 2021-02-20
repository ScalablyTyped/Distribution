package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Self extends StObject {
  
  var displayName: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var self: js.UndefOr[Boolean] = js.native
}
object Self {
  
  @scala.inline
  def apply(): Self = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Self]
  }
  
  @scala.inline
  implicit class SelfMutableBuilder[Self_ <: Self] (val x: Self_) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self_ = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self_ = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self_ = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self_ = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setId(value: String): Self_ = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self_ = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setSelf(value: Boolean): Self_ = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfUndefined: Self_ = StObject.set(x, "self", js.undefined)
  }
}
