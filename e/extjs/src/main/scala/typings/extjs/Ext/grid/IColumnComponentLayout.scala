package typings.extjs.Ext.grid

import typings.extjs.Ext.layout.component.IAuto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnComponentLayout extends IAuto {
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IColumnComponentLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IColumnComponentLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
}
object IColumnComponentLayout {
  
  @scala.inline
  def apply(): IColumnComponentLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnComponentLayout]
  }
  
  @scala.inline
  implicit class IColumnComponentLayoutMutableBuilder[Self <: IColumnComponentLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beginLayoutCycle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginLayoutCycleUndefined: Self = StObject.set(x, "beginLayoutCycle", js.undefined)
    
    @scala.inline
    def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
  }
}
