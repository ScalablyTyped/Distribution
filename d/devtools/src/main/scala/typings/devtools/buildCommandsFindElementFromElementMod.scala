package typings.devtools

import typings.devtools.anon.Value
import typings.wdioProtocols.buildTypesMod.ElementReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsFindElementFromElementMod {
  
  @JSImport("devtools/build/commands/findElementFromElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasElementIdUsingValue: Value): js.Promise[ElementReference | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasElementIdUsingValue.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementReference | js.Error]]
}
