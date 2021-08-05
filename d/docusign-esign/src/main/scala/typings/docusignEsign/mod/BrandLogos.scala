package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrandLogos extends StObject {
  
  /**
    * The URI for the logo that the brand uses in the header of email messages.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the brand's primary logo.
    */
  var primary: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for the brand's secondary logo.
    */
  var secondary: js.UndefOr[String] = js.undefined
}
object BrandLogos {
  
  inline def apply(): BrandLogos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandLogos]
  }
  
  extension [Self <: BrandLogos](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
