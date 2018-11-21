package typings
package fpDashTsLib.libZipperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Zipper", JSImport.Namespace)
@js.native
object libZipperModMembers extends js.Object {
  val URI: /* Zipper */ java.lang.String = js.native
  val fromArray: js.Function2[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], 
    /* focusIndex */ js.UndefOr[scala.Double], 
    fpDashTsLib.libOptionMod.Option[Zipper[js.Any]]
  ] = js.native
  val fromNonEmptyArray: js.Function1[/* nea */ fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[js.Any], Zipper[js.Any]] = js.native
  val getMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[Zipper[js.Any]]
  ] = js.native
  val getSemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[Zipper[js.Any]]
  ] = js.native
  val zipper: fpDashTsLib.libApplicativeMod.Applicative1[URI] with fpDashTsLib.libFoldableMod.Foldable1[URI] with fpDashTsLib.libTraversableMod.Traversable1[URI] with fpDashTsLib.libComonadMod.Comonad1[URI] = js.native
}

