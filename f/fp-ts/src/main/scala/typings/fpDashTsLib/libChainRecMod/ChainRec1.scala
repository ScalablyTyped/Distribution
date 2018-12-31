package typings
package fpDashTsLib.libChainRecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainRec1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libChainMod.Chain1[F] {
  def chainRec[A, B](
    a: A,
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[A, B]]]
  ): fpDashTsLib.libHKTMod.Type[F, B]
}

