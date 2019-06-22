package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.Functor1[F] {
  def extend[A, B](
    ea: fpDashTsLib.libHKTMod.Kind[F, A],
    f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[F, A], B]
  ): fpDashTsLib.libHKTMod.Kind[F, B]
}

object Extend1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    extend: (fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any]
  ): Extend1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Extend1[F]]
  }
}

