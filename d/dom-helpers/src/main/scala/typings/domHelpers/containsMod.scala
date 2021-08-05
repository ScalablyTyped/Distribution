package typings.domHelpers

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containsMod {
  
  @JSImport("dom-helpers/cjs/contains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(context: Element, node: Element): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(context.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
}
