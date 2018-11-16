package typings
package fpDashTsLib.libContravariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Contravariant[F] extends js.Object {
  val URI: F
  def contramap[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], f: js.Function1[/* b */ B, A]): fpDashTsLib.libHKTMod.HKT[F, B]
}

