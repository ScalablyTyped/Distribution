package typings.domHelpers

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsIsInputMod {
  
  @JSImport("dom-helpers/cjs/isInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Boolean]
  inline def default(node: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
