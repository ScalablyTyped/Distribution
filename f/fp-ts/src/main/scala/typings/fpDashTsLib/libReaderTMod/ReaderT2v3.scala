package typings
package fpDashTsLib.libReaderTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderT2v3[M /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  def ap[U, L, E, A, B](
    fab: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Kind3[M, U, L, js.Function1[/* a */ A, B]]],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Kind3[M, U, L, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Kind3[M, U, L, B]]
  def chain[U, L, E, A, B](
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Kind3[M, U, L, A]],
    f: js.Function1[/* a */ A, js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Kind3[M, U, L, B]]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Kind3[M, U, L, B]]
  def map[U, L, E, A, B](
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Kind3[M, U, L, A]],
    f: js.Function1[/* a */ A, B]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Kind3[M, U, L, B]]
  def of[U, L, E, A](a: A): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Kind3[M, U, L, A]]
}

object ReaderT2v3 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS3 */](
    ap: (js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Kind3[M, js.Any, js.Any, js.Function1[js.Any, js.Any]]
    ], js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind3[M, js.Any, js.Any, js.Any]]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind3[M, js.Any, js.Any, js.Any]],
    chain: (js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind3[M, js.Any, js.Any, js.Any]], js.Function1[
      js.Any, 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind3[M, js.Any, js.Any, js.Any]]
    ]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind3[M, js.Any, js.Any, js.Any]],
    map: (js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind3[M, js.Any, js.Any, js.Any]], js.Function1[js.Any, js.Any]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind3[M, js.Any, js.Any, js.Any]],
    of: js.Any => js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind3[M, js.Any, js.Any, js.Any]]
  ): ReaderT2v3[M] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[ReaderT2v3[M]]
  }
}

