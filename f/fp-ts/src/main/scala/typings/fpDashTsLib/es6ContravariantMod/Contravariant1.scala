package typings
package fpDashTsLib.es6ContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contravariant1[F /* <: fpDashTsLib.es6HKTMod.URIS */] extends js.Object {
  val URI: F
  def contramap[A, B](fa: fpDashTsLib.es6HKTMod.Kind[F, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.es6HKTMod.Kind[F, B]
}

object Contravariant1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    contramap: (fpDashTsLib.es6HKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any]
  ): Contravariant1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], contramap = js.Any.fromFunction2(contramap))
  
    __obj.asInstanceOf[Contravariant1[F]]
  }
}

