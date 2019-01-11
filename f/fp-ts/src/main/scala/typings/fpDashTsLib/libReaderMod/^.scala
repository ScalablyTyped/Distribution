package typings
package fpDashTsLib.libReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Reader", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: /* Reader */ java.lang.String = js.native
  val reader: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.libReaderMod.URI] with fpDashTsLib.libProfunctorMod.Profunctor2[fpDashTsLib.libReaderMod.URI] with fpDashTsLib.libCategoryMod.Category2[fpDashTsLib.libReaderMod.URI] with fpDashTsLib.libStrongMod.Strong2[fpDashTsLib.libReaderMod.URI] with fpDashTsLib.libChoiceMod.Choice2[fpDashTsLib.libReaderMod.URI] = js.native
  def ask[E](): fpDashTsLib.libReaderMod.Reader[E, E] = js.native
  def asks[E, A](f: js.Function1[/* e */ E, A]): fpDashTsLib.libReaderMod.Reader[E, A] = js.native
  def local[E, E2](f: js.Function1[/* e */ E2, E]): js.Function1[
    /* fa */ fpDashTsLib.libReaderMod.Reader[E, _], 
    fpDashTsLib.libReaderMod.Reader[E2, _]
  ] = js.native
}

