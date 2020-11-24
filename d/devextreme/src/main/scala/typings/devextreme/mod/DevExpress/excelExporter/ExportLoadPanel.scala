package typings.devextreme.mod.DevExpress.excelExporter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportLoadPanel extends js.Object {
  
  /**
    * [descr:ExportLoadPanel.enabled]
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ExportLoadPanel.height]
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * [descr:ExportLoadPanel.indicatorSrc]
    */
  var indicatorSrc: js.UndefOr[String] = js.native
  
  /**
    * [descr:ExportLoadPanel.shading]
    */
  var shading: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ExportLoadPanel.shadingColor]
    */
  var shadingColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:ExportLoadPanel.showIndicator]
    */
  var showIndicator: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ExportLoadPanel.showPane]
    */
  var showPane: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:ExportLoadPanel.text]
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * [descr:ExportLoadPanel.width]
    */
  var width: js.UndefOr[Double] = js.native
}
object ExportLoadPanel {
  
  @scala.inline
  def apply(): ExportLoadPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportLoadPanel]
  }
  
  @scala.inline
  implicit class ExportLoadPanelOps[Self <: ExportLoadPanel] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
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
