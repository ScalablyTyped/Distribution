package typings.extjs.Ext.layout

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILayout
  extends StObject
     with IBase {
  
  /** [Method] Removes layout s itemCls and owning Container s itemCls
    * @param item Object
    */
  var afterRemove: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var beginLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var beginLayoutCycle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var calculate: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var completeLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  
  /** [Method] Called before an item is rendered to allow the layout to configure the item
    * @param item Ext.Component The item to be configured
    */
  var configureItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], Unit]] = js.undefined
  
  /** [Method] Destroys this layout  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Boolean) */
  var done: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] This method if implemented is called after all layouts have completed
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var finalizeLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var finishedLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Ext.Component
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  var getItemSizePolicy: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], ISizePolicy]] = js.undefined
  
  /** [Method] Returns the set of items to layout empty by default */
  var getLayoutItems: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] A one time initialization method called just before rendering  */
  var initLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Property] (Boolean) */
  var isLayout: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Validates item is in the proper place in the dom
    * @param item Object
    * @param target Object
    * @param position Object
    */
  var isValidParent: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] This method if implemented is called after all layouts are finished and all have a lastComponentSize cached
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var notifyOwner: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  
  /** [Method] This method is called when a child item changes in some way
    * @param child Ext.Component The child item that has changed.
    * @returns Boolean True if this layout has handled the content change.
    */
  var onContentChange: js.UndefOr[js.Function1[/* child */ js.UndefOr[IComponent], Boolean]] = js.undefined
  
  /** [Method] Iterates over all passed items ensuring they are rendered
    * @param items Object
    * @param target Object
    */
  var renderItems: js.UndefOr[
    js.Function2[/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}
object ILayout {
  
  @scala.inline
  def apply(): ILayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayout]
  }
  
  @scala.inline
  implicit class ILayoutMutableBuilder[Self <: ILayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterRemove(value: /* item */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterRemoveUndefined: Self = StObject.set(x, "afterRemove", js.undefined)
    
    @scala.inline
    def setBeginLayout(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = StObject.set(x, "beginLayoutCycle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginLayoutCycleUndefined: Self = StObject.set(x, "beginLayoutCycle", js.undefined)
    
    @scala.inline
    def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    @scala.inline
    def setCompleteLayout(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = StObject.set(x, "completeLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteLayoutUndefined: Self = StObject.set(x, "completeLayout", js.undefined)
    
    @scala.inline
    def setConfigureItem(value: /* item */ js.UndefOr[IComponent] => Unit): Self = StObject.set(x, "configureItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConfigureItemUndefined: Self = StObject.set(x, "configureItem", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setFinalizeLayout(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = StObject.set(x, "finalizeLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinalizeLayoutUndefined: Self = StObject.set(x, "finalizeLayout", js.undefined)
    
    @scala.inline
    def setFinishedLayout(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = StObject.set(x, "finishedLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinishedLayoutUndefined: Self = StObject.set(x, "finishedLayout", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: /* item */ js.UndefOr[IComponent] => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
    
    @scala.inline
    def setGetLayoutItems(value: () => Unit): Self = StObject.set(x, "getLayoutItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayoutItemsUndefined: Self = StObject.set(x, "getLayoutItems", js.undefined)
    
    @scala.inline
    def setInitLayout(value: () => Unit): Self = StObject.set(x, "initLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitLayoutUndefined: Self = StObject.set(x, "initLayout", js.undefined)
    
    @scala.inline
    def setIsLayout(value: Boolean): Self = StObject.set(x, "isLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLayoutUndefined: Self = StObject.set(x, "isLayout", js.undefined)
    
    @scala.inline
    def setIsValidParent(
      value: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "isValidParent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsValidParentUndefined: Self = StObject.set(x, "isValidParent", js.undefined)
    
    @scala.inline
    def setNotifyOwner(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = StObject.set(x, "notifyOwner", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNotifyOwnerUndefined: Self = StObject.set(x, "notifyOwner", js.undefined)
    
    @scala.inline
    def setOnContentChange(value: /* child */ js.UndefOr[IComponent] => Boolean): Self = StObject.set(x, "onContentChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContentChangeUndefined: Self = StObject.set(x, "onContentChange", js.undefined)
    
    @scala.inline
    def setRenderItems(value: (/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "renderItems", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderItemsUndefined: Self = StObject.set(x, "renderItems", js.undefined)
  }
}
