package typings
package fpDashTsLib.libProfunctorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Profunctor[F] extends js.Object {
  val URI: F
  def map[L, A, B](fa: fpDashTsLib.libHKTMod.HKT2[F, L, A], f: js.Function1[/* a */ A, B]): fpDashTsLib.libHKTMod.HKT2[F, L, B]
  def promap[A, B, C, D](
    fbc: fpDashTsLib.libHKTMod.HKT2[F, B, C],
    f: js.Function1[/* a */ A, B],
    g: js.Function1[/* c */ C, D]
  ): fpDashTsLib.libHKTMod.HKT2[F, A, D]
}

