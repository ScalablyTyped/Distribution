package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrandsResponse extends StObject {
  
  /**
    * A list of brands.
    */
  var brands: js.UndefOr[
    js.Array[
      /* Information about a brand that is associated with an account. A brand applies custom styles and text to an envelope. */ Brand
    ]
  ] = js.native
  
  /**
    * The brand that envelope recipients see when a brand is not explicitly set.
    */
  var recipientBrandIdDefault: js.UndefOr[String] = js.native
  
  /**
    * The brand that envelope senders see when a brand is not explicitly set.
    */
  var senderBrandIdDefault: js.UndefOr[String] = js.native
}
object BrandsResponse {
  
  @scala.inline
  def apply(): BrandsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrandsResponse]
  }
  
  @scala.inline
  implicit class BrandsResponseMutableBuilder[Self <: BrandsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrands(
      value: js.Array[
          /* Information about a brand that is associated with an account. A brand applies custom styles and text to an envelope. */ Brand
        ]
    ): Self = StObject.set(x, "brands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandsUndefined: Self = StObject.set(x, "brands", js.undefined)
    
    @scala.inline
    def setBrandsVarargs(
      value: (/* Information about a brand that is associated with an account. A brand applies custom styles and text to an envelope. */ Brand)*
    ): Self = StObject.set(x, "brands", js.Array(value :_*))
    
    @scala.inline
    def setRecipientBrandIdDefault(value: String): Self = StObject.set(x, "recipientBrandIdDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientBrandIdDefaultUndefined: Self = StObject.set(x, "recipientBrandIdDefault", js.undefined)
    
    @scala.inline
    def setSenderBrandIdDefault(value: String): Self = StObject.set(x, "senderBrandIdDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderBrandIdDefaultUndefined: Self = StObject.set(x, "senderBrandIdDefault", js.undefined)
  }
}
