package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt2
import typings.fpTs.altMod.Alt2C
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.bifunctorMod.Bifunctor2
import typings.fpTs.eitherMod.Either_
import typings.fpTs.filterableMod.Filterable2C
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor2
import typings.fpTs.iOMod.IO_
import typings.fpTs.ioeitherMod.IOEither_
import typings.fpTs.monadIOMod.MonadIO2
import typings.fpTs.monadIOMod.MonadIO2C
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadThrowMod.MonadThrow2
import typings.fpTs.monadThrowMod.MonadThrow2C
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.semigroupMod.Semigroup
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioEither {
  
  @JSImport("fp-ts", "ioEither")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "ioEither.Alt")
  @js.native
  val Alt_ : Alt2[typings.fpTs.ioeitherMod.URI] = js.native
  
  @JSImport("fp-ts", "ioEither.Applicative")
  @js.native
  val Applicative: Applicative2[typings.fpTs.ioeitherMod.URI] = js.native
  
  @JSImport("fp-ts", "ioEither.ApplicativePar")
  @js.native
  val ApplicativePar: Applicative2[typings.fpTs.ioeitherMod.URI] = js.native
  
  @JSImport("fp-ts", "ioEither.ApplicativeSeq")
  @js.native
  val ApplicativeSeq: Applicative2[typings.fpTs.ioeitherMod.URI] = js.native
  
  @JSImport("fp-ts", "ioEither.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.ioeitherMod.URI] = js.native
  
  @JSImport("fp-ts", "ioEither.Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.ioeitherMod.URI] = js.native
  
  @JSImport("fp-ts", "ioEither.Monad")
  @js.native
  val Monad: Monad2[typings.fpTs.ioeitherMod.URI] = js.native
  
  @JSImport("fp-ts", "ioEither.MonadIO")
  @js.native
  val MonadIO: MonadIO2[typings.fpTs.ioeitherMod.URI] = js.native
  
  @JSImport("fp-ts", "ioEither.MonadThrow")
  @js.native
  val MonadThrow: MonadThrow2[typings.fpTs.ioeitherMod.URI] = js.native
  
  @JSImport("fp-ts", "ioEither.URI")
  @js.native
  val URI: /* "IOEither" */ String = js.native
  
  inline def alt[E, A](that: Lazy[IOEither_[E, A]]): js.Function1[/* fa */ IOEither_[E, A], IOEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOEither_[E, A], IOEither_[E, A]]]
  
  inline def ap[E, A](fa: IOEither_[E, A]): js.Function1[/* fab */ IOEither_[E, js.Function1[/* a */ A, js.Any]], IOEither_[E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ IOEither_[E, js.Function1[/* a */ A, js.Any]], IOEither_[E, js.Any]]]
  
  inline def apFirst[E, B](fb: IOEither_[E, B]): js.Function1[/* fa */ IOEither_[E, js.Any], IOEither_[E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOEither_[E, js.Any], IOEither_[E, js.Any]]]
  
  inline def apS[A, N /* <: String */, E, B](name: Exclude[N, /* keyof A */ String], fb: IOEither_[E, B]): js.Function1[
    /* fa */ IOEither_[E, A], 
    IOEither_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IOEither_[E, A], 
    IOEither_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, D, B](name: Exclude[N, /* keyof A */ String], fb: IOEither_[D, B]): js.Function1[
    /* fa */ IOEither_[js.Any, A], 
    IOEither_[
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IOEither_[js.Any, A], 
    IOEither_[
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ]]
  
  inline def apSecond[E, B](fb: IOEither_[E, B]): js.Function1[/* fa */ IOEither_[E, js.Any], IOEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOEither_[E, js.Any], IOEither_[E, B]]]
  
  inline def apW[D, A](fa: IOEither_[D, A]): js.Function1[
    /* fab */ IOEither_[js.Any, js.Function1[/* a */ A, js.Any]], 
    IOEither_[D | js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ IOEither_[js.Any, js.Function1[/* a */ A, js.Any]], 
    IOEither_[D | js.Any, js.Any]
  ]]
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ IOEither_[E, A], IOEither_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ IOEither_[E, A], IOEither_[G, B]]]
  
  inline def bind[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[
    /* fa */ IOEither_[E, A], 
    IOEither_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IOEither_[E, A], 
    IOEither_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ IOEither_[js.Any, js.Any], 
    IOEither_[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ IOEither_[js.Any, js.Any], 
    IOEither_[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, D, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, IOEither_[D, B]]): js.Function1[
    /* fa */ IOEither_[js.Any, A], 
    IOEither_[
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ IOEither_[js.Any, A], 
    IOEither_[
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ]]
  
  inline def bracket[E, A, B](
    acquire: IOEither_[E, A],
    use: js.Function1[/* a */ A, IOEither_[E, B]],
    release: js.Function2[/* a */ A, /* e */ Either_[E, B], IOEither_[E, Unit]]
  ): IOEither_[E, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("bracket")(acquire.asInstanceOf[js.Any], use.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[IOEither_[E, B]]
  
  inline def chain[E, A, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, B]]]
  
  inline def chainEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, B]]]
  
  inline def chainEitherKW[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ IOEither_[js.Any, A], IOEither_[js.Any | E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[js.Any, A], IOEither_[js.Any | E, B]]]
  
  inline def chainFirst[E, A, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, A]]]
  
  inline def chainFirstW[D, A, B](f: js.Function1[/* a */ A, IOEither_[D, B]]): js.Function1[/* ma */ IOEither_[js.Any, A], IOEither_[D | js.Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[js.Any, A], IOEither_[D | js.Any, A]]]
  
  inline def chainW[D, A, B](f: js.Function1[/* a */ A, IOEither_[D, B]]): js.Function1[/* ma */ IOEither_[js.Any, A], IOEither_[D | js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[js.Any, A], IOEither_[D | js.Any, B]]]
  
  inline def filterOrElse[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, A]]]
  
  inline def filterOrElse_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IOEither_[E, B]]]
  
  inline def flatten[E, A](mma: IOEither_[E, IOEither_[E, A]]): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def fold[E, A, B](onLeft: js.Function1[/* e */ E, IO_[B]], onRight: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ IOEither_[E, A], IO_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IO_[B]]]
  
  inline def fromEither[E, A](ma: Either_[E, A]): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(ma.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def fromEitherK[E, A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, IOEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, IOEither_[E, B]]]
  
  @JSImport("fp-ts", "ioEither.fromIO")
  @js.native
  val fromIO: js.Function1[
    /* fa */ IO_[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
  ] = js.native
  
  inline def fromOption[E](onNone: Lazy[E]): js.Function1[/* ma */ Option_[js.Any], IOEither_[E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[js.Any], IOEither_[E, js.Any]]]
  
  inline def fromPredicate[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, IOEither_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, IOEither_[E, A]]]
  
  inline def fromPredicate_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, IOEither_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, IOEither_[E, B]]]
  
  inline def getAltIOValidation[E](SE: Semigroup[E]): Alt2C[typings.fpTs.ioeitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAltIOValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[Alt2C[typings.fpTs.ioeitherMod.URI, E]]
  
  inline def getApplicativeIOValidation[E](SE: Semigroup[E]): Applicative2C[typings.fpTs.ioeitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeIOValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[Applicative2C[typings.fpTs.ioeitherMod.URI, E]]
  
  inline def getApplyMonoid[E, A](M: Monoid[A]): Monoid[IOEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplyMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[IOEither_[E, A]]]
  
  inline def getApplySemigroup[E, A](S: Semigroup[A]): Semigroup[IOEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplySemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[IOEither_[E, A]]]
  
  inline def getFilterable[E](M: Monoid[E]): Filterable2C[typings.fpTs.ioeitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterable")(M.asInstanceOf[js.Any]).asInstanceOf[Filterable2C[typings.fpTs.ioeitherMod.URI, E]]
  
  inline def getIOValidation[E](SE: Semigroup[E]): (Monad2C[typings.fpTs.ioeitherMod.URI, E]) & Bifunctor2[typings.fpTs.ioeitherMod.URI] & (Alt2C[typings.fpTs.ioeitherMod.URI, E]) & (MonadIO2C[typings.fpTs.ioeitherMod.URI, E]) & (MonadThrow2C[typings.fpTs.ioeitherMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getIOValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[(Monad2C[typings.fpTs.ioeitherMod.URI, E]) & Bifunctor2[typings.fpTs.ioeitherMod.URI] & (Alt2C[typings.fpTs.ioeitherMod.URI, E]) & (MonadIO2C[typings.fpTs.ioeitherMod.URI, E]) & (MonadThrow2C[typings.fpTs.ioeitherMod.URI, E])]
  
  inline def getOrElse[E, A](onLeft: js.Function1[/* e */ E, IO_[A]]): js.Function1[/* ma */ IOEither_[E, A], IO_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IO_[A]]]
  
  inline def getOrElseW[E, B](onLeft: js.Function1[/* e */ E, IO_[B]]): js.Function1[/* ma */ IOEither_[E, js.Any], IO_[B | js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, js.Any], IO_[B | js.Any]]]
  
  inline def getSemigroup[E, A](S: Semigroup[A]): Semigroup[IOEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[IOEither_[E, A]]]
  
  @JSImport("fp-ts", "ioEither.ioEither")
  @js.native
  val ioEither: Monad2[typings.fpTs.ioeitherMod.URI] & Bifunctor2[typings.fpTs.ioeitherMod.URI] & Alt2[typings.fpTs.ioeitherMod.URI] & MonadIO2[typings.fpTs.ioeitherMod.URI] & MonadThrow2[typings.fpTs.ioeitherMod.URI] = js.native
  
  inline def left[E, A](l: E): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(l.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def leftIO[E, A](me: IO_[E]): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftIO")(me.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ IOEither_[js.Any, A], IOEither_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOEither_[js.Any, A], IOEither_[js.Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ IOEither_[E, js.Any], IOEither_[G, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ IOEither_[E, js.Any], IOEither_[G, js.Any]]]
  
  @JSImport("fp-ts", "ioEither.of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
  ] = js.native
  
  inline def orElse[E, A, M](onLeft: js.Function1[/* e */ E, IOEither_[M, A]]): js.Function1[/* ma */ IOEither_[E, A], IOEither_[M, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ IOEither_[E, A], IOEither_[M, A]]]
  
  inline def right[E, A](a: A): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def rightIO[E, A](ma: IO_[A]): IOEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightIO")(ma.asInstanceOf[js.Any]).asInstanceOf[IOEither_[E, A]]
  
  inline def swap[E, A](ma: IOEither_[E, A]): IOEither_[A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(ma.asInstanceOf[js.Any]).asInstanceOf[IOEither_[A, E]]
  
  @JSImport("fp-ts", "ioEither.throwError")
  @js.native
  val throwError: js.Function1[
    /* e */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
  ] = js.native
  
  inline def tryCatch[E, A](f: Lazy[A], onError: js.Function1[/* reason */ js.Any, E]): IOEither_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(f.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[IOEither_[E, A]]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
