package typings
package fpDashTsLib.libReaderTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderT2v[M] extends js.Object {
  def ap[E, A, B](
    fab: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, js.Function1[/* a */ A, B]]],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, B]]
  def chain[E, A, B](
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, A]],
    f: js.Function1[/* a */ A, js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, B]]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, B]]
  def map[E, A, B](fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, A]], f: js.Function1[/* a */ A, B]): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, B]]
  def of[E, A](a: A): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, A]]
}

object ReaderT2v {
  @scala.inline
  def apply[M](
    ap: (js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Function1[js.Any, js.Any]]], js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]],
    chain: (js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]], js.Function1[js.Any, js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]]]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]],
    map: (js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]], js.Function1[js.Any, js.Any]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]],
    of: js.Any => js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]]
  ): ReaderT2v[M] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[ReaderT2v[M]]
  }
}

