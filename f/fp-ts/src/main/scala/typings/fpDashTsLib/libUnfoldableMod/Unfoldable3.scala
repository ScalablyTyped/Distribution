package typings
package fpDashTsLib.libUnfoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unfoldable3[F /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  val URI: F
  def unfoldr[U, L, A, B](b: B, f: js.Function1[/* b */ B, fpDashTsLib.libOptionMod.Option[js.Tuple2[A, B]]]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
}

object Unfoldable3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    unfoldr: js.Function2[
      js.Any, 
      js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Tuple2[js.Any, js.Any]]], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ]
  ): Unfoldable3[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("unfoldr")(unfoldr)
    __obj.asInstanceOf[Unfoldable3[F]]
  }
}

