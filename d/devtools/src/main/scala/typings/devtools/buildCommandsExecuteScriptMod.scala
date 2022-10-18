package typings.devtools

import typings.devtools.anon.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsExecuteScriptMod {
  
  @JSImport("devtools/build/commands/executeScript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasScriptArgs: Args): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasScriptArgs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
