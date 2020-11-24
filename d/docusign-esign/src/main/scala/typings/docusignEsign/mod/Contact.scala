package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contact extends js.Object {
  
  /**
    * The cloud service that provided the contact. Valid values are:
    *
    * - `rooms`
    * - `docusignCore` (default)
    *
    * <!-- Future:
    *
    * - `Box`
    * - `GoogleDrive`
    * - `Dropbox`
    * - `SalesForce`
    * - `SkyDrive`
    *
    * -->
    */
  var cloudProvider: js.UndefOr[String] = js.native
  
  /**
    * The id of the container at the cloud provider. For example, this might be the room id for a DocuSign Transaction Room.
    */
  var cloudProviderContainerId: js.UndefOr[String] = js.native
  
  /**
    * The id of a contact person in the account's address book.
    */
  var contactId: js.UndefOr[String] = js.native
  
  /**
    * A list of the contact's phone numbers.
    *
    * **Note**: The phone numbers associated with shared contacts do not display to users other than the user who added the contact.
    * Additionally, in the following scenarios, the phone number of a shared contact does not populate automatically for anyone other than the user who added the contact:
    *
    * - Sending an envelope by using SMS
    * - Using phone authentication
    *
    * You must ask the user who added the contact for the phone number and then manually enter it into the authentication box.
    */
  var contactPhoneNumbers: js.UndefOr[
    js.Array[
      /* Details about the phone numbers associated with a specific contact. */ ContactPhoneNumber
    ]
  ] = js.native
  
  /**
    * The URI for retrieving information about the contact.
    */
  var contactUri: js.UndefOr[String] = js.native
  
  var emails: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  var isOwner: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var organization: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the tab is shared.
    */
  var shared: js.UndefOr[String] = js.native
  
  var signingGroup: js.UndefOr[String] = js.native
  
  /**
    * Optional. The name of the signing group.
    *
    * Maximum Length: 100 characters.
    */
  var signingGroupName: js.UndefOr[String] = js.native
}
object Contact {
  
  @scala.inline
  def apply(): Contact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contact]
  }
  
  @scala.inline
  implicit class ContactOps[Self <: Contact] (val x: Self) extends AnyVal {
    
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
    def setCloudProvider(value: String): Self = this.set("cloudProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudProvider: Self = this.set("cloudProvider", js.undefined)
    
    @scala.inline
    def setCloudProviderContainerId(value: String): Self = this.set("cloudProviderContainerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudProviderContainerId: Self = this.set("cloudProviderContainerId", js.undefined)
    
    @scala.inline
    def setContactId(value: String): Self = this.set("contactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactId: Self = this.set("contactId", js.undefined)
    
    @scala.inline
    def setContactPhoneNumbersVarargs(
      value: (/* Details about the phone numbers associated with a specific contact. */ ContactPhoneNumber)*
    ): Self = this.set("contactPhoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setContactPhoneNumbers(
      value: js.Array[
          /* Details about the phone numbers associated with a specific contact. */ ContactPhoneNumber
        ]
    ): Self = this.set("contactPhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactPhoneNumbers: Self = this.set("contactPhoneNumbers", js.undefined)
    
    @scala.inline
    def setContactUri(value: String): Self = this.set("contactUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactUri: Self = this.set("contactUri", js.undefined)
    
    @scala.inline
    def setEmailsVarargs(value: String*): Self = this.set("emails", js.Array(value :_*))
    
    @scala.inline
    def setEmails(value: js.Array[String]): Self = this.set("emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmails: Self = this.set("emails", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setIsOwner(value: Boolean): Self = this.set("isOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOwner: Self = this.set("isOwner", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    
    @scala.inline
    def setShared(value: String): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    
    @scala.inline
    def setSigningGroup(value: String): Self = this.set("signingGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningGroup: Self = this.set("signingGroup", js.undefined)
    
    @scala.inline
    def setSigningGroupName(value: String): Self = this.set("signingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningGroupName: Self = this.set("signingGroupName", js.undefined)
  }
}
