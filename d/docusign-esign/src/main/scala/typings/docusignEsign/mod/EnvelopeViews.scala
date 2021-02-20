package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeViews extends StObject {
  
  /**
    * The view URL to be navigated to.
    */
  var url: js.UndefOr[String] = js.native
}
object EnvelopeViews {
  
  @scala.inline
  def apply(): EnvelopeViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeViews]
  }
  
  @scala.inline
  implicit class EnvelopeViewsMutableBuilder[Self <: EnvelopeViews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
