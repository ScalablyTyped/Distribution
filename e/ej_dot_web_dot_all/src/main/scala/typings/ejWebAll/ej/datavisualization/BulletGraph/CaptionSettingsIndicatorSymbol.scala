package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptionSettingsIndicatorSymbol extends js.Object {
  /** Contains property to customize the border of indicator symbol.
    */
  var border: js.UndefOr[CaptionSettingsIndicatorSymbolBorder] = js.native
  /** Specifies the color of indicator symbol.
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  /** Specifies the URL of image that represents indicator symbol.
    */
  var imageURL: js.UndefOr[String] = js.native
  /** Specifies the opacity of indicator symbol.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** Specifies the shape of indicator symbol.
    */
  var shape: js.UndefOr[String] = js.native
  /** Contains property to customize the size of indicator symbol.
    */
  var size: js.UndefOr[CaptionSettingsIndicatorSymbolSize] = js.native
}

object CaptionSettingsIndicatorSymbol {
  @scala.inline
  def apply(): CaptionSettingsIndicatorSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSettingsIndicatorSymbol]
  }
  @scala.inline
  implicit class CaptionSettingsIndicatorSymbolOps[Self <: CaptionSettingsIndicatorSymbol] (val x: Self) extends AnyVal {
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
    def setBorder(value: CaptionSettingsIndicatorSymbolBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setImageURL(value: String): Self = this.set("imageURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageURL: Self = this.set("imageURL", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setShape(value: String): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    @scala.inline
    def setSize(value: CaptionSettingsIndicatorSymbolSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

