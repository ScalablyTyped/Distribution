package typings
package fpDashTsLib.es6OptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionT2v1[M /* <: fpDashTsLib.es6HKTMod.URIS */]
  extends fpDashTsLib.es6ApplicativeMod.ApplicativeComposition11[M, fpDashTsLib.es6OptionMod.URI] {
  def chain[A, B](
    fa: fpDashTsLib.es6HKTMod.Type[M, fpDashTsLib.es6OptionMod.Option[A]],
    f: js.Function1[/* a */ A, fpDashTsLib.es6HKTMod.Type[M, fpDashTsLib.es6OptionMod.Option[B]]]
  ): fpDashTsLib.es6HKTMod.Type[M, fpDashTsLib.es6OptionMod.Option[B]]
}

object OptionT2v1 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS */](
    ap: (fpDashTsLib.es6HKTMod.Type[
      M, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6OptionMod.URI, js.Function1[js.Any, js.Any]]
    ], fpDashTsLib.es6HKTMod.Type[M, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6OptionMod.URI, js.Any]]) => fpDashTsLib.es6HKTMod.Type[M, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6OptionMod.URI, js.Any]],
    chain: (fpDashTsLib.es6HKTMod.Type[M, fpDashTsLib.es6OptionMod.Option[js.Any]], js.Function1[js.Any, fpDashTsLib.es6HKTMod.Type[M, fpDashTsLib.es6OptionMod.Option[js.Any]]]) => fpDashTsLib.es6HKTMod.Type[M, fpDashTsLib.es6OptionMod.Option[js.Any]],
    map: (fpDashTsLib.es6HKTMod.Type[M, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6OptionMod.URI, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type[M, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6OptionMod.URI, js.Any]],
    of: js.Any => fpDashTsLib.es6HKTMod.Type[M, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6OptionMod.URI, js.Any]]
  ): OptionT2v1[M] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[OptionT2v1[M]]
  }
}

