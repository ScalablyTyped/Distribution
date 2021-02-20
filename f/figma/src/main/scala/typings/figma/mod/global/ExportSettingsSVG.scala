package typings.figma.mod.global

import typings.figma.figmaStrings.SVG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ExportSettingsSVGMutableBuilder[Self <: ExportSettingsSVG] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentsOnly(value: Boolean): Self = StObject.set(x, "contentsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsOnlyUndefined: Self = StObject.set(x, "contentsOnly", js.undefined)
    
    @scala.inline
    def setFormat(value: SVG): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    @scala.inline
    def setSvgIdAttribute(value: Boolean): Self = StObject.set(x, "svgIdAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgIdAttributeUndefined: Self = StObject.set(x, "svgIdAttribute", js.undefined)
    
    @scala.inline
    def setSvgOutlineText(value: Boolean): Self = StObject.set(x, "svgOutlineText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgOutlineTextUndefined: Self = StObject.set(x, "svgOutlineText", js.undefined)
    
    @scala.inline
    def setSvgSimplifyStroke(value: Boolean): Self = StObject.set(x, "svgSimplifyStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvgSimplifyStrokeUndefined: Self = StObject.set(x, "svgSimplifyStroke", js.undefined)
  }
}
