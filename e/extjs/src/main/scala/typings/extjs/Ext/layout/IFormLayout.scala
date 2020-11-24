package typings.extjs.Ext.layout

import typings.extjs.Ext.layout.container.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFormLayout extends IContainer {
  
  /** [Method] Handles overflow processing for a container
    * @param ownerContext Ext.layout.ContextItem
    * @param containerSize Object
    * @param dimensions Number A bit mask for the overflow managed dimensions. The 0-bit is for width and the 1-bit is for height. In other words, a value of 1 would be only width, 2 would be only height and 3 would be both.
    */
  var calculateOverflow: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[IContextItem], 
      /* containerSize */ js.UndefOr[js.Any], 
      /* dimensions */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IFormLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
    * @param ownerContext Object
    */
  @JSName("completeLayout")
  var completeLayout_IFormLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Creates an element that makes bottom right body padding consistent across browsers
    * @param out Object
    * @param renderData Object
    */
  var doRenderPadder: js.UndefOr[
    js.Function2[/* out */ js.UndefOr[js.Any], /* renderData */ js.UndefOr[js.Any], Unit]
  ] = js.native
  
  /** [Method] Returns the container size that of the target
    * @param ownerContext Ext.layout.ContextItem The owner's context item.
    * @param inDom Boolean True if the container size must be in the DOM.
    * @param ignoreOverflow Boolean if true scrollbar size will not be subtracted from container size.
    * @returns Object The size
    */
  @JSName("getContainerSize")
  var getContainerSize_IFormLayout: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[IContextItem], 
      /* inDom */ js.UndefOr[Boolean], 
      /* ignoreOverflow */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.native
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IFormLayout: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], ISizePolicy]] = js.native
  
  /** [Method] returns the overflow x style of the render target
    * @param ownerContext Ext.layout.ContextItem
    * @returns String
    */
  var getOverflowXStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], String]] = js.native
  
  /** [Method] returns the overflow y style of the render target
    * @param ownerContext Ext.layout.ContextItem
    * @returns String
    */
  var getOverflowYStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], String]] = js.native
  
  /** [Property] (Object) */
  var getScrollRangeFlags: js.UndefOr[js.Any] = js.native
}
object IFormLayout {
  
  @scala.inline
  def apply(): IFormLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFormLayout]
  }
  
  @scala.inline
  implicit class IFormLayoutOps[Self <: IFormLayout] (val x: Self) extends AnyVal {
    
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
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalculate: Self = this.set("calculate", js.undefined)
    
    @scala.inline
    def setCalculateOverflow(
      value: (/* ownerContext */ js.UndefOr[IContextItem], /* containerSize */ js.UndefOr[js.Any], /* dimensions */ js.UndefOr[Double]) => Unit
    ): Self = this.set("calculateOverflow", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCalculateOverflow: Self = this.set("calculateOverflow", js.undefined)
    
    @scala.inline
    def setCompleteLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("completeLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCompleteLayout: Self = this.set("completeLayout", js.undefined)
    
    @scala.inline
    def setDoRenderPadder(value: (/* out */ js.UndefOr[js.Any], /* renderData */ js.UndefOr[js.Any]) => Unit): Self = this.set("doRenderPadder", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDoRenderPadder: Self = this.set("doRenderPadder", js.undefined)
    
    @scala.inline
    def setGetContainerSize(
      value: (/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean], /* ignoreOverflow */ js.UndefOr[Boolean]) => _
    ): Self = this.set("getContainerSize", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetContainerSize: Self = this.set("getContainerSize", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: /* item */ js.UndefOr[js.Any] => ISizePolicy): Self = this.set("getItemSizePolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetItemSizePolicy: Self = this.set("getItemSizePolicy", js.undefined)
    
    @scala.inline
    def setGetOverflowXStyle(value: /* ownerContext */ js.UndefOr[IContextItem] => String): Self = this.set("getOverflowXStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOverflowXStyle: Self = this.set("getOverflowXStyle", js.undefined)
    
    @scala.inline
    def setGetOverflowYStyle(value: /* ownerContext */ js.UndefOr[IContextItem] => String): Self = this.set("getOverflowYStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOverflowYStyle: Self = this.set("getOverflowYStyle", js.undefined)
    
    @scala.inline
    def setGetScrollRangeFlags(value: js.Any): Self = this.set("getScrollRangeFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetScrollRangeFlags: Self = this.set("getScrollRangeFlags", js.undefined)
  }
}
