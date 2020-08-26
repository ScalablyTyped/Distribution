package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetLocationsRequest extends js.Object {
  /**
    * The desired list of Google Compute Engine
    * [locations](/compute/docs/zones#available) in which the cluster's nodes
    * should be located. Changing the locations a cluster is in will result
    * in nodes being either created or removed from the cluster, depending on
    * whether locations are being added or removed.
    *
    * This list must always include the cluster's primary zone.
    */
  var locations: js.UndefOr[js.Array[String]] = js.native
}

object SetLocationsRequest {
  @scala.inline
  def apply(): SetLocationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetLocationsRequest]
  }
  @scala.inline
  implicit class SetLocationsRequestOps[Self <: SetLocationsRequest] (val x: Self) extends AnyVal {
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
    def setLocationsVarargs(value: String*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[String]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
  }
  
}

