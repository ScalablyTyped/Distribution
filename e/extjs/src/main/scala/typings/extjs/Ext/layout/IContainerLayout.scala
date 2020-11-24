package typings.extjs.Ext.layout

import typings.extjs.Ext.Array
import typings.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IElementContainer because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined addChildEls, removeChildEls */ @js.native
trait IContainerLayout extends ILayout {
  
  /** [Method] Adds each argument passed to this method to the childEls array  */
  var addChildEls: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    * @param firstCycle Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IContainerLayout: js.UndefOr[
    js.Function2[/* ownerContext */ js.UndefOr[js.Any], /* firstCycle */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] In addition to work done by our base classes containers benefit from some extra cached data
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IContainerLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Adds layout s itemCls and owning Container s itemCls
    * @param item Object
    */
  @JSName("configureItem")
  var configureItem_IContainerLayout: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Returns the container size that of the target
    * @param ownerContext Ext.layout.ContextItem The owner's context item.
    * @param inDom Boolean True if the container size must be in the DOM.
    * @returns Object The size
    */
  var getContainerSize: js.UndefOr[
    js.Function2[/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean], _]
  ] = js.native
  
  /** [Method] Returns the element into which extra functional DOM elements can be inserted
    * @returns Ext.Element
    */
  var getElementTarget: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] Returns an array of child components either for a render phase Performed in the beforeLayout method of the layout s
    * @returns Ext.Component[] of child components
    */
  @JSName("getLayoutItems")
  var getLayoutItems_IContainerLayout: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the element into which rendering must take place
    * @returns Ext.Element
    */
  var getRenderTarget: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] Returns all items that are rendered
    * @returns Array All matching items
    */
  var getRenderedItems: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the owner component s resize element
    * @returns Ext.Element
    */
  var getTarget: js.UndefOr[js.Function0[IElement]] = js.native
  
  /** [Method] Returns all items that are both rendered and visible
    * @returns Array All matching items
    */
  var getVisibleItems: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[String] = js.native
  
  /** [Property] (Ext.Element) */
  var overflowPadderEl: js.UndefOr[IElement] = js.native
  
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
    * @param testFn Function The test function.
    */
  var removeChildEls: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
}
object IContainerLayout {
  
  @scala.inline
  def apply(): IContainerLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContainerLayout]
  }
  
  @scala.inline
  implicit class IContainerLayoutOps[Self <: IContainerLayout] (val x: Self) extends AnyVal {
    
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
    def setAddChildEls(value: () => Unit): Self = this.set("addChildEls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAddChildEls: Self = this.set("addChildEls", js.undefined)
    
    @scala.inline
    def setBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("beginLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeginLayout: Self = this.set("beginLayout", js.undefined)
    
    @scala.inline
    def setBeginLayoutCycle(value: (/* ownerContext */ js.UndefOr[js.Any], /* firstCycle */ js.UndefOr[js.Any]) => Unit): Self = this.set("beginLayoutCycle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeginLayoutCycle: Self = this.set("beginLayoutCycle", js.undefined)
    
    @scala.inline
    def setConfigureItem(value: /* item */ js.UndefOr[js.Any] => Unit): Self = this.set("configureItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteConfigureItem: Self = this.set("configureItem", js.undefined)
    
    @scala.inline
    def setGetContainerSize(value: (/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean]) => _): Self = this.set("getContainerSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetContainerSize: Self = this.set("getContainerSize", js.undefined)
    
    @scala.inline
    def setGetElementTarget(value: () => IElement): Self = this.set("getElementTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetElementTarget: Self = this.set("getElementTarget", js.undefined)
    
    @scala.inline
    def setGetLayoutItems(value: () => Array): Self = this.set("getLayoutItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLayoutItems: Self = this.set("getLayoutItems", js.undefined)
    
    @scala.inline
    def setGetRenderTarget(value: () => IElement): Self = this.set("getRenderTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRenderTarget: Self = this.set("getRenderTarget", js.undefined)
    
    @scala.inline
    def setGetRenderedItems(value: () => Array): Self = this.set("getRenderedItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRenderedItems: Self = this.set("getRenderedItems", js.undefined)
    
    @scala.inline
    def setGetTarget(value: () => IElement): Self = this.set("getTarget", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTarget: Self = this.set("getTarget", js.undefined)
    
    @scala.inline
    def setGetVisibleItems(value: () => Array): Self = this.set("getVisibleItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetVisibleItems: Self = this.set("getVisibleItems", js.undefined)
    
    @scala.inline
    def setItemCls(value: String): Self = this.set("itemCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCls: Self = this.set("itemCls", js.undefined)
    
    @scala.inline
    def setOverflowPadderEl(value: IElement): Self = this.set("overflowPadderEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverflowPadderEl: Self = this.set("overflowPadderEl", js.undefined)
    
    @scala.inline
    def setRemoveChildEls(value: js.UndefOr[js.Any] => Unit): Self = this.set("removeChildEls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveChildEls: Self = this.set("removeChildEls", js.undefined)
  }
}
