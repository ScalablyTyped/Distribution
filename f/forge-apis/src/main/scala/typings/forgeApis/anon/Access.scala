package typings.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Access extends StObject {
  
  var access: js.UndefOr[String] = js.native
}
object Access {
  
  @scala.inline
  def apply(): Access = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Access]
  }
  
  @scala.inline
  implicit class AccessMutableBuilder[Self <: Access] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: String): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
  }
}
