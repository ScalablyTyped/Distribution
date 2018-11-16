package typings
package fpDashTsLib.libInvariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Invariant3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  val URI: F
  def imap[U, L, A, B](
    fa: fpDashTsLib.libHKTMod.HKT3[F, U, L, A],
    f: js.Function1[/* a */ A, B],
    g: js.Function1[/* b */ B, A]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

