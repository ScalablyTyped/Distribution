package typings
package fpDashTsLib.libReaderTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderT[M] extends js.Object {
  def ap[E, A, B](
    fab: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, js.Function1[/* a */ A, B]]],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, B]]
  def chain[E, A, B](
    f: js.Function1[/* a */ A, js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, B]]],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, B]]
  def map[E, A, B](f: js.Function1[/* a */ A, B], fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, A]]): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, B]]
  def of[E, A](a: A): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, A]]
}

