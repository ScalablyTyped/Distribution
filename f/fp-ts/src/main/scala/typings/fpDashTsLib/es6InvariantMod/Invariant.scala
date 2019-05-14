package typings
package fpDashTsLib.es6InvariantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invariant[F] extends js.Object {
  val URI: F
  def imap[A, B](fa: fpDashTsLib.es6HKTMod.HKT[F, A], f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): fpDashTsLib.es6HKTMod.HKT[F, B]
}

object Invariant {
  @scala.inline
  def apply[F](
    URI: F,
    imap: (fpDashTsLib.es6HKTMod.HKT[F, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.HKT[F, js.Any]
  ): Invariant[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], imap = js.Any.fromFunction3(imap))
  
    __obj.asInstanceOf[Invariant[F]]
  }
}

