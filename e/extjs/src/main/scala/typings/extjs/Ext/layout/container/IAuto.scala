package typings.extjs.Ext.layout.container

import typings.extjs.Ext.layout.IContextItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuto extends IContainer {
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Handles overflow processing for a container
    * @param ownerContext Ext.layout.ContextItem
    */
  var calculateOverflow: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.native
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
    * @param ownerContext Object
    */
  @JSName("completeLayout")
  var completeLayout_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
    * @param ownerContext Object
    */
  @JSName("finishedLayout")
  var finishedLayout_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Returns the overflow x style of the render target
    * @param ownerContext Ext.layout.ContextItem
    * @returns String
    */
  var getOverflowXStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], String]] = js.native
  
  /** [Method] Returns the overflow y style of the render target
    * @param ownerContext Ext.layout.ContextItem
    * @returns String
    */
  var getOverflowYStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], String]] = js.native
  
  /** [Property] (Boolean) */
  var manageOverflow: js.UndefOr[Boolean] = js.native
  
  /** [Property] (Boolean) */
  var managePadding: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var reserveScrollbar: js.UndefOr[Boolean] = js.native
  
  /** [Method] This method sets the height and or width of the outerCt innerCt to adjust for the following browser specific issues
    * @param ownerContext Ext.layout.ContextItem
    * @param containerSize Object
    */
  var setCtSizeIfNeeded: js.UndefOr[
    js.Function2[
      /* ownerContext */ js.UndefOr[IContextItem], 
      /* containerSize */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object IAuto {
  
  @scala.inline
  def apply(): IAuto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuto]
  }
  
  @scala.inline
  implicit class IAutoOps[Self <: IAuto] (val x: Self) extends AnyVal {
    
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
    def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("beginLayoutCycle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeginLayoutCycle: Self = this.set("beginLayoutCycle", js.undefined)
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalculate: Self = this.set("calculate", js.undefined)
    
    @scala.inline
    def setCalculateOverflow(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = this.set("calculateOverflow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalculateOverflow: Self = this.set("calculateOverflow", js.undefined)
    
    @scala.inline
    def setCompleteLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("completeLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCompleteLayout: Self = this.set("completeLayout", js.undefined)
    
    @scala.inline
    def setFinishedLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("finishedLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFinishedLayout: Self = this.set("finishedLayout", js.undefined)
    
    @scala.inline
    def setGetOverflowXStyle(value: /* ownerContext */ js.UndefOr[IContextItem] => String): Self = this.set("getOverflowXStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOverflowXStyle: Self = this.set("getOverflowXStyle", js.undefined)
    
    @scala.inline
    def setGetOverflowYStyle(value: /* ownerContext */ js.UndefOr[IContextItem] => String): Self = this.set("getOverflowYStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOverflowYStyle: Self = this.set("getOverflowYStyle", js.undefined)
    
    @scala.inline
    def setManageOverflow(value: Boolean): Self = this.set("manageOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManageOverflow: Self = this.set("manageOverflow", js.undefined)
    
    @scala.inline
    def setManagePadding(value: Boolean): Self = this.set("managePadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagePadding: Self = this.set("managePadding", js.undefined)
    
    @scala.inline
    def setReserveScrollbar(value: Boolean): Self = this.set("reserveScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReserveScrollbar: Self = this.set("reserveScrollbar", js.undefined)
    
    @scala.inline
    def setSetCtSizeIfNeeded(
      value: (/* ownerContext */ js.UndefOr[IContextItem], /* containerSize */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("setCtSizeIfNeeded", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetCtSizeIfNeeded: Self = this.set("setCtSizeIfNeeded", js.undefined)
  }
}
