package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt2
import typings.fpTs.altMod.Alt2C
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applyMod.Apply1
import typings.fpTs.bifunctorMod.Bifunctor2
import typings.fpTs.eitherMod.Either_
import typings.fpTs.filterableMod.Filterable2C
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor2
import typings.fpTs.iOMod.IO_
import typings.fpTs.ioeitherMod.IOEither_
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadTaskMod.MonadTask2
import typings.fpTs.monadTaskMod.MonadTask2C
import typings.fpTs.monadThrowMod.MonadThrow2
import typings.fpTs.monadThrowMod.MonadThrow2C
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.taskEitherMod.TaskEither_
import typings.fpTs.taskMod.Task_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskEither {
  
  @JSImport("fp-ts", "taskEither")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "taskEither.Alt")
  @js.native
  val Alt_ : Alt2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.ApplicativePar")
  @js.native
  val ApplicativePar: Applicative2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.ApplicativeSeq")
  @js.native
  val ApplicativeSeq: Applicative2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.URI")
  @js.native
  val URI: /* "TaskEither" */ String = js.native
  
  inline def alt[E, A](that: Lazy[TaskEither_[E, A]]): js.Function1[/* fa */ TaskEither_[E, A], TaskEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskEither_[E, A], TaskEither_[E, A]]]
  
  inline def ap[E, A](fa: TaskEither_[E, A]): js.Function1[/* fab */ TaskEither_[E, js.Function1[/* a */ A, js.Any]], TaskEither_[E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ TaskEither_[E, js.Function1[/* a */ A, js.Any]], TaskEither_[E, js.Any]]]
  
  inline def apFirst[E, B](fb: TaskEither_[E, B]): js.Function1[/* fa */ TaskEither_[E, js.Any], TaskEither_[E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskEither_[E, js.Any], TaskEither_[E, js.Any]]]
  
  inline def apS[A, N /* <: String */, E, B](name: Exclude[N, /* keyof A */ String], fb: TaskEither_[E, B]): js.Function1[
    /* fa */ TaskEither_[E, A], 
    TaskEither_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ TaskEither_[E, A], 
    TaskEither_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, D, B](name: Exclude[N, /* keyof A */ String], fb: TaskEither_[D, B]): js.Function1[
    /* fa */ TaskEither_[js.Any, A], 
    TaskEither_[
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ TaskEither_[js.Any, A], 
    TaskEither_[
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ]]
  
  inline def apSecond[E, B](fb: TaskEither_[E, B]): js.Function1[/* fa */ TaskEither_[E, js.Any], TaskEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskEither_[E, js.Any], TaskEither_[E, B]]]
  
  inline def apW[D, A](fa: TaskEither_[D, A]): js.Function1[
    /* fab */ TaskEither_[js.Any, js.Function1[/* a */ A, js.Any]], 
    TaskEither_[D | js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ TaskEither_[js.Any, js.Function1[/* a */ A, js.Any]], 
    TaskEither_[D | js.Any, js.Any]
  ]]
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskEither_[E, A], TaskEither_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskEither_[E, A], TaskEither_[G, B]]]
  
  inline def bind[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[
    /* fa */ TaskEither_[E, A], 
    TaskEither_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ TaskEither_[E, A], 
    TaskEither_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ TaskEither_[js.Any, js.Any], 
    TaskEither_[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ TaskEither_[js.Any, js.Any], 
    TaskEither_[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, D, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, TaskEither_[D, B]]): js.Function1[
    /* fa */ TaskEither_[js.Any, A], 
    TaskEither_[
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ TaskEither_[js.Any, A], 
    TaskEither_[
      D | js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ]]
  
  inline def bracket[E, A, B](
    acquire: TaskEither_[E, A],
    use: js.Function1[/* a */ A, TaskEither_[E, B]],
    release: js.Function2[/* a */ A, /* e */ Either_[E, B], TaskEither_[E, Unit]]
  ): TaskEither_[E, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("bracket")(acquire.asInstanceOf[js.Any], use.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[TaskEither_[E, B]]
  
  inline def chain[E, A, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]]]
  
  inline def chainEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]]]
  
  inline def chainEitherKW[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ TaskEither_[js.Any, A], TaskEither_[js.Any | E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[js.Any, A], TaskEither_[js.Any | E, B]]]
  
  inline def chainFirst[E, A, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, A]]]
  
  inline def chainFirstW[E, A, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[/* ma */ TaskEither_[js.Any, A], TaskEither_[js.Any | E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[js.Any, A], TaskEither_[js.Any | E, A]]]
  
  inline def chainIOEitherK[E, A, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]]]
  
  inline def chainIOEitherKW[E, A, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* ma */ TaskEither_[js.Any, A], TaskEither_[js.Any | E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[js.Any, A], TaskEither_[js.Any | E, B]]]
  
  inline def chainW[E, A, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[/* ma */ TaskEither_[js.Any, A], TaskEither_[E | js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[js.Any, A], TaskEither_[E | js.Any, B]]]
  
  inline def filterOrElse[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, A]]]
  
  inline def filterOrElse_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]]]
  
  inline def flatten[E, A](mma: TaskEither_[E, TaskEither_[E, A]]): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def fold[E, A, B](onLeft: js.Function1[/* e */ E, Task_[B]], onRight: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* ma */ TaskEither_[E, A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], Task_[B]]]
  
  inline def fromEither[E, A](ma: Either_[E, A]): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(ma.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def fromEitherK[E, A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, TaskEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskEither_[E, B]]]
  
  @JSImport("fp-ts", "taskEither.fromIO")
  @js.native
  val fromIO: js.Function1[
    /* fa */ IO_[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
  ] = js.native
  
  inline def fromIOEither[E, A](fa: IOEither_[E, A]): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOEither")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def fromIOEitherK[E, A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* a */ A, TaskEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskEither_[E, B]]]
  
  inline def fromOption[E](onNone: Lazy[E]): js.Function1[/* ma */ Option_[js.Any], TaskEither_[E, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Option_[js.Any], TaskEither_[E, js.Any]]]
  
  inline def fromPredicate[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, TaskEither_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, TaskEither_[E, A]]]
  
  inline def fromPredicate_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, TaskEither_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, TaskEither_[E, B]]]
  
  @JSImport("fp-ts", "taskEither.fromTask")
  @js.native
  val fromTask: js.Function1[
    /* fa */ Task_[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
  ] = js.native
  
  inline def getAltTaskValidation[E](SE: Semigroup[E]): Alt2C[typings.fpTs.taskEitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAltTaskValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[Alt2C[typings.fpTs.taskEitherMod.URI, E]]
  
  inline def getApplicativeTaskValidation[E](A: Apply1[typings.fpTs.taskMod.URI], SE: Semigroup[E]): Applicative2C[typings.fpTs.taskEitherMod.URI, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeTaskValidation")(A.asInstanceOf[js.Any], SE.asInstanceOf[js.Any])).asInstanceOf[Applicative2C[typings.fpTs.taskEitherMod.URI, E]]
  
  inline def getApplyMonoid[E, A](M: Monoid[A]): Monoid[TaskEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplyMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[TaskEither_[E, A]]]
  
  inline def getApplySemigroup[E, A](S: Semigroup[A]): Semigroup[TaskEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplySemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[TaskEither_[E, A]]]
  
  inline def getFilterable[E](M: Monoid[E]): Filterable2C[typings.fpTs.taskEitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterable")(M.asInstanceOf[js.Any]).asInstanceOf[Filterable2C[typings.fpTs.taskEitherMod.URI, E]]
  
  inline def getOrElse[E, A](onLeft: js.Function1[/* e */ E, Task_[A]]): js.Function1[/* ma */ TaskEither_[E, A], Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], Task_[A]]]
  
  inline def getOrElseW[E, B](onLeft: js.Function1[/* e */ E, Task_[B]]): js.Function1[/* ma */ TaskEither_[E, js.Any], Task_[B | js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, js.Any], Task_[B | js.Any]]]
  
  inline def getSemigroup[E, A](S: Semigroup[A]): Semigroup[TaskEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[TaskEither_[E, A]]]
  
  inline def getTaskValidation[E](SE: Semigroup[E]): (Monad2C[typings.fpTs.taskEitherMod.URI, E]) & Bifunctor2[typings.fpTs.taskEitherMod.URI] & (Alt2C[typings.fpTs.taskEitherMod.URI, E]) & (MonadTask2C[typings.fpTs.taskEitherMod.URI, E]) & (MonadThrow2C[typings.fpTs.taskEitherMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getTaskValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[(Monad2C[typings.fpTs.taskEitherMod.URI, E]) & Bifunctor2[typings.fpTs.taskEitherMod.URI] & (Alt2C[typings.fpTs.taskEitherMod.URI, E]) & (MonadTask2C[typings.fpTs.taskEitherMod.URI, E]) & (MonadThrow2C[typings.fpTs.taskEitherMod.URI, E])]
  
  inline def left[E, A](e: E): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(e.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def leftIO[E, A](me: IO_[E]): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftIO")(me.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def leftTask[E, A](me: Task_[E]): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftTask")(me.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskEither_[js.Any, A], TaskEither_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskEither_[js.Any, A], TaskEither_[js.Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ TaskEither_[E, js.Any], TaskEither_[G, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskEither_[E, js.Any], TaskEither_[G, js.Any]]]
  
  @JSImport("fp-ts", "taskEither.of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
  ] = js.native
  
  inline def orElse[E, A, M](onLeft: js.Function1[/* e */ E, TaskEither_[M, A]]): js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[M, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[M, A]]]
  
  inline def right[E, A](a: A): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def rightIO[E, A](ma: IO_[A]): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightIO")(ma.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def rightTask[E, A](ma: Task_[A]): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightTask")(ma.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def swap[E, A](ma: TaskEither_[E, A]): TaskEither_[A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(ma.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[A, E]]
  
  @JSImport("fp-ts", "taskEither.taskEither")
  @js.native
  val taskEither: Monad2[typings.fpTs.taskEitherMod.URI] & Bifunctor2[typings.fpTs.taskEitherMod.URI] & Alt2[typings.fpTs.taskEitherMod.URI] & MonadTask2[typings.fpTs.taskEitherMod.URI] & MonadThrow2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.taskEitherSeq")
  @js.native
  val taskEitherSeq: Monad2[typings.fpTs.taskEitherMod.URI] & Bifunctor2[typings.fpTs.taskEitherMod.URI] & Alt2[typings.fpTs.taskEitherMod.URI] & MonadTask2[typings.fpTs.taskEitherMod.URI] & MonadThrow2[typings.fpTs.taskEitherMod.URI] = js.native
  
  inline def taskify[L, R](
    f: js.Function1[
      /* cb */ js.Function2[/* e */ js.UndefOr[L | Null], /* r */ js.UndefOr[R], Unit], 
      Unit
    ]
  ): js.Function0[TaskEither_[L, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("taskify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function0[TaskEither_[L, R]]]
  inline def taskify[A, L, R](
    f: js.Function2[
      /* a */ A, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | Null], /* r */ js.UndefOr[R], Unit], 
      Unit
    ]
  ): js.Function1[/* a */ A, TaskEither_[L, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("taskify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskEither_[L, R]]]
  inline def taskify[A, B, L, R](
    f: js.Function3[
      /* a */ A, 
      /* b */ B, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | Null], /* r */ js.UndefOr[R], Unit], 
      Unit
    ]
  ): js.Function2[/* a */ A, /* b */ B, TaskEither_[L, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("taskify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ A, /* b */ B, TaskEither_[L, R]]]
  inline def taskify[A, B, C, L, R](
    f: js.Function4[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | Null], /* r */ js.UndefOr[R], Unit], 
      Unit
    ]
  ): js.Function3[/* a */ A, /* b */ B, /* c */ C, TaskEither_[L, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("taskify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* a */ A, /* b */ B, /* c */ C, TaskEither_[L, R]]]
  inline def taskify[A, B, C, D, L, R](
    f: js.Function5[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | Null], /* r */ js.UndefOr[R], Unit], 
      Unit
    ]
  ): js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, TaskEither_[L, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("taskify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, TaskEither_[L, R]]]
  inline def taskify[A, B, C, D, E, L, R](
    f: js.Function6[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* cb */ js.Function2[/* e */ js.UndefOr[L | Null], /* r */ js.UndefOr[R], Unit], 
      Unit
    ]
  ): js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, TaskEither_[L, R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("taskify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, TaskEither_[L, R]]]
  
  @JSImport("fp-ts", "taskEither.throwError")
  @js.native
  val throwError: js.Function1[
    /* e */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
  ] = js.native
  
  inline def tryCatch[E, A](f: Lazy[js.Promise[A]], onRejected: js.Function1[/* reason */ js.Any, E]): TaskEither_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(f.asInstanceOf[js.Any], onRejected.asInstanceOf[js.Any])).asInstanceOf[TaskEither_[E, A]]
  
  inline def tryCatchK[E, A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, js.Promise[B]], onRejected: js.Function1[/* reason */ js.Any, E]): js.Function1[/* a */ A, TaskEither_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCatchK")(f.asInstanceOf[js.Any], onRejected.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, TaskEither_[E, B]]]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
