package typings.divaJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait D extends StObject {
  
  var d: H
  
  var f: String
  
  var il: String
  
  var url: String
}
object D {
  
  inline def apply(d: H, f: String, il: String, url: String): D = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], il = il.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[D]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: D] (val x: Self) extends AnyVal {
    
    inline def setD(value: H): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setF(value: String): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setIl(value: String): Self = StObject.set(x, "il", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
