package typings.gently

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gently", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Gently
  
  @js.native
  trait Gently extends StObject {
    
    def expect(obj: js.Any, method: String): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    def expect(obj: js.Any, method: String, count: Double, stubFn: js.Function1[/* repeated */ js.Any, js.Any]): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    def expect(obj: js.Any, method: String, stubFn: js.Function1[/* repeated */ js.Any, js.Any]): js.Function1[/* repeated */ js.Any, js.Any] = js.native
    
    def hijack(realRequire: js.Function1[/* id */ String, js.Any]): js.Function1[/* id */ String, js.Any] = js.native
    
    var hijacked: js.Array[js.Any] = js.native
    
    def restore(obj: js.Any, method: String): Unit = js.native
    
    def stub(location: String): js.Any = js.native
    def stub(location: String, exportsName: String): js.Any = js.native
    
    def verify(): Unit = js.native
    def verify(msg: String): Unit = js.native
  }
}
