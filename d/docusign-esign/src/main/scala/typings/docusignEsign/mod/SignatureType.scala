package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureType extends js.Object {
  
  /**
    * When **true**, the signature type is the default type.
    */
  var isDefault: js.UndefOr[String] = js.native
  
  /**
    * The type of signature. Valid values are:
    *
    * - `electronic`: Indicates an **electronic** signature that is used by common law countries such as the United States, United Kingdom, and Australia.
    * This is the default signature type that DocuSign uses.
    * - `universal`: Indicates a **digital** signature that is accepted by both common law and civil law countries. To use digital signatures,
    * you must use the [DocuSign Signature Appliance](https://developers.docusign.com/dsa-api).
    *
    * For more information, see [Standards Based Signatures](https://developers.docusign.com/esign-rest-api/guides/standards-based-signatures).
    */
  var `type`: js.UndefOr[String] = js.native
}
object SignatureType {
  
  @scala.inline
  def apply(): SignatureType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureType]
  }
  
  @scala.inline
  implicit class SignatureTypeOps[Self <: SignatureType] (val x: Self) extends AnyVal {
    
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
    def setIsDefault(value: String): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
