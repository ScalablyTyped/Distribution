package typings.domHelpers

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siblingsMod {
  
  @JSImport("dom-helpers/cjs/siblings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[Element]]
  inline def default(node: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
}
