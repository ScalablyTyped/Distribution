package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountBrands extends StObject {
  
  /**
    * A list of brands.
    */
  var brands: js.UndefOr[
    js.Array[
      /* Information about a brand that is associated with an account. A brand applies custom styles and text to an envelope. */ Brand
    ]
  ] = js.undefined
  
  /**
    * The brand that envelope recipients see when a brand is not explicitly set.
    */
  var recipientBrandIdDefault: js.UndefOr[String] = js.undefined
  
  /**
    * The brand that envelope senders see when a brand is not explicitly set.
    */
  var senderBrandIdDefault: js.UndefOr[String] = js.undefined
}
object AccountBrands {
  
  inline def apply(): AccountBrands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountBrands]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountBrands] (val x: Self) extends AnyVal {
    
    inline def setBrands(
      value: js.Array[
          /* Information about a brand that is associated with an account. A brand applies custom styles and text to an envelope. */ Brand
        ]
    ): Self = StObject.set(x, "brands", value.asInstanceOf[js.Any])
    
    inline def setBrandsUndefined: Self = StObject.set(x, "brands", js.undefined)
    
    inline def setBrandsVarargs(
      value: (/* Information about a brand that is associated with an account. A brand applies custom styles and text to an envelope. */ Brand)*
    ): Self = StObject.set(x, "brands", js.Array(value*))
    
    inline def setRecipientBrandIdDefault(value: String): Self = StObject.set(x, "recipientBrandIdDefault", value.asInstanceOf[js.Any])
    
    inline def setRecipientBrandIdDefaultUndefined: Self = StObject.set(x, "recipientBrandIdDefault", js.undefined)
    
    inline def setSenderBrandIdDefault(value: String): Self = StObject.set(x, "senderBrandIdDefault", value.asInstanceOf[js.Any])
    
    inline def setSenderBrandIdDefaultUndefined: Self = StObject.set(x, "senderBrandIdDefault", js.undefined)
  }
}
