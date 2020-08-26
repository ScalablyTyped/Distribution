package typings.geolib.anon

import typings.geolib.typesMod.GeolibInputLongitude
import typings.geolib.typesMod.GeolibLongitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lng extends GeolibInputLongitude {
  var lng: GeolibLongitudeInputValue = js.native
}

object Lng {
  @scala.inline
  def apply(lng: GeolibLongitudeInputValue): Lng = {
    val __obj = js.Dynamic.literal(lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lng]
  }
  @scala.inline
  implicit class LngOps[Self <: Lng] (val x: Self) extends AnyVal {
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
    def setLng(value: GeolibLongitudeInputValue): Self = this.set("lng", value.asInstanceOf[js.Any])
  }
  
}

