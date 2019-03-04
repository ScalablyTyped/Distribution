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
    alt: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    zero: js.Function0[fpDashTsLib.libHKTMod.Type[F, js.Any]]
  ): Plus1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = alt, map = map, zero = zero)
  
    __obj.asInstanceOf[Plus1[F]]
  }
}

