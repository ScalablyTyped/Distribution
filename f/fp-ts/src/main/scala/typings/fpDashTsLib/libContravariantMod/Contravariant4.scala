package typings
package fpDashTsLib.libContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contravariant4[F /* <: fpDashTsLib.libHKTMod.URIS4 */] extends js.Object {
  val URI: F
  def contramap[X, U, L, A, B](fa: fpDashTsLib.libHKTMod.Kind4[F, X, U, L, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.libHKTMod.Kind4[F, X, U, L, B]
}

object Contravariant4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS4 */](
    URI: F,
    contramap: (fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Contravariant4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], contramap = js.Any.fromFunction2(contramap))
  
    __obj.asInstanceOf[Contravariant4[F]]
  }
}

