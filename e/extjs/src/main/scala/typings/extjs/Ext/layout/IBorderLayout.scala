package typings.extjs.Ext.layout

import typings.extjs.Ext.layout.container.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBorderLayout
  extends StObject
     with IContainer {
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IBorderLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IBorderLayout: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], ISizePolicy]] = js.undefined
  
  /** [Config Option] (Number/String/Object) */
  var padding: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Object) */
  var regionWeights: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var split: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var splitterResize: js.UndefOr[Boolean] = js.undefined
}
object IBorderLayout {
  
  @scala.inline
  def apply(): IBorderLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBorderLayout]
  }
  
  @scala.inline
  implicit class IBorderLayoutMutableBuilder[Self <: IBorderLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: /* item */ js.UndefOr[js.Any] => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
    
    @scala.inline
    def setPadding(value: js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRegionWeights(value: js.Any): Self = StObject.set(x, "regionWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionWeightsUndefined: Self = StObject.set(x, "regionWeights", js.undefined)
    
    @scala.inline
    def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    
    @scala.inline
    def setSplitterResize(value: Boolean): Self = StObject.set(x, "splitterResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitterResizeUndefined: Self = StObject.set(x, "splitterResize", js.undefined)
  }
}
