package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightConfig extends js.Object {
  
  /**
    * The border highlight fill color (default: transparent).
    */
  var borderColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The color format used to format color styles (default: hex).
    */
  var colorFormat: js.UndefOr[ColorFormat] = js.native
  
  /**
    * The content box highlight fill color (default: transparent).
    */
  var contentColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The grid layout color (default: transparent).
    */
  var cssGridColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The event target element highlight fill color (default: transparent).
    */
  var eventTargetColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The grid layout highlight configuration (default: all transparent).
    */
  var gridHighlightConfig: js.UndefOr[GridHighlightConfig] = js.native
  
  /**
    * The margin highlight fill color (default: transparent).
    */
  var marginColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The padding highlight fill color (default: transparent).
    */
  var paddingColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The shape outside fill color (default: transparent).
    */
  var shapeColor: js.UndefOr[RGBA] = js.native
  
  /**
    * The shape margin fill color (default: transparent).
    */
  var shapeMarginColor: js.UndefOr[RGBA] = js.native
  
  /**
    * Whether the a11y info should be shown (default: true).
    */
  var showAccessibilityInfo: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the extension lines from node to the rulers should be shown (default: false).
    */
  var showExtensionLines: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the node info tooltip should be shown (default: false).
    */
  var showInfo: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the rulers should be shown (default: false).
    */
  var showRulers: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the node styles in the tooltip (default: false).
    */
  var showStyles: js.UndefOr[Boolean] = js.native
}
object HighlightConfig {
  
  @scala.inline
  def apply(): HighlightConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightConfig]
  }
  
  @scala.inline
  implicit class HighlightConfigOps[Self <: HighlightConfig] (val x: Self) extends AnyVal {
    
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
    def setBorderColor(value: RGBA): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setColorFormat(value: ColorFormat): Self = this.set("colorFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorFormat: Self = this.set("colorFormat", js.undefined)
    
    @scala.inline
    def setContentColor(value: RGBA): Self = this.set("contentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentColor: Self = this.set("contentColor", js.undefined)
    
    @scala.inline
    def setCssGridColor(value: RGBA): Self = this.set("cssGridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssGridColor: Self = this.set("cssGridColor", js.undefined)
    
    @scala.inline
    def setEventTargetColor(value: RGBA): Self = this.set("eventTargetColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTargetColor: Self = this.set("eventTargetColor", js.undefined)
    
    @scala.inline
    def setGridHighlightConfig(value: GridHighlightConfig): Self = this.set("gridHighlightConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridHighlightConfig: Self = this.set("gridHighlightConfig", js.undefined)
    
    @scala.inline
    def setMarginColor(value: RGBA): Self = this.set("marginColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginColor: Self = this.set("marginColor", js.undefined)
    
    @scala.inline
    def setPaddingColor(value: RGBA): Self = this.set("paddingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingColor: Self = this.set("paddingColor", js.undefined)
    
    @scala.inline
    def setShapeColor(value: RGBA): Self = this.set("shapeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeColor: Self = this.set("shapeColor", js.undefined)
    
    @scala.inline
    def setShapeMarginColor(value: RGBA): Self = this.set("shapeMarginColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShapeMarginColor: Self = this.set("shapeMarginColor", js.undefined)
    
    @scala.inline
    def setShowAccessibilityInfo(value: Boolean): Self = this.set("showAccessibilityInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAccessibilityInfo: Self = this.set("showAccessibilityInfo", js.undefined)
    
    @scala.inline
    def setShowExtensionLines(value: Boolean): Self = this.set("showExtensionLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowExtensionLines: Self = this.set("showExtensionLines", js.undefined)
    
    @scala.inline
    def setShowInfo(value: Boolean): Self = this.set("showInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInfo: Self = this.set("showInfo", js.undefined)
    
    @scala.inline
    def setShowRulers(value: Boolean): Self = this.set("showRulers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRulers: Self = this.set("showRulers", js.undefined)
    
    @scala.inline
    def setShowStyles(value: Boolean): Self = this.set("showStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowStyles: Self = this.set("showStyles", js.undefined)
  }
}
