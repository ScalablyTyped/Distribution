package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicative1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libApplyMod.Apply1[F] {
  def of[A](a: A): fpDashTsLib.libHKTMod.Type[F, A]
}

object Applicative1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[F, js.Any]]
  ): Applicative1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = ap, map = map, of = of)
  
    __obj.asInstanceOf[Applicative1[F]]
  }
}

