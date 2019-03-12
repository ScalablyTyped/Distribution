package typings
package fpDashTsLib.libReaderTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderT2v1[M /* <: fpDashTsLib.libHKTMod.URIS */] extends js.Object {
  def ap[E, A, B](
    fab: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, js.Function1[/* a */ A, B]]],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, B]]
  def chain[E, A, B](
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, A]],
    f: js.Function1[/* a */ A, js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, B]]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, B]]
  def map[E, A, B](fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, A]], f: js.Function1[/* a */ A, B]): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, B]]
  def of[E, A](a: A): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type[M, A]]
}

object ReaderT2v1 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS */](
    ap: (js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Function1[js.Any, js.Any]]], js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]],
    chain: (js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]], js.Function1[js.Any, js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]]]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]],
    map: (js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]], js.Function1[js.Any, js.Any]) => js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]],
    of: js.Any => js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, js.Any]]
  ): ReaderT2v1[M] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[ReaderT2v1[M]]
  }
}

