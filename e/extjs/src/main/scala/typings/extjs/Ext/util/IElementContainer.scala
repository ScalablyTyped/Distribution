package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IElementContainer
  extends StObject
     with IBase {
  
  /** [Method] Adds each argument passed to this method to the childEls array  */
  var addChildEls: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
    * @param testFn Function The test function.
    */
  var removeChildEls: js.UndefOr[js.Function1[/* testFn */ js.UndefOr[Any], Unit]] = js.undefined
}
object IElementContainer {
  
  inline def apply(): IElementContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IElementContainer]
  }
  
  extension [Self <: IElementContainer](x: Self) {
    
    inline def setAddChildEls(value: () => Unit): Self = StObject.set(x, "addChildEls", js.Any.fromFunction0(value))
    
    inline def setAddChildElsUndefined: Self = StObject.set(x, "addChildEls", js.undefined)
    
    inline def setRemoveChildEls(value: /* testFn */ js.UndefOr[Any] => Unit): Self = StObject.set(x, "removeChildEls", js.Any.fromFunction1(value))
    
    inline def setRemoveChildElsUndefined: Self = StObject.set(x, "removeChildEls", js.undefined)
  }
}
