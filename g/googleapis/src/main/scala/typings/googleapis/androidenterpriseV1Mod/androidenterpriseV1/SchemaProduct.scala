package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait SchemaProduct extends js.Object {
  
  /**
    * The tracks visible to the enterprise.
    */
  var appTracks: js.UndefOr[js.Array[SchemaTrackInfo]] = js.native
  
  /**
    * App versions currently available for this product.
    */
  var appVersion: js.UndefOr[js.Array[SchemaAppVersion]] = js.native
  
  /**
    * The name of the author of the product (for example, the app developer).
    */
  var authorName: js.UndefOr[String] = js.native
  
  /**
    * The countries which this app is available in.
    */
  var availableCountries: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Deprecated, use appTracks instead.
    */
  var availableTracks: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The app category (e.g. RACING, SOCIAL, etc.)
    */
  var category: js.UndefOr[String] = js.native
  
  /**
    * The content rating for this app.
    */
  var contentRating: js.UndefOr[String] = js.native
  
  /**
    * The localized promotional description, if available.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A link to the (consumer) Google Play details page for the product.
    */
  var detailsUrl: js.UndefOr[String] = js.native
  
  /**
    * How and to whom the package is made available. The value
    * publicGoogleHosted means that the package is available through the Play
    * store and not restricted to a specific enterprise. The value
    * privateGoogleHosted means that the package is a private app (restricted
    * to an enterprise) but hosted by Google. The value privateSelfHosted means
    * that the package is a private app (restricted to an enterprise) and is
    * privately hosted.
    */
  var distributionChannel: js.UndefOr[String] = js.native
  
  /**
    * A link to an image that can be used as an icon for the product. This
    * image is suitable for use at up to 512px x 512px.
    */
  var iconUrl: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#product&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The approximate time (within 7 days) the app was last published,
    * expressed in milliseconds since epoch.
    */
  var lastUpdatedTimestampMillis: js.UndefOr[String] = js.native
  
  /**
    * The minimum Android SDK necessary to run the app.
    */
  var minAndroidSdkVersion: js.UndefOr[Double] = js.native
  
  /**
    * A list of permissions required by the app.
    */
  var permissions: js.UndefOr[js.Array[SchemaProductPermission]] = js.native
  
  /**
    * A string of the form app:&lt;package name&gt;. For example,
    * app:com.google.android.gm represents the Gmail app.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * Whether this product is free, free with in-app purchases, or paid. If the
    * pricing is unknown, this means the product is not generally available
    * anymore (even though it might still be available to people who own it).
    */
  var productPricing: js.UndefOr[String] = js.native
  
  /**
    * A description of the recent changes made to the app.
    */
  var recentChanges: js.UndefOr[String] = js.native
  
  /**
    * Deprecated.
    */
  var requiresContainerApp: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of screenshot links representing the app.
    */
  var screenshotUrls: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The certificate used to sign this product.
    */
  var signingCertificate: js.UndefOr[SchemaProductSigningCertificate] = js.native
  
  /**
    * A link to a smaller image that can be used as an icon for the product.
    * This image is suitable for use at up to 128px x 128px.
    */
  var smallIconUrl: js.UndefOr[String] = js.native
  
  /**
    * The name of the product.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * A link to the managed Google Play details page for the product, for use
    * by an Enterprise admin.
    */
  var workDetailsUrl: js.UndefOr[String] = js.native
}
object SchemaProduct {
  
  @scala.inline
  def apply(): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProduct]
  }
  
  @scala.inline
  implicit class SchemaProductOps[Self <: SchemaProduct] (val x: Self) extends AnyVal {
    
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
    def setAppTracksVarargs(value: SchemaTrackInfo*): Self = this.set("appTracks", js.Array(value :_*))
    
    @scala.inline
    def setAppTracks(value: js.Array[SchemaTrackInfo]): Self = this.set("appTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppTracks: Self = this.set("appTracks", js.undefined)
    
    @scala.inline
    def setAppVersionVarargs(value: SchemaAppVersion*): Self = this.set("appVersion", js.Array(value :_*))
    
    @scala.inline
    def setAppVersion(value: js.Array[SchemaAppVersion]): Self = this.set("appVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppVersion: Self = this.set("appVersion", js.undefined)
    
    @scala.inline
    def setAuthorName(value: String): Self = this.set("authorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorName: Self = this.set("authorName", js.undefined)
    
    @scala.inline
    def setAvailableCountriesVarargs(value: String*): Self = this.set("availableCountries", js.Array(value :_*))
    
    @scala.inline
    def setAvailableCountries(value: js.Array[String]): Self = this.set("availableCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableCountries: Self = this.set("availableCountries", js.undefined)
    
    @scala.inline
    def setAvailableTracksVarargs(value: String*): Self = this.set("availableTracks", js.Array(value :_*))
    
    @scala.inline
    def setAvailableTracks(value: js.Array[String]): Self = this.set("availableTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableTracks: Self = this.set("availableTracks", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setContentRating(value: String): Self = this.set("contentRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentRating: Self = this.set("contentRating", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDetailsUrl(value: String): Self = this.set("detailsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailsUrl: Self = this.set("detailsUrl", js.undefined)
    
    @scala.inline
    def setDistributionChannel(value: String): Self = this.set("distributionChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionChannel: Self = this.set("distributionChannel", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestampMillis(value: String): Self = this.set("lastUpdatedTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimestampMillis: Self = this.set("lastUpdatedTimestampMillis", js.undefined)
    
    @scala.inline
    def setMinAndroidSdkVersion(value: Double): Self = this.set("minAndroidSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAndroidSdkVersion: Self = this.set("minAndroidSdkVersion", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: SchemaProductPermission*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[SchemaProductPermission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setProductPricing(value: String): Self = this.set("productPricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductPricing: Self = this.set("productPricing", js.undefined)
    
    @scala.inline
    def setRecentChanges(value: String): Self = this.set("recentChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecentChanges: Self = this.set("recentChanges", js.undefined)
    
    @scala.inline
    def setRequiresContainerApp(value: Boolean): Self = this.set("requiresContainerApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresContainerApp: Self = this.set("requiresContainerApp", js.undefined)
    
    @scala.inline
    def setScreenshotUrlsVarargs(value: String*): Self = this.set("screenshotUrls", js.Array(value :_*))
    
    @scala.inline
    def setScreenshotUrls(value: js.Array[String]): Self = this.set("screenshotUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenshotUrls: Self = this.set("screenshotUrls", js.undefined)
    
    @scala.inline
    def setSigningCertificate(value: SchemaProductSigningCertificate): Self = this.set("signingCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningCertificate: Self = this.set("signingCertificate", js.undefined)
    
    @scala.inline
    def setSmallIconUrl(value: String): Self = this.set("smallIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallIconUrl: Self = this.set("smallIconUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWorkDetailsUrl(value: String): Self = this.set("workDetailsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkDetailsUrl: Self = this.set("workDetailsUrl", js.undefined)
  }
}
