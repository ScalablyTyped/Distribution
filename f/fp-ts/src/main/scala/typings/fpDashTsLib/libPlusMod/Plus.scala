package typings
package fpDashTsLib.libPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plus[F]
  extends fpDashTsLib.libAltMod.Alt[F] {
  def zero[A](): fpDashTsLib.libHKTMod.HKT[F, A]
}

