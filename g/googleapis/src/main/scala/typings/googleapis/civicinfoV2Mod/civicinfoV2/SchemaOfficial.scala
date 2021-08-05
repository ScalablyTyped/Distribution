package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a person holding an elected office.
  */
trait SchemaOfficial extends StObject {
  
  /**
    * Addresses at which to contact the official.
    */
  var address: js.UndefOr[js.Array[SchemaSimpleAddressType]] = js.undefined
  
  /**
    * A list of known (social) media channels for this official.
    */
  var channels: js.UndefOr[js.Array[SchemaChannel]] = js.undefined
  
  /**
    * The direct email addresses for the official.
    */
  var emails: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The official&#39;s name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The full name of the party the official belongs to.
    */
  var party: js.UndefOr[String] = js.undefined
  
  /**
    * The official&#39;s public contact phone numbers.
    */
  var phones: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A URL for a photo of the official.
    */
  var photoUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The official&#39;s public website URLs.
    */
  var urls: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaOfficial {
  
  inline def apply(): SchemaOfficial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOfficial]
  }
  
  extension [Self <: SchemaOfficial](x: Self) {
    
    inline def setAddress(value: js.Array[SchemaSimpleAddressType]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: SchemaSimpleAddressType*): Self = StObject.set(x, "address", js.Array(value :_*))
    
    inline def setChannels(value: js.Array[SchemaChannel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: SchemaChannel*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParty(value: String): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    inline def setPhones(value: js.Array[String]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    inline def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
    
    inline def setPhonesVarargs(value: String*): Self = StObject.set(x, "phones", js.Array(value :_*))
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
