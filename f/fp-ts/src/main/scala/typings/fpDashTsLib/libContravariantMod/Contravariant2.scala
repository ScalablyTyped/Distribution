package typings
package fpDashTsLib.libContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contravariant2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  val URI: F
  def contramap[L, A, B](fa: fpDashTsLib.libHKTMod.Type2[F, L, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

