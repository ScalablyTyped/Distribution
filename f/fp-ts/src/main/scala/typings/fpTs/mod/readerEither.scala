package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt3
import typings.fpTs.altMod.Alt3C
import typings.fpTs.applicativeMod.Applicative3
import typings.fpTs.applicativeMod.Applicative3C
import typings.fpTs.bifunctorMod.Bifunctor3
import typings.fpTs.eitherMod.Either_
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor3
import typings.fpTs.monadMod.Monad3
import typings.fpTs.monadMod.Monad3C
import typings.fpTs.monadThrowMod.MonadThrow3
import typings.fpTs.monadThrowMod.MonadThrow3C
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.readerEitherMod.ReaderEither_
import typings.fpTs.readerMod.Reader_
import typings.fpTs.semigroupMod.Semigroup
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerEither {
  
  @JSImport("fp-ts", "readerEither")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "readerEither.Alt")
  @js.native
  val Alt_ : Alt3[typings.fpTs.readerEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "readerEither.Applicative")
  @js.native
  val Applicative: Applicative3[typings.fpTs.readerEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "readerEither.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor3[typings.fpTs.readerEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "readerEither.Functor")
  @js.native
  val Functor: Functor3[typings.fpTs.readerEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "readerEither.Monad")
  @js.native
  val Monad: Monad3[typings.fpTs.readerEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "readerEither.MonadThrow")
  @js.native
  val MonadThrow: MonadThrow3[typings.fpTs.readerEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "readerEither.URI")
  @js.native
  val URI: /* "ReaderEither" */ String = js.native
  
  inline def alt[R, E, A](that: js.Function0[ReaderEither_[R, E, A]]): js.Function1[/* fa */ ReaderEither_[R, E, A], ReaderEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderEither_[R, E, A], ReaderEither_[R, E, A]]]
  
  inline def ap[R, E, A](fa: ReaderEither_[R, E, A]): js.Function1[
    /* fab */ ReaderEither_[R, E, js.Function1[/* a */ A, js.Any]], 
    ReaderEither_[R, E, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ ReaderEither_[R, E, js.Function1[/* a */ A, js.Any]], 
    ReaderEither_[R, E, js.Any]
  ]]
  
  inline def apFirst[R, E, B](fb: ReaderEither_[R, E, B]): js.Function1[/* fa */ ReaderEither_[R, E, js.Any], ReaderEither_[R, E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderEither_[R, E, js.Any], ReaderEither_[R, E, js.Any]]]
  
  inline def apS[A, N /* <: String */, R, E, B](name: Exclude[N, /* keyof A */ String], fb: ReaderEither_[R, E, B]): js.Function1[
    /* fa */ ReaderEither_[R, E, A], 
    ReaderEither_[
      R, 
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderEither_[R, E, A], 
    ReaderEither_[
      R, 
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, Q, D, B](name: Exclude[N, /* keyof A */ String], fb: ReaderEither_[Q, D, B]): js.Function1[
    /* fa */ ReaderEither_[js.Any, js.Any, A], 
    ReaderEither_[
      Q & js.Any, 
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderEither_[js.Any, js.Any, A], 
    ReaderEither_[
      Q & js.Any, 
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ]]
  
  inline def apSecond[R, E, B](fb: ReaderEither_[R, E, B]): js.Function1[/* fa */ ReaderEither_[R, E, js.Any], ReaderEither_[R, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderEither_[R, E, js.Any], ReaderEither_[R, E, B]]]
  
  inline def apW[Q, D, A](fa: ReaderEither_[Q, D, A]): js.Function1[
    /* fab */ ReaderEither_[js.Any, js.Any, js.Function1[/* a */ A, js.Any]], 
    ReaderEither_[Q & js.Any, D | js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ ReaderEither_[js.Any, js.Any, js.Function1[/* a */ A, js.Any]], 
    ReaderEither_[Q & js.Any, D | js.Any, js.Any]
  ]]
  
  inline def ask[R, E](): ReaderEither_[R, E, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")().asInstanceOf[ReaderEither_[R, E, R]]
  
  inline def asks[R, E, A](f: js.Function1[/* r */ R, A]): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(f.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ ReaderEither_[js.Any, E, A], ReaderEither_[js.Any, G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ ReaderEither_[js.Any, E, A], ReaderEither_[js.Any, G, B]]]
  
  inline def bind[N /* <: String */, A, R, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReaderEither_[R, E, B]]): js.Function1[
    /* fa */ ReaderEither_[R, E, A], 
    ReaderEither_[
      R, 
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderEither_[R, E, A], 
    ReaderEither_[
      R, 
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ ReaderEither_[js.Any, js.Any, js.Any], 
    ReaderEither_[
      js.Any, 
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ ReaderEither_[js.Any, js.Any, js.Any], 
    ReaderEither_[
      js.Any, 
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, Q, D, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReaderEither_[Q, D, B]]): js.Function1[
    /* fa */ ReaderEither_[js.Any, js.Any, A], 
    ReaderEither_[
      Q & js.Any, 
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderEither_[js.Any, js.Any, A], 
    ReaderEither_[
      Q & js.Any, 
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ]]
  
  inline def chain[R, E, A, B](f: js.Function1[/* a */ A, ReaderEither_[R, E, B]]): js.Function1[/* ma */ ReaderEither_[R, E, A], ReaderEither_[R, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, E, A], ReaderEither_[R, E, B]]]
  
  inline def chainEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ ReaderEither_[js.Any, E, A], ReaderEither_[js.Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[js.Any, E, A], ReaderEither_[js.Any, E, B]]]
  
  inline def chainEitherKW[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ ReaderEither_[js.Any, js.Any, A], ReaderEither_[js.Any, js.Any | E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[js.Any, js.Any, A], ReaderEither_[js.Any, js.Any | E, B]]]
  
  inline def chainFirst[R, E, A, B](f: js.Function1[/* a */ A, ReaderEither_[R, E, B]]): js.Function1[/* ma */ ReaderEither_[R, E, A], ReaderEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, E, A], ReaderEither_[R, E, A]]]
  
  inline def chainFirstW[R, D, A, B](f: js.Function1[/* a */ A, ReaderEither_[R, D, B]]): js.Function1[
    /* ma */ ReaderEither_[js.Any, js.Any, A], 
    ReaderEither_[js.Any & R, D | js.Any, A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ ReaderEither_[js.Any, js.Any, A], 
    ReaderEither_[js.Any & R, D | js.Any, A]
  ]]
  
  inline def chainW[R, E, A, B](f: js.Function1[/* a */ A, ReaderEither_[R, E, B]]): js.Function1[
    /* ma */ ReaderEither_[js.Any, js.Any, A], 
    ReaderEither_[js.Any & R, E | js.Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ ReaderEither_[js.Any, js.Any, A], 
    ReaderEither_[js.Any & R, E | js.Any, B]
  ]]
  
  inline def filterOrElse[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ ReaderEither_[js.Any, E, A], ReaderEither_[js.Any, E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ ReaderEither_[js.Any, E, A], ReaderEither_[js.Any, E, A]]]
  
  inline def filterOrElse_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ ReaderEither_[js.Any, E, A], ReaderEither_[js.Any, E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ ReaderEither_[js.Any, E, A], ReaderEither_[js.Any, E, B]]]
  
  inline def flatten[R, E, A](mma: ReaderEither_[R, E, ReaderEither_[R, E, A]]): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def fold[R, E, A, B](onLeft: js.Function1[/* e */ E, Reader_[R, B]], onRight: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ ReaderEither_[R, E, A], Reader_[R, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, E, A], Reader_[R, B]]]
  
  inline def fromEither[R, E, A](ma: Either_[E, A]): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def fromEitherK[E, A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, ReaderEither_[js.Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderEither_[js.Any, E, B]]]
  
  inline def fromOption[E](onNone: js.Function0[E]): js.Function1[/* ma */ Option_[js.Any], ReaderEither_[js.Any, E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[js.Any], ReaderEither_[js.Any, E, js.Any]]]
  
  inline def fromPredicate[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, ReaderEither_[js.Any, E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, ReaderEither_[js.Any, E, A]]]
  
  inline def fromPredicate_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, ReaderEither_[js.Any, E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, ReaderEither_[js.Any, E, B]]]
  
  inline def getAltReaderValidation[E](SE: Semigroup[E]): Alt3C[typings.fpTs.readerEitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAltReaderValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[Alt3C[typings.fpTs.readerEitherMod.URI, E]]
  
  inline def getApplicativeReaderValidation[E](SE: Semigroup[E]): Applicative3C[typings.fpTs.readerEitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeReaderValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[Applicative3C[typings.fpTs.readerEitherMod.URI, E]]
  
  inline def getApplyMonoid[R, E, A](M: Monoid[A]): Monoid[ReaderEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplyMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[ReaderEither_[R, E, A]]]
  
  inline def getApplySemigroup[R, E, A](S: Semigroup[A]): Semigroup[ReaderEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplySemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[ReaderEither_[R, E, A]]]
  
  inline def getOrElse[E, R, A](onLeft: js.Function1[/* e */ E, Reader_[R, A]]): js.Function1[/* ma */ ReaderEither_[R, E, A], Reader_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, E, A], Reader_[R, A]]]
  
  inline def getOrElseW[R, E, B](onLeft: js.Function1[/* e */ E, Reader_[R, B]]): js.Function1[/* ma */ ReaderEither_[js.Any, E, js.Any], Reader_[js.Any & R, B | js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[js.Any, E, js.Any], Reader_[js.Any & R, B | js.Any]]]
  
  inline def getReaderValidation[E](SE: Semigroup[E]): (Monad3C[typings.fpTs.readerEitherMod.URI, E]) & Bifunctor3[typings.fpTs.readerEitherMod.URI] & (Alt3C[typings.fpTs.readerEitherMod.URI, E]) & (MonadThrow3C[typings.fpTs.readerEitherMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[(Monad3C[typings.fpTs.readerEitherMod.URI, E]) & Bifunctor3[typings.fpTs.readerEitherMod.URI] & (Alt3C[typings.fpTs.readerEitherMod.URI, E]) & (MonadThrow3C[typings.fpTs.readerEitherMod.URI, E])]
  
  inline def getSemigroup[R, E, A](S: Semigroup[A]): Semigroup[ReaderEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[ReaderEither_[R, E, A]]]
  
  inline def left[R, E, A](e: E): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(e.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def leftReader[R, E, A](me: Reader_[R, E]): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftReader")(me.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def local[Q, R](f: js.Function1[/* f */ Q, R]): js.Function1[/* ma */ ReaderEither_[R, js.Any, js.Any], ReaderEither_[Q, js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, js.Any, js.Any], ReaderEither_[Q, js.Any, js.Any]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ ReaderEither_[js.Any, js.Any, A], ReaderEither_[js.Any, js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderEither_[js.Any, js.Any, A], ReaderEither_[js.Any, js.Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ ReaderEither_[js.Any, E, js.Any], ReaderEither_[js.Any, G, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderEither_[js.Any, E, js.Any], ReaderEither_[js.Any, G, js.Any]]]
  
  @JSImport("fp-ts", "readerEither.of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
  ] = js.native
  
  inline def orElse[E, R, M, A](onLeft: js.Function1[/* e */ E, ReaderEither_[R, M, A]]): js.Function1[/* ma */ ReaderEither_[R, E, A], ReaderEither_[R, M, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderEither_[R, E, A], ReaderEither_[R, M, A]]]
  
  @JSImport("fp-ts", "readerEither.readerEither")
  @js.native
  val readerEither: Monad3[typings.fpTs.readerEitherMod.URI] & Bifunctor3[typings.fpTs.readerEitherMod.URI] & Alt3[typings.fpTs.readerEitherMod.URI] & MonadThrow3[typings.fpTs.readerEitherMod.URI] = js.native
  
  inline def right[R, E, A](a: A): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def rightReader[R, E, A](ma: Reader_[R, A]): ReaderEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightReader")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, E, A]]
  
  inline def swap[R, E, A](ma: ReaderEither_[R, E, A]): ReaderEither_[R, A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderEither_[R, A, E]]
  
  @JSImport("fp-ts", "readerEither.throwError")
  @js.native
  val throwError: js.Function1[
    /* e */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ js.Any
  ] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
