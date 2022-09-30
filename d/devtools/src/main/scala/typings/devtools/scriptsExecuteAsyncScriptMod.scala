package typings.devtools

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptsExecuteAsyncScriptMod {
  
  @JSImport("devtools/build/scripts/executeAsyncScript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    _underscore: Element,
    script: String,
    scriptTimeout: Double,
    dataProperty: String,
    dataFlag: String,
    commandArgs: Any*
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")((scala.List(_underscore.asInstanceOf[js.Any], script.asInstanceOf[js.Any], scriptTimeout.asInstanceOf[js.Any], dataProperty.asInstanceOf[js.Any], dataFlag.asInstanceOf[js.Any])).`++`(commandArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Any]]
}
