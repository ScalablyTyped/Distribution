package typings.extjs.Ext.layout.component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBoundList
  extends StObject
     with IAuto {
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IBoundList: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IBoundList: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Validates item is in the proper place in the dom  */
  @JSName("isValidParent")
  var isValidParent_IBoundList: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IBoundList {
  
  inline def apply(): IBoundList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoundList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBoundList] (val x: Self) extends AnyVal {
    
    inline def setBeginLayout(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1(value))
    
    inline def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "beginLayoutCycle", js.Any.fromFunction1(value))
    
    inline def setBeginLayoutCycleUndefined: Self = StObject.set(x, "beginLayoutCycle", js.undefined)
    
    inline def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
    
    inline def setIsValidParent(value: () => Unit): Self = StObject.set(x, "isValidParent", js.Any.fromFunction0(value))
    
    inline def setIsValidParentUndefined: Self = StObject.set(x, "isValidParent", js.undefined)
  }
}
