package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable[F] extends js.Object {
  val URI: F
  def reduce[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B
}

object Foldable {
  @scala.inline
  def apply[F](
    URI: F,
    reduce: (fpDashTsLib.libHKTMod.HKT[F, js.Any], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): Foldable[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], reduce = js.Any.fromFunction3(reduce))
  
    __obj.asInstanceOf[Foldable[F]]
  }
}

