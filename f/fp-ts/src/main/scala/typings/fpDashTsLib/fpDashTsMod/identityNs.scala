package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "identity")
@js.native
object identityNs extends js.Object {
  @js.native
  class Identity[A] protected ()
    extends fpDashTsLib.libIdentityMod.Identity[A] {
    def this(value: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Identity = js.native
  val identity: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libIdentityMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libIdentityMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[fpDashTsLib.libIdentityMod.URI] with fpDashTsLib.libAltMod.Alt1[fpDashTsLib.libIdentityMod.URI] with fpDashTsLib.libComonadMod.Comonad1[fpDashTsLib.libIdentityMod.URI] with fpDashTsLib.libChainRecMod.ChainRec1[fpDashTsLib.libIdentityMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, chain, chainFirst, duplicate, extend, flatten, foldMap, map, reduce, reduceRight) */ def alt[A](that: js.Function0[fpDashTsLib.libIdentityMod.Identity[A]]): js.Function1[
    /* fa */ fpDashTsLib.libIdentityMod.Identity[A], 
    fpDashTsLib.libIdentityMod.Identity[A]
  ] = js.native
  def getEq[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libIdentityMod.Identity[A]] = js.native
  def getSetoid[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libIdentityMod.Identity[A]] = js.native
  def getShow[A](S: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[fpDashTsLib.libIdentityMod.Identity[A]] = js.native
}

