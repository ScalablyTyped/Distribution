package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "reader")
@js.native
object readerNs extends js.Object {
  @js.native
  class Reader[E, A] protected ()
    extends fpDashTsLib.es6ReaderMod.Reader[E, A] {
    def this(run: js.Function1[/* e */ E, A]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Reader = js.native
  val reader: fpDashTsLib.es6MonadMod.Monad2[fpDashTsLib.es6ReaderMod.URI] with fpDashTsLib.es6ProfunctorMod.Profunctor2[fpDashTsLib.es6ReaderMod.URI] with fpDashTsLib.es6CategoryMod.Category2[fpDashTsLib.es6ReaderMod.URI] with fpDashTsLib.es6StrongMod.Strong2[fpDashTsLib.es6ReaderMod.URI] with fpDashTsLib.es6ChoiceMod.Choice2[fpDashTsLib.es6ReaderMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(apFirst, apSecond, chain, chainFirst, compose, flatten, map, promap) */ def ap[L, A](fa: fpDashTsLib.es6ReaderMod.Reader[L, A]): js.Function1[
    /* fab */ fpDashTsLib.es6ReaderMod.Reader[L, js.Function1[/* a */ A, _]], 
    fpDashTsLib.es6ReaderMod.Reader[L, _]
  ] = js.native
  def ask[E](): fpDashTsLib.es6ReaderMod.Reader[E, E] = js.native
  def asks[E, A](f: js.Function1[/* e */ E, A]): fpDashTsLib.es6ReaderMod.Reader[E, A] = js.native
  def getMonoid[E, A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6ReaderMod.Reader[E, A]] = js.native
  def getSemigroup[E, A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6ReaderMod.Reader[E, A]] = js.native
  def local[E, E2](f: js.Function1[/* e */ E2, E]): js.Function1[
    /* fa */ fpDashTsLib.es6ReaderMod.Reader[E, _], 
    fpDashTsLib.es6ReaderMod.Reader[E2, _]
  ] = js.native
  def of[R, A](a: A): fpDashTsLib.es6ReaderMod.Reader[R, A] = js.native
}

