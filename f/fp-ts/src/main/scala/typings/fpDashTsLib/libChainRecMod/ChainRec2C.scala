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

object ChainRec2C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    URI: F,
    _L: L,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[F, L, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    chainRec: js.Function2[
      js.Any, 
      js.Function1[
        js.Any, 
        fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
      ], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[F, L, js.Any]
    ]
  ): ChainRec2C[F, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("_L")(_L.asInstanceOf[js.Any])
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("chainRec")(chainRec)
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[ChainRec2C[F, L]]
  }
}

