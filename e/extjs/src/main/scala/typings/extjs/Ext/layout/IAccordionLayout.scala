package typings.extjs.Ext.layout

import typings.extjs.Ext.layout.container.IVBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccordionLayout
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
object IAccordionLayout {
  
  @scala.inline
  def apply(): IAccordionLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionLayout]
  }
  
  @scala.inline
  implicit class IAccordionLayoutMutableBuilder[Self <: IAccordionLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveOnTop(value: Boolean): Self = StObject.set(x, "activeOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOnTopUndefined: Self = StObject.set(x, "activeOnTop", js.undefined)
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setAutoWidth(value: Boolean): Self = StObject.set(x, "autoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWidthUndefined: Self = StObject.set(x, "autoWidth", js.undefined)
    
    @scala.inline
    def setCollapseFirst(value: Boolean): Self = StObject.set(x, "collapseFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseFirstUndefined: Self = StObject.set(x, "collapseFirst", js.undefined)
    
    @scala.inline
    def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHideCollapseTool(value: Boolean): Self = StObject.set(x, "hideCollapseTool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideCollapseToolUndefined: Self = StObject.set(x, "hideCollapseTool", js.undefined)
    
    @scala.inline
    def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    @scala.inline
    def setTitleCollapse(value: Boolean): Self = StObject.set(x, "titleCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleCollapseUndefined: Self = StObject.set(x, "titleCollapse", js.undefined)
  }
}
