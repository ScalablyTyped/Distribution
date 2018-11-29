package typings
package fpDashTsLib.libReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Reader", JSImport.Namespace)
@js.native
object libReaderModMembers extends js.Object {
  val URI: /* Reader */ java.lang.String = js.native
  val ask: js.Function0[Reader[js.Any, js.Any]] = js.native
  val asks: js.Function1[/* f */ js.Function1[/* e */ js.Any, js.Any], Reader[js.Any, js.Any]] = js.native
  val local: js.Function1[
    /* f */ js.Function1[/* e */ js.Any, js.Any], 
    js.Function1[/* fa */ Reader[js.Any, js.Any], Reader[js.Any, js.Any]]
  ] = js.native
  val reader: fpDashTsLib.libMonadMod.Monad2[URI] with fpDashTsLib.libProfunctorMod.Profunctor2[URI] with fpDashTsLib.libCategoryMod.Category2[URI] with fpDashTsLib.libStrongMod.Strong2[URI] with fpDashTsLib.libChoiceMod.Choice2[URI] = js.native
}

