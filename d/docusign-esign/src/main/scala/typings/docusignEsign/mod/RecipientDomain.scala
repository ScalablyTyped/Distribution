package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientDomain extends StObject {
  
  var active: js.UndefOr[String] = js.undefined
  
  var domainCode: js.UndefOr[String] = js.undefined
  
  var domainName: js.UndefOr[String] = js.undefined
  
  var recipientDomainId: js.UndefOr[String] = js.undefined
}
object RecipientDomain {
  
  inline def apply(): RecipientDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientDomain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientDomain] (val x: Self) extends AnyVal {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDomainCode(value: String): Self = StObject.set(x, "domainCode", value.asInstanceOf[js.Any])
    
    inline def setDomainCodeUndefined: Self = StObject.set(x, "domainCode", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setRecipientDomainId(value: String): Self = StObject.set(x, "recipientDomainId", value.asInstanceOf[js.Any])
    
    inline def setRecipientDomainIdUndefined: Self = StObject.set(x, "recipientDomainId", js.undefined)
  }
}
