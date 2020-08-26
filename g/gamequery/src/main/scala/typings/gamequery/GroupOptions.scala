package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupOptions extends js.Object {
  var height: js.UndefOr[Double] = js.native
  var overflow: js.UndefOr[String] = js.native
  var posx: js.UndefOr[Double] = js.native
  var posy: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object GroupOptions {
  @scala.inline
  def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  @scala.inline
  implicit class GroupOptionsOps[Self <: GroupOptions] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setOverflow(value: String): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
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

