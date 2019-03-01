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

object Invariant3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    imap: js.Function3[
      fpDashTsLib.libHKTMod.HKT3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ]
  ): Invariant3[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("imap")(imap)
    __obj.asInstanceOf[Invariant3[F]]
  }
}

