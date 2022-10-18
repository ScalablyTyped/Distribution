package typings.fpTs.mod

import typings.fpTs.fpTsStrings.These
import typings.fpTs.libApplicativeMod.Applicative2C
import typings.fpTs.libApplyMod.Apply2C
import typings.fpTs.libBifunctorMod.Bifunctor2
import typings.fpTs.libChainMod.Chain2C
import typings.fpTs.libEqMod.Eq
import typings.fpTs.libFoldableMod.Foldable2
import typings.fpTs.libFromEitherMod.FromEither2
import typings.fpTs.libFromTheseMod.FromThese2
import typings.fpTs.libFunctionMod.Lazy
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libMonadMod.Monad2C
import typings.fpTs.libMonadThrowMod.MonadThrow2C
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libPointedMod.Pointed2
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSemigroupMod.Semigroup
import typings.fpTs.libShowMod.Show
import typings.fpTs.libTheseMod.These_
import typings.fpTs.libTraversableMod.PipeableTraverse2
import typings.fpTs.libTraversableMod.Sequence2
import typings.fpTs.libTraversableMod.Traversable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object these {
  
  @JSImport("fp-ts", "these")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "these.ApT")
  @js.native
  val ApT: These_[scala.Nothing, js.Array[Any]] = js.native
  
  @JSImport("fp-ts", "these.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts", "these.Foldable")
  @js.native
  val Foldable: Foldable2[typings.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts", "these.FromEither")
  @js.native
  val FromEither: FromEither2[typings.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts", "these.FromThese")
  @js.native
  val FromThese: FromThese2[typings.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts", "these.Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts", "these.Pointed")
  @js.native
  val Pointed: Pointed2[typings.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts", "these.Traversable")
  @js.native
  val Traversable: Traversable2[typings.fpTs.libTheseMod.URI] = js.native
  
  @JSImport("fp-ts", "these.URI")
  @js.native
  val URI: /* "These" */ String = js.native
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ These_[E, A], These_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], These_[G, B]]]
  
  inline def both[E, A](left: E, right: A): These_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("both")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[These_[E, A]]
  
  inline def elem[A](E: Eq[A]): js.Function1[/* a */ A, js.Function1[/* ma */ These_[Any, A], Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("elem")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, js.Function1[/* ma */ These_[Any, A], Boolean]]]
  
  inline def exists[A](predicate: Predicate[A]): js.Function1[/* ma */ These_[Any, A], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ These_[Any, A], Boolean]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ These_[Any, js.Function1[/* a */ A, Any]], These_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ These_[Any, js.Function1[/* a */ A, Any]], These_[Any, Any]]]
  
  inline def fold[E, A, B](
    onLeft: js.Function1[/* e */ E, B],
    onRight: js.Function1[/* a */ A, B],
    onBoth: js.Function2[/* e */ E, /* a */ A, B]
  ): js.Function1[/* fa */ These_[E, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], B]]
  
  inline def foldMap[M](M: Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ Any, M], js.Function1[/* fa */ These_[Any, Any], M]] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* a */ Any, M], js.Function1[/* fa */ These_[Any, Any], M]]]
  
  inline def foldW[E, B, A, C, D](
    onLeft: js.Function1[/* e */ E, B],
    onRight: js.Function1[/* a */ A, C],
    onBoth: js.Function2[/* e */ E, /* a */ A, D]
  ): js.Function1[/* fa */ These_[E, A], B | C | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], B | C | D]]
  
  inline def fromOption[E](onNone: Lazy[E]): js.Function1[/* fa */ Option_[Any], These_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Option_[Any], These_[E, Any]]]
  
  inline def fromOptionK[E](onNone: Lazy[E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], These_[E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], These_[E, Any]]
  ]]
  
  inline def fromOptions[E, A](fe: Option_[E], fa: Option_[A]): Option_[These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromOptions")(fe.asInstanceOf[js.Any], fa.asInstanceOf[js.Any])).asInstanceOf[Option_[These_[E, A]]]
  
  inline def fromPredicate[A, E](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* b */ A, These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ A, These_[E, A]]]
  
  inline def fromPredicate_ABE[A, B /* <: A */, E](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, These_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, These_[E, B]]]
  
  inline def getApplicative[E](S: Semigroup[E]): Applicative2C[typings.fpTs.libTheseMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicative")(S.asInstanceOf[js.Any]).asInstanceOf[Applicative2C[typings.fpTs.libTheseMod.URI, E]]
  
  inline def getApply[E](S: Semigroup[E]): Apply2C[These, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApply")(S.asInstanceOf[js.Any]).asInstanceOf[Apply2C[These, E]]
  
  inline def getChain[E](S: Semigroup[E]): Chain2C[typings.fpTs.libTheseMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChain")(S.asInstanceOf[js.Any]).asInstanceOf[Chain2C[typings.fpTs.libTheseMod.URI, E]]
  
  inline def getEq[E, A](EE: Eq[E], EA: Eq[A]): Eq[These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEq")(EE.asInstanceOf[js.Any], EA.asInstanceOf[js.Any])).asInstanceOf[Eq[These_[E, A]]]
  
  inline def getLeft[E, A](fa: These_[E, A]): Option_[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeft")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[E]]
  
  inline def getLeftOnly[E, A](fa: These_[E, A]): Option_[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeftOnly")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[E]]
  
  inline def getMonad[E](S: Semigroup[E]): (Monad2C[typings.fpTs.libTheseMod.URI, E]) & (MonadThrow2C[typings.fpTs.libTheseMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonad")(S.asInstanceOf[js.Any]).asInstanceOf[(Monad2C[typings.fpTs.libTheseMod.URI, E]) & (MonadThrow2C[typings.fpTs.libTheseMod.URI, E])]
  
  inline def getRight[E, A](fa: These_[E, A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRight")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def getRightOnly[E, A](fa: These_[E, A]): Option_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRightOnly")(fa.asInstanceOf[js.Any]).asInstanceOf[Option_[A]]
  
  inline def getSemigroup[E, A](SE: Semigroup[E], SA: Semigroup[A]): Semigroup[These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Semigroup[These_[E, A]]]
  
  inline def getShow[E, A](SE: Show[E], SA: Show[A]): Show[These_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getShow")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Show[These_[E, A]]]
  
  inline def isBoth[E, A](fa: These_[E, A]): /* is fp-ts.fp-ts/lib/These.Both<E, A> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoth")(fa.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/These.Both<E, A> */ Boolean]
  
  inline def isLeft[E](fa: These_[E, Any]): /* is fp-ts.fp-ts/lib/Either.Left<E> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeft")(fa.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Either.Left<E> */ Boolean]
  
  inline def isRight[A](fa: These_[Any, A]): /* is fp-ts.fp-ts/lib/Either.Right<A> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRight")(fa.asInstanceOf[js.Any]).asInstanceOf[/* is fp-ts.fp-ts/lib/Either.Right<A> */ Boolean]
  
  inline def left[E, A](left: E): These_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(left.asInstanceOf[js.Any]).asInstanceOf[These_[E, A]]
  
  inline def leftOrBoth[E](e: E): js.Function1[/* ma */ Option_[Any], These_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftOrBoth")(e.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[Any], These_[E, Any]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ These_[Any, A], These_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ These_[Any, A], These_[Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ These_[E, Any], These_[G, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ These_[E, Any], These_[G, Any]]]
  
  inline def `match`[E, A, B](
    onLeft: js.Function1[/* e */ E, B],
    onRight: js.Function1[/* a */ A, B],
    onBoth: js.Function2[/* e */ E, /* a */ A, B]
  ): js.Function1[/* fa */ These_[E, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], B]]
  
  inline def matchW[E, B, A, C, D](
    onLeft: js.Function1[/* e */ E, B],
    onRight: js.Function1[/* a */ A, C],
    onBoth: js.Function2[/* e */ E, /* a */ A, D]
  ): js.Function1[/* fa */ These_[E, A], B | C | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], B | C | D]]
  
  inline def of[E, A](right: A): These_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(right.asInstanceOf[js.Any]).asInstanceOf[These_[E, A]]
  
  inline def reduce[A, B](b: B, f: js.Function2[/* b */ B, /* a */ A, B]): js.Function1[/* fa */ These_[Any, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[Any, A], B]]
  
  inline def reduceRight[A, B](b: B, f: js.Function2[/* a */ A, /* b */ B, B]): js.Function1[/* fa */ These_[Any, A], B] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(b.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[Any, A], B]]
  
  inline def right[E, A](right: A): These_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(right.asInstanceOf[js.Any]).asInstanceOf[These_[E, A]]
  
  inline def rightOrBoth[A](a: A): js.Function1[/* me */ Option_[Any], These_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightOrBoth")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* me */ Option_[Any], These_[Any, A]]]
  
  @JSImport("fp-ts", "these.sequence")
  @js.native
  val sequence: Sequence2[typings.fpTs.libTheseMod.URI] = js.native
  
  inline def swap[E, A](fa: These_[E, A]): These_[A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(fa.asInstanceOf[js.Any]).asInstanceOf[These_[A, E]]
  
  @JSImport("fp-ts", "these.these")
  @js.native
  val these: Functor2[typings.fpTs.libTheseMod.URI] & Bifunctor2[typings.fpTs.libTheseMod.URI] & Foldable2[typings.fpTs.libTheseMod.URI] & Traversable2[typings.fpTs.libTheseMod.URI] = js.native
  
  inline def toTuple[E, A](e: E, a: A): js.Function1[/* fa */ These_[E, A], js.Tuple2[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTuple")(e.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], js.Tuple2[E, A]]]
  
  inline def toTuple2[E, A](e: Lazy[E], a: Lazy[A]): js.Function1[/* fa */ These_[E, A], js.Tuple2[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(e.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ These_[E, A], js.Tuple2[E, A]]]
  
  @JSImport("fp-ts", "these.traverse")
  @js.native
  val traverse: PipeableTraverse2[typings.fpTs.libTheseMod.URI] = js.native
  
  inline def traverseReadonlyArrayWithIndex[E](S: Semigroup[E]): js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, These_[E, Any]], 
    js.Function1[/* as */ js.Array[Any], These_[E, js.Array[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, These_[E, Any]], 
    js.Function1[/* as */ js.Array[Any], These_[E, js.Array[Any]]]
  ]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[E](S: Semigroup[E]): js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, These_[E, Any]], 
    js.Function1[/* as */ ReadonlyNonEmptyArray_[Any], These_[E, ReadonlyNonEmptyArray_[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, These_[E, Any]], 
    js.Function1[/* as */ ReadonlyNonEmptyArray_[Any], These_[E, ReadonlyNonEmptyArray_[Any]]]
  ]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
}
