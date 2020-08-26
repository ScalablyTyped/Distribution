package typings.geolib.anon

import typings.geolib.typesMod.GeolibInputLongitude
import typings.geolib.typesMod.GeolibLongitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongitudeGeolibLongitudeInputValue extends GeolibInputLongitude {
  var longitude: GeolibLongitudeInputValue = js.native
}

object LongitudeGeolibLongitudeInputValue {
  @scala.inline
  def apply(longitude: GeolibLongitudeInputValue): LongitudeGeolibLongitudeInputValue = {
    val __obj = js.Dynamic.literal(longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongitudeGeolibLongitudeInputValue]
  }
  @scala.inline
  implicit class LongitudeGeolibLongitudeInputValueOps[Self <: LongitudeGeolibLongitudeInputValue] (val x: Self) extends AnyVal {
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
    def setLongitude(value: GeolibLongitudeInputValue): Self = this.set("longitude", value.asInstanceOf[js.Any])
  }
  
}

