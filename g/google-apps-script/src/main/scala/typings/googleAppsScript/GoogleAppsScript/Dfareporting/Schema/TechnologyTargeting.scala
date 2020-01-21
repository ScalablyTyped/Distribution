package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TechnologyTargeting extends js.Object {
  var browsers: js.UndefOr[js.Array[Browser]] = js.undefined
  var connectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.undefined
  var mobileCarriers: js.UndefOr[js.Array[MobileCarrier]] = js.undefined
  var operatingSystemVersions: js.UndefOr[js.Array[OperatingSystemVersion]] = js.undefined
  var operatingSystems: js.UndefOr[js.Array[OperatingSystem]] = js.undefined
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

