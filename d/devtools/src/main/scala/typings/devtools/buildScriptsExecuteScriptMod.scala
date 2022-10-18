package typings.devtools

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildScriptsExecuteScriptMod {
  
  @JSImport("devtools/build/scripts/executeScript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(_underscore: HTMLElement, script: String, dataProperty: String, dataFlag: String, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")((scala.List(_underscore.asInstanceOf[js.Any], script.asInstanceOf[js.Any], dataProperty.asInstanceOf[js.Any], dataFlag.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
}
