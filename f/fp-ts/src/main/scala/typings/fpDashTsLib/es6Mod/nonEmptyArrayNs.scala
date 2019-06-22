package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "nonEmptyArray")
@js.native
object nonEmptyArrayNs extends js.Object {
  @js.native
  class NonEmptyArray[A] protected ()
    extends fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A] {
    def this(head: A, tail: fpDashTsLib.libArrayMod.Global.Array[A]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.NonEmptyArray = js.native
  val nonEmptyArray: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.es6NonEmptyArrayMod.URI] with fpDashTsLib.es6ComonadMod.Comonad1[fpDashTsLib.es6NonEmptyArrayMod.URI] with (fpDashTsLib.es6TraversableWithIndexMod.TraversableWithIndex1[fpDashTsLib.es6NonEmptyArrayMod.URI, scala.Double]) with (fpDashTsLib.es6FunctorWithIndexMod.FunctorWithIndex1[fpDashTsLib.es6NonEmptyArrayMod.URI, scala.Double]) with (fpDashTsLib.es6FoldableWithIndexMod.FoldableWithIndex1[fpDashTsLib.es6NonEmptyArrayMod.URI, scala.Double]) = js.native
  def fromArray[A](as: fpDashTsLib.libArrayMod.Global.Array[A]): fpDashTsLib.es6OptionMod.Option[fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A]] = js.native
  def getEq[A](S: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A]] = js.native
  def getSemigroup[A](): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A]] = js.native
  def getSetoid[A](S: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A]] = js.native
  def group[A](S: fpDashTsLib.es6EqMod.Eq[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A]]
  ] = js.native
  def groupBy[A](as: fpDashTsLib.libArrayMod.Global.Array[A], f: js.Function1[/* a */ A, java.lang.String]): org.scalablytyped.runtime.StringDictionary[fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A]] = js.native
  def groupSort[A](O: fpDashTsLib.es6OrdMod.Ord[A]): js.Function1[
    /* as */ fpDashTsLib.libArrayMod.Global.Array[A], 
    fpDashTsLib.libArrayMod.Global.Array[fpDashTsLib.es6NonEmptyArrayMod.NonEmptyArray[A]]
  ] = js.native
}

