package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt1
import typings.fpTs.alternativeMod.Alternative1
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.applyMod.Apply1
import typings.fpTs.chainMod.Chain1
import typings.fpTs.compactableMod.Compactable1
import typings.fpTs.eitherMod.Either_
import typings.fpTs.filterableMod.Filterable1
import typings.fpTs.fromEitherMod.FromEither1
import typings.fpTs.fromIOMod.FromIO1
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functorMod.Functor1
import typings.fpTs.iOMod.IO_
import typings.fpTs.iooptionMod.IOOption
import typings.fpTs.iooptionMod.URI
import typings.fpTs.monadIOMod.MonadIO1
import typings.fpTs.monadMod.Monad1
import typings.fpTs.naturalTransformationMod.NaturalTransformation11
import typings.fpTs.naturalTransformationMod.NaturalTransformation21
import typings.fpTs.optionMod.Option_
import typings.fpTs.pointedMod.Pointed1
import typings.fpTs.predicateMod.Predicate
import typings.fpTs.readonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.refinementMod.Refinement
import typings.fpTs.separatedMod.Separated_
import typings.fpTs.zeroMod.Zero1
import typings.std.Exclude
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioOption {
  
  @JSImport("fp-ts", "ioOption")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "ioOption.Alt")
  @js.native
  val Alt_ : Alt1[URI] = js.native
  
  @JSImport("fp-ts", "ioOption.Alternative")
  @js.native
  val Alternative: Alternative1[URI] = js.native
  
  @JSImport("fp-ts", "ioOption.ApT")
  @js.native
  val ApT: IOOption[js.Array[Any]] = js.native
  
  @JSImport("fp-ts", "ioOption.Applicative")
  @js.native
  val Applicative: Applicative1[URI] = js.native
  
  @JSImport("fp-ts", "ioOption.Apply")
  @js.native
  val Apply: Apply1[URI] = js.native
  
  @JSImport("fp-ts", "ioOption.Chain")
  @js.native
  val Chain_ : Chain1[URI] = js.native
  
  @JSImport("fp-ts", "ioOption.Compactable")
  @js.native
  val Compactable: Compactable1[URI] = js.native
  
  @JSImport("fp-ts", "ioOption.Do")
  @js.native
  val Do: IOOption[js.Object] = js.native
  
  @JSImport("fp-ts", "ioOption.Filterable")
  @js.native
  val Filterable: Filterable1[URI] = js.native
  
  @JSImport("fp-ts", "ioOption.FromEither")
  @js.native
  val FromEither_ : FromEither1[URI] = js.native
  
  @JSImport("fp-ts", "ioOption.FromIO")
  @js.native
  val FromIO_ : FromIO1[URI] = js.native
  
  @JSImport("fp-ts", "ioOption.Functor")
  @js.native
  val Functor: Functor1[URI] = js.native
  
  @JSImport("fp-ts", "ioOption.Monad")
  @js.native
  val Monad: Monad1[URI] = js.native
  
  @JSImport("fp-ts", "ioOption.MonadIO")
  @js.native
  val MonadIO: MonadIO1[URI] = js.native
  
  @JSImport("fp-ts", "ioOption.Pointed")
  @js.native
  val Pointed: Pointed1[URI] = js.native
  
  @JSImport("fp-ts", "ioOption.Zero")
  @js.native
  val Zero_ : Zero1[URI] = js.native
  
  inline def alt[A](second: Lazy[IOOption[A]]): js.Function1[/* first */ IOOption[A], IOOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOOption[A], IOOption[A]]]
  
  inline def altW[B](second: Lazy[IOOption[B]]): js.Function1[/* first */ IOOption[Any], IOOption[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("altW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOOption[Any], IOOption[Any | B]]]
  
  inline def ap[A](fa: IOOption[A]): js.Function1[/* fab */ IOOption[js.Function1[/* a */ A, Any]], IOOption[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ IOOption[js.Function1[/* a */ A, Any]], IOOption[Any]]]
  
  inline def apFirst[B](second: IOOption[B]): js.Function1[/* first */ IOOption[Any], IOOption[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOOption[Any], IOOption[Any]]]
  
  inline def apS[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], fb: IOOption[B]): js.Function1[
    /* fa */ IOOption[A], 
    IOOption[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IOOption[A], 
    IOOption[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  inline def apSecond[B](second: IOOption[B]): js.Function1[/* first */ IOOption[Any], IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ IOOption[Any], IOOption[B]]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, IOOption[B]]): js.Function1[
    /* ma */ IOOption[A], 
    IOOption[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ IOOption[A], 
    IOOption[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ IOOption[Any], 
    IOOption[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ IOOption[Any], 
    IOOption[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[Any]
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
  
  @JSImport("fp-ts", "ioOption.compact")
  @js.native
  val compact: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ] = js.native
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* fb */ IOOption[A], IOOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ IOOption[A], IOOption[A]]]
  
  inline def filterMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* fga */ IOOption[A], IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fga */ IOOption[A], IOOption[B]]]
  
  inline def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fb */ IOOption[A], IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ IOOption[A], IOOption[B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ IOOption[js.Function1[/* a */ A, Any]], IOOption[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ IOOption[js.Function1[/* a */ A, Any]], IOOption[Any]]]
  
  inline def flatten[A](mma: IOOption[IOOption[A]]): IOOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[IOOption[A]]
  
  inline def fold[B, A](onNone: js.Function0[IO_[B]], onSome: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ IOOption[A], IO_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOOption[A], IO_[B]]]
  
  @JSImport("fp-ts", "ioOption.fromEither")
  @js.native
  val fromEither: NaturalTransformation21[typings.fpTs.eitherMod.URI, URI] = js.native
  
  inline def fromEitherK[E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, IOOption[B]]]
  
  @JSImport("fp-ts", "ioOption.fromIO")
  @js.native
  val fromIO: NaturalTransformation11[typings.fpTs.iOMod.URI, URI] = js.native
  
  @JSImport("fp-ts", "ioOption.fromIOEither")
  @js.native
  val fromIOEither: NaturalTransformation21[typings.fpTs.ioeitherMod.URI, URI] = js.native
  
  inline def fromIOK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, IOOption[B]]]
  
  inline def fromNullable[A](a: A): IOOption[NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(a.asInstanceOf[js.Any]).asInstanceOf[IOOption[NonNullable[A]]]
  
  inline def fromNullableK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, js.UndefOr[B | Null]]): js.Function1[/* a */ A, IOOption[NonNullable[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, IOOption[NonNullable[B]]]]
  
  @JSImport("fp-ts", "ioOption.fromOption")
  @js.native
  val fromOption: NaturalTransformation11[typings.fpTs.optionMod.URI, URI] = js.native
  
  inline def fromOptionK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* a */ A, IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, IOOption[B]]]
  
  inline def fromPredicate[A](predicate: Predicate[A]): js.Function1[/* b */ A, IOOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ A, IOOption[A]]]
  
  inline def fromPredicate_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* a */ A, IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, IOOption[B]]]
  
  inline def getOrElse[A](onNone: Lazy[IO_[A]]): js.Function1[/* fa */ IOOption[A], IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOOption[A], IO_[A]]]
  
  inline def getOrElseW[B](onNone: Lazy[IO_[B]]): js.Function1[/* ma */ IOOption[Any], IO_[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOOption[Any], IO_[Any | B]]]
  
  inline def guard(b: Boolean): IOOption[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("guard")(b.asInstanceOf[js.Any]).asInstanceOf[IOOption[Unit]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ IOOption[A], IOOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOOption[A], IOOption[B]]]
  
  inline def `match`[B, A](onNone: js.Function0[B], onSome: js.Function1[/* a */ A, B]): js.Function1[/* ma */ IOOption[A], IO_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOOption[A], IO_[B]]]
  
  inline def matchE[B, A](onNone: js.Function0[IO_[B]], onSome: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ IOOption[A], IO_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOOption[A], IO_[B]]]
  
  inline def matchEW[B, C, A](onNone: js.Function0[IO_[B]], onSome: js.Function1[/* a */ A, IO_[C]]): js.Function1[/* ma */ IOOption[A], IO_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchEW")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOOption[A], IO_[B | C]]]
  
  inline def matchW[B, A, C](onNone: js.Function0[B], onSome: js.Function1[/* a */ A, C]): js.Function1[/* ma */ IOOption[A], IO_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOOption[A], IO_[B | C]]]
  
  @JSImport("fp-ts", "ioOption.none")
  @js.native
  val none: IOOption[scala.Nothing] = js.native
  
  @JSImport("fp-ts", "ioOption.of")
  @js.native
  val of: js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ] = js.native
  
  inline def partition[A](predicate: Predicate[A]): js.Function1[/* fb */ IOOption[A], Separated_[IOOption[A], IOOption[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ IOOption[A], Separated_[IOOption[A], IOOption[A]]]]
  
  inline def partitionMap[A, B, C](f: js.Function1[/* a */ A, Either_[B, C]]): js.Function1[/* fa */ IOOption[A], Separated_[IOOption[B], IOOption[C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOOption[A], Separated_[IOOption[B], IOOption[C]]]]
  
  inline def partition_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fb */ IOOption[A], Separated_[IOOption[A], IOOption[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ IOOption[A], Separated_[IOOption[A], IOOption[B]]]]
  
  @JSImport("fp-ts", "ioOption.separate")
  @js.native
  val separate: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<A, B>> */ /* fa */ Any, 
    Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ]
  ] = js.native
  
  inline def some[A](a: A): IOOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(a.asInstanceOf[js.Any]).asInstanceOf[IOOption[A]]
  
  inline def toNullable[A](ma: IOOption[A]): IO_[A | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("toNullable")(ma.asInstanceOf[js.Any]).asInstanceOf[IO_[A | Null]]
  
  inline def toUndefined[A](ma: IOOption[A]): IO_[js.UndefOr[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUndefined")(ma.asInstanceOf[js.Any]).asInstanceOf[IO_[js.UndefOr[A]]]
  
  inline def traverseReadonlyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, IOOption[B]]): js.Function1[/* as */ js.Array[A], IOOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], IOOption[js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, IOOption[B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], IOOption[ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], IOOption[ReadonlyNonEmptyArray_[B]]]]
  
  @JSImport("fp-ts", "ioOption.zero")
  @js.native
  val zero: js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
