package typings
package fpDashTsLib.libInvariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invariant2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  val URI: F
  def imap[L, A, B](
    fa: fpDashTsLib.libHKTMod.HKT2[F, L, A],
    f: js.Function1[/* a */ A, B],
    g: js.Function1[/* b */ B, A]
  ): fpDashTsLib.libHKTMod.Kind2[F, L, B]
}

object Invariant2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    imap: (fpDashTsLib.libHKTMod.HKT2[F, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
  ): Invariant2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], imap = js.Any.fromFunction3(imap))
  
    __obj.asInstanceOf[Invariant2[F]]
  }
}

