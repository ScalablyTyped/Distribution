package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProofServiceResourceToken extends StObject {
  
  var ResourceToken: js.UndefOr[String] = js.native
}
object ProofServiceResourceToken {
  
  @scala.inline
  def apply(): ProofServiceResourceToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProofServiceResourceToken]
  }
  
  @scala.inline
  implicit class ProofServiceResourceTokenMutableBuilder[Self <: ProofServiceResourceToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceToken(value: String): Self = StObject.set(x, "ResourceToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTokenUndefined: Self = StObject.set(x, "ResourceToken", js.undefined)
  }
}
