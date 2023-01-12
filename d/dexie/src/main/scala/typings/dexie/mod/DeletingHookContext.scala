package typings.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletingHookContext[T, Key] extends StObject {
  
  var onerror: js.UndefOr[js.Function1[/* err */ Any, Unit]] = js.undefined
  
  var onsuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object DeletingHookContext {
  
  inline def apply[T, Key](): DeletingHookContext[T, Key] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletingHookContext[T, Key]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletingHookContext[?, ?], T, Key] (val x: Self & (DeletingHookContext[T, Key])) extends AnyVal {
    
    inline def setOnerror(value: /* err */ Any => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
    
    inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    inline def setOnsuccess(value: () => Unit): Self = StObject.set(x, "onsuccess", js.Any.fromFunction0(value))
    
    inline def setOnsuccessUndefined: Self = StObject.set(x, "onsuccess", js.undefined)
  }
}
