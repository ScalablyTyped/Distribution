package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libExtendMod.Extend1[F] {
  def extract[A](ca: fpDashTsLib.libHKTMod.Kind[F, A]): A
}

object Comonad1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    extend: (fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Function1[/* fa */ fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    extract: fpDashTsLib.libHKTMod.Kind[F, js.Any] => js.Any,
    map: (fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any]
  ): Comonad1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Comonad1[F]]
  }
}

