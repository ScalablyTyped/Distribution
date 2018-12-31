package typings
package fpDashTsLib.libAltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libFunctorMod.Functor2C[F, L] {
  def alt[A](fx: fpDashTsLib.libHKTMod.Type2[F, L, A], fy: fpDashTsLib.libHKTMod.Type2[F, L, A]): fpDashTsLib.libHKTMod.Type2[F, L, A]
}

