package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Comonad1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libExtendMod.Extend1[F] {
  def extract[A](ca: fpDashTsLib.libHKTMod.Type[F, A]): A
}

