package typings
package fpDashTsLib.libUnfoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unfoldable[F] extends js.Object {
  val URI: F
  def unfoldr[A, B](b: B, f: js.Function1[/* b */ B, fpDashTsLib.libOptionMod.Option[js.Tuple2[A, B]]]): fpDashTsLib.libHKTMod.HKT[F, A]
}

object Unfoldable {
  @scala.inline
  def apply[F](
    URI: F,
    unfoldr: (js.Any, js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Tuple2[js.Any, js.Any]]]) => fpDashTsLib.libHKTMod.HKT[F, js.Any]
  ): Unfoldable[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfoldr = js.Any.fromFunction2(unfoldr))
  
    __obj.asInstanceOf[Unfoldable[F]]
  }
}

