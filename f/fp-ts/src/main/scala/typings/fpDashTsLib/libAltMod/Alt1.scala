package typings
package fpDashTsLib.libAltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Alt1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libFunctorMod.Functor1[F] {
  def alt[A](fx: fpDashTsLib.libHKTMod.Type[F, A], fy: fpDashTsLib.libHKTMod.Type[F, A]): fpDashTsLib.libHKTMod.Type[F, A]
}

