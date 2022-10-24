package typings.devtools

import typings.devtools.anon.ShadowId
import typings.wdioProtocols.buildTypesMod.ElementReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsFindElementFromShadowRootMod {
  
  @JSImport("devtools/build/commands/findElementFromShadowRoot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param1: ShadowId): js.Promise[ElementReference | js.Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ElementReference | js.Error]]
}
