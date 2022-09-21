package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promiseMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/util/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/util/promise", "Deferred")
  @js.native
  open class Deferred[R] () extends StObject {
    
    var promise: js.Promise[R] = js.native
    
    def reject(): Unit = js.native
    def reject(reason: js.Error): Unit = js.native
    @JSName("reject")
    var reject_Original: Rejecter = js.native
    
    def resolve(value: R): Unit = js.native
    def resolve(value: js.Promise[R]): Unit = js.native
    @JSName("resolve")
    var resolve_Original: Resolver[R] = js.native
  }
  
  inline def sequence[T](values: js.Array[T], fn: js.Function1[/* value */ T, js.Promise[Unit]]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(values.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  type Rejecter = js.Function1[/* reason */ js.UndefOr[js.Error], Unit]
  
  type Resolver[R] = js.Function1[/* value */ R | js.Promise[R], Unit]
}
