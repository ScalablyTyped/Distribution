package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IosInfo extends js.Object {
  /** iOS App Store ID. */
  var iosAppStoreId: js.UndefOr[java.lang.String] = js.undefined
  /** iOS bundle ID of the app. */
  var iosBundleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Custom (destination) scheme to use for iOS. By default, we’ll use the
    * bundle ID as the custom scheme. Developer can override this behavior using
    * this param.
    */
  var iosCustomScheme: js.UndefOr[java.lang.String] = js.undefined
  /** Link to open on iOS if the app is not installed. */
  var iosFallbackLink: js.UndefOr[java.lang.String] = js.undefined
  /** iPad bundle ID of the app. */
  var iosIpadBundleId: js.UndefOr[java.lang.String] = js.undefined
  /** If specified, this overrides the ios_fallback_link value on iPads. */
  var iosIpadFallbackLink: js.UndefOr[java.lang.String] = js.undefined
}

