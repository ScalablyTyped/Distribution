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

object ChainRec2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    chainRec: js.Function2[
      js.Any, 
      js.Function1[
        js.Any, 
        fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
      ], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any]
    ]
  ): ChainRec2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = ap, chain = chain, chainRec = chainRec, map = map)
  
    __obj.asInstanceOf[ChainRec2[F]]
  }
}

