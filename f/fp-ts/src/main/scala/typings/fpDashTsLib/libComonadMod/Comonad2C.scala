package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libExtendMod.Extend2C[F, L] {
  def extract[A](ca: fpDashTsLib.libHKTMod.Type2[F, L, A]): A
}

