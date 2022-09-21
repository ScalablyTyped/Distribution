package typings.expoWebBrowser.webBrowserTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedirectEvent extends StObject {
  
  var url: String
}
object RedirectEvent {
  
  inline def apply(url: String): RedirectEvent = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectEvent]
  }
  
  extension [Self <: RedirectEvent](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
