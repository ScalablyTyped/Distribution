package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientSignatureProviderOptions extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var cpfNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var cpfNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * A pre-shared secret that the signer must enter to complete the signing process. Eg last six digits of the signer's government ID or Social Security number.
    * Or a newly created pre-shared secret for the transaction. Note: some signature providers may require an exact (case-sensitive) match if alphabetic characters
    * are included in the field.
    */
  var oneTimePassword: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `oneTimePassword` property is editable.
    */
  var oneTimePasswordMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The role or capacity of the signing recipient. Examples: Manager, Approver, etc.
    */
  var signerRole: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signerRole` property is editable.
    */
  var signerRoleMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The mobile phone number used to send the recipient an access code for the signing ceremony. Format: a string starting with +, then the country code
    * followed by the full mobile phone number without any spaces or special characters. Omit leading zeroes before a city code.
    * Examples: +14155551234, +97235551234, +33505551234.
    */
  var sms: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `sms` property is editable.
    */
  var smsMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
}
object RecipientSignatureProviderOptions {
  
  @scala.inline
  def apply(): RecipientSignatureProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientSignatureProviderOptions]
  }
  
  @scala.inline
  implicit class RecipientSignatureProviderOptionsMutableBuilder[Self <: RecipientSignatureProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpfNumber(value: String): Self = StObject.set(x, "cpfNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpfNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "cpfNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpfNumberMetadataUndefined: Self = StObject.set(x, "cpfNumberMetadata", js.undefined)
    
    @scala.inline
    def setCpfNumberUndefined: Self = StObject.set(x, "cpfNumber", js.undefined)
    
    @scala.inline
    def setOneTimePassword(value: String): Self = StObject.set(x, "oneTimePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneTimePasswordMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "oneTimePasswordMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneTimePasswordMetadataUndefined: Self = StObject.set(x, "oneTimePasswordMetadata", js.undefined)
    
    @scala.inline
    def setOneTimePasswordUndefined: Self = StObject.set(x, "oneTimePassword", js.undefined)
    
    @scala.inline
    def setSignerRole(value: String): Self = StObject.set(x, "signerRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerRoleMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "signerRoleMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerRoleMetadataUndefined: Self = StObject.set(x, "signerRoleMetadata", js.undefined)
    
    @scala.inline
    def setSignerRoleUndefined: Self = StObject.set(x, "signerRole", js.undefined)
    
    @scala.inline
    def setSms(value: String): Self = StObject.set(x, "sms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "smsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsMetadataUndefined: Self = StObject.set(x, "smsMetadata", js.undefined)
    
    @scala.inline
    def setSmsUndefined: Self = StObject.set(x, "sms", js.undefined)
  }
}
