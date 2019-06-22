package typings
package fpDashTsLib.es6ContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contravariant4[F /* <: fpDashTsLib.es6HKTMod.URIS4 */] extends js.Object {
  val URI: F
  def contramap[X, U, L, A, B](fa: fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.es6HKTMod.Kind4[F, X, U, L, B]
}

object Contravariant4 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS4 */](
    URI: F,
    contramap: (fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind4[F, js.Any, js.Any, js.Any, js.Any]
  ): Contravariant4[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], contramap = js.Any.fromFunction2(contramap))
  
    __obj.asInstanceOf[Contravariant4[F]]
  }
}

