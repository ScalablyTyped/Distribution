package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TechnologyTargeting extends js.Object {
  /**
    * Browsers that this ad targets. For each browser either set browserVersionId or dartId along with the version numbers. If both are specified, only
    * browserVersionId will be used. The other fields are populated automatically when the ad is inserted or updated.
    */
  var browsers: js.UndefOr[js.Array[Browser]] = js.undefined
  /**
    * Connection types that this ad targets. For each connection type only id is required. The other fields are populated automatically when the ad is
    * inserted or updated.
    */
  var connectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.undefined
  /**
    * Mobile carriers that this ad targets. For each mobile carrier only id is required, and the other fields are populated automatically when the ad is
    * inserted or updated. If targeting a mobile carrier, do not set targeting for any zip codes.
    */
  var mobileCarriers: js.UndefOr[js.Array[MobileCarrier]] = js.undefined
  /**
    * Operating system versions that this ad targets. To target all versions, use operatingSystems. For each operating system version, only id is required.
    * The other fields are populated automatically when the ad is inserted or updated. If targeting an operating system version, do not set targeting for the
    * corresponding operating system in operatingSystems.
    */
  var operatingSystemVersions: js.UndefOr[js.Array[OperatingSystemVersion]] = js.undefined
  /**
    * Operating systems that this ad targets. To target specific versions, use operatingSystemVersions. For each operating system only dartId is required.
    * The other fields are populated automatically when the ad is inserted or updated. If targeting an operating system, do not set targeting for operating
    * system versions for the same operating system.
    */
  var operatingSystems: js.UndefOr[js.Array[OperatingSystem]] = js.undefined
  /**
    * Platform types that this ad targets. For example, desktop, mobile, or tablet. For each platform type, only id is required, and the other fields are
    * populated automatically when the ad is inserted or updated.
    */
  var platformTypes: js.UndefOr[js.Array[PlatformType]] = js.undefined
}

