package typings.ejWebAll.ej.SunburstChart

import typings.ejWebAll.ej.datavisualization.Sunburst.FontStyle
import typings.ejWebAll.ej.datavisualization.Sunburst.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TitleFont extends js.Object {
  /** Font family for Sunburst title.
    * @Default {Segoe UI}
    */
  var fontFamily: js.UndefOr[String] = js.native
  /** Font style for Sunburst title.
    * @Default {Normal. See FontStyle}
    */
  var fontStyle: js.UndefOr[FontStyle | String] = js.native
  /** Font weight for Sunburst title.
    * @Default {Regular. See FontWeight}
    */
  var fontWeight: js.UndefOr[FontWeight | String] = js.native
  /** Opacity of the Sunburst title.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Font size for Sunburst title.
    * @Default {20px}
    */
  var size: js.UndefOr[String] = js.native
}

object TitleFont {
  @scala.inline
  def apply(): TitleFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleFont]
  }
  @scala.inline
  implicit class TitleFontOps[Self <: TitleFont] (val x: Self) extends AnyVal {
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
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontStyle(value: FontStyle | String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontWeight(value: FontWeight | String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

