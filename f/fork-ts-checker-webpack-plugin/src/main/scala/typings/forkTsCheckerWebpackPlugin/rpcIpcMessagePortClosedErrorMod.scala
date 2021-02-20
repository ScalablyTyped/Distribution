package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.rpcMessagePortClosedErrorMod.RpcMessagePortClosedError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcIpcMessagePortClosedErrorMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc/error/RpcIpcMessagePortClosedError", "RpcIpcMessagePortClosedError")
  @js.native
  class RpcIpcMessagePortClosedError protected () extends RpcMessagePortClosedError {
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
