package typings.esfxInternalTag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@esfx/internal-tag", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Tagged extends js.Object {
    @JSName(scala.scalajs.js.Symbol.toStringTag)
    var toStringTag: String = js.native
  }
  
  def Tag(): js.Function1[/* target */ js.Function, Unit] = js.native
  def Tag(tag: String): js.Function1[/* target */ js.Function, Unit] = js.native
  def defineTag[T /* <: js.Object */](target: T, tag: String): T with Tagged = js.native
}

