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
import typings.fpTs.fromTaskMod.FromTask1
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functorMod.Functor1
import typings.fpTs.iOMod.IO_
import typings.fpTs.monadIOMod.MonadIO1
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadTaskMod.MonadTask1
import typings.fpTs.naturalTransformationMod.NaturalTransformation11
import typings.fpTs.naturalTransformationMod.NaturalTransformation21
import typings.fpTs.optionMod.Option_
import typings.fpTs.pointedMod.Pointed1
import typings.fpTs.predicateMod.Predicate
import typings.fpTs.readonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.refinementMod.Refinement
import typings.fpTs.separatedMod.Separated_
import typings.fpTs.taskMod.Task_
import typings.fpTs.taskOptionMod.TaskOption
import typings.fpTs.taskOptionMod.URI
import typings.fpTs.zeroMod.Zero1
import typings.std.Exclude
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskOption {
  
  @JSImport("fp-ts", "taskOption")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "taskOption.Alt")
  @js.native
  val Alt_ : Alt1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.Alternative")
  @js.native
  val Alternative: Alternative1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.ApT")
  @js.native
  val ApT: TaskOption[js.Array[Any]] = js.native
  
  @JSImport("fp-ts", "taskOption.ApplicativePar")
  @js.native
  val ApplicativePar: Applicative1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.ApplicativeSeq")
  @js.native
  val ApplicativeSeq: Applicative1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.ApplyPar")
  @js.native
  val ApplyPar: Apply1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.ApplySeq")
  @js.native
  val ApplySeq: Apply1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.Chain")
  @js.native
  val Chain_ : Chain1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.Compactable")
  @js.native
  val Compactable: Compactable1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.Do")
  @js.native
  val Do: TaskOption[js.Object] = js.native
  
  @JSImport("fp-ts", "taskOption.Filterable")
  @js.native
  val Filterable: Filterable1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.FromEither")
  @js.native
  val FromEither_ : FromEither1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.FromIO")
  @js.native
  val FromIO_ : FromIO1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.FromTask")
  @js.native
  val FromTask_ : FromTask1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.Functor")
  @js.native
  val Functor: Functor1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.Monad")
  @js.native
  val Monad: Monad1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.MonadIO")
  @js.native
  val MonadIO: MonadIO1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.MonadTask")
  @js.native
  val MonadTask: MonadTask1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.Pointed")
  @js.native
  val Pointed: Pointed1[URI] = js.native
  
  @JSImport("fp-ts", "taskOption.Zero")
  @js.native
  val Zero_ : Zero1[URI] = js.native
  
  inline def alt[A](second: Lazy[TaskOption[A]]): js.Function1[/* first */ TaskOption[A], TaskOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskOption[A], TaskOption[A]]]
  
  inline def altW[B](second: Lazy[TaskOption[B]]): js.Function1[/* first */ TaskOption[Any], TaskOption[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("altW")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskOption[Any], TaskOption[Any | B]]]
  
  inline def ap[A](fa: TaskOption[A]): js.Function1[/* fab */ TaskOption[js.Function1[/* a */ A, Any]], TaskOption[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ TaskOption[js.Function1[/* a */ A, Any]], TaskOption[Any]]]
  
  inline def apFirst[B](second: TaskOption[B]): js.Function1[/* first */ TaskOption[Any], TaskOption[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskOption[Any], TaskOption[Any]]]
  
  inline def apS[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], fb: TaskOption[B]): js.Function1[
    /* fa */ TaskOption[A], 
    TaskOption[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ TaskOption[A], 
    TaskOption[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  inline def apSecond[B](second: TaskOption[B]): js.Function1[/* first */ TaskOption[Any], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ TaskOption[Any], TaskOption[B]]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, TaskOption[B]]): js.Function1[
    /* ma */ TaskOption[A], 
    TaskOption[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ TaskOption[A], 
    TaskOption[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ TaskOption[Any], 
    TaskOption[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ TaskOption[Any], 
    TaskOption[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[Any]
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
  
  @JSImport("fp-ts", "taskOption.compact")
  @js.native
  val compact: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Option<A>> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ] = js.native
  
  inline def filter[A](predicate: Predicate[A]): js.Function1[/* fb */ TaskOption[A], TaskOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ TaskOption[A], TaskOption[A]]]
  
  inline def filterMap[A, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* fga */ TaskOption[A], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fga */ TaskOption[A], TaskOption[B]]]
  
  inline def filter_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fb */ TaskOption[A], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ TaskOption[A], TaskOption[B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ TaskOption[js.Function1[/* a */ A, Any]], TaskOption[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ TaskOption[js.Function1[/* a */ A, Any]], TaskOption[Any]]]
  
  inline def flatten[A](mma: TaskOption[TaskOption[A]]): TaskOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[TaskOption[A]]
  
  inline def fold[B, A](onNone: js.Function0[Task_[B]], onSome: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* ma */ TaskOption[A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskOption[A], Task_[B]]]
  
  inline def foldW[B, C, A](onNone: js.Function0[Task_[B]], onSome: js.Function1[/* a */ A, Task_[C]]): js.Function1[/* ma */ TaskOption[A], Task_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldW")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskOption[A], Task_[B | C]]]
  
  @JSImport("fp-ts", "taskOption.fromEither")
  @js.native
  val fromEither: NaturalTransformation21[typings.fpTs.eitherMod.URI, URI] = js.native
  
  inline def fromEitherK[E, A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Either_[E, B]]): js.Function1[/* a */ A, TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEitherK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[B]]]
  
  @JSImport("fp-ts", "taskOption.fromIO")
  @js.native
  val fromIO: NaturalTransformation11[typings.fpTs.iOMod.URI, URI] = js.native
  
  inline def fromIOK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[B]]]
  
  inline def fromNullable[A](a: A): TaskOption[NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(a.asInstanceOf[js.Any]).asInstanceOf[TaskOption[NonNullable[A]]]
  
  inline def fromNullableK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, js.UndefOr[B | Null]]): js.Function1[/* a */ A, TaskOption[NonNullable[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[NonNullable[B]]]]
  
  @JSImport("fp-ts", "taskOption.fromOption")
  @js.native
  val fromOption: NaturalTransformation11[typings.fpTs.optionMod.URI, URI] = js.native
  
  inline def fromOptionK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Option_[B]]): js.Function1[/* a */ A, TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[B]]]
  
  inline def fromPredicate[A](predicate: Predicate[A]): js.Function1[/* b */ A, TaskOption[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* b */ A, TaskOption[A]]]
  
  inline def fromPredicate_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* a */ A, TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[B]]]
  
  @JSImport("fp-ts", "taskOption.fromTask")
  @js.native
  val fromTask: NaturalTransformation11[typings.fpTs.taskMod.URI, URI] = js.native
  
  @JSImport("fp-ts", "taskOption.fromTaskEither")
  @js.native
  val fromTaskEither: NaturalTransformation21[typings.fpTs.taskEitherMod.URI, URI] = js.native
  
  inline def fromTaskK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* a */ A, TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[B]]]
  
  inline def getOrElse[A](onNone: Lazy[Task_[A]]): js.Function1[/* fa */ TaskOption[A], Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElse")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskOption[A], Task_[A]]]
  
  inline def getOrElseW[B](onNone: Lazy[Task_[B]]): js.Function1[/* ma */ TaskOption[Any], Task_[Any | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrElseW")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ TaskOption[Any], Task_[Any | B]]]
  
  inline def guard(b: Boolean): TaskOption[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("guard")(b.asInstanceOf[js.Any]).asInstanceOf[TaskOption[Unit]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskOption[A], TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskOption[A], TaskOption[B]]]
  
  inline def `match`[B, A](onNone: js.Function0[B], onSome: js.Function1[/* a */ A, B]): js.Function1[/* ma */ TaskOption[A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskOption[A], Task_[B]]]
  
  inline def matchE[B, A](onNone: js.Function0[Task_[B]], onSome: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* ma */ TaskOption[A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskOption[A], Task_[B]]]
  
  inline def matchEW[B, C, A](onNone: js.Function0[Task_[B]], onSome: js.Function1[/* a */ A, Task_[C]]): js.Function1[/* ma */ TaskOption[A], Task_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchEW")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskOption[A], Task_[B | C]]]
  
  inline def matchW[B, A, C](onNone: js.Function0[B], onSome: js.Function1[/* a */ A, C]): js.Function1[/* ma */ TaskOption[A], Task_[B | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onNone.asInstanceOf[js.Any], onSome.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskOption[A], Task_[B | C]]]
  
  @JSImport("fp-ts", "taskOption.none")
  @js.native
  val none: TaskOption[scala.Nothing] = js.native
  
  @JSImport("fp-ts", "taskOption.of")
  @js.native
  val of: js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ] = js.native
  
  inline def partition[A](predicate: Predicate[A]): js.Function1[/* fb */ TaskOption[A], Separated_[TaskOption[A], TaskOption[A]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ TaskOption[A], Separated_[TaskOption[A], TaskOption[A]]]]
  
  inline def partitionMap[A, B, C](f: js.Function1[/* a */ A, Either_[B, C]]): js.Function1[/* fa */ TaskOption[A], Separated_[TaskOption[B], TaskOption[C]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partitionMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskOption[A], Separated_[TaskOption[B], TaskOption[C]]]]
  
  inline def partition_AB_A[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* fb */ TaskOption[A], Separated_[TaskOption[A], TaskOption[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partition")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fb */ TaskOption[A], Separated_[TaskOption[A], TaskOption[B]]]]
  
  @JSImport("fp-ts", "taskOption.separate")
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
  
  inline def traverseArray[A, B](f: js.Function1[/* a */ A, TaskOption[B]]): js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]]]
  
  inline def traverseArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, TaskOption[B]]): js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, TaskOption[B]]): js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndexSeq[A, B](f: js.Function2[/* index */ Double, /* a */ A, TaskOption[B]]): js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, TaskOption[B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], TaskOption[ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], TaskOption[ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndexSeq[A, B](f: js.Function2[/* index */ Double, /* a */ A, TaskOption[B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], TaskOption[ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], TaskOption[ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseSeqArray[A, B](f: js.Function1[/* a */ A, TaskOption[B]]): js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]]]
  
  inline def traverseSeqArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, TaskOption[B]]): js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], TaskOption[js.Array[B]]]]
  
  inline def tryCatch[A](f: Lazy[js.Promise[A]]): TaskOption[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCatch")(f.asInstanceOf[js.Any]).asInstanceOf[TaskOption[A]]
  
  inline def tryCatchK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, js.Promise[B]]): js.Function1[/* a */ A, TaskOption[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryCatchK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskOption[B]]]
  
  @JSImport("fp-ts", "taskOption.zero")
  @js.native
  val zero: js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
