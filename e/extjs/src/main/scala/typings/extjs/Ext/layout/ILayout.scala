package typings.extjs.Ext.layout

import typings.extjs.Ext.IBase
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILayout extends IBase {
  
  /** [Method] Removes layout s itemCls and owning Container s itemCls
    * @param item Object
    */
  var afterRemove: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var beginLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var beginLayoutCycle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var calculate: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var completeLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  
  /** [Method] Called before an item is rendered to allow the layout to configure the item
    * @param item Ext.Component The item to be configured
    */
  var configureItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], Unit]] = js.native
  
  /** [Method] Destroys this layout  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Boolean) */
  var done: js.UndefOr[Boolean] = js.native
  
  /** [Method] This method if implemented is called after all layouts have completed
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var finalizeLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var finishedLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Ext.Component
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  var getItemSizePolicy: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], ISizePolicy]] = js.native
  
  /** [Method] Returns the set of items to layout empty by default */
  var getLayoutItems: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] A one time initialization method called just before rendering  */
  var initLayout: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Property] (Boolean) */
  var isLayout: js.UndefOr[Boolean] = js.native
  
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
  ] = js.native
  
  /** [Method] This method if implemented is called after all layouts are finished and all have a lastComponentSize cached
    * @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
    */
  var notifyOwner: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  
  /** [Method] This method is called when a child item changes in some way
    * @param child Ext.Component The child item that has changed.
    * @returns Boolean True if this layout has handled the content change.
    */
  var onContentChange: js.UndefOr[js.Function1[/* child */ js.UndefOr[IComponent], Boolean]] = js.native
  
  /** [Method] Iterates over all passed items ensuring they are rendered
    * @param items Object
    * @param target Object
    */
  var renderItems: js.UndefOr[
    js.Function2[/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], Unit]
  ] = js.native
}
object ILayout {
  
  @scala.inline
  def apply(): ILayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayout]
  }
  
  @scala.inline
  implicit class ILayoutOps[Self <: ILayout] (val x: Self) extends AnyVal {
    
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
    def setAfterRemove(value: /* item */ js.UndefOr[js.Any] => Unit): Self = this.set("afterRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterRemove: Self = this.set("afterRemove", js.undefined)
    
    @scala.inline
    def setBeginLayout(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = this.set("beginLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeginLayout: Self = this.set("beginLayout", js.undefined)
    
    @scala.inline
    def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = this.set("beginLayoutCycle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeginLayoutCycle: Self = this.set("beginLayoutCycle", js.undefined)
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = this.set("calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalculate: Self = this.set("calculate", js.undefined)
    
    @scala.inline
    def setCompleteLayout(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = this.set("completeLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCompleteLayout: Self = this.set("completeLayout", js.undefined)
    
    @scala.inline
    def setConfigureItem(value: /* item */ js.UndefOr[IComponent] => Unit): Self = this.set("configureItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConfigureItem: Self = this.set("configureItem", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setFinalizeLayout(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = this.set("finalizeLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFinalizeLayout: Self = this.set("finalizeLayout", js.undefined)
    
    @scala.inline
    def setFinishedLayout(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = this.set("finishedLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFinishedLayout: Self = this.set("finishedLayout", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: /* item */ js.UndefOr[IComponent] => ISizePolicy): Self = this.set("getItemSizePolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetItemSizePolicy: Self = this.set("getItemSizePolicy", js.undefined)
    
    @scala.inline
    def setGetLayoutItems(value: () => Unit): Self = this.set("getLayoutItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLayoutItems: Self = this.set("getLayoutItems", js.undefined)
    
    @scala.inline
    def setInitLayout(value: () => Unit): Self = this.set("initLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInitLayout: Self = this.set("initLayout", js.undefined)
    
    @scala.inline
    def setIsLayout(value: Boolean): Self = this.set("isLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLayout: Self = this.set("isLayout", js.undefined)
    
    @scala.inline
    def setIsValidParent(
      value: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("isValidParent", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteIsValidParent: Self = this.set("isValidParent", js.undefined)
    
    @scala.inline
    def setNotifyOwner(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = this.set("notifyOwner", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifyOwner: Self = this.set("notifyOwner", js.undefined)
    
    @scala.inline
    def setOnContentChange(value: /* child */ js.UndefOr[IComponent] => Boolean): Self = this.set("onContentChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContentChange: Self = this.set("onContentChange", js.undefined)
    
    @scala.inline
    def setRenderItems(value: (/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Unit): Self = this.set("renderItems", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderItems: Self = this.set("renderItems", js.undefined)
  }
}
