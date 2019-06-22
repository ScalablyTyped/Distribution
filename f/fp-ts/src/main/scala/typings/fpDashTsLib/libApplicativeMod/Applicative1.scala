package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicative1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libApplyMod.Apply1[F] {
  def of[A](a: A): fpDashTsLib.libHKTMod.Kind[F, A]
}

object Applicative1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.Kind[F, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind[F, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    of: js.Any => fpDashTsLib.libHKTMod.Kind[F, js.Any]
  ): Applicative1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[Applicative1[F]]
  }
}

