package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCookiesRequest extends StObject {
  
  /**
    * The list of URLs for which applicable cookies will be fetched.
    * If not specified, it's assumed to be set to the list containing
    * the URLs of the page and all of its subframes.
    */
  var urls: js.UndefOr[js.Array[String]] = js.native
}
object GetCookiesRequest {
  
  @scala.inline
  def apply(): GetCookiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCookiesRequest]
  }
  
  @scala.inline
  implicit class GetCookiesRequestMutableBuilder[Self <: GetCookiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
