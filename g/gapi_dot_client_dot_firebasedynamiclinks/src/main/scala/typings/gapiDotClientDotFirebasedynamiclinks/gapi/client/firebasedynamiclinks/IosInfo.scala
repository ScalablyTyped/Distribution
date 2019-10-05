package typings.gapiDotClientDotFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosInfo extends js.Object {
  /** iOS App Store ID. */
  var iosAppStoreId: js.UndefOr[String] = js.undefined
  /** iOS bundle ID of the app. */
  var iosBundleId: js.UndefOr[String] = js.undefined
  /**
    * Custom (destination) scheme to use for iOS. By default, we’ll use the
    * bundle ID as the custom scheme. Developer can override this behavior using
    * this param.
    */
  var iosCustomScheme: js.UndefOr[String] = js.undefined
  /** Link to open on iOS if the app is not installed. */
  var iosFallbackLink: js.UndefOr[String] = js.undefined
  /** iPad bundle ID of the app. */
  var iosIpadBundleId: js.UndefOr[String] = js.undefined
  /** If specified, this overrides the ios_fallback_link value on iPads. */
  var iosIpadFallbackLink: js.UndefOr[String] = js.undefined
}

object IosInfo {
  @scala.inline
  def apply(
    iosAppStoreId: String = null,
    iosBundleId: String = null,
    iosCustomScheme: String = null,
    iosFallbackLink: String = null,
    iosIpadBundleId: String = null,
    iosIpadFallbackLink: String = null
  ): IosInfo = {
    val __obj = js.Dynamic.literal()
    if (iosAppStoreId != null) __obj.updateDynamic("iosAppStoreId")(iosAppStoreId)
    if (iosBundleId != null) __obj.updateDynamic("iosBundleId")(iosBundleId)
    if (iosCustomScheme != null) __obj.updateDynamic("iosCustomScheme")(iosCustomScheme)
    if (iosFallbackLink != null) __obj.updateDynamic("iosFallbackLink")(iosFallbackLink)
    if (iosIpadBundleId != null) __obj.updateDynamic("iosIpadBundleId")(iosIpadBundleId)
    if (iosIpadFallbackLink != null) __obj.updateDynamic("iosIpadFallbackLink")(iosIpadFallbackLink)
    __obj.asInstanceOf[IosInfo]
  }
}

