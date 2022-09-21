package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.altMod.Alt2
import typings.fpTs.altMod.Alt2C
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applyMod.Apply1
import typings.fpTs.applyMod.Apply2
import typings.fpTs.bifunctorMod.Bifunctor2
import typings.fpTs.chainMod.Chain2
import typings.fpTs.compactableMod.Compactable2C
import typings.fpTs.eitherMod.Either_
import typings.fpTs.filterableMod.Filterable2C
import typings.fpTs.fpTsStrings.Option
import typings.fpTs.fpTsStrings.TaskEither
import typings.fpTs.fromEitherMod.FromEither2
import typings.fpTs.fromIOMod.FromIO2
import typings.fpTs.fromTaskMod.FromTask2
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functorMod.Functor2
import typings.fpTs.iOMod.IO_
import typings.fpTs.ioeitherMod.IOEither_
import typings.fpTs.monadIOMod.MonadIO2
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadTaskMod.MonadTask2
import typings.fpTs.monadTaskMod.MonadTask2C
import typings.fpTs.monadThrowMod.MonadThrow2
import typings.fpTs.monadThrowMod.MonadThrow2C
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.naturalTransformationMod.NaturalTransformation12
import typings.fpTs.naturalTransformationMod.NaturalTransformation12C
import typings.fpTs.naturalTransformationMod.NaturalTransformation22
import typings.fpTs.optionMod.Option_
import typings.fpTs.pointedMod.Pointed2
import typings.fpTs.predicateMod.Predicate
import typings.fpTs.readonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.refinementMod.Refinement
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.taskEitherMod.TaskEither_
import typings.fpTs.taskMod.Task_
import typings.fpTs.taskOptionMod.TaskOption
import typings.std.Exclude
import typings.std.NonNullable
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
  
  @JSImport("fp-ts", "taskEither.ApT")
  @js.native
  val ApT: TaskEither_[scala.Nothing, js.Array[Any]] = js.native
  
  @JSImport("fp-ts", "taskEither.ApplicativePar")
  @js.native
  val ApplicativePar: Applicative2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.ApplicativeSeq")
  @js.native
  val ApplicativeSeq: Applicative2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.ApplyPar")
  @js.native
  val ApplyPar: Apply2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.ApplySeq")
  @js.native
  val ApplySeq: Apply2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.Chain")
  @js.native
  val Chain_ : Chain2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.Do")
  @js.native
  val Do: TaskEither_[scala.Nothing, js.Object] = js.native
  
  @JSImport("fp-ts", "taskEither.FromEither")
  @js.native
  val FromEither_ : FromEither2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.FromIO")
  @js.native
  val FromIO_ : FromIO2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.FromTask")
  @js.native
  val FromTask_ : FromTask2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.Monad")
  @js.native
  val Monad: Monad2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.MonadIO")
  @js.native
  val MonadIO: MonadIO2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.MonadTask")
  @js.native
  val MonadTask: MonadTask2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.MonadThrow")
  @js.native
  val MonadThrow: MonadThrow2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.Pointed")
  @js.native
  val Pointed: Pointed2[typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.URI")
  @js.native
  val URI: /* "TaskEither" */ String = js.native
  
  inline def alt[E, A](that: Lazy[TaskEither_[E, A]]): js.Function1[/* fa */ TaskEither_[E, A], TaskEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskEither_[E, A], TaskEither_[E, A]]]
  
  inline def altW[E2, B](that: Lazy[TaskEither_[E2, B]]): js.Function1[/* fa */ TaskEither_[Any, Any], TaskEither_[E2, Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("altW")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskEither_[Any, Any], TaskEither_[E2, Any | B]]]
  
  inline def ap[E, A](fa: TaskEither_[E, A]): js.Function1[/* fab */ TaskEither_[E, js.Function1[/* a */ A, Any]], TaskEither_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ TaskEither_[E, js.Function1[/* a */ A, Any]], TaskEither_[E, Any]]]
  
  inline def apFirst[E, B](second: TaskEither_[E, B]): js.Function1[/* first */ TaskEither_[E, Any], TaskEither_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskEither_[E, Any], TaskEither_[E, Any]]]
  
  inline def apFirstW[E2, B](second: TaskEither_[E2, B]): js.Function1[/* first */ TaskEither_[Any, Any], TaskEither_[Any | E2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirstW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskEither_[Any, Any], TaskEither_[Any | E2, Any]]]
  
  inline def apS[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], fb: TaskEither_[E, B]): js.Function1[
    /* fa */ TaskEither_[E, A], 
    TaskEither_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ TaskEither_[E, A], 
    TaskEither_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, E2, B](name: Exclude[N, /* keyof A */ String], fb: TaskEither_[E2, B]): js.Function1[
    /* fa */ TaskEither_[Any, A], 
    TaskEither_[
      Any | E2, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ TaskEither_[Any, A], 
    TaskEither_[
      Any | E2, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ]]
  
  inline def apSecond[E, B](second: TaskEither_[E, B]): js.Function1[/* first */ TaskEither_[E, Any], TaskEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskEither_[E, Any], TaskEither_[E, B]]]
  
  inline def apSecondW[E2, B](second: TaskEither_[E2, B]): js.Function1[/* first */ TaskEither_[Any, Any], TaskEither_[Any | E2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecondW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskEither_[Any, Any], TaskEither_[Any | E2, B]]]
  
  inline def apW[E2, A](fa: TaskEither_[E2, A]): js.Function1[
    /* fab */ TaskEither_[Any, js.Function1[/* a */ A, Any]], 
    TaskEither_[Any | E2, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ TaskEither_[Any, js.Function1[/* a */ A, Any]], 
    TaskEither_[Any | E2, Any]
  ]]
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskEither_[E, A], TaskEither_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskEither_[E, A], TaskEither_[G, B]]]
  
  inline def bind[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[
    /* ma */ TaskEither_[E, A], 
    TaskEither_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ TaskEither_[E, A], 
    TaskEither_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ TaskEither_[Any, Any], 
    TaskEither_[
      Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ TaskEither_[Any, Any], 
    TaskEither_[
      Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[Any]
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, E2, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, TaskEither_[E2, B]]): js.Function1[
    /* fa */ TaskEither_[Any, A], 
    TaskEither_[
      Any | E2, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ TaskEither_[Any, A], 
    TaskEither_[
      Any | E2, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ]]
  
  inline def bracket[E, A, B](
    acquire: TaskEither_[E, A],
    use: js.Function1[/* a */ A, TaskEither_[E, B]],
    release: js.Function2[/* a */ A, /* e */ Either_[E, B], TaskEither_[E, Unit]]
  ): TaskEither_[E, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("bracket")(acquire.asInstanceOf[js.Any], use.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[TaskEither_[E, B]]
  
  inline def bracketW[E1, A, E2, B, E3](
    acquire: TaskEither_[E1, A],
    use: js.Function1[/* a */ A, TaskEither_[E2, B]],
    release: js.Function2[/* a */ A, /* e */ Either_[E2, B], TaskEither_[E3, Unit]]
  ): TaskEither_[E1 | E2 | E3, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("bracketW")(acquire.asInstanceOf[js.Any], use.asInstanceOf[js.Any], release.asInstanceOf[js.Any])).asInstanceOf[TaskEither_[E1 | E2 | E3, B]]
  
  inline def chain[E, A, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]]]
  
  inline def chainEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]]]
  
  inline def chainEitherKW[E2, A, B](f: js.Function1[/* a */ A, Either_[E2, B]]): js.Function1[/* ma */ TaskEither_[Any, A], TaskEither_[Any | E2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[Any, A], TaskEither_[Any | E2, B]]]
  
  inline def chainFirst[E, A, B](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, A]]]
  
  inline def chainFirstEitherK[A, E, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, A]]]
  
  inline def chainFirstEitherKW[A, E2, B](f: js.Function1[/* a */ A, Either_[E2, B]]): js.Function1[/* ma */ TaskEither_[Any, A], TaskEither_[Any | E2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[Any, A], TaskEither_[Any | E2, A]]]
  
  inline def chainFirstIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ TaskEither_[Any, A], TaskEither_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskEither_[Any, A], TaskEither_[Any, A]]]
  
  inline def chainFirstTaskK[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* first */ TaskEither_[Any, A], TaskEither_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskEither_[Any, A], TaskEither_[Any, A]]]
  
  inline def chainFirstW[E2, A, B](f: js.Function1[/* a */ A, TaskEither_[E2, B]]): js.Function1[/* ma */ TaskEither_[Any, A], TaskEither_[Any | E2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[Any, A], TaskEither_[Any | E2, A]]]
  
  inline def chainIOEitherK[E, A, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]]]
  
  inline def chainIOEitherKW[E2, A, B](f: js.Function1[/* a */ A, IOEither_[E2, B]]): js.Function1[/* ma */ TaskEither_[Any, A], TaskEither_[Any | E2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOEitherKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[Any, A], TaskEither_[Any | E2, B]]]
  
  inline def chainIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ TaskEither_[Any, A], TaskEither_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskEither_[Any, A], TaskEither_[Any, B]]]
  
  inline def chainNullableK[E](e: E): js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[/* ma */ TaskEither_[E, Any], TaskEither_[E, NonNullable[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(e.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, js.UndefOr[Any | Null]], 
    js.Function1[/* ma */ TaskEither_[E, Any], TaskEither_[E, NonNullable[Any]]]
  ]]
  
  inline def chainOptionK[E](onNone: Lazy[E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[/* ma */ TaskEither_[E, Any], TaskEither_[E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Option_[Any]], 
    js.Function1[/* ma */ TaskEither_[E, Any], TaskEither_[E, Any]]
  ]]
  
  inline def chainTaskK[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* first */ TaskEither_[Any, A], TaskEither_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskEither_[Any, A], TaskEither_[Any, B]]]
  
  inline def chainTaskOptionK[E](onNone: Lazy[E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, TaskOption[Any]], 
    js.Function1[/* ma */ TaskEither_[E, Any], TaskEither_[E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, TaskOption[Any]], 
    js.Function1[/* ma */ TaskEither_[E, Any], TaskEither_[E, Any]]
  ]]
  
  inline def chainTaskOptionKW[E2](onNone: Lazy[E2]): js.Function1[
    /* f */ js.Function1[/* a */ Any, TaskOption[Any]], 
    js.Function1[/* ma */ TaskEither_[Any, Any], TaskEither_[E2 | Any, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskOptionKW")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, TaskOption[Any]], 
    js.Function1[/* ma */ TaskEither_[Any, Any], TaskEither_[E2 | Any, Any]]
  ]]
  
  inline def chainW[E2, A, B](f: js.Function1[/* a */ A, TaskEither_[E2, B]]): js.Function1[/* ma */ TaskEither_[Any, A], TaskEither_[Any | E2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[Any, A], TaskEither_[Any | E2, B]]]
  
  inline def filterOrElse[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* mb */ TaskEither_[E, A], TaskEither_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* mb */ TaskEither_[E, A], TaskEither_[E, A]]]
  
  inline def filterOrElseW[A, E2](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E2]): js.Function1[/* mb */ TaskEither_[Any, A], TaskEither_[Any | E2, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElseW")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* mb */ TaskEither_[Any, A], TaskEither_[Any | E2, A]]]
  
  inline def filterOrElseW_AB_AE2[A, B /* <: A */, E2](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E2]): js.Function1[/* ma */ TaskEither_[Any, A], TaskEither_[Any | E2, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElseW")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskEither_[Any, A], TaskEither_[Any | E2, B]]]
  
  inline def filterOrElse_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOrElse")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], TaskEither_[E, B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ TaskEither_[Any, js.Function1[/* a */ A, Any]], TaskEither_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ TaskEither_[Any, js.Function1[/* a */ A, Any]], TaskEither_[Any, Any]]]
  
  inline def flatten[E, A](mma: TaskEither_[E, TaskEither_[E, A]]): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def flattenW[E1, E2, A](mma: TaskEither_[E1, TaskEither_[E2, A]]): TaskEither_[E1 | E2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenW")(mma.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E1 | E2, A]]
  
  inline def fold[E, A, B](onLeft: js.Function1[/* e */ E, Task_[B]], onRight: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* ma */ TaskEither_[E, A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], Task_[B]]]
  
  inline def foldW[E, B, A, C](onLeft: js.Function1[/* e */ E, Task_[B]], onRight: js.Function1[/* a */ A, Task_[C]]): js.Function1[/* ma */ TaskEither_[E, A], Task_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], Task_[B | C]]]
  
  @JSImport("fp-ts", "taskEither.fromEither")
  @js.native
  val fromEither: NaturalTransformation22[typings.fpTs.eitherMod.URI, typings.fpTs.taskEitherMod.URI] = js.native
  
  inline def fromEitherK[E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, TaskEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskEither_[E, B]]]
  
  @JSImport("fp-ts", "taskEither.fromIO")
  @js.native
  val fromIO: NaturalTransformation12[typings.fpTs.iOMod.URI, typings.fpTs.taskEitherMod.URI] = js.native
  
  @JSImport("fp-ts", "taskEither.fromIOEither")
  @js.native
  val fromIOEither: NaturalTransformation22[typings.fpTs.ioeitherMod.URI, typings.fpTs.taskEitherMod.URI] = js.native
  
  inline def fromIOEitherK[E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IOEither_[E, B]]): js.Function1[/* a */ A, TaskEither_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskEither_[E, B]]]
  
  inline def fromIOK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, TaskEither_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskEither_[Any, B]]]
  
  inline def fromNullable[E](e: E): js.Function1[/* a */ Any, TaskEither_[E, NonNullable[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(e.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ Any, TaskEither_[E, NonNullable[Any]]]]
  
  inline def fromNullableK[E](e: E): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[/* a */ js.Array[Any], TaskEither_[E, NonNullable[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(e.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], js.UndefOr[Any | Null]], 
    js.Function1[/* a */ js.Array[Any], TaskEither_[E, NonNullable[Any]]]
  ]]
  
  inline def fromOption[E](onNone: Lazy[E]): NaturalTransformation12C[Option, TaskEither, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[NaturalTransformation12C[Option, TaskEither, E]]
  
  inline def fromOptionK[E](onNone: Lazy[E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], TaskEither_[E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], TaskEither_[E, Any]]
  ]]
  
  inline def fromPredicate[E, A](predicate: Predicate[A], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* b */ Any, TaskEither_[E, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ Any, TaskEither_[E, Any]]]
  
  inline def fromPredicate_EAB_A[E, A, B /* <: A */](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, TaskEither_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, TaskEither_[E, B]]]
  
  @JSImport("fp-ts", "taskEither.fromTask")
  @js.native
  val fromTask: NaturalTransformation12[typings.fpTs.taskMod.URI, typings.fpTs.taskEitherMod.URI] = js.native
  
  inline def fromTaskK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* a */ A, TaskEither_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskEither_[Any, B]]]
  
  inline def fromTaskOption[E](onNone: Lazy[E]): NaturalTransformation12C[typings.fpTs.taskOptionMod.URI, typings.fpTs.taskEitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[NaturalTransformation12C[typings.fpTs.taskOptionMod.URI, typings.fpTs.taskEitherMod.URI, E]]
  
  inline def fromTaskOptionK[E](onNone: Lazy[E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], TaskOption[Any]], 
    js.Function1[/* a */ js.Array[Any], TaskEither_[E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], TaskOption[Any]], 
    js.Function1[/* a */ js.Array[Any], TaskEither_[E, Any]]
  ]]
  
  inline def getAltTaskValidation[E](S: Semigroup[E]): Alt2C[typings.fpTs.taskEitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAltTaskValidation")(S.asInstanceOf[js.Any]).asInstanceOf[Alt2C[typings.fpTs.taskEitherMod.URI, E]]
  
  inline def getApplicativeTaskValidation[E](A: Apply1[typings.fpTs.taskMod.URI], S: Semigroup[E]): Applicative2C[typings.fpTs.taskEitherMod.URI, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicativeTaskValidation")(A.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[Applicative2C[typings.fpTs.taskEitherMod.URI, E]]
  
  inline def getApplyMonoid[E, A](M: Monoid[A]): Monoid[TaskEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplyMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[TaskEither_[E, A]]]
  
  inline def getApplySemigroup[E, A](S: Semigroup[A]): Semigroup[TaskEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplySemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[TaskEither_[E, A]]]
  
  inline def getCompactable[E](M: Monoid[E]): Compactable2C[TaskEither, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompactable")(M.asInstanceOf[js.Any]).asInstanceOf[Compactable2C[TaskEither, E]]
  
  inline def getFilterable[E](M: Monoid[E]): Filterable2C[typings.fpTs.taskEitherMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilterable")(M.asInstanceOf[js.Any]).asInstanceOf[Filterable2C[typings.fpTs.taskEitherMod.URI, E]]
  
  inline def getOrElse[E, A](onLeft: js.Function1[/* e */ E, Task_[A]]): js.Function1[/* ma */ TaskEither_[E, A], Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], Task_[A]]]
  
  inline def getOrElseW[E, B](onLeft: js.Function1[/* e */ E, Task_[B]]): js.Function1[/* ma */ TaskEither_[E, Any], Task_[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, Any], Task_[Any | B]]]
  
  inline def getSemigroup[E, A](S: Semigroup[A]): Semigroup[TaskEither_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[TaskEither_[E, A]]]
  
  inline def getTaskValidation[E](SE: Semigroup[E]): (Monad2C[typings.fpTs.taskEitherMod.URI, E]) & Bifunctor2[typings.fpTs.taskEitherMod.URI] & (Alt2C[typings.fpTs.taskEitherMod.URI, E]) & (MonadTask2C[typings.fpTs.taskEitherMod.URI, E]) & (MonadThrow2C[typings.fpTs.taskEitherMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getTaskValidation")(SE.asInstanceOf[js.Any]).asInstanceOf[(Monad2C[typings.fpTs.taskEitherMod.URI, E]) & Bifunctor2[typings.fpTs.taskEitherMod.URI] & (Alt2C[typings.fpTs.taskEitherMod.URI, E]) & (MonadTask2C[typings.fpTs.taskEitherMod.URI, E]) & (MonadThrow2C[typings.fpTs.taskEitherMod.URI, E])]
  
  inline def left[E, A](e: E): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(e.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def leftIO[E, A](me: IO_[E]): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftIO")(me.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def leftTask[E, A](me: Task_[E]): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftTask")(me.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskEither_[Any, A], TaskEither_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskEither_[Any, A], TaskEither_[Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ TaskEither_[E, Any], TaskEither_[G, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskEither_[E, Any], TaskEither_[G, Any]]]
  
  inline def `match`[E, B, A](onLeft: js.Function1[/* e */ E, B], onRight: js.Function1[/* a */ A, B]): js.Function1[/* ma */ TaskEither_[E, A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], Task_[B]]]
  
  inline def matchE[E, A, B](onLeft: js.Function1[/* e */ E, Task_[B]], onRight: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* ma */ TaskEither_[E, A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], Task_[B]]]
  
  inline def matchEW[E, B, A, C](onLeft: js.Function1[/* e */ E, Task_[B]], onRight: js.Function1[/* a */ A, Task_[C]]): js.Function1[/* ma */ TaskEither_[E, A], Task_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchEW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], Task_[B | C]]]
  
  inline def matchW[E, B, A, C](onLeft: js.Function1[/* e */ E, B], onRight: js.Function1[/* a */ A, C]): js.Function1[/* ma */ TaskEither_[E, A], Task_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, A], Task_[B | C]]]
  
  inline def of[E, A](a: A): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def orElse[E1, A, E2](onLeft: js.Function1[/* e */ E1, TaskEither_[E2, A]]): js.Function1[/* ma */ TaskEither_[E1, A], TaskEither_[E2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElse")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E1, A], TaskEither_[E2, A]]]
  
  inline def orElseFirst[E, B](onLeft: js.Function1[/* e */ E, TaskEither_[E, B]]): js.Function1[/* ma */ TaskEither_[E, Any], TaskEither_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirst")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, Any], TaskEither_[E, Any]]]
  
  inline def orElseFirstIOK[E, B](onLeft: js.Function1[/* e */ E, IO_[B]]): js.Function1[/* ma */ TaskEither_[E, Any], TaskEither_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirstIOK")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, Any], TaskEither_[E, Any]]]
  
  inline def orElseFirstTaskK[E, B](onLeft: js.Function1[/* e */ E, Task_[B]]): js.Function1[/* ma */ TaskEither_[E, Any], TaskEither_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirstTaskK")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E, Any], TaskEither_[E, Any]]]
  
  inline def orElseFirstW[E1, E2, B](onLeft: js.Function1[/* e */ E1, TaskEither_[E2, B]]): js.Function1[/* ma */ TaskEither_[E1, Any], TaskEither_[E1 | E2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseFirstW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E1, Any], TaskEither_[E1 | E2, Any]]]
  
  inline def orElseW[E1, E2, B](onLeft: js.Function1[/* e */ E1, TaskEither_[E2, B]]): js.Function1[/* ma */ TaskEither_[E1, Any], TaskEither_[E2, Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orElseW")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskEither_[E1, Any], TaskEither_[E2, Any | B]]]
  
  inline def orLeft[E1, E2](onLeft: js.Function1[/* e */ E1, Task_[E2]]): js.Function1[/* fa */ TaskEither_[E1, Any], TaskEither_[E2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("orLeft")(onLeft.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskEither_[E1, Any], TaskEither_[E2, Any]]]
  
  inline def right[E, A](a: A): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def rightIO[E, A](ma: IO_[A]): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightIO")(ma.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def rightTask[E, A](ma: Task_[A]): TaskEither_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightTask")(ma.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, A]]
  
  inline def sequenceArray[A, E](arr: js.Array[TaskEither_[E, A]]): TaskEither_[E, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, js.Array[A]]]
  
  inline def sequenceSeqArray[A, E](arr: js.Array[TaskEither_[E, A]]): TaskEither_[E, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceSeqArray")(arr.asInstanceOf[js.Any]).asInstanceOf[TaskEither_[E, js.Array[A]]]
  
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
    /* e */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
  ] = js.native
  
  inline def toUnion[E, A](fa: TaskEither_[E, A]): Task_[E | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnion")(fa.asInstanceOf[js.Any]).asInstanceOf[Task_[E | A]]
  
  inline def traverseArray[A, B, E](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[/* as */ js.Array[A], TaskEither_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskEither_[E, js.Array[B]]]]
  
  inline def traverseArrayWithIndex[A, B, E](f: js.Function2[/* index */ Double, /* a */ A, TaskEither_[E, B]]): js.Function1[/* as */ js.Array[A], TaskEither_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskEither_[E, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, E, B](f: js.Function2[/* index */ Double, /* a */ A, TaskEither_[E, B]]): js.Function1[/* as */ js.Array[A], TaskEither_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskEither_[E, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndexSeq[A, E, B](f: js.Function2[/* index */ Double, /* a */ A, TaskEither_[E, B]]): js.Function1[/* as */ js.Array[A], TaskEither_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskEither_[E, js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, E, B](f: js.Function2[/* index */ Double, /* a */ A, TaskEither_[E, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], TaskEither_[E, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], TaskEither_[E, ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndexSeq[A, E, B](f: js.Function2[/* index */ Double, /* a */ A, TaskEither_[E, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], TaskEither_[E, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], TaskEither_[E, ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseSeqArray[A, B, E](f: js.Function1[/* a */ A, TaskEither_[E, B]]): js.Function1[/* as */ js.Array[A], TaskEither_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskEither_[E, js.Array[B]]]]
  
  inline def traverseSeqArrayWithIndex[A, B, E](f: js.Function2[/* index */ Double, /* a */ A, TaskEither_[E, B]]): js.Function1[/* as */ js.Array[A], TaskEither_[E, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskEither_[E, js.Array[B]]]]
  
  inline def tryCatch[E, A](f: Lazy[js.Promise[A]], onRejected: js.Function1[/* reason */ Any, E]): TaskEither_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(f.asInstanceOf[js.Any], onRejected.asInstanceOf[js.Any])).asInstanceOf[TaskEither_[E, A]]
  
  inline def tryCatchK[E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, js.Promise[B]], onRejected: js.Function1[/* reason */ Any, E]): js.Function1[/* a */ A, TaskEither_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCatchK")(f.asInstanceOf[js.Any], onRejected.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, TaskEither_[E, B]]]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
