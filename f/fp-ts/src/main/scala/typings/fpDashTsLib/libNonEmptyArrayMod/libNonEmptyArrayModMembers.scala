package typings
package fpDashTsLib.libNonEmptyArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/NonEmptyArray", JSImport.Namespace)
@js.native
object libNonEmptyArrayModMembers extends js.Object {
  val URI: /* NonEmptyArray */ java.lang.String = js.native
  val nonEmptyArray: fpDashTsLib.libMonadMod.Monad1[URI] with fpDashTsLib.libComonadMod.Comonad1[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[URI] with (fpDashTsLib.libTraversableWithIndexMod.TraversableWithIndex1[URI, scala.Double]) with (fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex1[URI, scala.Double]) with (fpDashTsLib.libFoldableWithIndexMod.FoldableWithIndex1[URI, scala.Double]) = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[NonEmptyArray[A]] = js.native
  def getSemigroup[A](): fpDashTsLib.libSemigroupMod.Semigroup[NonEmptyArray[A]] = js.native
  def group[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[NonEmptyArray[A]]
  ] = js.native
  def groupBy[A](as: fpDashTsLib.libArrayMod.Global.Array[A], f: js.Function1[/* a */ A, java.lang.String]): ScalablyTyped.runtime.StringDictionary[NonEmptyArray[A]] = js.native
  def groupSort[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[NonEmptyArray[A]]
  ] = js.native
}

