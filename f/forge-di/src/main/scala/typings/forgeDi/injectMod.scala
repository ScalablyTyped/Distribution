package typings.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typings.forgeDi.anon.Partialdefault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectMod {
  
  @JSImport("forge-di/dist/framework/inject", JSImport.Default)
  @js.native
  def default[T](hints: StringDictionary[String | Partialdefault]): js.Function1[/* target */ T, T] = js.native
  
  @JSImport("forge-di/dist/framework/inject", "HINT_PROPERTY")
  @js.native
  val HINT_PROPERTY: /* "__FORGE_DEPENDENCY_HINTS__" */ String = js.native
}
