package typings
package fpDashTsLib.es6FoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */] extends js.Object {
  val URI: F
  def reduce[U, L, A, B](fa: fpDashTsLib.es6HKTMod.Kind3[F, U, L, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B
}

object Foldable3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    reduce: (fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): Foldable3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], reduce = js.Any.fromFunction3(reduce))
  
    __obj.asInstanceOf[Foldable3[F]]
  }
}

