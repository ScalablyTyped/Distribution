package typings
package fpDashTsLib.libChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain[F]
  extends fpDashTsLib.libApplyMod.Apply[F] {
  def chain[A, B](fa: fpDashTsLib.libHKTMod.HKT[F, A], f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT[F, B]]): fpDashTsLib.libHKTMod.HKT[F, B]
}

