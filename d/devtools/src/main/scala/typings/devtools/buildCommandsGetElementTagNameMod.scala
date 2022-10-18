package typings.devtools

import typings.devtools.anon.ElementId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsGetElementTagNameMod {
  
  @JSImport("devtools/build/commands/getElementTagName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasElementId: ElementId): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasElementId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
