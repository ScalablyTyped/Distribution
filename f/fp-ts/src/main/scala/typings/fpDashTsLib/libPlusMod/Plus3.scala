package typings
package fpDashTsLib.libPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plus3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libAltMod.Alt3[F] {
  def zero[U, L, A](): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
}

object Plus3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    alt: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
    ],
    zero: js.Function0[fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]]
  ): Plus3[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("alt")(alt)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("zero")(zero)
    __obj.asInstanceOf[Plus3[F]]
  }
}

