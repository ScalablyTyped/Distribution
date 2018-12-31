package typings
package fpDashTsLib.libChainRecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainRec2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libChainMod.Chain2[F] {
  def chainRec[L, A, B](
    a: A,
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libEitherMod.Either[A, B]]
    ]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

