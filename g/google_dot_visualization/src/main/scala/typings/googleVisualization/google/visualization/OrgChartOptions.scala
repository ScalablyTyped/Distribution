package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgChartOptions extends StObject {
  
  var allowCollapse: js.UndefOr[Boolean] = js.undefined
  
  var allowHtml: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var nodeClass: js.UndefOr[String] = js.undefined
  
  var selectedNodeClass: js.UndefOr[String] = js.undefined
  
  var selectionColor: js.UndefOr[String] = js.undefined
  
  /**
    * Chart size
    * @type {('small'|'medium'|'large')}
    * @default 'medium'
    */
  var size: js.UndefOr[String] = js.undefined
}
object OrgChartOptions {
  
  @scala.inline
  def apply(): OrgChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgChartOptions]
  }
  
  @scala.inline
  implicit class OrgChartOptionsMutableBuilder[Self <: OrgChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCollapse(value: Boolean): Self = StObject.set(x, "allowCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCollapseUndefined: Self = StObject.set(x, "allowCollapse", js.undefined)
    
    @scala.inline
    def setAllowHtml(value: Boolean): Self = StObject.set(x, "allowHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHtmlUndefined: Self = StObject.set(x, "allowHtml", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setNodeClass(value: String): Self = StObject.set(x, "nodeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeClassUndefined: Self = StObject.set(x, "nodeClass", js.undefined)
    
    @scala.inline
    def setSelectedNodeClass(value: String): Self = StObject.set(x, "selectedNodeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedNodeClassUndefined: Self = StObject.set(x, "selectedNodeClass", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: String): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
