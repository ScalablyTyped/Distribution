package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedConfigurationsForDeviceListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#managedConfigurationsForDeviceListResponse". */
  var kind: js.UndefOr[String] = js.native
  /** A managed configuration for an app on a specific device. */
  var managedConfigurationForDevice: js.UndefOr[js.Array[ManagedConfiguration]] = js.native
}

object ManagedConfigurationsForDeviceListResponse {
  @scala.inline
  def apply(): ManagedConfigurationsForDeviceListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfigurationsForDeviceListResponse]
  }
  @scala.inline
  implicit class ManagedConfigurationsForDeviceListResponseOps[Self <: ManagedConfigurationsForDeviceListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setManagedConfigurationForDeviceVarargs(value: ManagedConfiguration*): Self = this.set("managedConfigurationForDevice", js.Array(value :_*))
    @scala.inline
    def setManagedConfigurationForDevice(value: js.Array[ManagedConfiguration]): Self = this.set("managedConfigurationForDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedConfigurationForDevice: Self = this.set("managedConfigurationForDevice", js.undefined)
  }
  
}

