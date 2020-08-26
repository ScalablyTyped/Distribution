package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileMapOptions extends js.Object {
  var buffer: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var posx: js.UndefOr[Double] = js.native
  var posy: js.UndefOr[Double] = js.native
  var sizex: js.UndefOr[Double] = js.native
  var sizey: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object TileMapOptions {
  @scala.inline
  def apply(): TileMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileMapOptions]
  }
  @scala.inline
  implicit class TileMapOptionsOps[Self <: TileMapOptions] (val x: Self) extends AnyVal {
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
    def setBuffer(value: Double): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPosx(value: Double): Self = this.set("posx", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosx: Self = this.set("posx", js.undefined)
    @scala.inline
    def setPosy(value: Double): Self = this.set("posy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosy: Self = this.set("posy", js.undefined)
    @scala.inline
    def setSizex(value: Double): Self = this.set("sizex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizex: Self = this.set("sizex", js.undefined)
    @scala.inline
    def setSizey(value: Double): Self = this.set("sizey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizey: Self = this.set("sizey", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

