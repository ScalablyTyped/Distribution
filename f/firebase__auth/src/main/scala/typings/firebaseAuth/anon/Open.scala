package typings.firebaseAuth.anon

import typings.firebaseAuth.distBrowserCjsSrcPlatformCordovaPluginsMod.InAppBrowserRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Open extends StObject {
  
  def open(url: String, target: String, options: String): InAppBrowserRef
}
object Open {
  
  inline def apply(open: (String, String, String) => InAppBrowserRef): Open = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction3(open))
    __obj.asInstanceOf[Open]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Open] (val x: Self) extends AnyVal {
    
    inline def setOpen(value: (String, String, String) => InAppBrowserRef): Self = StObject.set(x, "open", js.Any.fromFunction3(value))
  }
}
