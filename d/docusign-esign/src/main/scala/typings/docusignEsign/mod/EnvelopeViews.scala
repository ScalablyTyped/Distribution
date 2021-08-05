package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeViews extends StObject {
  
  /**
    * The view URL to be navigated to.
    */
  var url: js.UndefOr[String] = js.undefined
}
object EnvelopeViews {
  
  inline def apply(): EnvelopeViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeViews]
  }
  
  extension [Self <: EnvelopeViews](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
