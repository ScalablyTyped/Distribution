package typings.googleMapReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NESWBounds extends js.Object {
  @JSName("ne")
  var ne_FNESWBounds: Coords = js.native
  var nw: js.UndefOr[Coords] = js.native
  var se: js.UndefOr[Coords] = js.native
  var sw: Coords = js.native
}

object NESWBounds {
  @scala.inline
  def apply(ne: Coords, sw: Coords): NESWBounds = {
    val __obj = js.Dynamic.literal(ne = ne.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
    __obj.asInstanceOf[NESWBounds]
  }
  @scala.inline
  implicit class NESWBoundsOps[Self <: NESWBounds] (val x: Self) extends AnyVal {
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
    def setNe(value: Coords): Self = this.set("ne", value.asInstanceOf[js.Any])
    @scala.inline
    def setSw(value: Coords): Self = this.set("sw", value.asInstanceOf[js.Any])
    @scala.inline
    def setNw(value: Coords): Self = this.set("nw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNw: Self = this.set("nw", js.undefined)
    @scala.inline
    def setSe(value: Coords): Self = this.set("se", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSe: Self = this.set("se", js.undefined)
  }
  
}

