package typings.fridaGum.global

import typings.fridaGum.RpcExports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpc {
  
  @JSGlobal("rpc")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Empty object that you can either replace or insert into to expose an RPC-style API to your application.
    * The key specifies the method name and the value is your exported function. This function may either return
    * a plain value for returning that to the caller immediately, or a Promise for returning asynchronously.
    */
  @JSGlobal("rpc.exports")
  @js.native
  def exports: RpcExports = js.native
  inline def exports_=(x: RpcExports): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exports")(x.asInstanceOf[js.Any])
}
