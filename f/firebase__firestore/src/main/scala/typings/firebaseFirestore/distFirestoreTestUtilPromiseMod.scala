package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreTestUtilPromiseMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/util/promise", "Deferred")
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
  
  type Rejecter = js.Function1[/* reason */ js.UndefOr[js.Error], Unit]
  
  type Resolver[R] = js.Function1[/* value */ R | js.Promise[R], Unit]
}
