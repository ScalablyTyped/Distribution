package typings
package fpDashTsLib.libContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contravariant[F] extends js.Object {
  val URI: F
  def contramap[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.libHKTMod.HKT[F, B]
}

object Contravariant {
  @scala.inline
  def apply[F](
    URI: F,
    contramap: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ]
  ): Contravariant[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("contramap")(contramap)
    __obj.asInstanceOf[Contravariant[F]]
  }
}

