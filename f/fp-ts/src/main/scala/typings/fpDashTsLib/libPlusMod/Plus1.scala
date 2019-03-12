package typings
package fpDashTsLib.libPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plus1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libAltMod.Alt1[F] {
  def zero[A](): fpDashTsLib.libHKTMod.Type[F, A]
}

object Plus1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    alt: (fpDashTsLib.libHKTMod.Type[F, js.Any], fpDashTsLib.libHKTMod.Type[F, js.Any]) => fpDashTsLib.libHKTMod.Type[F, js.Any],
    map: (fpDashTsLib.libHKTMod.Type[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type[F, js.Any],
    zero: () => fpDashTsLib.libHKTMod.Type[F, js.Any]
  ): Plus1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map), zero = js.Any.fromFunction0(zero))
  
    __obj.asInstanceOf[Plus1[F]]
  }
}

