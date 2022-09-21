package typings.extjs.Ext.layout.container

import typings.extjs.Ext.layout.ISizePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBorder
  extends StObject
     with IContainer {
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IBorder: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IBorder: js.UndefOr[js.Function1[/* item */ js.UndefOr[Any], ISizePolicy]] = js.undefined
  
  /** [Config Option] (Number/String/Object) */
  var padding: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Object) */
  var regionWeights: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Boolean) */
  var split: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var splitterResize: js.UndefOr[Boolean] = js.undefined
}
object IBorder {
  
  inline def apply(): IBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBorder]
  }
  
  extension [Self <: IBorder](x: Self) {
    
    inline def setCalculate(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    inline def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    inline def setGetItemSizePolicy(value: /* item */ js.UndefOr[Any] => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction1(value))
    
    inline def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
    
    inline def setPadding(value: Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRegionWeights(value: Any): Self = StObject.set(x, "regionWeights", value.asInstanceOf[js.Any])
    
    inline def setRegionWeightsUndefined: Self = StObject.set(x, "regionWeights", js.undefined)
    
    inline def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    
    inline def setSplitterResize(value: Boolean): Self = StObject.set(x, "splitterResize", value.asInstanceOf[js.Any])
    
    inline def setSplitterResizeUndefined: Self = StObject.set(x, "splitterResize", js.undefined)
  }
}
