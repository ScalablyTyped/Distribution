package typings.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeviceRegistriesResponse extends js.Object {
  /** The registries that matched the query. */
  var deviceRegistries: js.UndefOr[js.Array[DeviceRegistry]] = js.native
  /**
    * If not empty, indicates that there may be more registries that match the
    * request; this value should be passed in a new
    * `ListDeviceRegistriesRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListDeviceRegistriesResponse {
  @scala.inline
  def apply(): ListDeviceRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceRegistriesResponse]
  }
  @scala.inline
  implicit class ListDeviceRegistriesResponseOps[Self <: ListDeviceRegistriesResponse] (val x: Self) extends AnyVal {
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
    def setDeviceRegistriesVarargs(value: DeviceRegistry*): Self = this.set("deviceRegistries", js.Array(value :_*))
    @scala.inline
    def setDeviceRegistries(value: js.Array[DeviceRegistry]): Self = this.set("deviceRegistries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceRegistries: Self = this.set("deviceRegistries", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

