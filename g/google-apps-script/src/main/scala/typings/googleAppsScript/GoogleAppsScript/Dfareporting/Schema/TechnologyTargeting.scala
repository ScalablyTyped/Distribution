package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TechnologyTargeting extends js.Object {
  var browsers: js.UndefOr[js.Array[Browser]] = js.native
  var connectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.native
  var mobileCarriers: js.UndefOr[js.Array[MobileCarrier]] = js.native
  var operatingSystemVersions: js.UndefOr[js.Array[OperatingSystemVersion]] = js.native
  var operatingSystems: js.UndefOr[js.Array[OperatingSystem]] = js.native
  var platformTypes: js.UndefOr[js.Array[PlatformType]] = js.native
}

object TechnologyTargeting {
  @scala.inline
  def apply(): TechnologyTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TechnologyTargeting]
  }
  @scala.inline
  implicit class TechnologyTargetingOps[Self <: TechnologyTargeting] (val x: Self) extends AnyVal {
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
    def setBrowsersVarargs(value: Browser*): Self = this.set("browsers", js.Array(value :_*))
    @scala.inline
    def setBrowsers(value: js.Array[Browser]): Self = this.set("browsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowsers: Self = this.set("browsers", js.undefined)
    @scala.inline
    def setConnectionTypesVarargs(value: ConnectionType*): Self = this.set("connectionTypes", js.Array(value :_*))
    @scala.inline
    def setConnectionTypes(value: js.Array[ConnectionType]): Self = this.set("connectionTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionTypes: Self = this.set("connectionTypes", js.undefined)
    @scala.inline
    def setMobileCarriersVarargs(value: MobileCarrier*): Self = this.set("mobileCarriers", js.Array(value :_*))
    @scala.inline
    def setMobileCarriers(value: js.Array[MobileCarrier]): Self = this.set("mobileCarriers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileCarriers: Self = this.set("mobileCarriers", js.undefined)
    @scala.inline
    def setOperatingSystemVersionsVarargs(value: OperatingSystemVersion*): Self = this.set("operatingSystemVersions", js.Array(value :_*))
    @scala.inline
    def setOperatingSystemVersions(value: js.Array[OperatingSystemVersion]): Self = this.set("operatingSystemVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystemVersions: Self = this.set("operatingSystemVersions", js.undefined)
    @scala.inline
    def setOperatingSystemsVarargs(value: OperatingSystem*): Self = this.set("operatingSystems", js.Array(value :_*))
    @scala.inline
    def setOperatingSystems(value: js.Array[OperatingSystem]): Self = this.set("operatingSystems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystems: Self = this.set("operatingSystems", js.undefined)
    @scala.inline
    def setPlatformTypesVarargs(value: PlatformType*): Self = this.set("platformTypes", js.Array(value :_*))
    @scala.inline
    def setPlatformTypes(value: js.Array[PlatformType]): Self = this.set("platformTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformTypes: Self = this.set("platformTypes", js.undefined)
  }
  
}

