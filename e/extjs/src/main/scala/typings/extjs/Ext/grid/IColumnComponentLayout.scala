package typings.extjs.Ext.grid

import typings.extjs.Ext.layout.component.IAuto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnComponentLayout
  extends StObject
     with IAuto {
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IColumnComponentLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IColumnComponentLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[Any], Unit]] = js.undefined
}
object IColumnComponentLayout {
  
  inline def apply(): IColumnComponentLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnComponentLayout]
  }
  
  extension [Self <: IColumnComponentLayout](x: Self) {
    
    inline def setBeginLayout(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1(value))
    
    inline def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "beginLayoutCycle", js.Any.fromFunction1(value))
    
    inline def setBeginLayoutCycleUndefined: Self = StObject.set(x, "beginLayoutCycle", js.undefined)
    
    inline def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
  }
}
