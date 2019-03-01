package typings
package fpDashTsLib.libStateTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateT2[M /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  def ap[L, S, A, B](
    fab: js.Function1[
      /* s */ S, 
      fpDashTsLib.libHKTMod.Type2[M, L, js.Tuple2[js.Function1[/* a */ A, B], S]]
    ],
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type2[M, L, js.Tuple2[A, S]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type2[M, L, js.Tuple2[B, S]]]
  def chain[L, S, A, B](
    f: js.Function1[
      /* a */ A, 
      js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type2[M, L, js.Tuple2[B, S]]]
    ],
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type2[M, L, js.Tuple2[A, S]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type2[M, L, js.Tuple2[B, S]]]
  def map[L, S, A, B](
    f: js.Function1[/* a */ A, B],
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type2[M, L, js.Tuple2[A, S]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type2[M, L, js.Tuple2[B, S]]]
  def of[L, S, A](a: A): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.Type2[M, L, js.Tuple2[A, S]]]
}

object StateT2 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS2 */](
    ap: js.Function2[
      js.Function1[
        js.Any, 
        fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Tuple2[js.Function1[js.Any, js.Any], js.Any]]
      ], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Tuple2[js.Any, js.Any]]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Tuple2[js.Any, js.Any]]]
    ],
    chain: js.Function2[
      js.Function1[
        js.Any, 
        js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Tuple2[js.Any, js.Any]]]
      ], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Tuple2[js.Any, js.Any]]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Tuple2[js.Any, js.Any]]]
    ],
    map: js.Function2[
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Tuple2[js.Any, js.Any]]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Tuple2[js.Any, js.Any]]]
    ],
    of: js.Function1[
      js.Any, 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Tuple2[js.Any, js.Any]]]
    ]
  ): StateT2[M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("of")(of)
    __obj.asInstanceOf[StateT2[M]]
  }
}

