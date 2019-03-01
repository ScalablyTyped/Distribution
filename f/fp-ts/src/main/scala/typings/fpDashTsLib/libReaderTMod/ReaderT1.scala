package typings
package fpDashTsLib.libReaderTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderT1[M /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def ap[E, A, B](
    fab: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, js.Function1[/* a */ A, B]]],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, B]]
  def chain[E, A, B](
    f: js.Function1[/* a */ A, js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, B]]],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, B]]
  def map[E, A, B](f: js.Function1[/* a */ A, B], fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, A]]): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, B]]
  def of[E, A](a: A): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, A]]
}

object ReaderT1 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS */](
    ap: js.Function2[
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Function1[js.Any, js.Any]]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]]
    ],
    chain: js.Function2[
      js.Function1[js.Any, js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]]
    ],
    map: js.Function2[
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]]
    ],
    of: js.Function1[js.Any, js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]]]
  ): ReaderT1[M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ap")(ap)
    __obj.updateDynamic("chain")(chain)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("of")(of)
    __obj.asInstanceOf[ReaderT1[M]]
  }
}

