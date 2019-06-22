package typings
package fpDashTsLib.libChainRecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainRec1[F /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libChainMod.Chain1[F] {
  def chainRec[A, B](
    a: A,
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libEitherMod.Either[A, B]]]
  ): fpDashTsLib.libHKTMod.Kind[F, B]
}

object ChainRec1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS */](
    URI: F,
    ap: (fpDashTsLib.libHKTMod.Kind[F, js.Function1[js.Any, js.Any]], fpDashTsLib.libHKTMod.Kind[F, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    chain: (fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind[F, js.Any]]) => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    chainRec: (js.Any, js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Kind[F, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
    ]) => fpDashTsLib.libHKTMod.Kind[F, js.Any],
    map: (fpDashTsLib.libHKTMod.Kind[F, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind[F, js.Any]
  ): ChainRec1[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), chainRec = js.Any.fromFunction2(chainRec), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[ChainRec1[F]]
  }
}

