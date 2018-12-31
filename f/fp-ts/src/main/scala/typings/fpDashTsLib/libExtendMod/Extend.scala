package typings
package fpDashTsLib.libExtendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extend[F]
  extends fpDashTsLib.libFunctorMod.Functor[F] {
  def extend[A, B](ea: fpDashTsLib.libHKTMod.HKT[F, A], f: js.Function1[/* fa */ fpDashTsLib.libHKTMod.HKT[F, A], B]): fpDashTsLib.libHKTMod.HKT[F, B]
}

