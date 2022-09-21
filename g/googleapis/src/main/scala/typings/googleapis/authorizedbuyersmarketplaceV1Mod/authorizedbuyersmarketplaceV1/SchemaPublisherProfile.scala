package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPublisherProfile extends StObject {
  
  /**
    * Description on the publisher's audience.
    */
  var audienceDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contact information for direct reservation deals. This is free text entered by the publisher and may include information like names, phone numbers and email addresses.
    */
  var directDealsContact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display name of the publisher profile. Can be used to filter the response of the publisherProfiles.list method.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of domains represented in this publisher profile. Empty if this is a parent profile. These are top private domains, meaning that these will not contain a string like "photos.google.co.uk/123", but will instead contain "google.co.uk". Can be used to filter the response of the publisherProfiles.list method.
    */
  var domains: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Indicates if this profile is the parent profile of the seller. A parent profile represents all the inventory from the seller, as opposed to child profile that is created to brand a portion of inventory. One seller has only one parent publisher profile, and can have multiple child profiles. See https://support.google.com/admanager/answer/6035806 for details. Can be used to filter the response of the publisherProfiles.list method by setting the filter to "is_parent: true".
    */
  var isParent: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A Google public URL to the logo for this publisher profile. The logo is stored as a PNG, JPG, or GIF image.
    */
  var logoUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL to additional marketing and sales materials.
    */
  var mediaKitUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of apps represented in this publisher profile. Empty if this is a parent profile.
    */
  var mobileApps: js.UndefOr[js.Array[SchemaPublisherProfileMobileApplication]] = js.undefined
  
  /**
    * Name of the publisher profile. Format: `buyers/{buyer\}/publisherProfiles/{publisher_profile\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Overview of the publisher.
    */
  var overview: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Statement explaining what's unique about publisher's business, and why buyers should partner with the publisher.
    */
  var pitchStatement: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contact information for programmatic deals. This is free text entered by the publisher and may include information like names, phone numbers and email addresses.
    */
  var programmaticDealsContact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A unique identifying code for the seller. This value is the same for all of the seller's parent and child publisher profiles. Can be used to filter the response of the publisherProfiles.list method.
    */
  var publisherCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL to a sample content page.
    */
  var samplePageUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Up to three key metrics and rankings. For example, "#1 Mobile News Site for 20 Straight Months".
    */
  var topHeadlines: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaPublisherProfile {
  
  inline def apply(): SchemaPublisherProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPublisherProfile]
  }
  
  extension [Self <: SchemaPublisherProfile](x: Self) {
    
    inline def setAudienceDescription(value: String): Self = StObject.set(x, "audienceDescription", value.asInstanceOf[js.Any])
    
    inline def setAudienceDescriptionNull: Self = StObject.set(x, "audienceDescription", null)
    
    inline def setAudienceDescriptionUndefined: Self = StObject.set(x, "audienceDescription", js.undefined)
    
    inline def setDirectDealsContact(value: String): Self = StObject.set(x, "directDealsContact", value.asInstanceOf[js.Any])
    
    inline def setDirectDealsContactNull: Self = StObject.set(x, "directDealsContact", null)
    
    inline def setDirectDealsContactUndefined: Self = StObject.set(x, "directDealsContact", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDomains(value: js.Array[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsNull: Self = StObject.set(x, "domains", null)
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: String*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setIsParent(value: Boolean): Self = StObject.set(x, "isParent", value.asInstanceOf[js.Any])
    
    inline def setIsParentNull: Self = StObject.set(x, "isParent", null)
    
    inline def setIsParentUndefined: Self = StObject.set(x, "isParent", js.undefined)
    
    inline def setLogoUrl(value: String): Self = StObject.set(x, "logoUrl", value.asInstanceOf[js.Any])
    
    inline def setLogoUrlNull: Self = StObject.set(x, "logoUrl", null)
    
    inline def setLogoUrlUndefined: Self = StObject.set(x, "logoUrl", js.undefined)
    
    inline def setMediaKitUrl(value: String): Self = StObject.set(x, "mediaKitUrl", value.asInstanceOf[js.Any])
    
    inline def setMediaKitUrlNull: Self = StObject.set(x, "mediaKitUrl", null)
    
    inline def setMediaKitUrlUndefined: Self = StObject.set(x, "mediaKitUrl", js.undefined)
    
    inline def setMobileApps(value: js.Array[SchemaPublisherProfileMobileApplication]): Self = StObject.set(x, "mobileApps", value.asInstanceOf[js.Any])
    
    inline def setMobileAppsUndefined: Self = StObject.set(x, "mobileApps", js.undefined)
    
    inline def setMobileAppsVarargs(value: SchemaPublisherProfileMobileApplication*): Self = StObject.set(x, "mobileApps", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOverview(value: String): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewNull: Self = StObject.set(x, "overview", null)
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setPitchStatement(value: String): Self = StObject.set(x, "pitchStatement", value.asInstanceOf[js.Any])
    
    inline def setPitchStatementNull: Self = StObject.set(x, "pitchStatement", null)
    
    inline def setPitchStatementUndefined: Self = StObject.set(x, "pitchStatement", js.undefined)
    
    inline def setProgrammaticDealsContact(value: String): Self = StObject.set(x, "programmaticDealsContact", value.asInstanceOf[js.Any])
    
    inline def setProgrammaticDealsContactNull: Self = StObject.set(x, "programmaticDealsContact", null)
    
    inline def setProgrammaticDealsContactUndefined: Self = StObject.set(x, "programmaticDealsContact", js.undefined)
    
    inline def setPublisherCode(value: String): Self = StObject.set(x, "publisherCode", value.asInstanceOf[js.Any])
    
    inline def setPublisherCodeNull: Self = StObject.set(x, "publisherCode", null)
    
    inline def setPublisherCodeUndefined: Self = StObject.set(x, "publisherCode", js.undefined)
    
    inline def setSamplePageUrl(value: String): Self = StObject.set(x, "samplePageUrl", value.asInstanceOf[js.Any])
    
    inline def setSamplePageUrlNull: Self = StObject.set(x, "samplePageUrl", null)
    
    inline def setSamplePageUrlUndefined: Self = StObject.set(x, "samplePageUrl", js.undefined)
    
    inline def setTopHeadlines(value: js.Array[String]): Self = StObject.set(x, "topHeadlines", value.asInstanceOf[js.Any])
    
    inline def setTopHeadlinesNull: Self = StObject.set(x, "topHeadlines", null)
    
    inline def setTopHeadlinesUndefined: Self = StObject.set(x, "topHeadlines", js.undefined)
    
    inline def setTopHeadlinesVarargs(value: String*): Self = StObject.set(x, "topHeadlines", js.Array(value*))
  }
}
