package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "reader")
@js.native
object readerNs extends js.Object {
  @js.native
  class Reader[E, A] protected ()
    extends fpDashTsLib.libReaderMod.Reader[E, A] {
    def this(run: js.Function1[/* e */ E, A]) = this()
  }
  
  val URI: /* Reader */ java.lang.String = js.native
  val ask: js.Function0[fpDashTsLib.libReaderMod.Reader[js.Any, js.Any]] = js.native
  val asks: js.Function1[
    /* f */ js.Function1[/* e */ js.Any, js.Any], 
    fpDashTsLib.libReaderMod.Reader[js.Any, js.Any]
  ] = js.native
  val local: js.Function1[
    /* f */ js.Function1[/* e */ js.Any, js.Any], 
    js.Function1[
      /* fa */ fpDashTsLib.libReaderMod.Reader[js.Any, js.Any], 
      fpDashTsLib.libReaderMod.Reader[js.Any, js.Any]
    ]
  ] = js.native
  val reader: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.libReaderMod.URI] with fpDashTsLib.libProfunctorMod.Profunctor2[fpDashTsLib.libReaderMod.URI] with fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.libReaderMod.URI] with fpDashTsLib.libStrongMod.Strong2[fpDashTsLib.libReaderMod.URI] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.libReaderMod.URI] = js.native
}

