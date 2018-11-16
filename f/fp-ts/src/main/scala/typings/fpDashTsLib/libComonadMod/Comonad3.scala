package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Comonad3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libExtendMod.Extend3[F] {
  def extract[U, L, A](ca: fpDashTsLib.libHKTMod.Type3[F, U, L, A]): A
}

