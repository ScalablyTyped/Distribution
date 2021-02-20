package typings.esfxInternalTag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/internal-tag", "Tag")
  @js.native
  def Tag(): js.Function1[/* target */ js.Function, Unit] = js.native
  @JSImport("@esfx/internal-tag", "Tag")
  @js.native
  def Tag(tag: String): js.Function1[/* target */ js.Function, Unit] = js.native
  
  @JSImport("@esfx/internal-tag", "defineTag")
  @js.native
  def defineTag[T /* <: js.Object */](target: T, tag: String): T with Tagged = js.native
  
  @js.native
  trait Tagged extends StObject {
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: String = js.native
  }
}
