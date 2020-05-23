package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Product extends js.Object {
  /** App versions currently available for this product. */
  var appVersion: js.UndefOr[js.Array[AppVersion]] = js.undefined
  /** The name of the author of the product (for example, the app developer). */
  var authorName: js.UndefOr[String] = js.undefined
  /** The tracks that are visible to the enterprise. */
  var availableTracks: js.UndefOr[js.Array[String]] = js.undefined
  /** A link to the (consumer) Google Play details page for the product. */
  var detailsUrl: js.UndefOr[String] = js.undefined
  /**
    * How and to whom the package is made available. The value publicGoogleHosted means that the package is available through the Play store and not
    * restricted to a specific enterprise. The value privateGoogleHosted means that the package is a private app (restricted to an enterprise) but hosted by
    * Google. The value privateSelfHosted means that the package is a private app (restricted to an enterprise) and is privately hosted.
    */
  var distributionChannel: js.UndefOr[String] = js.undefined
  /** A link to an image that can be used as an icon for the product. This image is suitable for use at up to 512px x 512px. */
  var iconUrl: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#product". */
  var kind: js.UndefOr[String] = js.undefined
  /** A string of the form app:<package name>. For example, app:com.google.android.gm represents the Gmail app. */
  var productId: js.UndefOr[String] = js.undefined
  /**
    * Whether this product is free, free with in-app purchases, or paid. If the pricing is unknown, this means the product is not generally available anymore
    * (even though it might still be available to people who own it).
    */
  var productPricing: js.UndefOr[String] = js.undefined
  /** Deprecated. */
  var requiresContainerApp: js.UndefOr[Boolean] = js.undefined
  /** The certificate used to sign this product. */
  var signingCertificate: js.UndefOr[ProductSigningCertificate] = js.undefined
  /** A link to a smaller image that can be used as an icon for the product. This image is suitable for use at up to 128px x 128px. */
  var smallIconUrl: js.UndefOr[String] = js.undefined
  /** The name of the product. */
  var title: js.UndefOr[String] = js.undefined
  /** A link to the managed Google Play details page for the product, for use by an Enterprise admin. */
  var workDetailsUrl: js.UndefOr[String] = js.undefined
}

object Product {
  @scala.inline
  def apply(
    appVersion: js.Array[AppVersion] = null,
    authorName: String = null,
    availableTracks: js.Array[String] = null,
    detailsUrl: String = null,
    distributionChannel: String = null,
    iconUrl: String = null,
    kind: String = null,
    productId: String = null,
    productPricing: String = null,
    requiresContainerApp: js.UndefOr[Boolean] = js.undefined,
    signingCertificate: ProductSigningCertificate = null,
    smallIconUrl: String = null,
    title: String = null,
    workDetailsUrl: String = null
  ): Product = {
    val __obj = js.Dynamic.literal()
    if (appVersion != null) __obj.updateDynamic("appVersion")(appVersion.asInstanceOf[js.Any])
    if (authorName != null) __obj.updateDynamic("authorName")(authorName.asInstanceOf[js.Any])
    if (availableTracks != null) __obj.updateDynamic("availableTracks")(availableTracks.asInstanceOf[js.Any])
    if (detailsUrl != null) __obj.updateDynamic("detailsUrl")(detailsUrl.asInstanceOf[js.Any])
    if (distributionChannel != null) __obj.updateDynamic("distributionChannel")(distributionChannel.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (productPricing != null) __obj.updateDynamic("productPricing")(productPricing.asInstanceOf[js.Any])
    if (!js.isUndefined(requiresContainerApp)) __obj.updateDynamic("requiresContainerApp")(requiresContainerApp.get.asInstanceOf[js.Any])
    if (signingCertificate != null) __obj.updateDynamic("signingCertificate")(signingCertificate.asInstanceOf[js.Any])
    if (smallIconUrl != null) __obj.updateDynamic("smallIconUrl")(smallIconUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (workDetailsUrl != null) __obj.updateDynamic("workDetailsUrl")(workDetailsUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
}

