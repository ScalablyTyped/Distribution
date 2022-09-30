package typings.devtools

import typings.devtools.anon.Using
import typings.wdioProtocols.typesMod.ElementReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findElementsMod {
  
  @JSImport("devtools/build/commands/findElements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasUsingValue: Using): js.Promise[js.Array[ElementReference]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasUsingValue.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ElementReference]]]
}
