package typings.fastCopy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmTypesUtilsMod {
  
  @JSImport("fast-copy/dist/esm/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fast-copy/dist/esm/types/utils", "createCache")
  @js.native
  val createCache: js.Function0[Cache] = js.native
  
  inline def getCleanClone(prototype: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCleanClone")(prototype.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("fast-copy/dist/esm/types/utils", "getRegExpFlags")
  @js.native
  val getRegExpFlags: js.Function1[/* regExp */ js.RegExp, String] = js.native
  
  @JSImport("fast-copy/dist/esm/types/utils", "getTag")
  @js.native
  val getTag: js.Function1[/* value */ Any, String] = js.native
  
  trait Cache extends StObject {
    
    def get(key: Any): Any
    
    def has(value: Any): Boolean
    
    def set(key: Any, value: Any): Unit
  }
  object Cache {
    
    inline def apply(get: Any => Any, has: Any => Boolean, set: (Any, Any) => Unit): Cache = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Cache]
    }
    
    extension [Self <: Cache](x: Self) {
      
      inline def setGet(value: Any => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Any, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
