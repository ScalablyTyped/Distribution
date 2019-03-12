package typings
package fpDashTsLib.libOptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionT[M]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition[M, fpDashTsLib.libOptionMod.URI] {
  def chain[A, B](
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libOptionMod.Option[B]]],
    fa: fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libOptionMod.Option[A]]
  ): fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libOptionMod.Option[B]]
}

object OptionT {
  @scala.inline
  def apply[M](
    ap: (fpDashTsLib.libHKTMod.HKT[
      M, 
      fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libOptionMod.URI, js.Function1[js.Any, js.Any]]
    ], fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libOptionMod.URI, js.Any]]) => fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libOptionMod.URI, js.Any]],
    chain: (js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libOptionMod.Option[js.Any]]], fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libOptionMod.Option[js.Any]]) => fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libOptionMod.Option[js.Any]],
    map: (fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libOptionMod.URI, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libOptionMod.URI, js.Any]],
    of: js.Any => fpDashTsLib.libHKTMod.HKT[M, fpDashTsLib.libHKTMod.HKT[fpDashTsLib.libOptionMod.URI, js.Any]]
  ): OptionT[M] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[OptionT[M]]
  }
}

