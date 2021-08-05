package typings.extjs.Ext.layout.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccordion
  extends StObject
     with IVBox {
  
  /** [Config Option] (Boolean) */
  var activeOnTop: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var collapseFirst: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var fill: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var hideCollapseTool: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var multi: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var titleCollapse: js.UndefOr[Boolean] = js.undefined
}
object IAccordion {
  
  inline def apply(): IAccordion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordion]
  }
  
  extension [Self <: IAccordion](x: Self) {
    
    inline def setActiveOnTop(value: Boolean): Self = StObject.set(x, "activeOnTop", value.asInstanceOf[js.Any])
    
    inline def setActiveOnTopUndefined: Self = StObject.set(x, "activeOnTop", js.undefined)
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    inline def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    inline def setCollapseFirst(value: Boolean): Self = StObject.set(x, "collapseFirst", value.asInstanceOf[js.Any])
    
    inline def setCollapseFirstUndefined: Self = StObject.set(x, "collapseFirst", js.undefined)
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setHideCollapseTool(value: Boolean): Self = StObject.set(x, "hideCollapseTool", value.asInstanceOf[js.Any])
    
    inline def setHideCollapseToolUndefined: Self = StObject.set(x, "hideCollapseTool", js.undefined)
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setTitleCollapse(value: Boolean): Self = StObject.set(x, "titleCollapse", value.asInstanceOf[js.Any])
    
    inline def setTitleCollapseUndefined: Self = StObject.set(x, "titleCollapse", js.undefined)
  }
}
