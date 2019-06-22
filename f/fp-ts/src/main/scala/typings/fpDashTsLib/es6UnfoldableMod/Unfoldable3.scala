package typings
package fpDashTsLib.es6UnfoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unfoldable3[F /* <: fpDashTsLib.es6HKTMod.URIS3 */] extends js.Object {
  val URI: F
  def unfoldr[U, L, A, B](b: B, f: js.Function1[/* b */ B, fpDashTsLib.es6OptionMod.Option[js.Tuple2[A, B]]]): fpDashTsLib.es6HKTMod.Kind3[F, U, L, A]
}

object Unfoldable3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS3 */](
    URI: F,
    unfoldr: (js.Any, js.Function1[js.Any, fpDashTsLib.es6OptionMod.Option[js.Tuple2[js.Any, js.Any]]]) => fpDashTsLib.es6HKTMod.Kind3[F, js.Any, js.Any, js.Any]
  ): Unfoldable3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfoldr = js.Any.fromFunction2(unfoldr))
  
    __obj.asInstanceOf[Unfoldable3[F]]
  }
}

