package typings
package fpDashTsLib.libContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contravariant1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  val URI: F
  def contramap[A, B](fa: fpDashTsLib.libHKTMod.Type[F, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.libHKTMod.Type[F, B]
}

object Contravariant1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    contramap: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ]
  ): Contravariant1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], contramap = contramap)
  
    __obj.asInstanceOf[Contravariant1[F]]
  }
}

