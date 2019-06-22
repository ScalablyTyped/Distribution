package typings
package fpDashTsLib.es6IOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/IO", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.IO = js.native
  val io: fpDashTsLib.es6MonadMod.Monad1[URI] with fpDashTsLib.es6MonadIOMod.MonadIO1[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(apFirst, apSecond, chain, chainFirst, flatten, map) */ def ap[A](fa: IO[A]): js.Function1[/* fab */ IO[js.Function1[/* a */ A, _]], IO[_]] = js.native
  def getMonoid[A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[IO[A]] = js.native
  def getSemigroup[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[IO[A]] = js.native
}

