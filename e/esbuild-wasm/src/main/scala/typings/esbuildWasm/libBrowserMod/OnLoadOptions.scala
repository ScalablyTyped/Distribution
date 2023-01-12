package typings.esbuildWasm.libBrowserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnLoadOptions extends StObject {
  
  var filter: js.RegExp
  
  var namespace: js.UndefOr[String] = js.undefined
}
object OnLoadOptions {
  
  inline def apply(filter: js.RegExp): OnLoadOptions = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnLoadOptions] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: js.RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
