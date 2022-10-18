package typings.devtools

import typings.devtools.anon.ShadowId
import typings.wdioProtocols.buildTypesMod.ElementReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsFindElementsFromShadowRootMod {
  
  @JSImport("devtools/build/commands/findElementsFromShadowRoot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasShadowIdUsingValue: ShadowId): js.Promise[js.Array[ElementReference]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasShadowIdUsingValue.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ElementReference]]]
}
