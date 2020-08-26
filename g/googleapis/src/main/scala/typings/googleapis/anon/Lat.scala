package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lat extends js.Object {
  var lat: js.UndefOr[Double] = js.native
  var lng: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var span: js.UndefOr[String] = js.native
}

object Lat {
  @scala.inline
  def apply(): Lat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lat]
  }
  @scala.inline
  implicit class LatOps[Self <: Lat] (val x: Self) extends AnyVal {
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
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLat: Self = this.set("lat", js.undefined)
    @scala.inline
    def setLng(value: Double): Self = this.set("lng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLng: Self = this.set("lng", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSpan(value: String): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
  }
  
}

