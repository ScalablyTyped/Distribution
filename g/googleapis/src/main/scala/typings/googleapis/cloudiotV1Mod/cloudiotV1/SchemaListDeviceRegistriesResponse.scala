package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDeviceRegistries`.
  */
@js.native
trait SchemaListDeviceRegistriesResponse extends js.Object {
  /**
    * The registries that matched the query.
    */
  var deviceRegistries: js.UndefOr[js.Array[SchemaDeviceRegistry]] = js.native
  /**
    * If not empty, indicates that there may be more registries that match the
    * request; this value should be passed in a new
    * `ListDeviceRegistriesRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDeviceRegistriesResponse {
  @scala.inline
  def apply(): SchemaListDeviceRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeviceRegistriesResponse]
  }
  @scala.inline
  implicit class SchemaListDeviceRegistriesResponseOps[Self <: SchemaListDeviceRegistriesResponse] (val x: Self) extends AnyVal {
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
    def setDeviceRegistriesVarargs(value: SchemaDeviceRegistry*): Self = this.set("deviceRegistries", js.Array(value :_*))
    @scala.inline
    def setDeviceRegistries(value: js.Array[SchemaDeviceRegistry]): Self = this.set("deviceRegistries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceRegistries: Self = this.set("deviceRegistries", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

