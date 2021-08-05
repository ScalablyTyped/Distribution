package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQueue
  extends StObject
     with IBase {
  
  /** [Method] Removes all items from the collection  */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the number of items in the collection
    * @returns Number the number of items in the collection.
    */
  var getCount: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Remove an item from the collection
    * @param obj Object The item to remove.
    * @returns Object The item removed or false if no item was removed.
    */
  var remove: js.UndefOr[js.Function1[/* obj */ js.UndefOr[js.Any], js.Any]] = js.undefined
}
object IQueue {
  
  inline def apply(): IQueue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQueue]
  }
  
  extension [Self <: IQueue](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    inline def setGetCountUndefined: Self = StObject.set(x, "getCount", js.undefined)
    
    inline def setRemove(value: /* obj */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
