package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgChartOptions extends js.Object {
  
  var allowCollapse: js.UndefOr[Boolean] = js.native
  
  var allowHtml: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var nodeClass: js.UndefOr[String] = js.native
  
  var selectedNodeClass: js.UndefOr[String] = js.native
  
  var selectionColor: js.UndefOr[String] = js.native
  
  /**
    * Chart size
    * @type {('small'|'medium'|'large')}
    * @default 'medium'
    */
  var size: js.UndefOr[String] = js.native
}
object OrgChartOptions {
  
  @scala.inline
  def apply(): OrgChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgChartOptions]
  }
  
  @scala.inline
  implicit class OrgChartOptionsOps[Self <: OrgChartOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowCollapse(value: Boolean): Self = this.set("allowCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCollapse: Self = this.set("allowCollapse", js.undefined)
    
    @scala.inline
    def setAllowHtml(value: Boolean): Self = this.set("allowHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHtml: Self = this.set("allowHtml", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setNodeClass(value: String): Self = this.set("nodeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeClass: Self = this.set("nodeClass", js.undefined)
    
    @scala.inline
    def setSelectedNodeClass(value: String): Self = this.set("selectedNodeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedNodeClass: Self = this.set("selectedNodeClass", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: String): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
