package typings.gapiClientDfareporting.gapi.client.dfareporting

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

object TechnologyTargeting {
  @scala.inline
  def apply(
    browsers: js.Array[Browser] = null,
    connectionTypes: js.Array[ConnectionType] = null,
    mobileCarriers: js.Array[MobileCarrier] = null,
    operatingSystemVersions: js.Array[OperatingSystemVersion] = null,
    operatingSystems: js.Array[OperatingSystem] = null,
    platformTypes: js.Array[PlatformType] = null
  ): TechnologyTargeting = {
    val __obj = js.Dynamic.literal()
    if (browsers != null) __obj.updateDynamic("browsers")(browsers.asInstanceOf[js.Any])
    if (connectionTypes != null) __obj.updateDynamic("connectionTypes")(connectionTypes.asInstanceOf[js.Any])
    if (mobileCarriers != null) __obj.updateDynamic("mobileCarriers")(mobileCarriers.asInstanceOf[js.Any])
    if (operatingSystemVersions != null) __obj.updateDynamic("operatingSystemVersions")(operatingSystemVersions.asInstanceOf[js.Any])
    if (operatingSystems != null) __obj.updateDynamic("operatingSystems")(operatingSystems.asInstanceOf[js.Any])
    if (platformTypes != null) __obj.updateDynamic("platformTypes")(platformTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TechnologyTargeting]
  }
}

