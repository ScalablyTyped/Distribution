package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FareInfo extends js.Object {
  var basisCode: js.UndefOr[String] = js.native
  /** The carrier of the aircraft or other vehicle commuting between two points. */
  var carrier: js.UndefOr[String] = js.native
  /** The city code of the city the trip ends at. */
  var destination: js.UndefOr[String] = js.native
  /** A unique identifier of the fare. */
  var id: js.UndefOr[String] = js.native
  /** Identifies this as a fare object. Value: the fixed string qpxexpress#fareInfo. */
  var kind: js.UndefOr[String] = js.native
  /** The city code of the city the trip begins at. */
  var origin: js.UndefOr[String] = js.native
  /** Whether this is a private fare, for example one offered only to select customers rather than the general public. */
  var `private`: js.UndefOr[Boolean] = js.native
}

object FareInfo {
  @scala.inline
  def apply(): FareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FareInfo]
  }
  @scala.inline
  implicit class FareInfoOps[Self <: FareInfo] (val x: Self) extends AnyVal {
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
    def setBasisCode(value: String): Self = this.set("basisCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasisCode: Self = this.set("basisCode", js.undefined)
    @scala.inline
    def setCarrier(value: String): Self = this.set("carrier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarrier: Self = this.set("carrier", js.undefined)
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
  }
  
}

