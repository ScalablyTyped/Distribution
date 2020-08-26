package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationMetadata extends js.Object {
  /** App Engine Flexible Environment is available in the given location.@OutputOnly */
  var flexibleEnvironmentAvailable: js.UndefOr[Boolean] = js.native
  /** App Engine Standard Environment is available in the given location.@OutputOnly */
  var standardEnvironmentAvailable: js.UndefOr[Boolean] = js.native
}

object LocationMetadata {
  @scala.inline
  def apply(): LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationMetadata]
  }
  @scala.inline
  implicit class LocationMetadataOps[Self <: LocationMetadata] (val x: Self) extends AnyVal {
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
    def setFlexibleEnvironmentAvailable(value: Boolean): Self = this.set("flexibleEnvironmentAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexibleEnvironmentAvailable: Self = this.set("flexibleEnvironmentAvailable", js.undefined)
    @scala.inline
    def setStandardEnvironmentAvailable(value: Boolean): Self = this.set("standardEnvironmentAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardEnvironmentAvailable: Self = this.set("standardEnvironmentAvailable", js.undefined)
  }
  
}

