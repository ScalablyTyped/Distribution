package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientDomain extends StObject {
  
  var active: js.UndefOr[String] = js.native
  
  var domainCode: js.UndefOr[String] = js.native
  
  var domainName: js.UndefOr[String] = js.native
  
  var recipientDomainId: js.UndefOr[String] = js.native
}
object RecipientDomain {
  
  @scala.inline
  def apply(): RecipientDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientDomain]
  }
  
  @scala.inline
  implicit class RecipientDomainMutableBuilder[Self <: RecipientDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setDomainCode(value: String): Self = StObject.set(x, "domainCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainCodeUndefined: Self = StObject.set(x, "domainCode", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setRecipientDomainId(value: String): Self = StObject.set(x, "recipientDomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientDomainIdUndefined: Self = StObject.set(x, "recipientDomainId", js.undefined)
  }
}
