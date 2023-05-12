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
import typings.fpTs.libFromTaskMod.FromTask1
import typings.fpTs.libFunctionMod.LazyArg
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libIOMod.IO_
import typings.fpTs.libMonadIOMod.MonadIO1
import typings.fpTs.libMonadMod.Monad1
import typings.fpTs.libMonadTaskMod.MonadTask1
import typings.fpTs.libOptionMod.Option_
import typings.fpTs.libPointedMod.Pointed1
import typings.fpTs.libPredicateMod.Predicate
import typings.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.libRefinementMod.Refinement
import typings.fpTs.libSeparatedMod.Separated_
import typings.fpTs.libTaskEitherMod.TaskEither_
import typings.fpTs.libTaskMod.Task_
import typings.fpTs.libZeroMod.Zero1
import typings.std.Exclude
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTaskOptionMod {
  
  @JSImport("fp-ts/lib/TaskOption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "Alt")
  @js.native
  val Alt_ : Alt1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "Alternative")
  @js.native
  val Alternative: Alternative1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "ApT")
  @js.native
  val ApT: TaskOption[js.Array[Any]] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "ApplicativePar")
  @js.native
  val ApplicativePar: Applicative1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "ApplicativeSeq")
  @js.native
  val ApplicativeSeq: Applicative1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "ApplyPar")
  @js.native
  val ApplyPar: Apply1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "ApplySeq")
  @js.native
  val ApplySeq: Apply1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "Chain")
  @js.native
  val Chain_ : Chain1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "Compactable")
  @js.native
  val Compactable: Compactable1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "Do")
  @js.native
  val Do: TaskOption[js.Object] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "Filterable")
  @js.native
  val Filterable: Filterable1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "FromEither")
  @js.native
  val FromEither_ : FromEither1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "FromIO")
  @js.native
  val FromIO_ : FromIO1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "FromTask")
  @js.native
  val FromTask_ : FromTask1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "Monad")
  @js.native
  val Monad: Monad1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "MonadIO")
  @js.native
  val MonadIO: MonadIO1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "MonadTask")
  @js.native
  val MonadTask: MonadTask1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "Pointed")
  @js.native
  val Pointed: Pointed1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskOption", "URI")
  @js.native
  val URI: /* "TaskOption" */ String = js.native
  type URI = /* "TaskOption" */ String
  
  @JSImport("fp-ts/lib/TaskOption", "Zero")
  @js.native
  val Zero_ : Zero1[typings.fpTs.libTaskOptionMod.URI] = js.native
  
  inline def alt[A](second: LazyArg[TaskOption[A]]): js.Function1[/* first */ TaskOption[A], TaskOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskOption[A], TaskOption[A]]]
  
  inline def altW[B](second: LazyArg[TaskOption[B]]): js.Function1[/* first */ TaskOption[Any], TaskOption[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("altW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskOption[Any], TaskOption[Any | B]]]
  
  inline def ap[A](fa: TaskOption[A]): js.Function1[/* fab */ TaskOption[js.Function1[/* a */ A, Any]], TaskOption[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ TaskOption[js.Function1[/* a */ A, Any]], TaskOption[Any]]]
  
  inline def apFirst[B](second: TaskOption[B]): js.Function1[/* first */ TaskOption[Any], TaskOption[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskOption[Any], TaskOption[Any]]]
  
  inline def apS[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], fb: TaskOption[B]): js.Function1[
    /* fa */ TaskOption[A], 
    TaskOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ TaskOption[A], 
    TaskOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[B](second: TaskOption[B]): js.Function1[/* first */ TaskOption[Any], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskOption[Any], TaskOption[B]]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, TaskOption[B]]): js.Function1[
    /* ma */ TaskOption[A], 
    TaskOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ TaskOption[A], 
    TaskOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ TaskOption[Any], 
    TaskOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ TaskOption[Any], 
    TaskOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def chain[A, B](f: js.Function1[/* a */ A, TaskOption[B]]): js.Function1[/* ma */ TaskOption[A], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskOption[A], TaskOption[B]]]
  
  inline def chainEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ TaskOption[A], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskOption[A], TaskOption[B]]]
  
  inline def chainFirst[A, B](f: js.Function1[/* a */ A, TaskOption[B]]): js.Function1[/* first */ TaskOption[A], TaskOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskOption[A], TaskOption[A]]]
  
  inline def chainFirstEitherK[E, A, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* ma */ TaskOption[A], TaskOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskOption[A], TaskOption[A]]]
  
  inline def chainFirstIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ TaskOption[A], TaskOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskOption[A], TaskOption[A]]]
  
  inline def chainFirstTaskK[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* first */ TaskOption[A], TaskOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskOption[A], TaskOption[A]]]
  
  inline def chainIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ TaskOption[A], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskOption[A], TaskOption[B]]]
  
  inline def chainNullableK[A, B](f: js.Function1[/* a */ A, js.UndefOr[B | Null]]): js.Function1[/* ma */ TaskOption[A], TaskOption[NonNullable[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainNullableK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskOption[A], TaskOption[NonNullable[B]]]]
  
  inline def chainOptionK[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* ma */ TaskOption[A], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainOptionK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskOption[A], TaskOption[B]]]
  
  inline def chainTaskK[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* first */ TaskOption[A], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskOption[A], TaskOption[B]]]
  
  @JSImport("fp-ts/lib/TaskOption", "compact")
  @js.native
  val compact: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ] = js.native
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* fb */ TaskOption[A], TaskOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ TaskOption[A], TaskOption[A]]]
  
  inline def filterMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* fga */ TaskOption[A], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fga */ TaskOption[A], TaskOption[B]]]
  
  inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fb */ TaskOption[A], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ TaskOption[A], TaskOption[B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ TaskOption[js.Function1[/* a */ A, Any]], TaskOption[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ TaskOption[js.Function1[/* a */ A, Any]], TaskOption[Any]]]
  
  inline def flatMap[A, B](f: js.Function1[/* a */ A, TaskOption[B]]): js.Function1[/* ma */ TaskOption[A], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskOption[A], TaskOption[B]]]
  inline def flatMap[A, B](ma: TaskOption[A], f: js.Function1[/* a */ A, TaskOption[B]]): TaskOption[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(ma.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[TaskOption[B]]
  
  inline def flatten[A](mma: TaskOption[TaskOption[A]]): TaskOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[TaskOption[A]]
  
  inline def fold[B, A](onNone: js.Function0[Task_[B]], onSome: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* ma */ TaskOption[A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskOption[A], Task_[B]]]
  
  inline def foldW[B, C, A](onNone: js.Function0[Task_[B]], onSome: js.Function1[/* a */ A, Task_[C]]): js.Function1[/* ma */ TaskOption[A], Task_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldW")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskOption[A], Task_[B | C]]]
  
  inline def fromEither[A](fa: Either_[Any, A]): TaskOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEither")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskOption[A]]
  
  inline def fromEitherK[E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[B]]]
  
  inline def fromIO[A](fa: IO_[A]): TaskOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIO")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskOption[A]]
  
  inline def fromIOK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[B]]]
  
  inline def fromNullable[A](a: A): TaskOption[NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(a.asInstanceOf[js.Any]).asInstanceOf[TaskOption[NonNullable[A]]]
  
  inline def fromNullableK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, js.UndefOr[B | Null]]): js.Function1[/* a */ A, TaskOption[NonNullable[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[NonNullable[B]]]]
  
  inline def fromOption[A](fa: Option_[A]): TaskOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskOption[A]]
  
  inline def fromOptionK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* a */ A, TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[B]]]
  
  inline def fromPredicate[A](predicate: Predicate[A]): js.Function1[/* b */ A, TaskOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ A, TaskOption[A]]]
  
  inline def fromPredicate_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* a */ A, TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[B]]]
  
  inline def fromTask[A](fa: Task_[A]): TaskOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTask")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskOption[A]]
  
  inline def fromTaskEither[A](fa: TaskEither_[Any, A]): TaskOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskEither")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskOption[A]]
  
  inline def fromTaskK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* a */ A, TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[B]]]
  
  inline def getOrElse[A](onNone: LazyArg[Task_[A]]): js.Function1[/* fa */ TaskOption[A], Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskOption[A], Task_[A]]]
  
  inline def getOrElseW[B](onNone: LazyArg[Task_[B]]): js.Function1[/* ma */ TaskOption[Any], Task_[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskOption[Any], Task_[Any | B]]]
  
  inline def guard(b: Boolean): TaskOption[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("guard")(b.asInstanceOf[js.Any]).asInstanceOf[TaskOption[Unit]]
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ TaskOption[A], 
    TaskOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ TaskOption[A], 
    TaskOption[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskOption[A], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskOption[A], TaskOption[B]]]
  
  inline def `match`[B, A](onNone: js.Function0[B], onSome: js.Function1[/* a */ A, B]): js.Function1[/* ma */ TaskOption[A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskOption[A], Task_[B]]]
  
  inline def matchE[B, A](onNone: js.Function0[Task_[B]], onSome: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* ma */ TaskOption[A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskOption[A], Task_[B]]]
  
  inline def matchEW[B, C, A](onNone: js.Function0[Task_[B]], onSome: js.Function1[/* a */ A, Task_[C]]): js.Function1[/* ma */ TaskOption[A], Task_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchEW")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskOption[A], Task_[B | C]]]
  
  inline def matchW[B, A, C](onNone: js.Function0[B], onSome: js.Function1[/* a */ A, C]): js.Function1[/* ma */ TaskOption[A], Task_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskOption[A], Task_[B | C]]]
  
  @JSImport("fp-ts/lib/TaskOption", "none")
  @js.native
  val none: TaskOption[scala.Nothing] = js.native
  
  inline def of[A](a: A): TaskOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[TaskOption[A]]
  
  inline def partition[A](predicate: Predicate[A]): js.Function1[/* fb */ TaskOption[A], Separated_[TaskOption[A], TaskOption[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ TaskOption[A], Separated_[TaskOption[A], TaskOption[A]]]]
  
  inline def partitionMap[A, B, C](f: js.Function1[/* a */ A, Either_[B, C]]): js.Function1[/* fa */ TaskOption[A], Separated_[TaskOption[B], TaskOption[C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskOption[A], Separated_[TaskOption[B], TaskOption[C]]]]
  
  inline def partition_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fb */ TaskOption[A], Separated_[TaskOption[A], TaskOption[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ TaskOption[A], Separated_[TaskOption[A], TaskOption[B]]]]
  
  @JSImport("fp-ts/lib/TaskOption", "separate")
  @js.native
  val separate: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Either<A, B>> */ /* fa */ Any, 
    Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ]
  ] = js.native
  
  inline def sequenceArray[A](as: js.Array[TaskOption[A]]): TaskOption[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(as.asInstanceOf[js.Any]).asInstanceOf[TaskOption[js.Array[A]]]
  
  inline def sequenceSeqArray[A](as: js.Array[TaskOption[A]]): TaskOption[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceSeqArray")(as.asInstanceOf[js.Any]).asInstanceOf[TaskOption[js.Array[A]]]
  
  inline def some[A](a: A): TaskOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(a.asInstanceOf[js.Any]).asInstanceOf[TaskOption[A]]
  
  inline def tap[A, _underscore](f: js.Function1[/* a */ A, TaskOption[_underscore]]): js.Function1[/* self */ TaskOption[A], TaskOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* self */ TaskOption[A], TaskOption[A]]]
  inline def tap[A, _underscore](self: TaskOption[A], f: js.Function1[/* a */ A, TaskOption[_underscore]]): TaskOption[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[TaskOption[A]]
  
  inline def traverseArray[A, B](f: js.Function1[/* a */ A, TaskOption[B]]): js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]]]
  
  inline def traverseArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, TaskOption[B]]): js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, TaskOption[B]]): js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndexSeq[A, B](f: js.Function2[/* index */ Double, /* a */ A, TaskOption[B]]): js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, TaskOption[B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], TaskOption[ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], TaskOption[ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndexSeq[A, B](f: js.Function2[/* index */ Double, /* a */ A, TaskOption[B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], TaskOption[ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], TaskOption[ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseSeqArray[A, B](f: js.Function1[/* a */ A, TaskOption[B]]): js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]]]
  
  inline def traverseSeqArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, TaskOption[B]]): js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]]]
  
  inline def tryCatch[A](f: LazyArg[js.Promise[A]]): TaskOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(f.asInstanceOf[js.Any]).asInstanceOf[TaskOption[A]]
  
  inline def tryCatchK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, js.Promise[B]]): js.Function1[/* a */ A, TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCatchK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[B]]]
  
  inline def zero[A](): TaskOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[TaskOption[A]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  type TaskOption[A] = Task_[Option_[A]]
}
