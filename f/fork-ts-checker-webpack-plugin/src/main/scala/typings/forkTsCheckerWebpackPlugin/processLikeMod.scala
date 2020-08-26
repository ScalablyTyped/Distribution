package typings.forkTsCheckerWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/rpc/rpc-ipc/ProcessLike", JSImport.Namespace)
@js.native
object processLikeMod extends js.Object {
  @js.native
  trait ProcessLike extends js.Object {
    var connected: js.UndefOr[Boolean] = js.native
    var disconnect: js.UndefOr[js.Function0[Unit]] = js.native
    var pid: js.UndefOr[String | Double] = js.native
    var send: js.UndefOr[
        js.Function4[
          /* message */ js.Any, 
          /* sendHandle */ js.UndefOr[js.Any], 
          /* options */ js.UndefOr[js.Any], 
          /* callback */ js.UndefOr[js.Function1[/* error */ js.Any, Unit]], 
          Boolean
        ]
      ] = js.native
    def off(event: js.Any): js.Any = js.native
    def off(event: js.Any, listener: js.Any): js.Any = js.native
    def on(event: js.Any, listener: js.Any): js.Any = js.native
  }
  
}

