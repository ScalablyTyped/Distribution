package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad[F]
  extends fpDashTsLib.libExtendMod.Extend[F] {
  def extract[A](ca: fpDashTsLib.libHKTMod.HKT[F, A]): A
}

