package typings.esfxCanceltoken

import typings.std.LockGrantedCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockManager extends StObject {
  
  def request(name: String, options: LockOptionsWithCancelToken, callback: LockGrantedCallback): js.Promise[Any]
}
object LockManager {
  
  inline def apply(request: (String, LockOptionsWithCancelToken, LockGrantedCallback) => js.Promise[Any]): LockManager = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction3(request))
    __obj.asInstanceOf[LockManager]
  }
  
  extension [Self <: LockManager](x: Self) {
    
    inline def setRequest(value: (String, LockOptionsWithCancelToken, LockGrantedCallback) => js.Promise[Any]): Self = StObject.set(x, "request", js.Any.fromFunction3(value))
  }
}
