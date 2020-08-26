package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var fileName: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var margin: js.UndefOr[Double] = js.native
  var onExported: js.UndefOr[js.Function] = js.native
  var onExporting: js.UndefOr[js.Function] = js.native
  var onFileSaving: js.UndefOr[js.Function] = js.native
  var proxyUrl: js.UndefOr[String] = js.native
  var svgToCanvas: js.UndefOr[js.Function] = js.native
  var width: js.UndefOr[Double] = js.native
}

object BackgroundColor {
  @scala.inline
  def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOnExported(value: js.Function): Self = this.set("onExported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExported: Self = this.set("onExported", js.undefined)
    @scala.inline
    def setOnExporting(value: js.Function): Self = this.set("onExporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnExporting: Self = this.set("onExporting", js.undefined)
    @scala.inline
    def setOnFileSaving(value: js.Function): Self = this.set("onFileSaving", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFileSaving: Self = this.set("onFileSaving", js.undefined)
    @scala.inline
    def setProxyUrl(value: String): Self = this.set("proxyUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyUrl: Self = this.set("proxyUrl", js.undefined)
    @scala.inline
    def setSvgToCanvas(value: js.Function): Self = this.set("svgToCanvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgToCanvas: Self = this.set("svgToCanvas", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

