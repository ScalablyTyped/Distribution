package typings.domHelpers

import typings.domHelpers.typesMod.CamelProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camelizeStyleMod {
  
  @JSImport("dom-helpers/cjs/camelizeStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: String */](string: T): CamelProperty = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any]).asInstanceOf[CamelProperty]
}
