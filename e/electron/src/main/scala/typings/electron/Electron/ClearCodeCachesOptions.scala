package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearCodeCachesOptions extends StObject {
  
  /**
    * An array of url corresponding to the resource whose generated code cache needs
    * to be removed. If the list is empty then all entries in the cache directory will
    * be removed.
    */
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}
object ClearCodeCachesOptions {
  
  inline def apply(): ClearCodeCachesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearCodeCachesOptions]
  }
  
  extension [Self <: ClearCodeCachesOptions](x: Self) {
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
