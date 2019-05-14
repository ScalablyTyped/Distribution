package typings
package fpDashTsLib.es6ContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contravariant[F] extends js.Object {
  val URI: F
  def contramap[A, B](fa: fpDashTsLib.es6HKTMod.HKT[F, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.es6HKTMod.HKT[F, B]
}

object Contravariant {
  @scala.inline
  def apply[F](
    URI: F,
    contramap: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any]
  ): Contravariant[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], contramap = js.Any.fromFunction2(contramap))
  
    __obj.asInstanceOf[Contravariant[F]]
  }
}

