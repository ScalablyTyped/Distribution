package typings.fpTs

import typings.fpTs.libApplicativeMod.Applicative2
import typings.fpTs.libApplyMod.Apply2
import typings.fpTs.libChainMod.Chain2
import typings.fpTs.libFromIOMod.FromIO2
import typings.fpTs.libFromReaderMod.FromReader2
import typings.fpTs.libFromTaskMod.FromTask2
import typings.fpTs.libFunctorMod.Functor2
import typings.fpTs.libIOMod.IO_
import typings.fpTs.libMonadIOMod.MonadIO2
import typings.fpTs.libMonadMod.Monad2
import typings.fpTs.libMonadTaskMod.MonadTask2
import typings.fpTs.libMonoidMod.Monoid
import typings.fpTs.libPointedMod.Pointed2
import typings.fpTs.libReaderIOMod.ReaderIO
import typings.fpTs.libReaderMod.Reader_
import typings.fpTs.libReadonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.libSemigroupMod.Semigroup
import typings.fpTs.libTaskMod.Task_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReaderTaskMod {
  
  @JSImport("fp-ts/lib/ReaderTask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "ApT")
  @js.native
  val ApT: ReaderTask_[Any, js.Array[Any]] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "ApplicativePar")
  @js.native
  val ApplicativePar: Applicative2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "ApplicativeSeq")
  @js.native
  val ApplicativeSeq: Applicative2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "ApplyPar")
  @js.native
  val ApplyPar: Apply2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "ApplySeq")
  @js.native
  val ApplySeq: Apply2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "Chain")
  @js.native
  val Chain_ : Chain2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "Do")
  @js.native
  val Do: ReaderTask_[Any, js.Object] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "FromIO")
  @js.native
  val FromIO_ : FromIO2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "FromReader")
  @js.native
  val FromReader_ : FromReader2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "FromTask")
  @js.native
  val FromTask_ : FromTask2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "Monad")
  @js.native
  val Monad: Monad2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "MonadIO")
  @js.native
  val MonadIO: MonadIO2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "MonadTask")
  @js.native
  val MonadTask: MonadTask2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "Pointed")
  @js.native
  val Pointed: Pointed2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "URI")
  @js.native
  val URI: /* "ReaderTask" */ String = js.native
  type URI = /* "ReaderTask" */ String
  
  inline def ap[R, A](fa: ReaderTask_[R, A]): js.Function1[/* fab */ ReaderTask_[R, js.Function1[/* a */ A, Any]], ReaderTask_[R, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ ReaderTask_[R, js.Function1[/* a */ A, Any]], ReaderTask_[R, Any]]]
  
  inline def apFirst[E, B](second: ReaderTask_[E, B]): js.Function1[/* first */ ReaderTask_[E, Any], ReaderTask_[E, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderTask_[E, Any], ReaderTask_[E, Any]]]
  
  inline def apS[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], fb: ReaderTask_[E, B]): js.Function1[
    /* fa */ ReaderTask_[E, A], 
    ReaderTask_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[E, A], 
    ReaderTask_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, R2, B](name: Exclude[N, /* keyof A */ String], fb: ReaderTask_[R2, B]): js.Function1[
    /* fa */ ReaderTask_[Any, A], 
    ReaderTask_[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[Any, A], 
    ReaderTask_[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def apSecond[E, B](second: ReaderTask_[E, B]): js.Function1[/* first */ ReaderTask_[E, Any], ReaderTask_[E, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(second.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderTask_[E, Any], ReaderTask_[E, B]]]
  
  inline def apW[R2, A](fa: ReaderTask_[R2, A]): js.Function1[
    /* fab */ ReaderTask_[Any, js.Function1[/* a */ A, Any]], 
    ReaderTask_[Any & R2, Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ ReaderTask_[Any, js.Function1[/* a */ A, Any]], 
    ReaderTask_[Any & R2, Any]
  ]]
  
  inline def ask[R](): ReaderTask_[R, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")().asInstanceOf[ReaderTask_[R, R]]
  
  inline def asks[R, A](f: js.Function1[/* r */ R, A]): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(f.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  inline def asksReaderTask[R, A](f: js.Function1[/* r */ R, ReaderTask_[R, A]]): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asksReaderTask")(f.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  inline def asksReaderTaskW[R1, R2, A](f: js.Function1[/* r1 */ R1, ReaderTask_[R2, A]]): ReaderTask_[R1 & R2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asksReaderTaskW")(f.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R1 & R2, A]]
  
  inline def bind[N /* <: String */, A, E, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReaderTask_[E, B]]): js.Function1[
    /* ma */ ReaderTask_[E, A], 
    ReaderTask_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ ReaderTask_[E, A], 
    ReaderTask_[
      E, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ ReaderTask_[Any, Any], 
    ReaderTask_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[Any, Any], 
    ReaderTask_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N ]: any} */ js.Any
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, R2, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReaderTask_[R2, B]]): js.Function1[
    /* fa */ ReaderTask_[Any, A], 
    ReaderTask_[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[Any, A], 
    ReaderTask_[
      Any & R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def chain[A, R, B](f: js.Function1[/* a */ A, ReaderTask_[R, B]]): js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, B]]]
  
  inline def chainFirst[A, R, B](f: js.Function1[/* a */ A, ReaderTask_[R, B]]): js.Function1[/* first */ ReaderTask_[R, A], ReaderTask_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderTask_[R, A], ReaderTask_[R, A]]]
  
  inline def chainFirstIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, A]]]
  
  inline def chainFirstReaderIOK[A, R, B](f: js.Function1[/* a */ A, ReaderIO[R, B]]): js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, A]]]
  
  inline def chainFirstReaderIOKW[A, R2, B](f: js.Function1[/* a */ A, ReaderIO[R2, B]]): js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderIOKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, A]]]
  
  inline def chainFirstReaderK[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, A]]]
  
  inline def chainFirstReaderKW[A, R1, B](f: js.Function1[/* a */ A, Reader_[R1, B]]): js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[R1 & Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[R1 & Any, A]]]
  
  inline def chainFirstTaskK[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, A]]]
  
  inline def chainFirstW[R2, A, B](f: js.Function1[/* a */ A, ReaderTask_[R2, B]]): js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, A]]]
  
  inline def chainIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, B]]]
  
  inline def chainReaderIOK[A, R, B](f: js.Function1[/* a */ A, ReaderIO[R, B]]): js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, B]]]
  
  inline def chainReaderIOKW[A, R2, B](f: js.Function1[/* a */ A, ReaderIO[R2, B]]): js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderIOKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, B]]]
  
  inline def chainReaderK[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, B]]]
  
  inline def chainReaderKW[A, R1, B](f: js.Function1[/* a */ A, Reader_[R1, B]]): js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[R1 & Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[R1 & Any, B]]]
  
  inline def chainTaskK[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, B]]]
  
  inline def chainW[R2, A, B](f: js.Function1[/* a */ A, ReaderTask_[R2, B]]): js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ ReaderTask_[Any, js.Function1[/* a */ A, Any]], ReaderTask_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ ReaderTask_[Any, js.Function1[/* a */ A, Any]], ReaderTask_[Any, Any]]]
  
  inline def flatMap[A, R2, B](f: js.Function1[/* a */ A, ReaderTask_[R2, B]]): js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, B]]]
  inline def flatMap[R1, A, R2, B](ma: ReaderTask_[R1, A], f: js.Function1[/* a */ A, ReaderTask_[R2, B]]): ReaderTask_[R1 & R2, B] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatMap")(ma.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[ReaderTask_[R1 & R2, B]]
  
  inline def flatten[R, A](mma: ReaderTask_[R, ReaderTask_[R, A]]): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  inline def flattenW[R1, R2, A](mma: ReaderTask_[R1, ReaderTask_[R2, A]]): ReaderTask_[R1 & R2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenW")(mma.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R1 & R2, A]]
  
  inline def fromIO[A, R](fa: IO_[A]): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIO")(fa.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  inline def fromIOK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, ReaderTask_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderTask_[Any, B]]]
  
  inline def fromReader[R, A](fa: Reader_[R, A]): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReader")(fa.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  inline def fromReaderIO[R, A](fa: ReaderIO[R, A]): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderIO")(fa.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  inline def fromReaderIOK[A /* <: js.Array[Any] */, R, B](f: js.Function1[/* a */ A, ReaderIO[R, B]]): js.Function1[/* a */ A, ReaderTask_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderTask_[R, B]]]
  
  inline def fromReaderK[A /* <: js.Array[Any] */, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* a */ A, ReaderTask_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderTask_[R, B]]]
  
  inline def fromTask[A, R](fa: Task_[A]): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTask")(fa.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  inline def fromTaskK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* a */ A, ReaderTask_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderTask_[Any, B]]]
  
  inline def getMonoid[R, A](M: Monoid[A]): Monoid[ReaderTask_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[ReaderTask_[R, A]]]
  
  inline def getSemigroup[R, A](S: Semigroup[A]): Semigroup[ReaderTask_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[ReaderTask_[R, A]]]
  
  inline def let[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, B]): js.Function1[
    /* fa */ ReaderTask_[Any, A], 
    ReaderTask_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("let")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[Any, A], 
    ReaderTask_[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B} */ js.Any
    ]
  ]]
  
  inline def local[R2, R1](f: js.Function1[/* r2 */ R2, R1]): js.Function1[/* ma */ ReaderTask_[R1, Any], ReaderTask_[R2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[R1, Any], ReaderTask_[R2, Any]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ ReaderTask_[Any, A], ReaderTask_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderTask_[Any, A], ReaderTask_[Any, B]]]
  
  inline def of[R, A](a: A): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(a.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  @JSImport("fp-ts/lib/ReaderTask", "readerTask")
  @js.native
  val readerTask: MonadTask2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "readerTaskSeq")
  @js.native
  val readerTaskSeq: MonadTask2[typings.fpTs.libReaderTaskMod.URI] = js.native
  
  inline def run[R, A](ma: ReaderTask_[R, A], r: R): js.Promise[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(ma.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[js.Promise[A]]
  
  inline def sequenceArray[R, A](arr: js.Array[ReaderTask_[R, A]]): ReaderTask_[R, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, js.Array[A]]]
  
  inline def sequenceSeqArray[R, A](arr: js.Array[ReaderTask_[R, A]]): ReaderTask_[R, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceSeqArray")(arr.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, js.Array[A]]]
  
  inline def tap[A, R2, _underscore](f: js.Function1[/* a */ A, ReaderTask_[R2, _underscore]]): js.Function1[/* self */ ReaderTask_[Any, A], ReaderTask_[R2 & Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tap")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* self */ ReaderTask_[Any, A], ReaderTask_[R2 & Any, A]]]
  inline def tap[R1, A, R2, _underscore](self: ReaderTask_[R1, A], f: js.Function1[/* a */ A, ReaderTask_[R2, _underscore]]): ReaderTask_[R1 & R2, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("tap")(self.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[ReaderTask_[R1 & R2, A]]
  
  inline def traverseArray[R, A, B](f: js.Function1[/* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]]]
  
  inline def traverseArrayWithIndex[R, A, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, R, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndexSeq[R, A, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, R, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], ReaderTask_[R, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], ReaderTask_[R, ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndexSeq[R, A, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], ReaderTask_[R, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], ReaderTask_[R, ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseSeqArray[R, A, B](f: js.Function1[/* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]]]
  
  inline def traverseSeqArrayWithIndex[R, A, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]]]
  
  /* augmented module */
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind2[E, A] extends StObject
  }
  
  type ReaderTask_[R, A] = js.Function1[/* r */ R, Task_[A]]
}
