package typings
package fpDashTsLib.libOptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionT2v2[M /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition21[M, fpDashTsLib.libOptionMod.URI] {
  def chain[L, A, B](
    fa: fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libOptionMod.Option[A]],
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libOptionMod.Option[B]]]
  ): fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libOptionMod.Option[B]]
}

object OptionT2v2 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS2 */](
    ap: (fpDashTsLib.libHKTMod.Type2[
      M, 
      js.Any, 
      fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Function1[js.Any, js.Any]]
    ], fpDashTsLib.libHKTMod.Type2[M, js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]]) => fpDashTsLib.libHKTMod.Type2[M, js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]],
    chain: (fpDashTsLib.libHKTMod.Type2[M, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]], js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Type2[M, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]]
    ]) => fpDashTsLib.libHKTMod.Type2[M, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]],
    map: (fpDashTsLib.libHKTMod.Type2[M, js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[M, js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]],
    of: js.Any => fpDashTsLib.libHKTMod.Type2[M, js.Any, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]]
  ): OptionT2v2[M] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[OptionT2v2[M]]
  }
}

