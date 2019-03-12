package typings
package fpDashTsLib.libStateTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateT3[M /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  def ap[U, L, S, A, B](
    fab: js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type3[M, U, L, js.Tuple2[js.Function1[/* a */ A, B], S]]
    ],
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Tuple2[A, S]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Tuple2[B, S]]]
  def chain[U, L, S, A, B](
    f: js.Function1[
      /* a */ A, 
      js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Tuple2[B, S]]]
    ],
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Tuple2[A, S]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Tuple2[B, S]]]
  def map[U, L, S, A, B](
    f: js.Function1[/* a */ A, B],
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Tuple2[A, S]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Tuple2[B, S]]]
  def of[U, L, S, A](a: A): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Tuple2[A, S]]]
}

object StateT3 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS3 */](
    ap: (js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Tuple2[js.Function1[js.Any, js.Any], js.Any]]
    ], js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Tuple2[js.Any, js.Any]]]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Tuple2[js.Any, js.Any]]],
    chain: (js.Function1[
      js.Any, 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Tuple2[js.Any, js.Any]]]
    ], js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Tuple2[js.Any, js.Any]]]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Tuple2[js.Any, js.Any]]],
    map: (js.Function1[js.Any, js.Any], js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Tuple2[js.Any, js.Any]]]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Tuple2[js.Any, js.Any]]],
    of: js.Any => js.Function1[js.Any, fpDashTsLib.libHKTMod.Type3[M, js.Any, js.Any, js.Tuple2[js.Any, js.Any]]]
  ): StateT3[M] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[StateT3[M]]
  }
}

