package typings
package fpDashTsLib.libInvariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invariant1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  val URI: F
  def imap[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): fpDashTsLib.libHKTMod.Type[F, B]
}

object Invariant1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    imap: js.Function3[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ]
  ): Invariant1[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("imap")(imap)
    __obj.asInstanceOf[Invariant1[F]]
  }
}

