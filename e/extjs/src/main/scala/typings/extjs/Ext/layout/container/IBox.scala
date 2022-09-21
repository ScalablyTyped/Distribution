package typings.extjs.Ext.layout.container

import typings.extjs.Ext.layout.ISizePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBox
  extends StObject
     with IContainer {
  
  /** [Method] This method is called to re cache our understanding of flexes
    * @param ownerContext Object
    */
  var cacheFlexes: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IBox: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
    * @param ownerContext Object
    */
  @JSName("completeLayout")
  var completeLayout_IBox: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var defaultMargins: js.UndefOr[Any] = js.undefined
  
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
    * @param ownerContext Object
    */
  @JSName("finishedLayout")
  var finishedLayout_IBox: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var flex: js.UndefOr[Double] = js.undefined
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @param ownerSizeModel Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IBox: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[Any], /* ownerSizeModel */ js.UndefOr[Any], ISizePolicy]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var pack: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var padding: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String/Ext.Component) */
  var stretchMaxPartner: js.UndefOr[Any] = js.undefined
}
object IBox {
  
  inline def apply(): IBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBox]
  }
  
  extension [Self <: IBox](x: Self) {
    
    inline def setCacheFlexes(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "cacheFlexes", js.Any.fromFunction1(value))
    
    inline def setCacheFlexesUndefined: Self = StObject.set(x, "cacheFlexes", js.undefined)
    
    inline def setCalculate(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    inline def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    inline def setCompleteLayout(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "completeLayout", js.Any.fromFunction1(value))
    
    inline def setCompleteLayoutUndefined: Self = StObject.set(x, "completeLayout", js.undefined)
    
    inline def setDefaultMargins(value: Any): Self = StObject.set(x, "defaultMargins", value.asInstanceOf[js.Any])
    
    inline def setDefaultMarginsUndefined: Self = StObject.set(x, "defaultMargins", js.undefined)
    
    inline def setFinishedLayout(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "finishedLayout", js.Any.fromFunction1(value))
    
    inline def setFinishedLayoutUndefined: Self = StObject.set(x, "finishedLayout", js.undefined)
    
    inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setGetItemSizePolicy(value: (/* item */ js.UndefOr[Any], /* ownerSizeModel */ js.UndefOr[Any]) => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction2(value))
    
    inline def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
    
    inline def setPack(value: String): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
    
    inline def setPackUndefined: Self = StObject.set(x, "pack", js.undefined)
    
    inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setStretchMaxPartner(value: Any): Self = StObject.set(x, "stretchMaxPartner", value.asInstanceOf[js.Any])
    
    inline def setStretchMaxPartnerUndefined: Self = StObject.set(x, "stretchMaxPartner", js.undefined)
  }
}
