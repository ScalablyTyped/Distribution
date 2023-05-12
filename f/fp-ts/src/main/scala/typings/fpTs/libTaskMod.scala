package typings.fpTs

import typings.fpTs.libApplicativeMod.Applicative1
import typings.fpTs.libApplyMod.Apply1
import typings.fpTs.libChainMod.Chain1
import typings.fpTs.libFromIOMod.FromIO1
import typings.fpTs.libFromTaskMod.FromTask1
import typings.fpTs.libFunctorMod.Functor1
import typings.fpTs.libIOMod.IO_
import typings.fpTs.libMonadIOMod.MonadIO1
import typings.fpTs.libMonadMod.Monad1
import typings.fpTs.libMonadTaskMod.MonadTask1
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libPointedMod.Pointed1
import typings.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.libSemigroupMod.Semigroup
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTaskMod {
  
  @JSImport("fp-ts/lib/Task", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Task", "ApT")
  @js.native
  val ApT: Task_[js.Array[Any]] = js.native
  
  @JSImport("fp-ts/lib/Task", "ApplicativePar")
  @js.native
  val ApplicativePar: Applicative1[typings.fpTs.libTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Task", "ApplicativeSeq")
  @js.native
  val ApplicativeSeq: Applicative1[typings.fpTs.libTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Task", "ApplyPar")
  @js.native
  val ApplyPar: Apply1[typings.fpTs.libTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Task", "ApplySeq")
  @js.native
  val ApplySeq: Apply1[typings.fpTs.libTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Task", "Chain")
  @js.native
  val Chain_ : Chain1[typings.fpTs.libTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Task", "Do")
  @js.native
  val Do: Task_[js.Object] = js.native
  
  @JSImport("fp-ts/lib/Task", "FromIO")
  @js.native
  val FromIO_ : FromIO1[typings.fpTs.libTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Task", "FromTask")
  @js.native
  val FromTask_ : FromTask1[typings.fpTs.libTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Task", "Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.libTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Task", "Monad")
  @js.native
  val Monad: Monad1[typings.fpTs.libTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Task", "MonadIO")
  @js.native
  val MonadIO: MonadIO1[typings.fpTs.libTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Task", "MonadTask")
  @js.native
  val MonadTask: MonadTask1[typings.fpTs.libTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Task", "Pointed")
  @js.native
  val Pointed: Pointed1[typings.fpTs.libTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Task", "URI")
  @js.native
  val URI: /* "Task" */ String = js.native
  type URI = /* "Task" */ String
  
  inline def ap[A](fa: Task_[A]): js.Function1[/* fab */ Task_[js.Function1[/* a */ A, Any]], Task_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Task_[js.Function1[/* a */ A, Any]], Task_[Any]]]
  
  inline def apFirst[B](second: Task_[B]): js.Function1[/* first */ Task_[Any], Task_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Task_[Any], Task_[Any]]]
  
  inline def apS[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], fb: Task_[B]): js.Function1[
    /* fa */ Task_[A], 
    Task_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Task_[A], 
    Task_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[B](second: Task_[B]): js.Function1[/* first */ Task_[Any], Task_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Task_[Any], Task_[B]]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Task_[B]]): js.Function1[
    /* ma */ Task_[A], 
    Task_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ Task_[A], 
    Task_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ Task_[Any], 
    Task_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Task_[Any], 
    Task_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def chain[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* ma */ Task_[A], Task_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Task_[A], Task_[B]]]
  
  inline def chainFirst[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* first */ Task_[A], Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Task_[A], Task_[A]]]
  
  inline def chainFirstIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ Task_[A], Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Task_[A], Task_[A]]]
  
  inline def chainIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ Task_[A], Task_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ Task_[A], Task_[B]]]
  
  inline def delay(millis: Double): js.Function1[/* ma */ Task_[Any], Task_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(millis.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Task_[Any], Task_[Any]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ Task_[js.Function1[/* a */ A, Any]], Task_[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Task_[js.Function1[/* a */ A, Any]], Task_[Any]]]
  
  inline def flatMap[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* ma */ Task_[A], Task_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Task_[A], Task_[B]]]
  inline def flatMap[A, B](ma: Task_[A], f: js.Function1[/* a */ A, Task_[B]]): Task_[B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(ma.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Task_[B]]
  
  inline def flatten[A](mma: Task_[Task_[A]]): Task_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[Task_[A]]
  
  inline def fromIO[A](fa: IO_[A]): Task_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIO")(fa.asInstanceOf[js.Any]).asInstanceOf[Task_[A]]
  
  inline def fromIOK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, Task_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, Task_[B]]]
  
  inline def fromTask[A](fa: Task_[A]): Task_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTask")(fa.asInstanceOf[js.Any]).asInstanceOf[Task_[A]]
  
  inline def getMonoid[A](M: Monoid[A]): Monoid[Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[Task_[A]]]
  
  inline def getRaceMonoid[A](): Monoid[Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRaceMonoid")().asInstanceOf[Monoid[Task_[A]]]
  
  inline def getSemigroup[A](S: Semigroup[A]): Semigroup[Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Task_[A]]]
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ Task_[A], 
    Task_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Task_[A], 
    Task_[
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Task_[A], Task_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Task_[A], Task_[B]]]
  
  @JSImport("fp-ts/lib/Task", "never")
  @js.native
  val never: Task_[scala.Nothing] = js.native
  
  inline def of[A](a: A): Task_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[Task_[A]]
  
  inline def sequenceArray[A](arr: js.Array[Task_[A]]): Task_[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[Task_[js.Array[A]]]
  
  inline def sequenceSeqArray[A](arr: js.Array[Task_[A]]): Task_[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceSeqArray")(arr.asInstanceOf[js.Any]).asInstanceOf[Task_[js.Array[A]]]
  
  inline def tap[A, _underscore](f: js.Function1[/* a */ A, Task_[_underscore]]): js.Function1[/* self */ Task_[A], Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* self */ Task_[A], Task_[A]]]
  inline def tap[A, _underscore](self: Task_[A], f: js.Function1[/* a */ A, Task_[_underscore]]): Task_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Task_[A]]
  
  @JSImport("fp-ts/lib/Task", "task")
  @js.native
  val task: Monad1[typings.fpTs.libTaskMod.URI] & MonadTask1[typings.fpTs.libTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/Task", "taskSeq")
  @js.native
  val taskSeq: Monad1[typings.fpTs.libTaskMod.URI] & MonadTask1[typings.fpTs.libTaskMod.URI] = js.native
  
  inline def traverseArray[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* as */ js.Array[A], Task_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Task_[js.Array[B]]]]
  
  inline def traverseArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, Task_[B]]): js.Function1[/* as */ js.Array[A], Task_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Task_[js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, Task_[B]]): js.Function1[/* as */ js.Array[A], Task_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Task_[js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndexSeq[A, B](f: js.Function2[/* index */ Double, /* a */ A, Task_[B]]): js.Function1[/* as */ js.Array[A], Task_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Task_[js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, Task_[B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], Task_[ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], Task_[ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndexSeq[A, B](f: js.Function2[/* index */ Double, /* a */ A, Task_[B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], Task_[ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], Task_[ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseSeqArray[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* as */ js.Array[A], Task_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Task_[js.Array[B]]]]
  
  inline def traverseSeqArrayWithIndex[A, B](f: js.Function2[/* index */ Double, /* a */ A, Task_[B]]): js.Function1[/* as */ js.Array[A], Task_[js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], Task_[js.Array[B]]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  type Task_[A] = js.Function0[js.Promise[A]]
}
