package typings
package fpDashTsLib.libFoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  val URI: F
  def reduce[A, B](fa: fpDashTsLib.libHKTMod.Type[F, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B
}

object Foldable1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): Foldable1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], reduce = reduce)
  
    __obj.asInstanceOf[Foldable1[F]]
  }
}

