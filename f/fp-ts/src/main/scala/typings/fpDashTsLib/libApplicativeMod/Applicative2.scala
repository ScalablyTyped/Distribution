package typings
package fpDashTsLib.libApplicativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Applicative2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libApplyMod.Apply2[F] {
  def of[L, A](a: A): fpDashTsLib.libHKTMod.Type2[F, L, A]
}

object Applicative2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]]
  ): Applicative2[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("of")(of)
    __obj.asInstanceOf[Applicative2[F]]
  }
}

