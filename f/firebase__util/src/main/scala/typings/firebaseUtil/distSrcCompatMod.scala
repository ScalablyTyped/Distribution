package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCompatMod {
  
  @JSImport("@firebase/util/dist/src/compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getModularInstance[ExpService](service: ExpService): ExpService = ^.asInstanceOf[js.Dynamic].applyDynamic("getModularInstance")(service.asInstanceOf[js.Any]).asInstanceOf[ExpService]
  inline def getModularInstance[ExpService](service: Compat[ExpService]): ExpService = ^.asInstanceOf[js.Dynamic].applyDynamic("getModularInstance")(service.asInstanceOf[js.Any]).asInstanceOf[ExpService]
  
  trait Compat[T] extends StObject {
    
    var _delegate: T
  }
  object Compat {
    
    inline def apply[T](_delegate: T): Compat[T] = {
      val __obj = js.Dynamic.literal(_delegate = _delegate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compat[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Compat[?], T] (val x: Self & Compat[T]) extends AnyVal {
      
      inline def set_delegate(value: T): Self = StObject.set(x, "_delegate", value.asInstanceOf[js.Any])
    }
  }
}
