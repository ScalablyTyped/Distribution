package typings
package fpDashTsLib.libAltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.Functor1[F] {
  def alt[A](fx: fpDashTsLib.libHKTMod.Kind[F, A], fy: fpDashTsLib.libHKTMod.Kind[F, A]): fpDashTsLib.libHKTMod.Kind[F, A]
}

object Alt1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    alt: (fpDashTsLib.libHKTMod.Kind[F, js.Any], fpDashTsLib.libHKTMod.Kind[F, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any]
  ): Alt1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = js.Any.fromFunction2(alt), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Alt1[F]]
  }
}

