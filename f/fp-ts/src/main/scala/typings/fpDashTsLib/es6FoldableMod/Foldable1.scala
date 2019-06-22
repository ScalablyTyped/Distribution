package typings
package fpDashTsLib.es6FoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable1[F /* <: fpDashTsLib.es6HKTMod.URIS */] extends js.Object {
  val URI: F
  def reduce[A, B](fa: fpDashTsLib.es6HKTMod.Kind[F, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B
}

object Foldable1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    reduce: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): Foldable1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], reduce = js.Any.fromFunction3(reduce))
  
    __obj.asInstanceOf[Foldable1[F]]
  }
}

