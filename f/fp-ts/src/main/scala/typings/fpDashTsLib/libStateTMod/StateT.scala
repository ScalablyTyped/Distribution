package typings
package fpDashTsLib.libStateTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StateT[M] extends js.Object {
  def ap[S, A, B](
    fab: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[js.Function1[/* a */ A, B], S]]],
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[A, S]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[B, S]]]
  def chain[S, A, B](
    f: js.Function1[/* a */ A, js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[B, S]]]],
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[A, S]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[B, S]]]
  def map[S, A, B](
    f: js.Function1[/* a */ A, B],
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[A, S]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[B, S]]]
  def of[S, A](a: A): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[A, S]]]
}

