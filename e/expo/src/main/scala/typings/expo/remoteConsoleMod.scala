package typings.expo

import typings.std.Console
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteConsoleMod {
  
  object default {
    
    @JSImport("expo/build/logs/RemoteConsole", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("expo/build/logs/RemoteConsole", "default.createRemoteConsole")
    @js.native
    def createRemoteConsole: js.Function1[/* originalConsole */ Console, Console] = js.native
    @scala.inline
    def createRemoteConsole_=(x: js.Function1[/* originalConsole */ Console, Console]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createRemoteConsole")(x.asInstanceOf[js.Any])
  }
}
