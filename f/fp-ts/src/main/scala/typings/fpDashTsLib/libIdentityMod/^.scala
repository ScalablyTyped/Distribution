package typings
package fpDashTsLib.libIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Identity", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Identity = js.native
  val identity: fpDashTsLib.libMonadMod.Monad1[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[URI] with fpDashTsLib.libAltMod.Alt1[URI] with fpDashTsLib.libComonadMod.Comonad1[URI] with fpDashTsLib.libChainRecMod.ChainRec1[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, chain, chainFirst, duplicate, extend, flatten, foldMap, map, reduce, reduceRight) */ def alt[A](that: js.Function0[Identity[A]]): js.Function1[/* fa */ Identity[A], Identity[A]] = js.native
  def getEq[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[Identity[A]] = js.native
  def getSetoid[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[Identity[A]] = js.native
  def getShow[A](S: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[Identity[A]] = js.native
}

