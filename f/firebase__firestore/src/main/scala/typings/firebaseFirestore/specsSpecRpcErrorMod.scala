package typings.firebaseFirestore

import typings.firebaseFirestore.utilErrorMod.Code
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/specs/spec_rpc_error", JSImport.Namespace)
@js.native
object specsSpecRpcErrorMod extends js.Object {
  @js.native
  class RpcError protected () extends Error {
    def this(code: Double, message: String) = this()
    def this(code: Code, message: String) = this()
    var code: Double = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

