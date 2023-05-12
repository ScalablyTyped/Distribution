package typings.firebaseAuth.anon

import typings.firebaseAuth.distNodeSrcPlatformCordovaPluginsMod.InAppBrowserRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  def open(url: String, target: String, options: String): InAppBrowserRef
}
object `31` {
  
  inline def apply(open: (String, String, String) => InAppBrowserRef): `31` = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction3(open))
    __obj.asInstanceOf[`31`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `31`] (val x: Self) extends AnyVal {
    
    inline def setOpen(value: (String, String, String) => InAppBrowserRef): Self = StObject.set(x, "open", js.Any.fromFunction3(value))
  }
}
