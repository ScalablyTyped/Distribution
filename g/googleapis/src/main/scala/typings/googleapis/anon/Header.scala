package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Header extends StObject {
  
  var header: js.UndefOr[Args] = js.undefined
  
  var urls: js.UndefOr[js.Array[Result]] = js.undefined
}
object Header {
  
  inline def apply(): Header = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Header]
  }
  
  extension [Self <: Header](x: Self) {
    
    inline def setHeader(value: Args): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setUrls(value: js.Array[Result]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: Result*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
