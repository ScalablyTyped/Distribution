package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpriteOptions extends js.Object {
  var animation: js.UndefOr[js.Any] = js.native
  var callback: js.UndefOr[js.Function0[_]] = js.native
  var height: js.UndefOr[Double] = js.native
  var posx: js.UndefOr[Double] = js.native
  var posy: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object SpriteOptions {
  @scala.inline
  def apply(): SpriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpriteOptions]
  }
  @scala.inline
  implicit class SpriteOptionsOps[Self <: SpriteOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: js.Any): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setCallback(value: () => _): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
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
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

