package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIosPostInstallAttributionRequest extends js.Object {
  /**
    * App installation epoch time (https://en.wikipedia.org/wiki/Unix_time).
    * This is a client signal for a more accurate weak match.
    */
  var appInstallationTime: js.UndefOr[java.lang.String] = js.undefined
  /** APP bundle ID. */
  var bundleId: js.UndefOr[java.lang.String] = js.undefined
  /** Device information. */
  var device: js.UndefOr[DeviceInfo] = js.undefined
  /**
    * iOS version, ie: 9.3.5.
    * Consider adding "build".
    */
  var iosVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * App post install attribution retrieval information. Disambiguates
    * mechanism (iSDK or developer invoked) to retrieve payload from
    * clicked link.
    */
  var retrievalMethod: js.UndefOr[java.lang.String] = js.undefined
  /** Google SDK version. */
  var sdkVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Possible unique matched link that server need to check before performing
    * fingerprint match. If passed link is short server need to expand the link.
    * If link is long server need to vslidate the link.
    */
  var uniqueMatchLinkToCheck: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Strong match page information. Disambiguates between default UI and
    * custom page to present when strong match succeeds/fails to find cookie.
    */
  var visualStyle: js.UndefOr[java.lang.String] = js.undefined
}

object GetIosPostInstallAttributionRequest {
  @scala.inline
  def apply(
    appInstallationTime: java.lang.String = null,
    bundleId: java.lang.String = null,
    device: DeviceInfo = null,
    iosVersion: java.lang.String = null,
    retrievalMethod: java.lang.String = null,
    sdkVersion: java.lang.String = null,
    uniqueMatchLinkToCheck: java.lang.String = null,
    visualStyle: java.lang.String = null
  ): GetIosPostInstallAttributionRequest = {
    val __obj = js.Dynamic.literal()
    if (appInstallationTime != null) __obj.updateDynamic("appInstallationTime")(appInstallationTime)
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
    if (device != null) __obj.updateDynamic("device")(device)
    if (iosVersion != null) __obj.updateDynamic("iosVersion")(iosVersion)
    if (retrievalMethod != null) __obj.updateDynamic("retrievalMethod")(retrievalMethod)
    if (sdkVersion != null) __obj.updateDynamic("sdkVersion")(sdkVersion)
    if (uniqueMatchLinkToCheck != null) __obj.updateDynamic("uniqueMatchLinkToCheck")(uniqueMatchLinkToCheck)
    if (visualStyle != null) __obj.updateDynamic("visualStyle")(visualStyle)
    __obj.asInstanceOf[GetIosPostInstallAttributionRequest]
  }
}

