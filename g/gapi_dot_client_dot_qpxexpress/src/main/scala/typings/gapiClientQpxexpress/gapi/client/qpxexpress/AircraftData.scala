package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AircraftData extends js.Object {
  /** The aircraft code. For example, for a Boeing 777 the code would be 777. */
  var code: js.UndefOr[String] = js.native
  /** Identifies this as an aircraftData object. Value: the fixed string qpxexpress#aircraftData */
  var kind: js.UndefOr[String] = js.native
  /** The name of an aircraft, for example Boeing 777. */
  var name: js.UndefOr[String] = js.native
}

object AircraftData {
  @scala.inline
  def apply(): AircraftData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AircraftData]
  }
  @scala.inline
  implicit class AircraftDataOps[Self <: AircraftData] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

