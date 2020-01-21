package typings.expo

import typings.std.Console_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/logs/RemoteConsole", JSImport.Namespace)
@js.native
object remoteConsoleMod extends js.Object {
  @js.native
  object default extends js.Object {
    var createRemoteConsole: js.Function1[/* originalConsole */ Console_, Console_] = js.native
  }
  
}

