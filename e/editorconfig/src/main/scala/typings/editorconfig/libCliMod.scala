package typings.editorconfig

import typings.commander.mod.OutputConfiguration
import typings.editorconfig.libMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCliMod {
  
  @JSImport("editorconfig/lib/cli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(args: js.Array[String]): js.Promise[js.Array[Props]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Props]]]
  inline def default(args: js.Array[String], testing: OutputConfiguration): js.Promise[js.Array[Props]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any], testing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Props]]]
}
