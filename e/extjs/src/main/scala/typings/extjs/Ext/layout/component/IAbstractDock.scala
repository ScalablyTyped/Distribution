package typings.extjs.Ext.layout.component

import typings.extjs.Ext.Array
import typings.extjs.Ext.layout.ISizePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAbstractDock
  extends StObject
     with IComponent {
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IAbstractDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IAbstractDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IAbstractDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Retrieve an ordered and or filtered array of all docked Components
    * @param order String The desired ordering of the items ('render' or 'visual').
    * @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
    * @returns Ext.Component[] An array of components.
    */
  var getDockedItems: js.UndefOr[
    js.Function2[/* order */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean], Array]
  ] = js.undefined
  
  /** [Method] Returns an object describing how this layout manages the size of the given component
    * @param item Object
    * @param ownerSizeModel Object
    * @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
    */
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IAbstractDock: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[Any], /* ownerSizeModel */ js.UndefOr[Any], ISizePolicy]
  ] = js.undefined
  
  /** [Method] Returns an array containing all the visible docked items inside this layout s owner Panel
    * @returns Array An array containing all the visible docked items of the Panel
    */
  @JSName("getLayoutItems")
  var getLayoutItems_IAbstractDock: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] The default weighting of docked items produces this arrangement
    * @param ownerContext Object
    * @param horz Object
    * @param vert Object
    */
  var invalidateAxes: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[Any], 
      /* horz */ js.UndefOr[Any], 
      /* vert */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
}
object IAbstractDock {
  
  inline def apply(): IAbstractDock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstractDock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAbstractDock] (val x: Self) extends AnyVal {
    
    inline def setBeginLayout(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1(value))
    
    inline def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "beginLayoutCycle", js.Any.fromFunction1(value))
    
    inline def setBeginLayoutCycleUndefined: Self = StObject.set(x, "beginLayoutCycle", js.undefined)
    
    inline def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
    
    inline def setCalculate(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    inline def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    inline def setGetDockedItems(value: (/* order */ js.UndefOr[String], /* beforeBody */ js.UndefOr[Boolean]) => Array): Self = StObject.set(x, "getDockedItems", js.Any.fromFunction2(value))
    
    inline def setGetDockedItemsUndefined: Self = StObject.set(x, "getDockedItems", js.undefined)
    
    inline def setGetItemSizePolicy(value: (/* item */ js.UndefOr[Any], /* ownerSizeModel */ js.UndefOr[Any]) => ISizePolicy): Self = StObject.set(x, "getItemSizePolicy", js.Any.fromFunction2(value))
    
    inline def setGetItemSizePolicyUndefined: Self = StObject.set(x, "getItemSizePolicy", js.undefined)
    
    inline def setGetLayoutItems(value: () => Array): Self = StObject.set(x, "getLayoutItems", js.Any.fromFunction0(value))
    
    inline def setGetLayoutItemsUndefined: Self = StObject.set(x, "getLayoutItems", js.undefined)
    
    inline def setInvalidateAxes(
      value: (/* ownerContext */ js.UndefOr[Any], /* horz */ js.UndefOr[Any], /* vert */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "invalidateAxes", js.Any.fromFunction3(value))
    
    inline def setInvalidateAxesUndefined: Self = StObject.set(x, "invalidateAxes", js.undefined)
  }
}
