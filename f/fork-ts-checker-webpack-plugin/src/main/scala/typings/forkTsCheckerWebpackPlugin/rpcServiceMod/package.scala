package typings.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object rpcServiceMod {
  
  type RpcCallHandler[TPayload, TResult] = js.Function1[/* payload */ TPayload, js.Promise[TResult]]
}
