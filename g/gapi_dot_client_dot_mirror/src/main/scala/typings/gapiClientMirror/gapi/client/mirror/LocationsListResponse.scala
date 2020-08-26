package typings.gapiClientMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationsListResponse extends js.Object {
  /** The list of locations. */
  var items: js.UndefOr[js.Array[Location]] = js.native
  /** The type of resource. This is always mirror#locationsList. */
  var kind: js.UndefOr[String] = js.native
}

object LocationsListResponse {
  @scala.inline
  def apply(): LocationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationsListResponse]
  }
  @scala.inline
  implicit class LocationsListResponseOps[Self <: LocationsListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Location*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Location]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

