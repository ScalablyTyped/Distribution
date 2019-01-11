package typings
package fpDashTsLib.libOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Option", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: /* Option */ java.lang.String = js.native
  val none: fpDashTsLib.libOptionMod.Option[scala.Nothing] = js.native
  val option: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libAlternativeMod.Alternative1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libExtendMod.Extend1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libCompactableMod.Compactable1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libFilterableMod.Filterable1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libWitherableMod.Witherable1[fpDashTsLib.libOptionMod.URI] = js.native
  def fromEither[L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def fromNullable[A](): fpDashTsLib.libOptionMod.Option[A] = js.native
  def fromNullable[A](a: A): fpDashTsLib.libOptionMod.Option[A] = js.native
  def fromPredicate[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_ABA[A, B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]] = js.native
  def fromRefinement[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]] = js.native
  def getApplyMonoid[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getApplySemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getFirstMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getLastMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getMonoid[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getOrd[A](O: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libOrdMod.Ord[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getRefinement[A, B /* <: A */](getOption: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]): fpDashTsLib.libFunctionMod.Refinement[A, B] = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def isNone[A](fa: fpDashTsLib.libOptionMod.Option[A]): /* is fp-ts.fp-ts/lib/Option.None<A> */ scala.Boolean = js.native
  def isSome[A](fa: fpDashTsLib.libOptionMod.Option[A]): /* is fp-ts.fp-ts/lib/Option.Some<A> */ scala.Boolean = js.native
  def some[A](a: A): fpDashTsLib.libOptionMod.Option[A] = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
}

