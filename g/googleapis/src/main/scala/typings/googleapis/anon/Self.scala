package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Self extends StObject {
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var self: js.UndefOr[Boolean] = js.undefined
}
object Self {
  
  inline def apply(): Self = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Self]
  }
  
  extension [Self_ <: Self](x: Self_) {
    
    inline def setDisplayName(value: String): Self_ = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self_ = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self_ = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self_ = StObject.set(x, "email", js.undefined)
    
    inline def setId(value: String): Self_ = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self_ = StObject.set(x, "id", js.undefined)
    
    inline def setSelf(value: Boolean): Self_ = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfUndefined: Self_ = StObject.set(x, "self", js.undefined)
  }
}
