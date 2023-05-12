package typings.foregroundChild

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsWatchdogMod {
  
  @JSImport("foreground-child/dist/mjs/watchdog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def watchdog(child: ChildProcess): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("watchdog")(child.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
}
