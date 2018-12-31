package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libExtendMod.Extend3C[F, U, L] {
  def extract[A](ca: fpDashTsLib.libHKTMod.Type3[F, U, L, A]): A
}

