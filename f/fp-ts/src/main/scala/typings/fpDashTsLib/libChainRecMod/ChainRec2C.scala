package typings
package fpDashTsLib.libChainRecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChainRec2C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libChainMod.Chain2C[F, L] {
  def chainRec[A, B](
    a: A,
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libEitherMod.Either[A, B]]
    ]
  ): fpDashTsLib.libHKTMod.Type2[F, L, B]
}

