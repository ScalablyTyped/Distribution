package typings.fpTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt3
import typings.fpTs.altMod.Alt3C
import typings.fpTs.applicativeMod.Applicative3
import typings.fpTs.applicativeMod.Applicative3C
import typings.fpTs.applyMod.Apply1
import typings.fpTs.bifunctorMod.Bifunctor3
import typings.fpTs.eitherMod.Either_
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor3
import typings.fpTs.iOMod.IO_
import typings.fpTs.ioeitherMod.IOEither_
import typings.fpTs.monadMod.Monad3
import typings.fpTs.monadMod.Monad3C
import typings.fpTs.monadTaskMod.MonadTask3
import typings.fpTs.monadTaskMod.MonadTask3C
import typings.fpTs.monadThrowMod.MonadThrow3
import typings.fpTs.monadThrowMod.MonadThrow3C
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.readerEitherMod.ReaderEither_
import typings.fpTs.readerMod.Reader_
import typings.fpTs.readerTaskMod.ReaderTask_
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.taskEitherMod.TaskEither_
import typings.fpTs.taskMod.Task_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerTaskEitherMod {
  
  @JSImport("fp-ts/lib/ReaderTaskEither", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/ReaderTaskEither", "Alt")
  @js.native
  val Alt_ : Alt3[typings.fpTs.readerTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTaskEither", "ApplicativePar")
  @js.native
  val ApplicativePar: Applicative3[typings.fpTs.readerTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTaskEither", "ApplicativeSeq")
  @js.native
  val ApplicativeSeq: Applicative3[typings.fpTs.readerTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTaskEither", "Bifunctor")
  @js.native
  val Bifunctor: Bifunctor3[typings.fpTs.readerTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTaskEither", "Functor")
  @js.native
  val Functor: Functor3[typings.fpTs.readerTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTaskEither", "URI")
  @js.native
  val URI: /* "ReaderTaskEither" */ String = js.native
  type URI = /* "ReaderTaskEither" */ String
  
  inline def alt[R, E, A](that: js.Function0[ReaderTaskEither_[R, E, A]]): js.Function1[/* fa */ ReaderTaskEither_[R, E, A], ReaderTaskEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderTaskEither_[R, E, A], ReaderTaskEither_[R, E, A]]]
  
  inline def ap[R, E, A](fa: ReaderTaskEither_[R, E, A]): js.Function1[
    /* fab */ ReaderTaskEither_[R, E, js.Function1[/* a */ A, js.Any]], 
    ReaderTaskEither_[R, E, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ ReaderTaskEither_[R, E, js.Function1[/* a */ A, js.Any]], 
    ReaderTaskEither_[R, E, js.Any]
  ]]
  
  inline def apFirst[R, E, B](fb: ReaderTaskEither_[R, E, B]): js.Function1[/* fa */ ReaderTaskEither_[R, E, js.Any], ReaderTaskEither_[R, E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderTaskEither_[R, E, js.Any], ReaderTaskEither_[R, E, js.Any]]]
  
  inline def apS[A, N /* <: String */, R, E, B](name: Exclude[N, /* keyof A */ String], fb: ReaderTaskEither_[R, E, B]): js.Function1[
    /* fa */ ReaderTaskEither_[R, E, A], 
    ReaderTaskEither_[
      R, 
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTaskEither_[R, E, A], 
    ReaderTaskEither_[
      R, 
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, Q, D, B](name: Exclude[N, /* keyof A */ String], fb: ReaderTaskEither_[Q, D, B]): js.Function1[
    /* fa */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[
      Q & js.Any, 
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[
      Q & js.Any, 
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ]]
  
  inline def apSecond[R, E, B](fb: ReaderTaskEither_[R, E, B]): js.Function1[/* fa */ ReaderTaskEither_[R, E, js.Any], ReaderTaskEither_[R, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderTaskEither_[R, E, js.Any], ReaderTaskEither_[R, E, B]]]
  
  inline def apW[Q, D, A](fa: ReaderTaskEither_[Q, D, A]): js.Function1[
    /* fab */ ReaderTaskEither_[js.Any, js.Any, js.Function1[/* a */ A, js.Any]], 
    ReaderTaskEither_[Q & js.Any, D | js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ ReaderTaskEither_[js.Any, js.Any, js.Function1[/* a */ A, js.Any]], 
    ReaderTaskEither_[Q & js.Any, D | js.Any, js.Any]
  ]]
  
  inline def ask[R, E](): ReaderTaskEither_[R, E, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")().asInstanceOf[ReaderTaskEither_[R, E, R]]
  
  inline def asks[R, E, A](f: js.Function1[/* r */ R, A]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(f.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ ReaderTaskEither_[js.Any, E, A], ReaderTaskEither_[js.Any, G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ ReaderTaskEither_[js.Any, E, A], ReaderTaskEither_[js.Any, G, B]]]
  
  inline def bind[N /* <: String */, A, R, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReaderTaskEither_[R, E, B]]): js.Function1[
    /* fa */ ReaderTaskEither_[R, E, A], 
    ReaderTaskEither_[
      R, 
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTaskEither_[R, E, A], 
    ReaderTaskEither_[
      R, 
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ ReaderTaskEither_[js.Any, js.Any, js.Any], 
    ReaderTaskEither_[
      js.Any, 
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ ReaderTaskEither_[js.Any, js.Any, js.Any], 
    ReaderTaskEither_[
      js.Any, 
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, Q, D, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReaderTaskEither_[Q, D, B]]): js.Function1[
    /* fa */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[
      Q & js.Any, 
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[
      Q & js.Any, 
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ]]
  
  inline def bracket[R, E, A, B](
    aquire: ReaderTaskEither_[R, E, A],
    use: js.Function1[/* a */ A, ReaderTaskEither_[R, E, B]],
    release: js.Function2[/* a */ A, /* e */ Either_[E, B], ReaderTaskEither_[R, E, Unit]]
  ): ReaderTaskEither_[R, E, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("bracket")(aquire.asInstanceOf[js.Any], use.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[ReaderTaskEither_[R, E, B]]
  
  inline def chain[R, E, A, B](f: js.Function1[/* a */ A, ReaderTaskEither_[R, E, B]]): js.Function1[/* ma */ ReaderTaskEither_[R, E, A], ReaderTaskEither_[R, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTaskEither_[R, E, A], ReaderTaskEither_[R, E, B]]]
  
  inline def chainEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ ReaderTaskEither_[js.Any, E, A], ReaderTaskEither_[js.Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTaskEither_[js.Any, E, A], ReaderTaskEither_[js.Any, E, B]]]
  
  inline def chainEitherKW[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[
    /* ma */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[js.Any, js.Any | E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[js.Any, js.Any | E, B]
  ]]
  
  inline def chainFirst[R, E, A, B](f: js.Function1[/* a */ A, ReaderTaskEither_[R, E, B]]): js.Function1[/* ma */ ReaderTaskEither_[R, E, A], ReaderTaskEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTaskEither_[R, E, A], ReaderTaskEither_[R, E, A]]]
  
  inline def chainFirstW[R, E, A, B](f: js.Function1[/* a */ A, ReaderTaskEither_[R, E, B]]): js.Function1[
    /* ma */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[js.Any & R, js.Any | E, A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[js.Any & R, js.Any | E, A]
  ]]
  
  inline def chainIOEitherK[E, A, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* ma */ ReaderTaskEither_[js.Any, E, A], ReaderTaskEither_[js.Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTaskEither_[js.Any, E, A], ReaderTaskEither_[js.Any, E, B]]]
  
  inline def chainIOEitherKW[E, A, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[
    /* ma */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[js.Any, js.Any | E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[js.Any, js.Any | E, B]
  ]]
  
  inline def chainTaskEitherK[E, A, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[/* ma */ ReaderTaskEither_[js.Any, E, A], ReaderTaskEither_[js.Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTaskEither_[js.Any, E, A], ReaderTaskEither_[js.Any, E, B]]]
  
  inline def chainTaskEitherKW[E, A, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[
    /* ma */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[js.Any, js.Any | E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[js.Any, js.Any | E, B]
  ]]
  
  inline def chainW[R, E, A, B](f: js.Function1[/* a */ A, ReaderTaskEither_[R, E, B]]): js.Function1[
    /* ma */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[js.Any & R, js.Any | E, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[js.Any & R, js.Any | E, B]
  ]]
  
  inline def filterOrElse[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ ReaderTaskEither_[js.Any, E, A], ReaderTaskEither_[js.Any, E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ ReaderTaskEither_[js.Any, E, A], ReaderTaskEither_[js.Any, E, A]]]
  
  inline def filterOrElse_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ ReaderTaskEither_[js.Any, E, A], ReaderTaskEither_[js.Any, E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ ReaderTaskEither_[js.Any, E, A], ReaderTaskEither_[js.Any, E, B]]]
  
  inline def flatten[R, E, A](mma: ReaderTaskEither_[R, E, ReaderTaskEither_[R, E, A]]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def fold[R, E, A, B](
    onLeft: js.Function1[/* e */ E, ReaderTask_[R, B]],
    onRight: js.Function1[/* a */ A, ReaderTask_[R, B]]
  ): js.Function1[/* ma */ ReaderTaskEither_[R, E, A], ReaderTask_[R, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ ReaderTaskEither_[R, E, A], ReaderTask_[R, B]]]
  
  inline def fromEither[R, E, A](ma: Either_[E, A]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def fromEitherK[E, A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, ReaderTaskEither_[js.Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderTaskEither_[js.Any, E, B]]]
  
  @JSImport("fp-ts/lib/ReaderTaskEither", "fromIO")
  @js.native
  val fromIO: js.Function1[
    /* fa */ IO_[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ js.Any
  ] = js.native
  
  inline def fromIOEither[R, E, A](ma: IOEither_[E, A]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOEither")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def fromIOEitherK[E, A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* a */ A, ReaderTaskEither_[js.Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderTaskEither_[js.Any, E, B]]]
  
  inline def fromOption[E](onNone: Lazy[E]): js.Function1[/* ma */ Option_[js.Any], ReaderTaskEither_[js.Any, E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[js.Any], ReaderTaskEither_[js.Any, E, js.Any]]]
  
  inline def fromPredicate[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, ReaderTaskEither_[js.Any, E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, ReaderTaskEither_[js.Any, E, A]]]
  
  inline def fromPredicate_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, ReaderTaskEither_[js.Any, E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, ReaderTaskEither_[js.Any, E, B]]]
  
  inline def fromReaderEither[R, E, A](ma: ReaderEither_[R, E, A]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderEither")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  @JSImport("fp-ts/lib/ReaderTaskEither", "fromTask")
  @js.native
  val fromTask: js.Function1[
    /* fa */ Task_[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ js.Any
  ] = js.native
  
  inline def fromTaskEither[R, E, A](ma: TaskEither_[E, A]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskEither")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def fromTaskEitherK[E, A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[/* a */ A, ReaderTaskEither_[js.Any, E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderTaskEither_[js.Any, E, B]]]
  
  inline def getAltReaderTaskValidation[E](SE: Semigroup[E]): Alt3C[typings.fpTs.readerTaskEitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAltReaderTaskValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[Alt3C[typings.fpTs.readerTaskEitherMod.URI, E]]
  
  inline def getApplicativeReaderTaskValidation[E](A: Apply1[typings.fpTs.taskMod.URI], SE: Semigroup[E]): Applicative3C[typings.fpTs.readerTaskEitherMod.URI, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeReaderTaskValidation")(A.asInstanceOf[js.Any], SE.asInstanceOf[js.Any])).asInstanceOf[Applicative3C[typings.fpTs.readerTaskEitherMod.URI, E]]
  
  inline def getApplyMonoid[R, E, A](M: Monoid[A]): Monoid[ReaderTaskEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplyMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[ReaderTaskEither_[R, E, A]]]
  
  inline def getApplySemigroup[R, E, A](S: Semigroup[A]): Semigroup[ReaderTaskEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplySemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[ReaderTaskEither_[R, E, A]]]
  
  inline def getOrElse[R, E, A](onLeft: js.Function1[/* e */ E, ReaderTask_[R, A]]): js.Function1[/* ma */ ReaderTaskEither_[R, E, A], ReaderTask_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTaskEither_[R, E, A], ReaderTask_[R, A]]]
  
  inline def getOrElseW[R, E, B](onLeft: js.Function1[/* e */ E, ReaderTask_[R, B]]): js.Function1[/* ma */ ReaderTaskEither_[js.Any, E, js.Any], ReaderTask_[js.Any & R, B | js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTaskEither_[js.Any, E, js.Any], ReaderTask_[js.Any & R, B | js.Any]]]
  
  inline def getReaderTaskValidation[E](SE: Semigroup[E]): (Monad3C[typings.fpTs.readerTaskEitherMod.URI, E]) & Bifunctor3[typings.fpTs.readerTaskEitherMod.URI] & (Alt3C[typings.fpTs.readerTaskEitherMod.URI, E]) & (MonadTask3C[typings.fpTs.readerTaskEitherMod.URI, E]) & (MonadThrow3C[typings.fpTs.readerTaskEitherMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderTaskValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[(Monad3C[typings.fpTs.readerTaskEitherMod.URI, E]) & Bifunctor3[typings.fpTs.readerTaskEitherMod.URI] & (Alt3C[typings.fpTs.readerTaskEitherMod.URI, E]) & (MonadTask3C[typings.fpTs.readerTaskEitherMod.URI, E]) & (MonadThrow3C[typings.fpTs.readerTaskEitherMod.URI, E])]
  
  inline def getSemigroup[R, E, A](S: Semigroup[A]): Semigroup[ReaderTaskEither_[R, E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[ReaderTaskEither_[R, E, A]]]
  
  inline def left[R, E, A](e: E): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(e.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def leftIO[R, E, A](me: IO_[E]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftIO")(me.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def leftReader[R, E, A](me: Reader_[R, E]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftReader")(me.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def leftReaderTask[R, E, A](me: ReaderTask_[R, E]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftReaderTask")(me.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def leftTask[R, E, A](me: Task_[E]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftTask")(me.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def local[Q, R](f: js.Function1[/* f */ Q, R]): js.Function1[
    /* ma */ ReaderTaskEither_[R, js.Any, js.Any], 
    ReaderTaskEither_[Q, js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ ReaderTaskEither_[R, js.Any, js.Any], 
    ReaderTaskEither_[Q, js.Any, js.Any]
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[js.Any, js.Any, B]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ ReaderTaskEither_[js.Any, js.Any, A], 
    ReaderTaskEither_[js.Any, js.Any, B]
  ]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[
    /* fa */ ReaderTaskEither_[js.Any, E, js.Any], 
    ReaderTaskEither_[js.Any, G, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ ReaderTaskEither_[js.Any, E, js.Any], 
    ReaderTaskEither_[js.Any, G, js.Any]
  ]]
  
  @JSImport("fp-ts/lib/ReaderTaskEither", "of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
  ] = js.native
  
  inline def orElse[R, E, A, M](onLeft: js.Function1[/* e */ E, ReaderTaskEither_[R, M, A]]): js.Function1[/* ma */ ReaderTaskEither_[R, E, A], ReaderTaskEither_[R, M, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTaskEither_[R, E, A], ReaderTaskEither_[R, M, A]]]
  
  @JSImport("fp-ts/lib/ReaderTaskEither", "readerTaskEither")
  @js.native
  val readerTaskEither: Monad3[typings.fpTs.readerTaskEitherMod.URI] & Bifunctor3[typings.fpTs.readerTaskEitherMod.URI] & Alt3[typings.fpTs.readerTaskEitherMod.URI] & MonadTask3[typings.fpTs.readerTaskEitherMod.URI] & MonadThrow3[typings.fpTs.readerTaskEitherMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTaskEither", "readerTaskEitherSeq")
  @js.native
  val readerTaskEitherSeq: Monad3[typings.fpTs.readerTaskEitherMod.URI] & Bifunctor3[typings.fpTs.readerTaskEitherMod.URI] & Alt3[typings.fpTs.readerTaskEitherMod.URI] & MonadTask3[typings.fpTs.readerTaskEitherMod.URI] & MonadThrow3[typings.fpTs.readerTaskEitherMod.URI] = js.native
  
  inline def right[R, E, A](a: A): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def rightIO[R, E, A](ma: IO_[A]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightIO")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def rightReader[R, E, A](ma: Reader_[R, A]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightReader")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def rightReaderTask[R, E, A](ma: ReaderTask_[R, A]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightReaderTask")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def rightTask[R, E, A](ma: Task_[A]): ReaderTaskEither_[R, E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightTask")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, E, A]]
  
  inline def run[R, E, A](ma: ReaderTaskEither_[R, E, A], r: R): js.Promise[Either_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(ma.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Either_[E, A]]]
  
  inline def swap[R, E, A](ma: ReaderTaskEither_[R, E, A]): ReaderTaskEither_[R, A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderTaskEither_[R, A, E]]
  
  @JSImport("fp-ts/lib/ReaderTaskEither", "throwError")
  @js.native
  val throwError: js.Function1[
    /* e */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ js.Any
  ] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  type ReaderTaskEither_[R, E, A] = js.Function1[/* r */ R, TaskEither_[E, A]]
}
