package typings
package fpDashTsLib.libChainRecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChainRec3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libChainMod.Chain3[F] {
  def chainRec[U, L, A, B](
    a: A,
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libEitherMod.Either[A, B]]
    ]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

