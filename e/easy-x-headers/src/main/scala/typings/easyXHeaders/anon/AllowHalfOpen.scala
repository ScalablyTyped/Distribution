package typings.easyXHeaders.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowHalfOpen extends StObject {
  
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
  
  var fd: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object AllowHalfOpen {
  
  @scala.inline
  def apply(): AllowHalfOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowHalfOpen]
  }
  
  @scala.inline
  implicit class AllowHalfOpenMutableBuilder[Self <: AllowHalfOpen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
    
    @scala.inline
    def setFd(value: String): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
