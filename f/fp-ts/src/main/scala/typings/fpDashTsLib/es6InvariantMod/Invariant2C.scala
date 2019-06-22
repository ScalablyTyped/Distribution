package typings
package fpDashTsLib.es6InvariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invariant2C[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L] extends js.Object {
  val URI: F
  val _L: L
  def imap[A, B](
    fa: fpDashTsLib.es6HKTMod.HKT2[F, L, A],
    f: js.Function1[/* a */ A, B],
    g: js.Function1[/* b */ B, A]
  ): fpDashTsLib.es6HKTMod.Kind2[F, L, B]
}

object Invariant2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    imap: (fpDashTsLib.es6HKTMod.HKT2[F, L, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind2[F, L, js.Any]
  ): Invariant2C[F, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], imap = js.Any.fromFunction3(imap))
  
    __obj.asInstanceOf[Invariant2C[F, L]]
  }
}

