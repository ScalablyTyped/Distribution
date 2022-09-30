package typings.fpTs

import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applyMod.Apply1
import typings.fpTs.applyMod.Apply2C
import typings.fpTs.bifunctorMod.Bifunctor2
import typings.fpTs.chainMod.Chain2C
import typings.fpTs.fpTsStrings.Option
import typings.fpTs.fpTsStrings.TaskThese
import typings.fpTs.fromEitherMod.FromEither2
import typings.fpTs.fromIOMod.FromIO2
import typings.fpTs.fromTaskMod.FromTask2
import typings.fpTs.fromTheseMod.FromThese2
import typings.fpTs.functionMod.Lazy
import typings.fpTs.functorMod.Functor2
import typings.fpTs.iOMod.IO_
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadTaskMod.MonadTask2C
import typings.fpTs.naturalTransformationMod.NaturalTransformation12
import typings.fpTs.naturalTransformationMod.NaturalTransformation12C
import typings.fpTs.naturalTransformationMod.NaturalTransformation22
import typings.fpTs.optionMod.Option_
import typings.fpTs.pointedMod.Pointed2
import typings.fpTs.predicateMod.Predicate
import typings.fpTs.readonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.refinementMod.Refinement
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.taskMod.Task_
import typings.fpTs.theseMod.These_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskTheseMod {
  
  @JSImport("fp-ts/lib/TaskThese", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "ApT")
  @js.native
  val ApT: TaskThese_[scala.Nothing, js.Array[Any]] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "Bifunctor")
  @js.native
  val Bifunctor: Bifunctor2[typings.fpTs.taskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "FromEither")
  @js.native
  val FromEither_ : FromEither2[typings.fpTs.taskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "FromIO")
  @js.native
  val FromIO_ : FromIO2[typings.fpTs.taskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "FromTask")
  @js.native
  val FromTask_ : FromTask2[typings.fpTs.taskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "FromThese")
  @js.native
  val FromThese_ : FromThese2[typings.fpTs.taskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.taskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "Pointed")
  @js.native
  val Pointed: Pointed2[typings.fpTs.taskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "URI")
  @js.native
  val URI: /* "TaskThese" */ String = js.native
  type URI = /* "TaskThese" */ String
  
  @JSImport("fp-ts/lib/TaskThese", "bifunctorTaskThese")
  @js.native
  val bifunctorTaskThese: Bifunctor2[typings.fpTs.taskTheseMod.URI] = js.native
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskThese_[E, A], TaskThese_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], TaskThese_[G, B]]]
  
  inline def both[E, A](e: E, a: A): TaskThese_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("both")(e.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[TaskThese_[E, A]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ TaskThese_[Any, js.Function1[/* a */ A, Any]], TaskThese_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ TaskThese_[Any, js.Function1[/* a */ A, Any]], TaskThese_[Any, Any]]]
  
  inline def fold[E, B, A](
    onLeft: js.Function1[/* e */ E, Task_[B]],
    onRight: js.Function1[/* a */ A, Task_[B]],
    onBoth: js.Function2[/* e */ E, /* a */ A, Task_[B]]
  ): js.Function1[/* fa */ TaskThese_[E, A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[B]]]
  
  inline def foldW[E, B, A, C, D](
    onLeft: js.Function1[/* e */ E, Task_[B]],
    onRight: js.Function1[/* a */ A, Task_[C]],
    onBoth: js.Function2[/* e */ E, /* a */ A, Task_[D]]
  ): js.Function1[/* fa */ TaskThese_[E, A], Task_[B | C | D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[B | C | D]]]
  
  @JSImport("fp-ts/lib/TaskThese", "fromEither")
  @js.native
  val fromEither: NaturalTransformation22[typings.fpTs.eitherMod.URI, typings.fpTs.taskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "fromIO")
  @js.native
  val fromIO: NaturalTransformation12[typings.fpTs.iOMod.URI, typings.fpTs.taskTheseMod.URI] = js.native
  
  @JSImport("fp-ts/lib/TaskThese", "fromIOEither")
  @js.native
  val fromIOEither: NaturalTransformation22[typings.fpTs.ioeitherMod.URI, typings.fpTs.taskTheseMod.URI] = js.native
  
  inline def fromIOK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, TaskThese_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskThese_[Any, B]]]
  
  inline def fromOption[E](onNone: Lazy[E]): NaturalTransformation12C[Option, TaskThese, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOption")(onNone.asInstanceOf[js.Any]).asInstanceOf[NaturalTransformation12C[Option, TaskThese, E]]
  
  inline def fromOptionK[E](onNone: Lazy[E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], TaskThese_[E, Any]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionK")(onNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Option_[Any]], 
    js.Function1[/* a */ js.Array[Any], TaskThese_[E, Any]]
  ]]
  
  inline def fromPredicate[A_1, E_1](predicate: Predicate[A_1], onFalse: js.Function1[/* a */ A_1, E_1]): js.Function1[/* b */ A_1, TaskThese_[E_1, A_1]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* b */ A_1, TaskThese_[E_1, A_1]]]
  
  inline def fromPredicate_ABE[A, B /* <: A */, E](refinement: Refinement[A, B], onFalse: js.Function1[/* a */ A, E]): js.Function1[/* a */ A, TaskThese_[E, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A, TaskThese_[E, B]]]
  
  inline def fromPredicate_A_2E_2[A_2, E_2](predicate: Predicate[A_2], onFalse: js.Function1[/* a */ A_2, E_2]): js.Function1[/* a */ A_2, TaskThese_[E_2, A_2]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any], onFalse.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* a */ A_2, TaskThese_[E_2, A_2]]]
  
  @JSImport("fp-ts/lib/TaskThese", "fromTask")
  @js.native
  val fromTask: NaturalTransformation12[typings.fpTs.taskMod.URI, typings.fpTs.taskTheseMod.URI] = js.native
  
  inline def fromTaskK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* a */ A, TaskThese_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskThese_[Any, B]]]
  
  @JSImport("fp-ts/lib/TaskThese", "fromThese")
  @js.native
  val fromThese: NaturalTransformation22[typings.fpTs.theseMod.URI, typings.fpTs.taskTheseMod.URI] = js.native
  
  inline def fromTheseK[A /* <: js.Array[Any] */, E, B](f: js.Function1[/* a */ A, These_[E, B]]): js.Function1[/* a */ A, TaskThese_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTheseK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, TaskThese_[E, B]]]
  
  @JSImport("fp-ts/lib/TaskThese", "functorTaskThese")
  @js.native
  val functorTaskThese: Functor2[typings.fpTs.taskTheseMod.URI] = js.native
  
  inline def getApplicative[E](A: Apply1[typings.fpTs.taskMod.URI], S: Semigroup[E]): Applicative2C[typings.fpTs.taskTheseMod.URI, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicative")(A.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[Applicative2C[typings.fpTs.taskTheseMod.URI, E]]
  
  inline def getApply[E](A: Apply1[typings.fpTs.taskMod.URI], S: Semigroup[E]): Apply2C[TaskThese, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApply")(A.asInstanceOf[js.Any], S.asInstanceOf[js.Any])).asInstanceOf[Apply2C[TaskThese, E]]
  
  inline def getChain[E](S: Semigroup[E]): Chain2C[typings.fpTs.taskTheseMod.URI, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChain")(S.asInstanceOf[js.Any]).asInstanceOf[Chain2C[typings.fpTs.taskTheseMod.URI, E]]
  
  inline def getMonad[E](S: Semigroup[E]): (Monad2C[typings.fpTs.taskTheseMod.URI, E]) & (MonadTask2C[typings.fpTs.taskTheseMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonad")(S.asInstanceOf[js.Any]).asInstanceOf[(Monad2C[typings.fpTs.taskTheseMod.URI, E]) & (MonadTask2C[typings.fpTs.taskTheseMod.URI, E])]
  
  inline def getSemigroup[E, A](SE: Semigroup[E], SA: Semigroup[A]): Semigroup[TaskThese_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Semigroup[TaskThese_[E, A]]]
  
  inline def left[E, A](e: E): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(e.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def leftIO[E, A](me: IO_[E]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftIO")(me.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def leftTask[E, A](me: Task_[E]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftTask")(me.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskThese_[Any, A], TaskThese_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskThese_[Any, A], TaskThese_[Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ TaskThese_[E, Any], TaskThese_[G, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, Any], TaskThese_[G, Any]]]
  
  inline def `match`[E, B, A](
    onLeft: js.Function1[/* e */ E, B],
    onRight: js.Function1[/* a */ A, B],
    onBoth: js.Function2[/* e */ E, /* a */ A, B]
  ): js.Function1[/* fa */ TaskThese_[E, A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[B]]]
  
  inline def matchE[E, B, A](
    onLeft: js.Function1[/* e */ E, Task_[B]],
    onRight: js.Function1[/* a */ A, Task_[B]],
    onBoth: js.Function2[/* e */ E, /* a */ A, Task_[B]]
  ): js.Function1[/* fa */ TaskThese_[E, A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchE")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[B]]]
  
  inline def matchEW[E, B, A, C, D](
    onLeft: js.Function1[/* e */ E, Task_[B]],
    onRight: js.Function1[/* a */ A, Task_[C]],
    onBoth: js.Function2[/* e */ E, /* a */ A, Task_[D]]
  ): js.Function1[/* fa */ TaskThese_[E, A], Task_[B | C | D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchEW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[B | C | D]]]
  
  inline def matchW[E, B, A, C, D](
    onLeft: js.Function1[/* e */ E, B],
    onRight: js.Function1[/* a */ A, C],
    onBoth: js.Function2[/* e */ E, /* a */ A, D]
  ): js.Function1[/* ma */ TaskThese_[E, A], Task_[B | C | D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchW")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* ma */ TaskThese_[E, A], Task_[B | C | D]]]
  
  inline def of[E, A](a: A): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def right[E, A](a: A): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def rightIO[E, A](ma: IO_[A]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightIO")(ma.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def rightTask[E, A](ma: Task_[A]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightTask")(ma.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def swap[E, A](fa: TaskThese_[E, A]): TaskThese_[A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[A, E]]
  
  @JSImport("fp-ts/lib/TaskThese", "taskThese")
  @js.native
  val taskThese: Functor2[typings.fpTs.taskTheseMod.URI] & Bifunctor2[typings.fpTs.taskTheseMod.URI] = js.native
  
  inline def toTuple[E, A](e: E, a: A): js.Function1[/* fa */ TaskThese_[E, A], Task_[js.Tuple2[E, A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTuple")(e.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[js.Tuple2[E, A]]]]
  
  inline def toTuple2[E, A](e: Lazy[E], a: Lazy[A]): js.Function1[/* fa */ TaskThese_[E, A], Task_[js.Tuple2[E, A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTuple2")(e.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[js.Tuple2[E, A]]]]
  
  inline def traverseReadonlyArrayWithIndex[E](S: Semigroup[E]): js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ js.Array[Any], TaskThese_[E, js.Array[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ js.Array[Any], TaskThese_[E, js.Array[Any]]]
  ]]
  
  inline def traverseReadonlyArrayWithIndexSeq[E](S: Semigroup[E]): js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ js.Array[Any], TaskThese_[E, js.Array[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndexSeq")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ js.Array[Any], TaskThese_[E, js.Array[Any]]]
  ]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[E](S: Semigroup[E]): js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ ReadonlyNonEmptyArray_[Any], TaskThese_[E, ReadonlyNonEmptyArray_[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ ReadonlyNonEmptyArray_[Any], TaskThese_[E, ReadonlyNonEmptyArray_[Any]]]
  ]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndexSeq[E](S: Semigroup[E]): js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ ReadonlyNonEmptyArray_[Any], TaskThese_[E, ReadonlyNonEmptyArray_[Any]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndexSeq")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function2[/* index */ Double, /* a */ Any, TaskThese_[E, Any]], 
    js.Function1[/* as */ ReadonlyNonEmptyArray_[Any], TaskThese_[E, ReadonlyNonEmptyArray_[Any]]]
  ]]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  type TaskThese_[E, A] = Task_[These_[E, A]]
}
