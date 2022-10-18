package typings.firebase.anon

import typings.firebase.compatMod.firebase.appCheck.AppCheckTokenResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteError extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  
  def next(tokenResult: AppCheckTokenResult): Unit
}
object CompleteError {
  
  inline def apply(next: AppCheckTokenResult => Unit): CompleteError = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[CompleteError]
  }
  
  extension [Self <: CompleteError](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: AppCheckTokenResult => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
  }
}
