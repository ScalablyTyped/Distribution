package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRequestFilter extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/web-request-filter
  /**
    * Array of URL patterns that will be used to filter out the requests that do not
    * match the URL patterns.
    */
  var urls: js.Array[String]
}
object WebRequestFilter {
  
  inline def apply(urls: js.Array[String]): WebRequestFilter = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebRequestFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebRequestFilter] (val x: Self) extends AnyVal {
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
