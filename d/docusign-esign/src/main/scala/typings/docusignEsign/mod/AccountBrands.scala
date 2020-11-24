package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountBrands extends js.Object {
  
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
object AccountBrands {
  
  @scala.inline
  def apply(): AccountBrands = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountBrands]
  }
  
  @scala.inline
  implicit class AccountBrandsOps[Self <: AccountBrands] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrandsVarargs(
      value: (/* Information about a brand that is associated with an account. A brand applies custom styles and text to an envelope. */ Brand)*
    ): Self = this.set("brands", js.Array(value :_*))
    
    @scala.inline
    def setBrands(
      value: js.Array[
          /* Information about a brand that is associated with an account. A brand applies custom styles and text to an envelope. */ Brand
        ]
    ): Self = this.set("brands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrands: Self = this.set("brands", js.undefined)
    
    @scala.inline
    def setRecipientBrandIdDefault(value: String): Self = this.set("recipientBrandIdDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientBrandIdDefault: Self = this.set("recipientBrandIdDefault", js.undefined)
    
    @scala.inline
    def setSenderBrandIdDefault(value: String): Self = this.set("senderBrandIdDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderBrandIdDefault: Self = this.set("senderBrandIdDefault", js.undefined)
  }
}
