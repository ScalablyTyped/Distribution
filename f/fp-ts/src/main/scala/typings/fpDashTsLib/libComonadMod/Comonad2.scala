package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Comonad2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libExtendMod.Extend2[F] {
  def extract[L, A](ca: fpDashTsLib.libHKTMod.Type2[F, L, A]): A
}

