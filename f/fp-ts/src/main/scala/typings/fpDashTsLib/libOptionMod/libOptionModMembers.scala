package typings
package fpDashTsLib.libOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Option", JSImport.Namespace)
@js.native
object libOptionModMembers extends js.Object {
  val URI: /* Option */ java.lang.String = js.native
  val none: Option[scala.Nothing] = js.native
  val option: fpDashTsLib.libMonadMod.Monad1[URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[URI] with fpDashTsLib.libPlusMod.Plus1[URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[URI] with fpDashTsLib.libAlternativeMod.Alternative1[URI] with fpDashTsLib.libExtendMod.Extend1[URI] with fpDashTsLib.libCompactableMod.Compactable1[URI] with fpDashTsLib.libFilterableMod.Filterable1[URI] with fpDashTsLib.libWitherableMod.Witherable1[URI] = js.native
  def fromEither[L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): Option[A] = js.native
  def fromNullable[A](): Option[A] = js.native
  def fromNullable[A](a: A): Option[A] = js.native
  def fromPredicate[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[/* a */ A, Option[A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_ABA[A, B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[/* a */ A, Option[B]] = js.native
  def fromRefinement[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[/* a */ A, Option[B]] = js.native
  def getApplyMonoid[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[Option[A]] = js.native
  def getApplySemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[Option[A]] = js.native
  def getFirstMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[Option[A]] = js.native
  def getLastMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[Option[A]] = js.native
  def getMonoid[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libMonoidMod.Monoid[Option[A]] = js.native
  def getOrd[A](O: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libOrdMod.Ord[Option[A]] = js.native
  def getRefinement[A, B /* <: A */](getOption: js.Function1[/* a */ A, Option[B]]): fpDashTsLib.libFunctionMod.Refinement[A, B] = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[Option[A]] = js.native
  def isNone[A](fa: Option[A]): /* is None */scala.Boolean = js.native
  def isSome[A](fa: Option[A]): /* is Some */scala.Boolean = js.native
  def some[A](a: A): Option[A] = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A]): Option[A] = js.native
}

