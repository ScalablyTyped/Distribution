package typings.extjs.Ext.layout.container

import typings.extjs.Ext.layout.ISizePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICheckboxGroup extends IContainer {
  
  /** [Config Option] (Boolean) */
  var autoFlex: js.UndefOr[Boolean] = js.native
  
  /** [Method] Just wait for the child items to all lay themselves out in the width we are configured to make available to them
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_ICheckboxGroup: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_ICheckboxGroup: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], ISizePolicy]] = js.native
  
  /** [Method] Always valid  */
  @JSName("isValidParent")
  var isValidParent_ICheckboxGroup: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Iterates over all passed items ensuring they are rendered
    * @param items Object
    */
  @JSName("renderItems")
  var renderItems_ICheckboxGroup: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Any], Unit]] = js.native
}
object ICheckboxGroup {
  
  @scala.inline
  def apply(): ICheckboxGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxGroup]
  }
  
  @scala.inline
  implicit class ICheckboxGroupMutableBuilder[Self <: ICheckboxGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFlex(value: Boolean): Self = StObject.set(x, "autoFlex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFlexUndefined: Self = StObject.set(x, "autoFlex", js.undefined)
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: /* item */ js.UndefOr[js.Any] => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
    
    @scala.inline
    def setIsValidParent(value: () => Unit): Self = StObject.set(x, "isValidParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValidParentUndefined: Self = StObject.set(x, "isValidParent", js.undefined)
    
    @scala.inline
    def setRenderItems(value: /* items */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "renderItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderItemsUndefined: Self = StObject.set(x, "renderItems", js.undefined)
  }
}
