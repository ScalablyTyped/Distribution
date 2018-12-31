package typings
package fpDashTsLib.libChainRecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainRec[F]
  extends fpDashTsLib.libChainMod.Chain[F] {
  def chainRec[A, B](
    a: A,
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[A, B]]]
  ): fpDashTsLib.libHKTMod.HKT[F, B]
}

