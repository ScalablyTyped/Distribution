package typings
package fpDashTsLib.es6UnfoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unfoldable1[F /* <: fpDashTsLib.es6HKTMod.URIS */] extends js.Object {
  val URI: F
  def unfoldr[A, B](b: B, f: js.Function1[/* b */ B, fpDashTsLib.es6OptionMod.Option[js.Tuple2[A, B]]]): fpDashTsLib.es6HKTMod.Kind[F, A]
}

object Unfoldable1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.es6HKTMod.URIS */](
    URI: F,
    unfoldr: (js.Any, js.Function1[js.Any, fpDashTsLib.es6OptionMod.Option[js.Tuple2[js.Any, js.Any]]]) => fpDashTsLib.es6HKTMod.Kind[F, js.Any]
  ): Unfoldable1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfoldr = js.Any.fromFunction2(unfoldr))
  
    __obj.asInstanceOf[Unfoldable1[F]]
  }
}

