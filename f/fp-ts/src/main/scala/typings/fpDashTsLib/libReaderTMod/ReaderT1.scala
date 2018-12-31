package typings
package fpDashTsLib.libReaderTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderT1[M /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def ap[E, A, B](
    fab: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, js.Function1[/* a */ A, B]]],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.HKT[M, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, B]]
  def chain[E, A, B](
    f: js.Function1[/* a */ A, js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, B]]],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, B]]
  def map[E, A, B](f: js.Function1[/* a */ A, B], fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, A]]): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, B]]
  def of[E, A](a: A): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, A]]
}

