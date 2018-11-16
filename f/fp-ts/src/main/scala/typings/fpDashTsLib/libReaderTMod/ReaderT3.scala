package typings
package fpDashTsLib.libReaderTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReaderT3[M /* <: fpDashTsLib.libHKTMod.URIS3 */] extends js.Object {
  def ap[U, L, E, A, B](
    fab: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type3[M, U, L, js.Function1[/* a */ A, B]]],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type3[M, U, L, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type3[M, U, L, B]]
  def chain[U, L, E, A, B](
    f: js.Function1[/* a */ A, js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type3[M, U, L, B]]],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type3[M, U, L, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type3[M, U, L, B]]
  def map[U, L, E, A, B](
    f: js.Function1[/* a */ A, B],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type3[M, U, L, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type3[M, U, L, B]]
  def of[U, L, E, A](a: A): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type3[M, U, L, A]]
}

