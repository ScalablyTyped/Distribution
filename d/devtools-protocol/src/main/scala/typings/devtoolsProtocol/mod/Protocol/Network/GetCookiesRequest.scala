package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCookiesRequest extends StObject {
  
  /**
    * The list of URLs for which applicable cookies will be fetched.
    * If not specified, it's assumed to be set to the list containing
    * the URLs of the page and all of its subframes.
    */
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}
object GetCookiesRequest {
  
  inline def apply(): GetCookiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCookiesRequest]
  }
  
  extension [Self <: GetCookiesRequest](x: Self) {
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
