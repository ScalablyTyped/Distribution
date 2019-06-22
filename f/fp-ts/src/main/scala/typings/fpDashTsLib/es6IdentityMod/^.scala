package typings
package fpDashTsLib.es6IdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Identity", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Identity = js.native
  val identity: fpDashTsLib.es6MonadMod.Monad1[URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v1[URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v1[URI] with fpDashTsLib.es6AltMod.Alt1[URI] with fpDashTsLib.es6ComonadMod.Comonad1[URI] with fpDashTsLib.es6ChainRecMod.ChainRec1[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, chain, chainFirst, duplicate, extend, flatten, foldMap, map, reduce, reduceRight) */ def alt[A](that: js.Function0[Identity[A]]): js.Function1[/* fa */ Identity[A], Identity[A]] = js.native
  def getEq[A](E: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[Identity[A]] = js.native
  def getSetoid[A](E: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[Identity[A]] = js.native
  def getShow[A](S: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[Identity[A]] = js.native
}

