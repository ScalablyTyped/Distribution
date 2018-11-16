package typings
package fpDashTsLib.libAltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Alt[F]
  extends fpDashTsLib.libFunctorMod.Functor[F] {
  def alt[A](fx: fpDashTsLib.libHKTMod.HKT[F, A], fy: fpDashTsLib.libHKTMod.HKT[F, A]): fpDashTsLib.libHKTMod.HKT[F, A]
}

