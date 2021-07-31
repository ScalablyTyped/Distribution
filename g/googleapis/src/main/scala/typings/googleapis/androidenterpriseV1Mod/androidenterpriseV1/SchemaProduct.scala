package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Products resource represents an app in the Google Play store that is
  * available to at least some users in the enterprise. (Some apps are
  * restricted to a single enterprise, and no information about them is made
  * available outside that enterprise.)  The information provided for each
  * product (localized name, icon, link to the full Google Play details page)
  * is intended to allow a basic representation of the product within an EMM
  * user interface.
  */
trait SchemaProduct extends StObject {
  
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
  var authorName: js.UndefOr[String] = js.undefined
  
  /**
    * The countries which this app is available in.
    */
  var availableCountries: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Deprecated, use appTracks instead.
    */
  var availableTracks: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The app category (e.g. RACING, SOCIAL, etc.)
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * The content rating for this app.
    */
  var contentRating: js.UndefOr[String] = js.undefined
  
  /**
    * The localized promotional description, if available.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A link to the (consumer) Google Play details page for the product.
    */
  var detailsUrl: js.UndefOr[String] = js.undefined
  
  /**
    * How and to whom the package is made available. The value
    * publicGoogleHosted means that the package is available through the Play
    * store and not restricted to a specific enterprise. The value
    * privateGoogleHosted means that the package is a private app (restricted
    * to an enterprise) but hosted by Google. The value privateSelfHosted means
    * that the package is a private app (restricted to an enterprise) and is
    * privately hosted.
    */
  var distributionChannel: js.UndefOr[String] = js.undefined
  
  /**
    * A link to an image that can be used as an icon for the product. This
    * image is suitable for use at up to 512px x 512px.
    */
  var iconUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#product&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The approximate time (within 7 days) the app was last published,
    * expressed in milliseconds since epoch.
    */
  var lastUpdatedTimestampMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum Android SDK necessary to run the app.
    */
  var minAndroidSdkVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * A list of permissions required by the app.
    */
  var permissions: js.UndefOr[js.Array[SchemaProductPermission]] = js.undefined
  
  /**
    * A string of the form app:&lt;package name&gt;. For example,
    * app:com.google.android.gm represents the Gmail app.
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this product is free, free with in-app purchases, or paid. If the
    * pricing is unknown, this means the product is not generally available
    * anymore (even though it might still be available to people who own it).
    */
  var productPricing: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the recent changes made to the app.
    */
  var recentChanges: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated.
    */
  var requiresContainerApp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of screenshot links representing the app.
    */
  var screenshotUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The certificate used to sign this product.
    */
  var signingCertificate: js.UndefOr[SchemaProductSigningCertificate] = js.undefined
  
  /**
    * A link to a smaller image that can be used as an icon for the product.
    * This image is suitable for use at up to 128px x 128px.
    */
  var smallIconUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the product.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * A link to the managed Google Play details page for the product, for use
    * by an Enterprise admin.
    */
  var workDetailsUrl: js.UndefOr[String] = js.undefined
}
object SchemaProduct {
  
  @scala.inline
  def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  
  @scala.inline
  implicit class SchemaProductMutableBuilder[Self <: SchemaProduct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppTracks(value: js.Array[SchemaTrackInfo]): Self = StObject.set(x, "appTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppTracksUndefined: Self = StObject.set(x, "appTracks", js.undefined)
    
    @scala.inline
    def setAppTracksVarargs(value: SchemaTrackInfo*): Self = StObject.set(x, "appTracks", js.Array(value :_*))
    
    @scala.inline
    def setAppVersion(value: js.Array[SchemaAppVersion]): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
    
    @scala.inline
    def setAppVersionVarargs(value: SchemaAppVersion*): Self = StObject.set(x, "appVersion", js.Array(value :_*))
    
    @scala.inline
    def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorNameUndefined: Self = StObject.set(x, "authorName", js.undefined)
    
    @scala.inline
    def setAvailableCountries(value: js.Array[String]): Self = StObject.set(x, "availableCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableCountriesUndefined: Self = StObject.set(x, "availableCountries", js.undefined)
    
    @scala.inline
    def setAvailableCountriesVarargs(value: String*): Self = StObject.set(x, "availableCountries", js.Array(value :_*))
    
    @scala.inline
    def setAvailableTracks(value: js.Array[String]): Self = StObject.set(x, "availableTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableTracksUndefined: Self = StObject.set(x, "availableTracks", js.undefined)
    
    @scala.inline
    def setAvailableTracksVarargs(value: String*): Self = StObject.set(x, "availableTracks", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setContentRating(value: String): Self = StObject.set(x, "contentRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentRatingUndefined: Self = StObject.set(x, "contentRating", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetailsUrl(value: String): Self = StObject.set(x, "detailsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUrlUndefined: Self = StObject.set(x, "detailsUrl", js.undefined)
    
    @scala.inline
    def setDistributionChannel(value: String): Self = StObject.set(x, "distributionChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionChannelUndefined: Self = StObject.set(x, "distributionChannel", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestampMillis(value: String): Self = StObject.set(x, "lastUpdatedTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampMillisUndefined: Self = StObject.set(x, "lastUpdatedTimestampMillis", js.undefined)
    
    @scala.inline
    def setMinAndroidSdkVersion(value: Double): Self = StObject.set(x, "minAndroidSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAndroidSdkVersionUndefined: Self = StObject.set(x, "minAndroidSdkVersion", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[SchemaProductPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: SchemaProductPermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setProductPricing(value: String): Self = StObject.set(x, "productPricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductPricingUndefined: Self = StObject.set(x, "productPricing", js.undefined)
    
    @scala.inline
    def setRecentChanges(value: String): Self = StObject.set(x, "recentChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecentChangesUndefined: Self = StObject.set(x, "recentChanges", js.undefined)
    
    @scala.inline
    def setRequiresContainerApp(value: Boolean): Self = StObject.set(x, "requiresContainerApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresContainerAppUndefined: Self = StObject.set(x, "requiresContainerApp", js.undefined)
    
    @scala.inline
    def setScreenshotUrls(value: js.Array[String]): Self = StObject.set(x, "screenshotUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenshotUrlsUndefined: Self = StObject.set(x, "screenshotUrls", js.undefined)
    
    @scala.inline
    def setScreenshotUrlsVarargs(value: String*): Self = StObject.set(x, "screenshotUrls", js.Array(value :_*))
    
    @scala.inline
    def setSigningCertificate(value: SchemaProductSigningCertificate): Self = StObject.set(x, "signingCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningCertificateUndefined: Self = StObject.set(x, "signingCertificate", js.undefined)
    
    @scala.inline
    def setSmallIconUrl(value: String): Self = StObject.set(x, "smallIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmallIconUrlUndefined: Self = StObject.set(x, "smallIconUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWorkDetailsUrl(value: String): Self = StObject.set(x, "workDetailsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkDetailsUrlUndefined: Self = StObject.set(x, "workDetailsUrl", js.undefined)
  }
}
