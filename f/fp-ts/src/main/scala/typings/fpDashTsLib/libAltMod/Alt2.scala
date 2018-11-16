package typings
package fpDashTsLib.libAltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Alt2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libFunctorMod.Functor2[F] {
  def alt[L, A](fx: fpDashTsLib.libHKTMod.Type2[F, L, A], fy: fpDashTsLib.libHKTMod.Type2[F, L, A]): fpDashTsLib.libHKTMod.Type2[F, L, A]
}

