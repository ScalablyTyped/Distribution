package typings.devtools

import typings.devtools.anon.ElementIdName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsGetElementAttributeMod {
  
  @JSImport("devtools/build/commands/getElementAttribute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param1: ElementIdName): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param1.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
}
