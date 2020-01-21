package typings.firebaseFirestore

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/util/promise", JSImport.Namespace)
@js.native
object testUtilPromiseMod extends js.Object {
  @js.native
  class Deferred[R] () extends js.Object {
    var promise: js.Promise[R] = js.native
    @JSName("reject")
    var reject_Original: Rejecter = js.native
    @JSName("resolve")
    var resolve_Original: Resolver[R] = js.native
    def reject(): Unit = js.native
    def reject(reason: Error): Unit = js.native
    def resolve(): Unit = js.native
    def resolve(value: R): Unit = js.native
    def resolve(value: js.Promise[R]): Unit = js.native
  }
  
  type Rejecter = js.Function1[/* reason */ js.UndefOr[Error], Unit]
  type Resolver[R] = js.Function1[/* value */ js.UndefOr[R | js.Promise[R]], Unit]
}

