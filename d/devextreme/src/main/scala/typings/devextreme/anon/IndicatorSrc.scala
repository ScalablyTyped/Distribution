package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicatorSrc extends js.Object {
  var enabled: js.UndefOr[Boolean | auto] = js.native
  var height: js.UndefOr[Double] = js.native
  var indicatorSrc: js.UndefOr[String] = js.native
  var shading: js.UndefOr[Boolean] = js.native
  var shadingColor: js.UndefOr[String] = js.native
  var showIndicator: js.UndefOr[Boolean] = js.native
  var showPane: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object IndicatorSrc {
  @scala.inline
  def apply(): IndicatorSrc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicatorSrc]
  }
  @scala.inline
  implicit class IndicatorSrcOps[Self <: IndicatorSrc] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean | auto): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIndicatorSrc(value: String): Self = this.set("indicatorSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorSrc: Self = this.set("indicatorSrc", js.undefined)
    @scala.inline
    def setShading(value: Boolean): Self = this.set("shading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShading: Self = this.set("shading", js.undefined)
    @scala.inline
    def setShadingColor(value: String): Self = this.set("shadingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadingColor: Self = this.set("shadingColor", js.undefined)
    @scala.inline
    def setShowIndicator(value: Boolean): Self = this.set("showIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIndicator: Self = this.set("showIndicator", js.undefined)
    @scala.inline
    def setShowPane(value: Boolean): Self = this.set("showPane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowPane: Self = this.set("showPane", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

