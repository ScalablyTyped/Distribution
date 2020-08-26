package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Height extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var searchTimeout: js.UndefOr[Double] = js.native
  var texts: js.UndefOr[Cancel] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Height {
  @scala.inline
  def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  @scala.inline
  implicit class HeightOps[Self <: Height] (val x: Self) extends AnyVal {
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
    def setAllowSearch(value: Boolean): Self = this.set("allowSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSearch: Self = this.set("allowSearch", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSearchTimeout(value: Double): Self = this.set("searchTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchTimeout: Self = this.set("searchTimeout", js.undefined)
    @scala.inline
    def setTexts(value: Cancel): Self = this.set("texts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

