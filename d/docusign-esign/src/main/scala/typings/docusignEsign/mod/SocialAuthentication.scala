package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocialAuthentication extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var authentication: js.UndefOr[String] = js.native
}
object SocialAuthentication {
  
  @scala.inline
  def apply(): SocialAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialAuthentication]
  }
  
  @scala.inline
  implicit class SocialAuthenticationMutableBuilder[Self <: SocialAuthentication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthentication(value: String): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationUndefined: Self = StObject.set(x, "authentication", js.undefined)
  }
}
