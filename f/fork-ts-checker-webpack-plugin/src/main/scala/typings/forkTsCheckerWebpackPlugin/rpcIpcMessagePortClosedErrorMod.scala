package typings.forkTsCheckerWebpackPlugin

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc/error/RpcIpcMessagePortClosedError", JSImport.Namespace)
@js.native
object rpcIpcMessagePortClosedErrorMod extends js.Object {
  @js.native
  class RpcIpcMessagePortClosedError protected () extends Error {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: String, code: Double) = this()
    def this(message: String, code: js.UndefOr[scala.Nothing], signal: String) = this()
    def this(message: String, code: String, signal: String) = this()
    def this(message: String, code: Double, signal: String) = this()
    def this(message: String, code: Null, signal: String) = this()
    val code: js.UndefOr[String | Double | Null] = js.native
    val signal: js.UndefOr[String | Null] = js.native
  }
  
}

