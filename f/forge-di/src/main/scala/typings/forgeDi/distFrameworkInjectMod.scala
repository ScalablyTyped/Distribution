package typings.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typings.forgeDi.anon.Partialdefault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFrameworkInjectMod {
  
  @JSImport("forge-di/dist/framework/inject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](hints: StringDictionary[String | Partialdefault]): js.Function1[/* target */ T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hints.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ T, T]]
  
  @JSImport("forge-di/dist/framework/inject", "HINT_PROPERTY")
  @js.native
  val HINT_PROPERTY: /* "__FORGE_DEPENDENCY_HINTS__" */ String = js.native
}
