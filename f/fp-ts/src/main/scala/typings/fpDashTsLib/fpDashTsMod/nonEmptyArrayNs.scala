package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "nonEmptyArray")
@js.native
object nonEmptyArrayNs extends js.Object {
  @js.native
  class NonEmptyArray[A] protected ()
    extends fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A] {
    def this(head: A, tail: fpDashTsLib.libArrayMod.Global.Array[A]) = this()
  }
  
  val URI: /* NonEmptyArray */ java.lang.String = js.native
  val nonEmptyArray: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libNonEmptyArrayMod.URI] with fpDashTsLib.libComonadMod.Comonad1[fpDashTsLib.libNonEmptyArrayMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libNonEmptyArrayMod.URI] with (fpDashTsLib.libTraversableWithIndexMod.TraversableWithIndex1[fpDashTsLib.libNonEmptyArrayMod.URI, scala.Double]) with (fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex1[fpDashTsLib.libNonEmptyArrayMod.URI, scala.Double]) with (fpDashTsLib.libFoldableWithIndexMod.FoldableWithIndex1[fpDashTsLib.libNonEmptyArrayMod.URI, scala.Double]) = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]] = js.native
  def getSemigroup[A](): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]] = js.native
  def group[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]]
  ] = js.native
  def groupBy[A](as: fpDashTsLib.libArrayMod.Global.Array[A], f: js.Function1[/* a */ A, java.lang.String]): org.scalablytyped.runtime.StringDictionary[fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]] = js.native
  def groupSort[A](O: fpDashTsLib.libOrdMod.Ord[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.libNonEmptyArrayMod.NonEmptyArray[A]]
  ] = js.native
}

