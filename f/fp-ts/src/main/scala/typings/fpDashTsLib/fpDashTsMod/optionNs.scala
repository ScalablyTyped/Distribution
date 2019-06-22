package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "option")
@js.native
object optionNs extends js.Object {
  @js.native
  class None[A] protected ()
    extends fpDashTsLib.libOptionMod.None[A]
  
  @js.native
  class Some[A] protected ()
    extends fpDashTsLib.libOptionMod.Some[A] {
    def this(value: A) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Option = js.native
  val none: fpDashTsLib.libOptionMod.Option[scala.Nothing] = js.native
  val option: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libPlusMod.Plus1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libAlternativeMod.Alternative1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libExtendMod.Extend1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libCompactableMod.Compactable1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libFilterableMod.Filterable1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libWitherableMod.Witherable1[fpDashTsLib.libOptionMod.URI] with fpDashTsLib.libMonadThrowMod.MonadThrow1[fpDashTsLib.libOptionMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(ap, apFirst, apSecond, chain, chainFirst, duplicate, extend, filter, filterMap, flatten, foldMap, map, partition, partitionMap, reduce, reduceRight, compact, separate) */ def alt[A](that: js.Function0[fpDashTsLib.libOptionMod.Option[A]]): js.Function1[/* fa */ fpDashTsLib.libOptionMod.Option[A], fpDashTsLib.libOptionMod.Option[A]] = js.native
  def elem[A](E: fpDashTsLib.libEqMod.Eq[A]): js.Function1[
    /* a */ A, 
    js.Function1[/* ma */ fpDashTsLib.libOptionMod.Option[A], scala.Boolean]
  ] = js.native
  def exists[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[/* ma */ fpDashTsLib.libOptionMod.Option[A], scala.Boolean] = js.native
  def fold[A, R](onNone: js.Function0[R], onSome: js.Function1[/* a */ A, R]): js.Function1[/* ma */ fpDashTsLib.libOptionMod.Option[A], R] = js.native
  def fromEither[L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def fromNullable[A](): fpDashTsLib.libOptionMod.Option[A] = js.native
  def fromNullable[A](a: A): fpDashTsLib.libOptionMod.Option[A] = js.native
  def fromPredicate[A](predicate: fpDashTsLib.libFunctionMod.Predicate[A]): js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[A]] = js.native
  @JSName("fromPredicate")
  def fromPredicate_ABA[A, B /* <: A */](predicate: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]] = js.native
  def fromRefinement[A, B /* <: A */](refinement: fpDashTsLib.libFunctionMod.Refinement[A, B]): js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]] = js.native
  def getApplyMonoid[A](M: fpDashTsLib.libMonoidMod.Monoid[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getApplySemigroup[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getEq[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getFirstMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getLastMonoid[A](): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getLeft[L, A](ma: fpDashTsLib.libEitherMod.Either[L, A]): fpDashTsLib.libOptionMod.Option[L] = js.native
  def getMonoid[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getOrElse[A](f: js.Function0[A]): js.Function1[/* ma */ fpDashTsLib.libOptionMod.Option[A], A] = js.native
  def getOrd[A](O: fpDashTsLib.libOrdMod.Ord[A]): fpDashTsLib.libOrdMod.Ord[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getRefinement[A, B /* <: A */](getOption: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]): fpDashTsLib.libFunctionMod.Refinement[A, B] = js.native
  def getRight[L, A](ma: fpDashTsLib.libEitherMod.Either[L, A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def getSetoid[A](E: fpDashTsLib.libEqMod.Eq[A]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def getShow[A](S: fpDashTsLib.libShowMod.Show[A]): fpDashTsLib.libShowMod.Show[fpDashTsLib.libOptionMod.Option[A]] = js.native
  def isNone[A](fa: fpDashTsLib.libOptionMod.Option[A]): /* is fp-ts.fp-ts/lib/Option.None<A> */ scala.Boolean = js.native
  def isSome[A](fa: fpDashTsLib.libOptionMod.Option[A]): /* is fp-ts.fp-ts/lib/Option.Some<A> */ scala.Boolean = js.native
  def mapNullable[A, B](f: js.Function1[/* a */ A, js.UndefOr[B | scala.Null]]): js.Function1[/* ma */ fpDashTsLib.libOptionMod.Option[A], fpDashTsLib.libOptionMod.Option[B]] = js.native
  def some[A](a: A): fpDashTsLib.libOptionMod.Option[A] = js.native
  def toNullable[A](ma: fpDashTsLib.libOptionMod.Option[A]): A | scala.Null = js.native
  def toUndefined[A](ma: fpDashTsLib.libOptionMod.Option[A]): js.UndefOr[A] = js.native
  def tryCatch[A](f: fpDashTsLib.libFunctionMod.Lazy[A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  /* static members */
  @js.native
  object None extends js.Object {
    var value: fpDashTsLib.libOptionMod.Option[scala.Nothing] = js.native
  }
  
}

