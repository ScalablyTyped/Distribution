package typings
package fpDashTsLib.es6InvariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invariant3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */] extends js.Object {
  val URI: F
  def imap[U, L, A, B](
    fa: fpDashTsLib.es6HKTMod.HKT3[F, U, L, A],
    f: js.Function1[/* a */ A, B],
    g: js.Function1[/* b */ B, A]
  ): fpDashTsLib.es6HKTMod.Kind3[F, U, L, B]
}

object Invariant3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    imap: (fpDashTsLib.es6HKTMod.HKT3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]
  ): Invariant3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], imap = js.Any.fromFunction3(imap))
  
    __obj.asInstanceOf[Invariant3[F]]
  }
}

