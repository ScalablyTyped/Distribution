package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "identity")
@js.native
object identityNs extends js.Object {
  @js.native
  class Identity[A] protected ()
    extends fpDashTsLib.es6IdentityMod.Identity[A] {
    def this(value: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Identity = js.native
  val identity: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.es6IdentityMod.URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.es6IdentityMod.URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v1[fpDashTsLib.es6IdentityMod.URI] with fpDashTsLib.es6AltMod.Alt1[fpDashTsLib.es6IdentityMod.URI] with fpDashTsLib.es6ComonadMod.Comonad1[fpDashTsLib.es6IdentityMod.URI] with fpDashTsLib.es6ChainRecMod.ChainRec1[fpDashTsLib.es6IdentityMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, chain, chainFirst, duplicate, extend, flatten, foldMap, map, reduce, reduceRight) */ def alt[A](that: js.Function0[fpDashTsLib.es6IdentityMod.Identity[A]]): js.Function1[
    /* fa */ fpDashTsLib.es6IdentityMod.Identity[A], 
    fpDashTsLib.es6IdentityMod.Identity[A]
  ] = js.native
  def getEq[A](E: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[fpDashTsLib.es6IdentityMod.Identity[A]] = js.native
  def getSetoid[A](E: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[fpDashTsLib.es6IdentityMod.Identity[A]] = js.native
  def getShow[A](S: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[fpDashTsLib.es6IdentityMod.Identity[A]] = js.native
}

