package typings
package fpDashTsLib.libFunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor1[F /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  val URI: F
  def map[A, B](fa: fpDashTsLib.libHKTMod.Kind[F, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.Kind[F, B]
}

object Functor1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    map: (fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any]
  ): Functor1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Functor1[F]]
  }
}

