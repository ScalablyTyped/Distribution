package typings.fluentReact

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmMarkupMod {
  
  @JSImport("@fluent/react/esm/markup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createParseMarkup(): MarkupParser = ^.asInstanceOf[js.Dynamic].applyDynamic("createParseMarkup")().asInstanceOf[MarkupParser]
  
  type MarkupParser = js.Function1[/* str */ String, js.Array[Node]]
}
