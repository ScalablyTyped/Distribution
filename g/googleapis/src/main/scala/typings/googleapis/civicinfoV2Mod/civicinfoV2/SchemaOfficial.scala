package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a person holding an elected office.
  */
@js.native
trait SchemaOfficial extends js.Object {
  
  /**
    * Addresses at which to contact the official.
    */
  var address: js.UndefOr[js.Array[SchemaSimpleAddressType]] = js.native
  
  /**
    * A list of known (social) media channels for this official.
    */
  var channels: js.UndefOr[js.Array[SchemaChannel]] = js.native
  
  /**
    * The direct email addresses for the official.
    */
  var emails: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The official&#39;s name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The full name of the party the official belongs to.
    */
  var party: js.UndefOr[String] = js.native
  
  /**
    * The official&#39;s public contact phone numbers.
    */
  var phones: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A URL for a photo of the official.
    */
  var photoUrl: js.UndefOr[String] = js.native
  
  /**
    * The official&#39;s public website URLs.
    */
  var urls: js.UndefOr[js.Array[String]] = js.native
}
object SchemaOfficial {
  
  @scala.inline
  def apply(): SchemaOfficial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOfficial]
  }
  
  @scala.inline
  implicit class SchemaOfficialOps[Self <: SchemaOfficial] (val x: Self) extends AnyVal {
    
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
    def setAddressVarargs(value: SchemaSimpleAddressType*): Self = this.set("address", js.Array(value :_*))
    
    @scala.inline
    def setAddress(value: js.Array[SchemaSimpleAddressType]): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: SchemaChannel*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[SchemaChannel]): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setEmailsVarargs(value: String*): Self = this.set("emails", js.Array(value :_*))
    
    @scala.inline
    def setEmails(value: js.Array[String]): Self = this.set("emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmails: Self = this.set("emails", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParty(value: String): Self = this.set("party", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParty: Self = this.set("party", js.undefined)
    
    @scala.inline
    def setPhonesVarargs(value: String*): Self = this.set("phones", js.Array(value :_*))
    
    @scala.inline
    def setPhones(value: js.Array[String]): Self = this.set("phones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhones: Self = this.set("phones", js.undefined)
    
    @scala.inline
    def setPhotoUrl(value: String): Self = this.set("photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotoUrl: Self = this.set("photoUrl", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
}
