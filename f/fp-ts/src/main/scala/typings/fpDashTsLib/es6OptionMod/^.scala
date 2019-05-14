package typings
package fpDashTsLib.es6OptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Option", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Option = js.native
  val none: Option[scala.Nothing] = js.native
  val option: fpDashTsLib.es6MonadMod.Monad1[URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v1[URI] with fpDashTsLib.es6PlusMod.Plus1[URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v1[URI] with fpDashTsLib.es6AlternativeMod.Alternative1[URI] with fpDashTsLib.es6ExtendMod.Extend1[URI] with fpDashTsLib.es6CompactableMod.Compactable1[URI] with fpDashTsLib.es6FilterableMod.Filterable1[URI] with fpDashTsLib.es6WitherableMod.Witherable1[URI] = js.native
  def fromEither[L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): Option[A] = js.native
  def fromNullable[A](): Option[A] = js.native
  def fromNullable[A](a: A): Option[A] = js.native
  def fromPredicate[A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): js.Function1[/* a */ A, Option[A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_ABA[A, B /* <: A */](predicate: fpDashTsLib.es6FunctionMod.Refinement[A, B]): js.Function1[/* a */ A, Option[B]] = js.native
  def fromRefinement[A, B /* <: A */](refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]): js.Function1[/* a */ A, Option[B]] = js.native
  def getApplyMonoid[A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[Option[A]] = js.native
  def getApplySemigroup[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[Option[A]] = js.native
  def getFirstMonoid[A](): fpDashTsLib.es6MonoidMod.Monoid[Option[A]] = js.native
  def getLastMonoid[A](): fpDashTsLib.es6MonoidMod.Monoid[Option[A]] = js.native
  def getMonoid[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6MonoidMod.Monoid[Option[A]] = js.native
  def getOrd[A](O: fpDashTsLib.es6OrdMod.Ord[A]): fpDashTsLib.es6OrdMod.Ord[Option[A]] = js.native
  def getRefinement[A, B /* <: A */](getOption: js.Function1[/* a */ A, Option[B]]): fpDashTsLib.es6FunctionMod.Refinement[A, B] = js.native
  def getSetoid[A](S: fpDashTsLib.es6SetoidMod.Setoid[A]): fpDashTsLib.es6SetoidMod.Setoid[Option[A]] = js.native
  def getShow[A](S: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[Option[A]] = js.native
  def isNone[A](fa: Option[A]): /* is fp-ts.fp-ts/es6/Option.None<A> */ scala.Boolean = js.native
  def isSome[A](fa: Option[A]): /* is fp-ts.fp-ts/es6/Option.Some<A> */ scala.Boolean = js.native
  def some[A](a: A): Option[A] = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A]): Option[A] = js.native
}

