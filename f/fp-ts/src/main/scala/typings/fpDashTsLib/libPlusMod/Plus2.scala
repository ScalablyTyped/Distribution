package typings
package fpDashTsLib.libPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plus2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libAltMod.Alt2[F] {
  def zero[L, A](): fpDashTsLib.libHKTMod.Type2[F, L, A]
}

object Plus2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    alt: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    zero: js.Function0[fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]]
  ): Plus2[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("alt")(alt)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[Plus2[F]]
  }
}

