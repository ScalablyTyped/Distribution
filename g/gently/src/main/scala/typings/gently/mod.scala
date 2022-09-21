package typings.gently

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gently", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Gently
  
  @js.native
  trait Gently extends StObject {
    
    def expect(obj: Any, method: String): js.Function1[/* repeated */ Any, Any] = js.native
    def expect(obj: Any, method: String, count: Double, stubFn: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, Any] = js.native
    def expect(obj: Any, method: String, stubFn: js.Function1[/* repeated */ Any, Any]): js.Function1[/* repeated */ Any, Any] = js.native
    
    def hijack(realRequire: js.Function1[/* id */ String, Any]): js.Function1[/* id */ String, Any] = js.native
    
    var hijacked: js.Array[Any] = js.native
    
    def restore(obj: Any, method: String): Unit = js.native
    
    def stub(location: String): Any = js.native
    def stub(location: String, exportsName: String): Any = js.native
    
    def verify(): Unit = js.native
    def verify(msg: String): Unit = js.native
  }
}
