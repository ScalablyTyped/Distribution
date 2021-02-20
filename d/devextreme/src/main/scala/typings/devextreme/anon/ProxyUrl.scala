package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyUrl extends StObject {
  
  var fileName: js.UndefOr[String] = js.native
  
  var proxyUrl: js.UndefOr[String] = js.native
}
object ProxyUrl {
  
  @scala.inline
  def apply(): ProxyUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyUrl]
  }
  
  @scala.inline
  implicit class ProxyUrlMutableBuilder[Self <: ProxyUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
  }
}
