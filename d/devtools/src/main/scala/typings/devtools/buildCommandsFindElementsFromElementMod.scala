package typings.devtools

import typings.devtools.anon.Value
import typings.wdioProtocols.buildTypesMod.ElementReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsFindElementsFromElementMod {
  
  @JSImport("devtools/build/commands/findElementsFromElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param1: Value): js.Promise[js.Array[ElementReference]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ElementReference]]]
}
