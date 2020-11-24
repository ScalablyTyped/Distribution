package typings.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typings.forgeDi.anon.Partialdefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-di/dist/framework/inject", JSImport.Namespace)
@js.native
object injectMod extends js.Object {
  
  val HINT_PROPERTY: /* "__FORGE_DEPENDENCY_HINTS__" */ String = js.native
  
  def default[T](hints: StringDictionary[String | Partialdefault]): js.Function1[/* target */ T, T] = js.native
}
