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

object ChainRec1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[F, js.Any]], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    chainRec: js.Function2[
      js.Any, 
      js.Function1[
        js.Any, 
        fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
      ], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[F, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[F, js.Any]
    ]
  ): ChainRec1[F] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("URI")(URI.asInstanceOf[js.Any])
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("chainRec")(chainRec)
    __obj.updateDynamic("map")(map)
    __obj.asInstanceOf[ChainRec1[F]]
  }
}

