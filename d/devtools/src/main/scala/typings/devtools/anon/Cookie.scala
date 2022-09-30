package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookie extends StObject {
  
  var cookie: typings.wdioProtocols.typesMod.Cookie
}
object Cookie {
  
  inline def apply(cookie: typings.wdioProtocols.typesMod.Cookie): Cookie = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  extension [Self <: Cookie](x: Self) {
    
    inline def setCookie(value: typings.wdioProtocols.typesMod.Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
  }
}
