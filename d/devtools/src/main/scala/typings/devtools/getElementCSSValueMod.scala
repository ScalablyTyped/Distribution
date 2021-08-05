package typings.devtools

import typings.devtools.anon.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getElementCSSValueMod {
  
  @JSImport("devtools/build/commands/getElementCSSValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasElementIdPropertyName: PropertyName): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasElementIdPropertyName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
