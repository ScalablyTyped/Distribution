package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProofServiceViewLink extends StObject {
  
  var ViewLink: js.UndefOr[String] = js.undefined
}
object ProofServiceViewLink {
  
  @scala.inline
  def apply(): ProofServiceViewLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProofServiceViewLink]
  }
  
  @scala.inline
  implicit class ProofServiceViewLinkMutableBuilder[Self <: ProofServiceViewLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewLink(value: String): Self = StObject.set(x, "ViewLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewLinkUndefined: Self = StObject.set(x, "ViewLink", js.undefined)
  }
}
