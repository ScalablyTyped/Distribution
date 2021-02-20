package typings.extjs.Ext.layout.component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBoundList extends IAuto {
  
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
    * @param ownerContext Object
    */
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IBoundList: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Called before any calculation cycles to prepare for layout
    * @param ownerContext Object
    */
  @JSName("beginLayout")
  var beginLayout_IBoundList: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Validates item is in the proper place in the dom  */
  @JSName("isValidParent")
  var isValidParent_IBoundList: js.UndefOr[js.Function0[Unit]] = js.native
}
object IBoundList {
  
  @scala.inline
  def apply(): IBoundList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoundList]
  }
  
  @scala.inline
  implicit class IBoundListMutableBuilder[Self <: IBoundList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginLayout(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beginLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginLayoutCycle(value: /* ownerContext */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beginLayoutCycle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginLayoutCycleUndefined: Self = StObject.set(x, "beginLayoutCycle", js.undefined)
    
    @scala.inline
    def setBeginLayoutUndefined: Self = StObject.set(x, "beginLayout", js.undefined)
    
    @scala.inline
    def setIsValidParent(value: () => Unit): Self = StObject.set(x, "isValidParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValidParentUndefined: Self = StObject.set(x, "isValidParent", js.undefined)
  }
}
