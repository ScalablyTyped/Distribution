package typings.extjs.Ext.layout

import typings.extjs.Ext.layout.container.IContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBoxLayout
  extends StObject
     with IContainer {
  
  /** [Method] This method is called to re cache our understanding of flexes
    * @param ownerContext Object
    */
  var cacheFlexes: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IBoxLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
    * @param ownerContext Object
    */
  @JSName("completeLayout")
  var completeLayout_IBoxLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (Object) */
  var defaultMargins: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
    * @param ownerContext Object
    */
  @JSName("finishedLayout")
  var finishedLayout_IBoxLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var flex: js.UndefOr[Double] = js.undefined
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @param ownerSizeModel Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IBoxLayout: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var pack: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var padding: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String/Ext.Component) */
  var stretchMaxPartner: js.UndefOr[js.Any] = js.undefined
}
object IBoxLayout {
  
  @scala.inline
  def apply(): IBoxLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoxLayout]
  }
  
  @scala.inline
  implicit class IBoxLayoutMutableBuilder[Self <: IBoxLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheFlexes(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "cacheFlexes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCacheFlexesUndefined: Self = StObject.set(x, "cacheFlexes", js.undefined)
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    @scala.inline
    def setCompleteLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "completeLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteLayoutUndefined: Self = StObject.set(x, "completeLayout", js.undefined)
    
    @scala.inline
    def setDefaultMargins(value: js.Any): Self = StObject.set(x, "defaultMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultMarginsUndefined: Self = StObject.set(x, "defaultMargins", js.undefined)
    
    @scala.inline
    def setFinishedLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "finishedLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinishedLayoutUndefined: Self = StObject.set(x, "finishedLayout", js.undefined)
    
    @scala.inline
    def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: (/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any]) => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
    
    @scala.inline
    def setPack(value: String): Self = StObject.set(x, "pack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackUndefined: Self = StObject.set(x, "pack", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setStretchMaxPartner(value: js.Any): Self = StObject.set(x, "stretchMaxPartner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchMaxPartnerUndefined: Self = StObject.set(x, "stretchMaxPartner", js.undefined)
  }
}
