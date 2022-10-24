package typings.devtools

import typings.devtools.anon.Using
import typings.wdioProtocols.buildTypesMod.ElementReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsFindElementsMod {
  
  @JSImport("devtools/build/commands/findElements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param1: Using): js.Promise[js.Array[ElementReference]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ElementReference]]]
}
