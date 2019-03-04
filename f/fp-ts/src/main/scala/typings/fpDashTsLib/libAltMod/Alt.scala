package typings
package fpDashTsLib.libAltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt[F]
  extends fpDashTsLib.libFunctorMod.Functor[F] {
  def alt[A](fx: fpDashTsLib.libHKTMod.HKT[F, A], fy: fpDashTsLib.libHKTMod.HKT[F, A]): fpDashTsLib.libHKTMod.HKT[F, A]
}

object Alt {
  @scala.inline
  def apply[F](
    URI: F,
    alt: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[F, js.Any]
    ]
  ): Alt[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], alt = alt, map = map)
  
    __obj.asInstanceOf[Alt[F]]
  }
}

