package typings
package fpDashTsLib.es6FoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable2[F /* <: fpDashTsLib.es6HKTMod.URIS2 */] extends js.Object {
  val URI: F
  def reduce[L, A, B](fa: fpDashTsLib.es6HKTMod.Type2[F, L, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B
}

object Foldable2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */](
    URI: F,
    reduce: (fpDashTsLib.es6HKTMod.Type2[F, js.Any, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): Foldable2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], reduce = js.Any.fromFunction3(reduce))
  
    __obj.asInstanceOf[Foldable2[F]]
  }
}

