package typings.googleapis.civicinfoV2Mod.civicinfoV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var emails: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Detailed summary about the official's address's geocoding
    */
  var geocodingSummaries: js.UndefOr[js.Array[SchemaGeocodingSummary]] = js.undefined
  
  /**
    * The official's name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full name of the party the official belongs to.
    */
  var party: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The official's public contact phone numbers.
    */
  var phones: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A URL for a photo of the official.
    */
  var photoUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The official's public website URLs.
    */
  var urls: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaOfficial {
  
  inline def apply(): SchemaOfficial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOfficial]
  }
  
  extension [Self <: SchemaOfficial](x: Self) {
    
    inline def setAddress(value: js.Array[SchemaSimpleAddressType]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: SchemaSimpleAddressType*): Self = StObject.set(x, "address", js.Array(value*))
    
    inline def setChannels(value: js.Array[SchemaChannel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setChannelsVarargs(value: SchemaChannel*): Self = StObject.set(x, "channels", js.Array(value*))
    
    inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsNull: Self = StObject.set(x, "emails", null)
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
    
    inline def setGeocodingSummaries(value: js.Array[SchemaGeocodingSummary]): Self = StObject.set(x, "geocodingSummaries", value.asInstanceOf[js.Any])
    
    inline def setGeocodingSummariesUndefined: Self = StObject.set(x, "geocodingSummaries", js.undefined)
    
    inline def setGeocodingSummariesVarargs(value: SchemaGeocodingSummary*): Self = StObject.set(x, "geocodingSummaries", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParty(value: String): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setPartyNull: Self = StObject.set(x, "party", null)
    
    inline def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    inline def setPhones(value: js.Array[String]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    inline def setPhonesNull: Self = StObject.set(x, "phones", null)
    
    inline def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
    
    inline def setPhonesVarargs(value: String*): Self = StObject.set(x, "phones", js.Array(value*))
    
    inline def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    inline def setPhotoUrlNull: Self = StObject.set(x, "photoUrl", null)
    
    inline def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsNull: Self = StObject.set(x, "urls", null)
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
