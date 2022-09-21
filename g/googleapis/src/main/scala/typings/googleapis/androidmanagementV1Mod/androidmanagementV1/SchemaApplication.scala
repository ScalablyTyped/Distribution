package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplication extends StObject {
  
  /**
    * Whether this app is free, free with in-app purchases, or paid. If the pricing is unspecified, this means the app is not generally available anymore (even though it might still be available to people who own it).
    */
  var appPricing: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Application tracks visible to the enterprise.
    */
  var appTracks: js.UndefOr[js.Array[SchemaAppTrackInfo]] = js.undefined
  
  /**
    * Versions currently available for this app.
    */
  var appVersions: js.UndefOr[js.Array[SchemaAppVersion]] = js.undefined
  
  /**
    * The name of the author of the apps (for example, the app developer).
    */
  var author: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The countries which this app is available in as per ISO 3166-1 alpha-2.
    */
  var availableCountries: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The app category (e.g. RACING, SOCIAL, etc.)
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The content rating for this app.
    */
  var contentRating: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The localized promotional description, if available.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How and to whom the package is made available.
    */
  var distributionChannel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Noteworthy features (if any) of this app.
    */
  var features: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Full app description, if available.
    */
  var fullDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link to an image that can be used as an icon for the app. This image is suitable for use up to a pixel size of 512 x 512.
    */
  var iconUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The set of managed properties available to be pre-configured for the app.
    */
  var managedProperties: js.UndefOr[js.Array[SchemaManagedProperty]] = js.undefined
  
  /**
    * The minimum Android SDK necessary to run the app.
    */
  var minAndroidSdkVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the app in the form enterprises/{enterprise\}/applications/{package_name\}.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The permissions required by the app.
    */
  var permissions: js.UndefOr[js.Array[SchemaApplicationPermission]] = js.undefined
  
  /**
    * A link to the (consumer) Google Play details page for the app.
    */
  var playStoreUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A localised description of the recent changes made to the app.
    */
  var recentChanges: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of screenshot links representing the app.
    */
  var screenshotUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A link to a smaller image that can be used as an icon for the app. This image is suitable for use up to a pixel size of 128 x 128.
    */
  var smallIconUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title of the app. Localized.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The approximate time (within 7 days) the app was last published.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaApplication {
  
  inline def apply(): SchemaApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplication]
  }
  
  extension [Self <: SchemaApplication](x: Self) {
    
    inline def setAppPricing(value: String): Self = StObject.set(x, "appPricing", value.asInstanceOf[js.Any])
    
    inline def setAppPricingNull: Self = StObject.set(x, "appPricing", null)
    
    inline def setAppPricingUndefined: Self = StObject.set(x, "appPricing", js.undefined)
    
    inline def setAppTracks(value: js.Array[SchemaAppTrackInfo]): Self = StObject.set(x, "appTracks", value.asInstanceOf[js.Any])
    
    inline def setAppTracksUndefined: Self = StObject.set(x, "appTracks", js.undefined)
    
    inline def setAppTracksVarargs(value: SchemaAppTrackInfo*): Self = StObject.set(x, "appTracks", js.Array(value*))
    
    inline def setAppVersions(value: js.Array[SchemaAppVersion]): Self = StObject.set(x, "appVersions", value.asInstanceOf[js.Any])
    
    inline def setAppVersionsUndefined: Self = StObject.set(x, "appVersions", js.undefined)
    
    inline def setAppVersionsVarargs(value: SchemaAppVersion*): Self = StObject.set(x, "appVersions", js.Array(value*))
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setAvailableCountries(value: js.Array[String]): Self = StObject.set(x, "availableCountries", value.asInstanceOf[js.Any])
    
    inline def setAvailableCountriesNull: Self = StObject.set(x, "availableCountries", null)
    
    inline def setAvailableCountriesUndefined: Self = StObject.set(x, "availableCountries", js.undefined)
    
    inline def setAvailableCountriesVarargs(value: String*): Self = StObject.set(x, "availableCountries", js.Array(value*))
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setContentRating(value: String): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
    
    inline def setContentRatingNull: Self = StObject.set(x, "contentRating", null)
    
    inline def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDistributionChannel(value: String): Self = StObject.set(x, "distributionChannel", value.asInstanceOf[js.Any])
    
    inline def setDistributionChannelNull: Self = StObject.set(x, "distributionChannel", null)
    
    inline def setDistributionChannelUndefined: Self = StObject.set(x, "distributionChannel", js.undefined)
    
    inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesNull: Self = StObject.set(x, "features", null)
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setFullDescription(value: String): Self = StObject.set(x, "fullDescription", value.asInstanceOf[js.Any])
    
    inline def setFullDescriptionNull: Self = StObject.set(x, "fullDescription", null)
    
    inline def setFullDescriptionUndefined: Self = StObject.set(x, "fullDescription", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlNull: Self = StObject.set(x, "iconUrl", null)
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setManagedProperties(value: js.Array[SchemaManagedProperty]): Self = StObject.set(x, "managedProperties", value.asInstanceOf[js.Any])
    
    inline def setManagedPropertiesUndefined: Self = StObject.set(x, "managedProperties", js.undefined)
    
    inline def setManagedPropertiesVarargs(value: SchemaManagedProperty*): Self = StObject.set(x, "managedProperties", js.Array(value*))
    
    inline def setMinAndroidSdkVersion(value: Double): Self = StObject.set(x, "minAndroidSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setMinAndroidSdkVersionNull: Self = StObject.set(x, "minAndroidSdkVersion", null)
    
    inline def setMinAndroidSdkVersionUndefined: Self = StObject.set(x, "minAndroidSdkVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissions(value: js.Array[SchemaApplicationPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SchemaApplicationPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setPlayStoreUrl(value: String): Self = StObject.set(x, "playStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setPlayStoreUrlNull: Self = StObject.set(x, "playStoreUrl", null)
    
    inline def setPlayStoreUrlUndefined: Self = StObject.set(x, "playStoreUrl", js.undefined)
    
    inline def setRecentChanges(value: String): Self = StObject.set(x, "recentChanges", value.asInstanceOf[js.Any])
    
    inline def setRecentChangesNull: Self = StObject.set(x, "recentChanges", null)
    
    inline def setRecentChangesUndefined: Self = StObject.set(x, "recentChanges", js.undefined)
    
    inline def setScreenshotUrls(value: js.Array[String]): Self = StObject.set(x, "screenshotUrls", value.asInstanceOf[js.Any])
    
    inline def setScreenshotUrlsNull: Self = StObject.set(x, "screenshotUrls", null)
    
    inline def setScreenshotUrlsUndefined: Self = StObject.set(x, "screenshotUrls", js.undefined)
    
    inline def setScreenshotUrlsVarargs(value: String*): Self = StObject.set(x, "screenshotUrls", js.Array(value*))
    
    inline def setSmallIconUrl(value: String): Self = StObject.set(x, "smallIconUrl", value.asInstanceOf[js.Any])
    
    inline def setSmallIconUrlNull: Self = StObject.set(x, "smallIconUrl", null)
    
    inline def setSmallIconUrlUndefined: Self = StObject.set(x, "smallIconUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
