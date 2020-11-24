package typings.extjs.Ext.layout.component

import typings.extjs.Ext.Array
import typings.extjs.Ext.layout.ISizePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDock extends IComponent {
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Retrieve an ordered and or filtered array of all docked Components
    * @param order String The desired ordering of the items ('render' or 'visual').
    * @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
    * @returns Ext.Component[] An array of components.
    */
  var getDockedItems: js.UndefOr[
    js.Function2[/* order */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean], Array]
  ] = js.native
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @param ownerSizeModel Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IDock: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.native
  
  /** [Method] Returns an array containing all the visible docked items inside this layout s owner Panel
    * @returns Array An array containing all the visible docked items of the Panel
    */
  @JSName("getLayoutItems")
  var getLayoutItems_IDock: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] The default weighting of docked items produces this arrangement
    * @param ownerContext Object
    * @param horz Object
    * @param vert Object
    */
  var invalidateAxes: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[js.Any], 
      /* horz */ js.UndefOr[js.Any], 
      /* vert */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object IDock {
  
  @scala.inline
  def apply(): IDock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDock]
  }
  
  @scala.inline
  implicit class IDockOps[Self <: IDock] (val x: Self) extends AnyVal {
    
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
    def setBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("beginLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeginLayout: Self = this.set("beginLayout", js.undefined)
    
    @scala.inline
    def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("beginLayoutCycle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeginLayoutCycle: Self = this.set("beginLayoutCycle", js.undefined)
    
    @scala.inline
    def setCalculate(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = this.set("calculate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCalculate: Self = this.set("calculate", js.undefined)
    
    @scala.inline
    def setGetDockedItems(value: (/* order */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean]) => Array): Self = this.set("getDockedItems", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetDockedItems: Self = this.set("getDockedItems", js.undefined)
    
    @scala.inline
    def setGetItemSizePolicy(value: (/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any]) => ISizePolicy): Self = this.set("getItemSizePolicy", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetItemSizePolicy: Self = this.set("getItemSizePolicy", js.undefined)
    
    @scala.inline
    def setGetLayoutItems(value: () => Array): Self = this.set("getLayoutItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLayoutItems: Self = this.set("getLayoutItems", js.undefined)
    
    @scala.inline
    def setInvalidateAxes(
      value: (/* ownerContext */ js.UndefOr[js.Any], /* horz */ js.UndefOr[js.Any], /* vert */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("invalidateAxes", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInvalidateAxes: Self = this.set("invalidateAxes", js.undefined)
  }
}
