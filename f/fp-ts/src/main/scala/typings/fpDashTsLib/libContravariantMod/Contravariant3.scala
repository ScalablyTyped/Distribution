package typings
package fpDashTsLib.libContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contravariant3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  val URI: F
  def contramap[U, L, A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

object Contravariant3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    contramap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ]
  ): Contravariant3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], contramap = contramap)
  
    __obj.asInstanceOf[Contravariant3[F]]
  }
}

