package typings
package fpDashTsLib.libAltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Alt3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libFunctorMod.Functor3[F] {
  def alt[U, L, A](fx: fpDashTsLib.libHKTMod.Type3[F, U, L, A], fy: fpDashTsLib.libHKTMod.Type3[F, U, L, A]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
}

