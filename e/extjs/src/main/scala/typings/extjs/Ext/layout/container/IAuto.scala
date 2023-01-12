package typings.extjs.Ext.layout.container

import typings.extjs.Ext.layout.IContextItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAuto
  extends StObject
     with IContainer {
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Handles overflow processing for a container
    * @param ownerContext Ext.layout.ContextItem
    */
  var calculateOverflow: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  
  /** [Method] Called to perform the calculations for this layout
    * @param ownerContext Object
    */
  @JSName("calculate")
  var calculate_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
    * @param ownerContext Object
    */
  @JSName("completeLayout")
  var completeLayout_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
    * @param ownerContext Object
    */
  @JSName("finishedLayout")
  var finishedLayout_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Returns the overflow x style of the render target
    * @param ownerContext Ext.layout.ContextItem
    * @returns String
    */
  var getOverflowXStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], String]] = js.undefined
  
  /** [Method] Returns the overflow y style of the render target
    * @param ownerContext Ext.layout.ContextItem
    * @returns String
    */
  var getOverflowYStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], String]] = js.undefined
  
  /** [Property] (Boolean) */
  var manageOverflow: js.UndefOr[Boolean] = js.undefined
  
  /** [Property] (Boolean) */
  var managePadding: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var reserveScrollbar: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] This method sets the height and or width of the outerCt innerCt to adjust for the following browser specific issues
    * @param ownerContext Ext.layout.ContextItem
    * @param containerSize Object
    */
  var setCtSizeIfNeeded: js.UndefOr[
    js.Function2[
      /* ownerContext */ js.UndefOr[IContextItem], 
      /* containerSize */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
}
object IAuto {
  
  inline def apply(): IAuto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAuto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAuto] (val x: Self) extends AnyVal {
    
    inline def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "beginLayoutCycle", js.Any.fromFunction1(value))
    
    inline def setBeginLayoutCycleUndefined: Self = StObject.set(x, "beginLayoutCycle", js.undefined)
    
    inline def setCalculate(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
    
    inline def setCalculateOverflow(value: /* ownerContext */ js.UndefOr[IContextItem] => Unit): Self = StObject.set(x, "calculateOverflow", js.Any.fromFunction1(value))
    
    inline def setCalculateOverflowUndefined: Self = StObject.set(x, "calculateOverflow", js.undefined)
    
    inline def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
    
    inline def setCompleteLayout(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "completeLayout", js.Any.fromFunction1(value))
    
    inline def setCompleteLayoutUndefined: Self = StObject.set(x, "completeLayout", js.undefined)
    
    inline def setFinishedLayout(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "finishedLayout", js.Any.fromFunction1(value))
    
    inline def setFinishedLayoutUndefined: Self = StObject.set(x, "finishedLayout", js.undefined)
    
    inline def setGetOverflowXStyle(value: /* ownerContext */ js.UndefOr[IContextItem] => String): Self = StObject.set(x, "getOverflowXStyle", js.Any.fromFunction1(value))
    
    inline def setGetOverflowXStyleUndefined: Self = StObject.set(x, "getOverflowXStyle", js.undefined)
    
    inline def setGetOverflowYStyle(value: /* ownerContext */ js.UndefOr[IContextItem] => String): Self = StObject.set(x, "getOverflowYStyle", js.Any.fromFunction1(value))
    
    inline def setGetOverflowYStyleUndefined: Self = StObject.set(x, "getOverflowYStyle", js.undefined)
    
    inline def setManageOverflow(value: Boolean): Self = StObject.set(x, "manageOverflow", value.asInstanceOf[js.Any])
    
    inline def setManageOverflowUndefined: Self = StObject.set(x, "manageOverflow", js.undefined)
    
    inline def setManagePadding(value: Boolean): Self = StObject.set(x, "managePadding", value.asInstanceOf[js.Any])
    
    inline def setManagePaddingUndefined: Self = StObject.set(x, "managePadding", js.undefined)
    
    inline def setReserveScrollbar(value: Boolean): Self = StObject.set(x, "reserveScrollbar", value.asInstanceOf[js.Any])
    
    inline def setReserveScrollbarUndefined: Self = StObject.set(x, "reserveScrollbar", js.undefined)
    
    inline def setSetCtSizeIfNeeded(value: (/* ownerContext */ js.UndefOr[IContextItem], /* containerSize */ js.UndefOr[Any]) => Unit): Self = StObject.set(x, "setCtSizeIfNeeded", js.Any.fromFunction2(value))
    
    inline def setSetCtSizeIfNeededUndefined: Self = StObject.set(x, "setCtSizeIfNeeded", js.undefined)
  }
}
