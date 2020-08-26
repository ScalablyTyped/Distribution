package typings.geolib.anon

import typings.geolib.typesMod.GeolibAltitudeInputValue
import typings.geolib.typesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alt extends GeolibInputAltitude {
  var alt: js.UndefOr[GeolibAltitudeInputValue] = js.native
}

object Alt {
  @scala.inline
  def apply(): Alt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alt]
  }
  @scala.inline
  implicit class AltOps[Self <: Alt] (val x: Self) extends AnyVal {
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
    def setAlt(value: GeolibAltitudeInputValue): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
  }
  
}

