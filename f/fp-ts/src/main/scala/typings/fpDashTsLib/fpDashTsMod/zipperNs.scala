package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "zipper")
@js.native
object zipperNs extends js.Object {
  @js.native
  class Zipper[A] protected ()
    extends fpDashTsLib.libZipperMod.Zipper[A] {
    def this(lefts: fpDashTsLib.libArrayMod.Global.Array[A], focus: A, rights: fpDashTsLib.libArrayMod.Global.Array[A]) = this()
  }
  
  val URI: /* Zipper */ java.lang.String = js.native
  val fromArray: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* focusIndex */ js.UndefOr[scala.Double], 
    fpDashTsLib.libOptionMod.Option[fpDashTsLib.libZipperMod.Zipper[js.Any]]
  ] = js.native
  val fromNonEmptyArray: js.Function1[
    /* nea */ fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[js.Any], 
    fpDashTsLib.libZipperMod.Zipper[js.Any]
  ] = js.native
  val getMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libZipperMod.Zipper[js.Any]]
  ] = js.native
  val getSemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libZipperMod.Zipper[js.Any]]
  ] = js.native
  val zipper: fpDashTsLib.libApplicativeMod.Applicative1[fpDashTsLib.libZipperMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libZipperMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[fpDashTsLib.libZipperMod.URI] with fpDashTsLib.libComonadMod.Comonad1[fpDashTsLib.libZipperMod.URI] = js.native
}

