package typings.divaJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait D extends StObject {
  
  var d: H = js.native
  
  var f: String = js.native
  
  var il: String = js.native
  
  var url: String = js.native
}
object D {
  
  @scala.inline
  def apply(d: H, f: String, il: String, url: String): D = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], il = il.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[D]
  }
  
  @scala.inline
  implicit class DMutableBuilder[Self <: D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: H): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIl(value: String): Self = StObject.set(x, "il", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
