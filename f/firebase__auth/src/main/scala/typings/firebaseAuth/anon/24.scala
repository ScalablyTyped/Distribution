package typings.firebaseAuth.anon

import typings.firebaseAuth.distNodeSrcPlatformCordovaPluginsMod.InAppBrowserRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  def open(url: String, target: String, options: String): InAppBrowserRef
}
object `24` {
  
  inline def apply(open: (String, String, String) => InAppBrowserRef): `24` = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction3(open))
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setOpen(value: (String, String, String) => InAppBrowserRef): Self = StObject.set(x, "open", js.Any.fromFunction3(value))
  }
}
