package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProduct extends StObject {
  
  /**
    * The app restriction schema
    */
  var appRestrictionsSchema: js.UndefOr[SchemaAppRestrictionsSchema] = js.undefined
  
  /**
    * The tracks visible to the enterprise.
    */
  var appTracks: js.UndefOr[js.Array[SchemaTrackInfo]] = js.undefined
  
  /**
    * App versions currently available for this product.
    */
  var appVersion: js.UndefOr[js.Array[SchemaAppVersion]] = js.undefined
  
  /**
    * The name of the author of the product (for example, the app developer).
    */
  var authorName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The countries which this app is available in.
    */
  var availableCountries: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Deprecated, use appTracks instead.
    */
  var availableTracks: js.UndefOr[js.Array[String] | Null] = js.undefined
  
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
    * A link to the (consumer) Google Play details page for the product.
    */
  var detailsUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * How and to whom the package is made available. The value publicGoogleHosted means that the package is available through the Play store and not restricted to a specific enterprise. The value privateGoogleHosted means that the package is a private app (restricted to an enterprise) but hosted by Google. The value privateSelfHosted means that the package is a private app (restricted to an enterprise) and is privately hosted.
    */
  var distributionChannel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Noteworthy features (if any) of this product.
    */
  var features: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A link to an image that can be used as an icon for the product. This image is suitable for use at up to 512px x 512px.
    */
  var iconUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The approximate time (within 7 days) the app was last published, expressed in milliseconds since epoch.
    */
  var lastUpdatedTimestampMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minimum Android SDK necessary to run the app.
    */
  var minAndroidSdkVersion: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A list of permissions required by the app.
    */
  var permissions: js.UndefOr[js.Array[SchemaProductPermission]] = js.undefined
  
  /**
    * A string of the form *app:<package name\>*. For example, app:com.google.android.gm represents the Gmail app.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this product is free, free with in-app purchases, or paid. If the pricing is unknown, this means the product is not generally available anymore (even though it might still be available to people who own it).
    */
  var productPricing: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A description of the recent changes made to the app.
    */
  var recentChanges: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated.
    */
  var requiresContainerApp: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A list of screenshot links representing the app.
    */
  var screenshotUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The certificate used to sign this product.
    */
  var signingCertificate: js.UndefOr[SchemaProductSigningCertificate] = js.undefined
  
  /**
    * A link to a smaller image that can be used as an icon for the product. This image is suitable for use at up to 128px x 128px.
    */
  var smallIconUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the product.
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link to the managed Google Play details page for the product, for use by an Enterprise admin.
    */
  var workDetailsUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaProduct {
  
  inline def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  
  extension [Self <: SchemaProduct](x: Self) {
    
    inline def setAppRestrictionsSchema(value: SchemaAppRestrictionsSchema): Self = StObject.set(x, "appRestrictionsSchema", value.asInstanceOf[js.Any])
    
    inline def setAppRestrictionsSchemaUndefined: Self = StObject.set(x, "appRestrictionsSchema", js.undefined)
    
    inline def setAppTracks(value: js.Array[SchemaTrackInfo]): Self = StObject.set(x, "appTracks", value.asInstanceOf[js.Any])
    
    inline def setAppTracksUndefined: Self = StObject.set(x, "appTracks", js.undefined)
    
    inline def setAppTracksVarargs(value: SchemaTrackInfo*): Self = StObject.set(x, "appTracks", js.Array(value*))
    
    inline def setAppVersion(value: js.Array[SchemaAppVersion]): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
    
    inline def setAppVersionVarargs(value: SchemaAppVersion*): Self = StObject.set(x, "appVersion", js.Array(value*))
    
    inline def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setAuthorNameNull: Self = StObject.set(x, "authorName", null)
    
    inline def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    inline def setAvailableCountries(value: js.Array[String]): Self = StObject.set(x, "availableCountries", value.asInstanceOf[js.Any])
    
    inline def setAvailableCountriesNull: Self = StObject.set(x, "availableCountries", null)
    
    inline def setAvailableCountriesUndefined: Self = StObject.set(x, "availableCountries", js.undefined)
    
    inline def setAvailableCountriesVarargs(value: String*): Self = StObject.set(x, "availableCountries", js.Array(value*))
    
    inline def setAvailableTracks(value: js.Array[String]): Self = StObject.set(x, "availableTracks", value.asInstanceOf[js.Any])
    
    inline def setAvailableTracksNull: Self = StObject.set(x, "availableTracks", null)
    
    inline def setAvailableTracksUndefined: Self = StObject.set(x, "availableTracks", js.undefined)
    
    inline def setAvailableTracksVarargs(value: String*): Self = StObject.set(x, "availableTracks", js.Array(value*))
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setContentRating(value: String): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
    
    inline def setContentRatingNull: Self = StObject.set(x, "contentRating", null)
    
    inline def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetailsUrl(value: String): Self = StObject.set(x, "detailsUrl", value.asInstanceOf[js.Any])
    
    inline def setDetailsUrlNull: Self = StObject.set(x, "detailsUrl", null)
    
    inline def setDetailsUrlUndefined: Self = StObject.set(x, "detailsUrl", js.undefined)
    
    inline def setDistributionChannel(value: String): Self = StObject.set(x, "distributionChannel", value.asInstanceOf[js.Any])
    
    inline def setDistributionChannelNull: Self = StObject.set(x, "distributionChannel", null)
    
    inline def setDistributionChannelUndefined: Self = StObject.set(x, "distributionChannel", js.undefined)
    
    inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesNull: Self = StObject.set(x, "features", null)
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlNull: Self = StObject.set(x, "iconUrl", null)
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setLastUpdatedTimestampMillis(value: String): Self = StObject.set(x, "lastUpdatedTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampMillisNull: Self = StObject.set(x, "lastUpdatedTimestampMillis", null)
    
    inline def setLastUpdatedTimestampMillisUndefined: Self = StObject.set(x, "lastUpdatedTimestampMillis", js.undefined)
    
    inline def setMinAndroidSdkVersion(value: Double): Self = StObject.set(x, "minAndroidSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setMinAndroidSdkVersionNull: Self = StObject.set(x, "minAndroidSdkVersion", null)
    
    inline def setMinAndroidSdkVersionUndefined: Self = StObject.set(x, "minAndroidSdkVersion", js.undefined)
    
    inline def setPermissions(value: js.Array[SchemaProductPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SchemaProductPermission*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductPricing(value: String): Self = StObject.set(x, "productPricing", value.asInstanceOf[js.Any])
    
    inline def setProductPricingNull: Self = StObject.set(x, "productPricing", null)
    
    inline def setProductPricingUndefined: Self = StObject.set(x, "productPricing", js.undefined)
    
    inline def setRecentChanges(value: String): Self = StObject.set(x, "recentChanges", value.asInstanceOf[js.Any])
    
    inline def setRecentChangesNull: Self = StObject.set(x, "recentChanges", null)
    
    inline def setRecentChangesUndefined: Self = StObject.set(x, "recentChanges", js.undefined)
    
    inline def setRequiresContainerApp(value: Boolean): Self = StObject.set(x, "requiresContainerApp", value.asInstanceOf[js.Any])
    
    inline def setRequiresContainerAppNull: Self = StObject.set(x, "requiresContainerApp", null)
    
    inline def setRequiresContainerAppUndefined: Self = StObject.set(x, "requiresContainerApp", js.undefined)
    
    inline def setScreenshotUrls(value: js.Array[String]): Self = StObject.set(x, "screenshotUrls", value.asInstanceOf[js.Any])
    
    inline def setScreenshotUrlsNull: Self = StObject.set(x, "screenshotUrls", null)
    
    inline def setScreenshotUrlsUndefined: Self = StObject.set(x, "screenshotUrls", js.undefined)
    
    inline def setScreenshotUrlsVarargs(value: String*): Self = StObject.set(x, "screenshotUrls", js.Array(value*))
    
    inline def setSigningCertificate(value: SchemaProductSigningCertificate): Self = StObject.set(x, "signingCertificate", value.asInstanceOf[js.Any])
    
    inline def setSigningCertificateUndefined: Self = StObject.set(x, "signingCertificate", js.undefined)
    
    inline def setSmallIconUrl(value: String): Self = StObject.set(x, "smallIconUrl", value.asInstanceOf[js.Any])
    
    inline def setSmallIconUrlNull: Self = StObject.set(x, "smallIconUrl", null)
    
    inline def setSmallIconUrlUndefined: Self = StObject.set(x, "smallIconUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWorkDetailsUrl(value: String): Self = StObject.set(x, "workDetailsUrl", value.asInstanceOf[js.Any])
    
    inline def setWorkDetailsUrlNull: Self = StObject.set(x, "workDetailsUrl", null)
    
    inline def setWorkDetailsUrlUndefined: Self = StObject.set(x, "workDetailsUrl", js.undefined)
  }
}
