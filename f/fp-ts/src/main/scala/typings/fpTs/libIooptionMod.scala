package typings.fpTs

import typings.fpTs.libAltMod.Alt1
import typings.fpTs.libAlternativeMod.Alternative1
import typings.fpTs.libApplicativeMod.Applicative1
import typings.fpTs.libApplyMod.Apply1
import typings.fpTs.libChainMod.Chain1
import typings.fpTs.libCompactableMod.Compactable1
import typings.fpTs.libEitherMod.Either_
import typings.fpTs.libFilterableMod.Filterable1
import typings.fpTs.libFromEitherMod.FromEither1
import typings.fpTs.libFromIOMod.FromIO1
import typings.fpTs.libFunctionMod.LazyArg
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libIOMod.IO_
import typings.fpTs.libIoeitherMod.IOEither_
import typings.fpTs.libMonadIOMod.MonadIO1
import typings.fpTs.libMonadMod.Monad1
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libPointedMod.Pointed1
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSeparatedMod.Separated_
import typings.fpTs.libZeroMod.Zero1
import typings.std.Exclude
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIooptionMod {
  
  @JSImport("fp-ts/lib/IOOption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/IOOption", "Alt")
  @js.native
  val Alt_ : Alt1[typings.fpTs.libIooptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "Alternative")
  @js.native
  val Alternative: Alternative1[typings.fpTs.libIooptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "ApT")
  @js.native
  val ApT: IOOption[js.Array[Any]] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "Applicative")
  @js.native
  val Applicative: Applicative1[typings.fpTs.libIooptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "Apply")
  @js.native
  val Apply: Apply1[typings.fpTs.libIooptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "Chain")
  @js.native
  val Chain_ : Chain1[typings.fpTs.libIooptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "Compactable")
  @js.native
  val Compactable: Compactable1[typings.fpTs.libIooptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "Do")
  @js.native
  val Do: IOOption[js.Object] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "Filterable")
  @js.native
  val Filterable: Filterable1[typings.fpTs.libIooptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "FromEither")
  @js.native
  val FromEither_ : FromEither1[typings.fpTs.libIooptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "FromIO")
  @js.native
  val FromIO_ : FromIO1[typings.fpTs.libIooptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.libIooptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "Monad")
  @js.native
  val Monad: Monad1[typings.fpTs.libIooptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "MonadIO")
  @js.native
  val MonadIO: MonadIO1[typings.fpTs.libIooptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "Pointed")
  @js.native
  val Pointed: Pointed1[typings.fpTs.libIooptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/IOOption", "URI")
  @js.native
  val URI: /* "IOOption" */ String = js.native
  type URI = /* "IOOption" */ String
  
  @JSImport("fp-ts/lib/IOOption", "Zero")
  @js.native
  val Zero_ : Zero1[typings.fpTs.libIooptionMod.URI] = js.native
  
  inline def alt[A](second: LazyArg[IOOption[A]]): js.Function1[/* first */ IOOption[A], IOOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOOption[A], IOOption[A]]]
  
  inline def altW[B](second: LazyArg[IOOption[B]]): js.Function1[/* first */ IOOption[Any], IOOption[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("altW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOOption[Any], IOOption[Any | B]]]
  
  inline def ap[A](fa: IOOption[A]): js.Function1[/* fab */ IOOption[js.Function1[/* a */ A, Any]], IOOption[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ IOOption[js.Function1[/* a */ A, Any]], IOOption[Any]]]
  
  inline def apFirst[B](second: IOOption[B]): js.Function1[/* first */ IOOption[Any], IOOption[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOOption[Any], IOOption[Any]]]
  
  inline def apS[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], fb: IOOption[B]): js.Function1[
    /* fa */ IOOption[A], 
    IOOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IOOption[A], 
    IOOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[B](second: IOOption[B]): js.Function1[/* first */ IOOption[Any], IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOOption[Any], IOOption[B]]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, IOOption[B]]): js.Function1[
    /* ma */ IOOption[A], 
    IOOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ IOOption[A], 
    IOOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ IOOption[Any], 
    IOOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ IOOption[Any], 
    IOOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def chain[A, B](f: js.Function1[/* a */ A, IOOption[B]]): js.Function1[/* ma */ IOOption[A], IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOOption[A], IOOption[B]]]
  
  inline def chainEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ IOOption[A], IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOOption[A], IOOption[B]]]
  
  inline def chainFirst[A, B](f: js.Function1[/* a */ A, IOOption[B]]): js.Function1[/* first */ IOOption[A], IOOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOOption[A], IOOption[A]]]
  
  inline def chainFirstEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ IOOption[A], IOOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOOption[A], IOOption[A]]]
  
  inline def chainFirstIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ IOOption[A], IOOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOOption[A], IOOption[A]]]
  
  inline def chainIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ IOOption[A], IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOOption[A], IOOption[B]]]
  
  inline def chainNullableK[A, B](f: js.Function1[/* a */ A, js.UndefOr[B | Null]]): js.Function1[/* ma */ IOOption[A], IOOption[NonNullable[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOOption[A], IOOption[NonNullable[B]]]]
  
  inline def chainOptionK[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* ma */ IOOption[A], IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOOption[A], IOOption[B]]]
  
  @JSImport("fp-ts/lib/IOOption", "compact")
  @js.native
  val compact: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ] = js.native
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* fb */ IOOption[A], IOOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ IOOption[A], IOOption[A]]]
  
  inline def filterMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* fga */ IOOption[A], IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fga */ IOOption[A], IOOption[B]]]
  
  inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fb */ IOOption[A], IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ IOOption[A], IOOption[B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ IOOption[js.Function1[/* a */ A, Any]], IOOption[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ IOOption[js.Function1[/* a */ A, Any]], IOOption[Any]]]
  
  inline def flatMap[A, B](f: js.Function1[/* a */ A, IOOption[B]]): js.Function1[/* ma */ IOOption[A], IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOOption[A], IOOption[B]]]
  inline def flatMap[A, B](ma: IOOption[A], f: js.Function1[/* a */ A, IOOption[B]]): IOOption[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(ma.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[IOOption[B]]
  
  inline def flatten[A](mma: IOOption[IOOption[A]]): IOOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[IOOption[A]]
  
  inline def fold[B, A](onNone: js.Function0[IO_[B]], onSome: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ IOOption[A], IO_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOOption[A], IO_[B]]]
  
  inline def fromEither[A](fa: Either_[Any, A]): IOOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(fa.asInstanceOf[js.Any]).asInstanceOf[IOOption[A]]
  
  inline def fromEitherK[E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, IOOption[B]]]
  
  inline def fromIO[A](fa: IO_[A]): IOOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIO")(fa.asInstanceOf[js.Any]).asInstanceOf[IOOption[A]]
  
  inline def fromIOEither[A](fa: IOEither_[Any, A]): IOOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOEither")(fa.asInstanceOf[js.Any]).asInstanceOf[IOOption[A]]
  
  inline def fromIOK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, IOOption[B]]]
  
  inline def fromNullable[A](a: A): IOOption[NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(a.asInstanceOf[js.Any]).asInstanceOf[IOOption[NonNullable[A]]]
  
  inline def fromNullableK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, js.UndefOr[B | Null]]): js.Function1[/* a */ A, IOOption[NonNullable[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, IOOption[NonNullable[B]]]]
  
  inline def fromOption[A](fa: Option_[A]): IOOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(fa.asInstanceOf[js.Any]).asInstanceOf[IOOption[A]]
  
  inline def fromOptionK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* a */ A, IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, IOOption[B]]]
  
  inline def fromPredicate[A](predicate: Predicate[A]): js.Function1[/* b */ A, IOOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ A, IOOption[A]]]
  
  inline def fromPredicate_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* a */ A, IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, IOOption[B]]]
  
  inline def getOrElse[A](onNone: LazyArg[IO_[A]]): js.Function1[/* fa */ IOOption[A], IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOOption[A], IO_[A]]]
  
  inline def getOrElseW[B](onNone: LazyArg[IO_[B]]): js.Function1[/* ma */ IOOption[Any], IO_[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOOption[Any], IO_[Any | B]]]
  
  inline def guard(b: Boolean): IOOption[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("guard")(b.asInstanceOf[js.Any]).asInstanceOf[IOOption[Unit]]
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ IOOption[A], 
    IOOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IOOption[A], 
    IOOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ IOOption[A], IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOOption[A], IOOption[B]]]
  
  inline def `match`[B, A](onNone: js.Function0[B], onSome: js.Function1[/* a */ A, B]): js.Function1[/* ma */ IOOption[A], IO_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOOption[A], IO_[B]]]
  
  inline def matchE[B, A](onNone: js.Function0[IO_[B]], onSome: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ IOOption[A], IO_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOOption[A], IO_[B]]]
  
  inline def matchEW[B, C, A](onNone: js.Function0[IO_[B]], onSome: js.Function1[/* a */ A, IO_[C]]): js.Function1[/* ma */ IOOption[A], IO_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchEW")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOOption[A], IO_[B | C]]]
  
  inline def matchW[B, A, C](onNone: js.Function0[B], onSome: js.Function1[/* a */ A, C]): js.Function1[/* ma */ IOOption[A], IO_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOOption[A], IO_[B | C]]]
  
  @JSImport("fp-ts/lib/IOOption", "none")
  @js.native
  val none: IOOption[scala.Nothing] = js.native
  
  inline def of[A](a: A): IOOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[IOOption[A]]
  
  inline def partition[A](predicate: Predicate[A]): js.Function1[/* fb */ IOOption[A], Separated_[IOOption[A], IOOption[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ IOOption[A], Separated_[IOOption[A], IOOption[A]]]]
  
  inline def partitionMap[A, B, C](f: js.Function1[/* a */ A, Either_[B, C]]): js.Function1[/* fa */ IOOption[A], Separated_[IOOption[B], IOOption[C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOOption[A], Separated_[IOOption[B], IOOption[C]]]]
  
  inline def partition_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fb */ IOOption[A], Separated_[IOOption[A], IOOption[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ IOOption[A], Separated_[IOOption[A], IOOption[B]]]]
  
  @JSImport("fp-ts/lib/IOOption", "separate")
  @js.native
  val separate: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<A, B>> */ /* fa */ Any, 
    Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ]
  ] = js.native
  
  inline def some[A](a: A): IOOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(a.asInstanceOf[js.Any]).asInstanceOf[IOOption[A]]
  
  inline def tap[A, _underscore](f: js.Function1[/* a */ A, IOOption[_underscore]]): js.Function1[/* self */ IOOption[A], IOOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* self */ IOOption[A], IOOption[A]]]
  inline def tap[A, _underscore](self: IOOption[A], f: js.Function1[/* a */ A, IOOption[_underscore]]): IOOption[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[IOOption[A]]
  
  inline def toNullable[A](ma: IOOption[A]): IO_[A | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("toNullable")(ma.asInstanceOf[js.Any]).asInstanceOf[IO_[A | Null]]
  
  inline def toUndefined[A](ma: IOOption[A]): IO_[js.UndefOr[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUndefined")(ma.asInstanceOf[js.Any]).asInstanceOf[IO_[js.UndefOr[A]]]
  
  inline def traverseReadonlyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, IOOption[B]]): js.Function1[/* as */ js.Array[A], IOOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IOOption[js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, IOOption[B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], IOOption[ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], IOOption[ReadonlyNonEmptyArray_[B]]]]
  
  inline def zero[A](): IOOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[IOOption[A]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  type IOOption[A] = IO_[Option_[A]]
}
