package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewUrl extends StObject {
  
  /**
    * The endpoint to which webhook notification messages are sent via an HTTP/S POST request. For the DocuSign production platform, the url must start with
    * https. For the demo platform, either http or https is ok.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ViewUrl {
  
  @scala.inline
  def apply(): ViewUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewUrl]
  }
  
  @scala.inline
  implicit class ViewUrlMutableBuilder[Self <: ViewUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
