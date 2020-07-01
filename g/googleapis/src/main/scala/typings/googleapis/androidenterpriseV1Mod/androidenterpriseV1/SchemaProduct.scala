package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    appTracks: js.Array[SchemaTrackInfo] = null,
    appVersion: js.Array[SchemaAppVersion] = null,
    authorName: String = null,
    availableCountries: js.Array[String] = null,
    availableTracks: js.Array[String] = null,
    category: String = null,
    contentRating: String = null,
    description: String = null,
    detailsUrl: String = null,
    distributionChannel: String = null,
    iconUrl: String = null,
    kind: String = null,
    lastUpdatedTimestampMillis: String = null,
    minAndroidSdkVersion: js.UndefOr[Double] = js.undefined,
    permissions: js.Array[SchemaProductPermission] = null,
    productId: String = null,
    productPricing: String = null,
    recentChanges: String = null,
    requiresContainerApp: js.UndefOr[Boolean] = js.undefined,
    screenshotUrls: js.Array[String] = null,
    signingCertificate: SchemaProductSigningCertificate = null,
    smallIconUrl: String = null,
    title: String = null,
    workDetailsUrl: String = null
  ): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    if (appTracks != null) __obj.updateDynamic("appTracks")(appTracks.asInstanceOf[js.Any])
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion.asInstanceOf[js.Any])
    if (authorName != null) __obj.updateDynamic("authorName")(authorName.asInstanceOf[js.Any])
    if (availableCountries != null) __obj.updateDynamic("availableCountries")(availableCountries.asInstanceOf[js.Any])
    if (availableTracks != null) __obj.updateDynamic("availableTracks")(availableTracks.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contentRating != null) __obj.updateDynamic("contentRating")(contentRating.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (detailsUrl != null) __obj.updateDynamic("detailsUrl")(detailsUrl.asInstanceOf[js.Any])
    if (distributionChannel != null) __obj.updateDynamic("distributionChannel")(distributionChannel.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastUpdatedTimestampMillis != null) __obj.updateDynamic("lastUpdatedTimestampMillis")(lastUpdatedTimestampMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(minAndroidSdkVersion)) __obj.updateDynamic("minAndroidSdkVersion")(minAndroidSdkVersion.get.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (productPricing != null) __obj.updateDynamic("productPricing")(productPricing.asInstanceOf[js.Any])
    if (recentChanges != null) __obj.updateDynamic("recentChanges")(recentChanges.asInstanceOf[js.Any])
    if (!js.isUndefined(requiresContainerApp)) __obj.updateDynamic("requiresContainerApp")(requiresContainerApp.get.asInstanceOf[js.Any])
    if (screenshotUrls != null) __obj.updateDynamic("screenshotUrls")(screenshotUrls.asInstanceOf[js.Any])
    if (signingCertificate != null) __obj.updateDynamic("signingCertificate")(signingCertificate.asInstanceOf[js.Any])
    if (smallIconUrl != null) __obj.updateDynamic("smallIconUrl")(smallIconUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (workDetailsUrl != null) __obj.updateDynamic("workDetailsUrl")(workDetailsUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProduct]
  }
}

