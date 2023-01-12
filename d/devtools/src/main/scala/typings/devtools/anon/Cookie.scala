package typings.devtools.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookie extends StObject {
  
  var cookie: typings.wdioProtocols.buildTypesMod.Cookie
}
object Cookie {
  
  inline def apply(cookie: typings.wdioProtocols.buildTypesMod.Cookie): Cookie = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
    
    inline def setCookie(value: typings.wdioProtocols.buildTypesMod.Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
  }
}
