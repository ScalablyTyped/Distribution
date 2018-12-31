package typings
package fpDashTsLib.libInvariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invariant1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  val URI: F
  def imap[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): fpDashTsLib.libHKTMod.Type[F, B]
}

