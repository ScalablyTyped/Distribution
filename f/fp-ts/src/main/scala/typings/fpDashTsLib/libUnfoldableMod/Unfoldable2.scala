package typings
package fpDashTsLib.libUnfoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unfoldable2[F /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  val URI: F
  def unfoldr[L, A, B](b: B, f: js.Function1[/* b */ B, fpDashTsLib.libOptionMod.Option[js.Tuple2[A, B]]]): fpDashTsLib.libHKTMod.Kind2[F, L, A]
}

object Unfoldable2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    unfoldr: (js.Any, js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Tuple2[js.Any, js.Any]]]) => fpDashTsLib.libHKTMod.Kind2[F, js.Any, js.Any]
  ): Unfoldable2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfoldr = js.Any.fromFunction2(unfoldr))
  
    __obj.asInstanceOf[Unfoldable2[F]]
  }
}

