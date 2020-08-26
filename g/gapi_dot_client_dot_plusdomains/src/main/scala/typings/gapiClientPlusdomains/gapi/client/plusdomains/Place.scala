package typings.gapiClientPlusdomains.gapi.client.plusdomains

import typings.gapiClientPlusdomains.anon.Latitude
import typings.gapiClientPlusdomains.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Place extends js.Object {
  /** The physical address of the place. */
  var address: js.UndefOr[`0`] = js.native
  /** The display name of the place. */
  var displayName: js.UndefOr[String] = js.native
  /** The id of the place. */
  var id: js.UndefOr[String] = js.native
  /** Identifies this resource as a place. Value: "plus#place". */
  var kind: js.UndefOr[String] = js.native
  /** The position of the place. */
  var position: js.UndefOr[Latitude] = js.native
}

object Place {
  @scala.inline
  def apply(): Place = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Place]
  }
  @scala.inline
  implicit class PlaceOps[Self <: Place] (val x: Self) extends AnyVal {
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
    def setAddress(value: `0`): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPosition(value: Latitude): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

