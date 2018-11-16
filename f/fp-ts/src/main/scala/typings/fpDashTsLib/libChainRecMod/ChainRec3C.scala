package typings
package fpDashTsLib.libChainRecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChainRec3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libChainMod.Chain3C[F, U, L] {
  def chainRec[A, B](
    a: A,
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libEitherMod.Either[A, B]]
    ]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

