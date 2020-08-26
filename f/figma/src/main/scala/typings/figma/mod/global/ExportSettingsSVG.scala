package typings.figma.mod.global

import typings.figma.figmaStrings.SVG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportSettingsSVG extends ExportSettings {
  val contentsOnly: js.UndefOr[Boolean] = js.native
  val format: SVG = js.native
   // defaults to true
  val suffix: js.UndefOr[String] = js.native
   // defaults to true
  val svgIdAttribute: js.UndefOr[Boolean] = js.native
  val svgOutlineText: js.UndefOr[Boolean] = js.native
   // defaults to false
  val svgSimplifyStroke: js.UndefOr[Boolean] = js.native
}

object ExportSettingsSVG {
  @scala.inline
  def apply(format: SVG): ExportSettingsSVG = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsSVG]
  }
  @scala.inline
  implicit class ExportSettingsSVGOps[Self <: ExportSettingsSVG] (val x: Self) extends AnyVal {
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
    def setFormat(value: SVG): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentsOnly(value: Boolean): Self = this.set("contentsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentsOnly: Self = this.set("contentsOnly", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setSvgIdAttribute(value: Boolean): Self = this.set("svgIdAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgIdAttribute: Self = this.set("svgIdAttribute", js.undefined)
    @scala.inline
    def setSvgOutlineText(value: Boolean): Self = this.set("svgOutlineText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgOutlineText: Self = this.set("svgOutlineText", js.undefined)
    @scala.inline
    def setSvgSimplifyStroke(value: Boolean): Self = this.set("svgSimplifyStroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgSimplifyStroke: Self = this.set("svgSimplifyStroke", js.undefined)
  }
  
}

