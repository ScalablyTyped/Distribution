package typings
package fpDashTsLib.es6InvariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invariant1[F /* <: fpDashTsLib.es6HKTMod.URIS */] extends js.Object {
  val URI: F
  def imap[A, B](fa: fpDashTsLib.es6HKTMod.HKT[F, A], f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): fpDashTsLib.es6HKTMod.Kind[F, B]
}

object Invariant1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    imap: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any]
  ): Invariant1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], imap = js.Any.fromFunction3(imap))
  
    __obj.asInstanceOf[Invariant1[F]]
  }
}

