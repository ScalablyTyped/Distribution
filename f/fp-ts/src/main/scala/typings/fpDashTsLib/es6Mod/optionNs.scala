package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "option")
@js.native
object optionNs extends js.Object {
  @js.native
  class None[A] protected ()
    extends fpDashTsLib.es6OptionMod.None[A]
  
  @js.native
  class Some[A] protected ()
    extends fpDashTsLib.es6OptionMod.Some[A] {
    def this(value: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Option = js.native
  val none: fpDashTsLib.es6OptionMod.Option[scala.Nothing] = js.native
  val option: fpDashTsLib.es6MonadMod.Monad1[fpDashTsLib.es6OptionMod.URI] with fpDashTsLib.es6Foldable2vMod.Foldable2v1[fpDashTsLib.es6OptionMod.URI] with fpDashTsLib.es6PlusMod.Plus1[fpDashTsLib.es6OptionMod.URI] with fpDashTsLib.es6Traversable2vMod.Traversable2v1[fpDashTsLib.es6OptionMod.URI] with fpDashTsLib.es6AlternativeMod.Alternative1[fpDashTsLib.es6OptionMod.URI] with fpDashTsLib.es6ExtendMod.Extend1[fpDashTsLib.es6OptionMod.URI] with fpDashTsLib.es6CompactableMod.Compactable1[fpDashTsLib.es6OptionMod.URI] with fpDashTsLib.es6FilterableMod.Filterable1[fpDashTsLib.es6OptionMod.URI] with fpDashTsLib.es6WitherableMod.Witherable1[fpDashTsLib.es6OptionMod.URI] with fpDashTsLib.es6MonadThrowMod.MonadThrow1[fpDashTsLib.es6OptionMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, chain, chainFirst, duplicate, extend, filter, filterMap, flatten, foldMap, map, partition, partitionMap, reduce, reduceRight, compact, separate) */ def alt[A](that: js.Function0[fpDashTsLib.es6OptionMod.Option[A]]): js.Function1[/* fa */ fpDashTsLib.es6OptionMod.Option[A], fpDashTsLib.es6OptionMod.Option[A]] = js.native
  def elem[A](E: fpDashTsLib.es6EqMod.Eq[A]): js.Function1[
    /* a */ A, 
    js.Function1[/* ma */ fpDashTsLib.es6OptionMod.Option[A], scala.Boolean]
  ] = js.native
  def exists[A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): js.Function1[/* ma */ fpDashTsLib.es6OptionMod.Option[A], scala.Boolean] = js.native
  def fold[A, R](onNone: js.Function0[R], onSome: js.Function1[/* a */ A, R]): js.Function1[/* ma */ fpDashTsLib.es6OptionMod.Option[A], R] = js.native
  def fromEither[L, A](fa: fpDashTsLib.es6EitherMod.Either[L, A]): fpDashTsLib.es6OptionMod.Option[A] = js.native
  def fromNullable[A](): fpDashTsLib.es6OptionMod.Option[A] = js.native
  def fromNullable[A](a: A): fpDashTsLib.es6OptionMod.Option[A] = js.native
  def fromPredicate[A](predicate: fpDashTsLib.es6FunctionMod.Predicate[A]): js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_ABA[A, B /* <: A */](predicate: fpDashTsLib.es6FunctionMod.Refinement[A, B]): js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]] = js.native
  def fromRefinement[A, B /* <: A */](refinement: fpDashTsLib.es6FunctionMod.Refinement[A, B]): js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]] = js.native
  def getApplyMonoid[A](M: fpDashTsLib.es6MonoidMod.Monoid[A]): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6OptionMod.Option[A]] = js.native
  def getApplySemigroup[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6SemigroupMod.Semigroup[fpDashTsLib.es6OptionMod.Option[A]] = js.native
  def getEq[A](E: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[fpDashTsLib.es6OptionMod.Option[A]] = js.native
  def getFirstMonoid[A](): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6OptionMod.Option[A]] = js.native
  def getLastMonoid[A](): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6OptionMod.Option[A]] = js.native
  def getLeft[L, A](ma: fpDashTsLib.es6EitherMod.Either[L, A]): fpDashTsLib.es6OptionMod.Option[L] = js.native
  def getMonoid[A](S: fpDashTsLib.es6SemigroupMod.Semigroup[A]): fpDashTsLib.es6MonoidMod.Monoid[fpDashTsLib.es6OptionMod.Option[A]] = js.native
  def getOrElse[A](f: js.Function0[A]): js.Function1[/* ma */ fpDashTsLib.es6OptionMod.Option[A], A] = js.native
  def getOrd[A](O: fpDashTsLib.es6OrdMod.Ord[A]): fpDashTsLib.es6OrdMod.Ord[fpDashTsLib.es6OptionMod.Option[A]] = js.native
  def getRefinement[A, B /* <: A */](getOption: js.Function1[/* a */ A, fpDashTsLib.es6OptionMod.Option[B]]): fpDashTsLib.es6FunctionMod.Refinement[A, B] = js.native
  def getRight[L, A](ma: fpDashTsLib.es6EitherMod.Either[L, A]): fpDashTsLib.es6OptionMod.Option[A] = js.native
  def getSetoid[A](E: fpDashTsLib.es6EqMod.Eq[A]): fpDashTsLib.es6EqMod.Eq[fpDashTsLib.es6OptionMod.Option[A]] = js.native
  def getShow[A](S: fpDashTsLib.es6ShowMod.Show[A]): fpDashTsLib.es6ShowMod.Show[fpDashTsLib.es6OptionMod.Option[A]] = js.native
  def isNone[A](fa: fpDashTsLib.es6OptionMod.Option[A]): /* is fp-ts.fp-ts/es6/Option.None<A> */ scala.Boolean = js.native
  def isSome[A](fa: fpDashTsLib.es6OptionMod.Option[A]): /* is fp-ts.fp-ts/es6/Option.Some<A> */ scala.Boolean = js.native
  def mapNullable[A, B](f: js.Function1[/* a */ A, js.UndefOr[B | scala.Null]]): js.Function1[/* ma */ fpDashTsLib.es6OptionMod.Option[A], fpDashTsLib.es6OptionMod.Option[B]] = js.native
  def some[A](a: A): fpDashTsLib.es6OptionMod.Option[A] = js.native
  def toNullable[A](ma: fpDashTsLib.es6OptionMod.Option[A]): A | scala.Null = js.native
  def toUndefined[A](ma: fpDashTsLib.es6OptionMod.Option[A]): js.UndefOr[A] = js.native
  def tryCatch[A](f: fpDashTsLib.es6FunctionMod.Lazy[A]): fpDashTsLib.es6OptionMod.Option[A] = js.native
  /* static members */
  @js.native
  object None extends js.Object {
    var value: fpDashTsLib.es6OptionMod.Option[scala.Nothing] = js.native
  }
  
}

