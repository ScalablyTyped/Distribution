package typings
package fpDashTsLib.libUnfoldableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unfoldable1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  val URI: F
  def unfoldr[A, B](b: B, f: js.Function1[/* b */ B, fpDashTsLib.libOptionMod.Option[js.Tuple2[A, B]]]): fpDashTsLib.libHKTMod.Type[F, A]
}

object Unfoldable1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    unfoldr: js.Function2[
      js.Any, 
      js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Tuple2[js.Any, js.Any]]], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ]
  ): Unfoldable1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], unfoldr = unfoldr)
  
    __obj.asInstanceOf[Unfoldable1[F]]
  }
}

