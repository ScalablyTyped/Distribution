package typings.expoWebBrowser.buildWebBrowserDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceActionResult extends StObject {
  
  var servicePackage: js.UndefOr[String] = js.undefined
}
object ServiceActionResult {
  
  inline def apply(): ServiceActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceActionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceActionResult] (val x: Self) extends AnyVal {
    
    inline def setServicePackage(value: String): Self = StObject.set(x, "servicePackage", value.asInstanceOf[js.Any])
    
    inline def setServicePackageUndefined: Self = StObject.set(x, "servicePackage", js.undefined)
  }
}
