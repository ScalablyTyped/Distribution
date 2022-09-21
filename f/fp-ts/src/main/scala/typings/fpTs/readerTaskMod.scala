package typings.fpTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applyMod.Apply2
import typings.fpTs.chainMod.Chain2
import typings.fpTs.fromIOMod.FromIO2
import typings.fpTs.fromReaderMod.FromReader2
import typings.fpTs.fromTaskMod.FromTask2
import typings.fpTs.functorMod.Functor2
import typings.fpTs.iOMod.IO_
import typings.fpTs.monadIOMod.MonadIO2
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadTaskMod.MonadTask2
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.naturalTransformationMod.NaturalTransformation12
import typings.fpTs.naturalTransformationMod.NaturalTransformation22
import typings.fpTs.pointedMod.Pointed2
import typings.fpTs.readerMod.Reader_
import typings.fpTs.readonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.taskMod.Task_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerTaskMod {
  
  @JSImport("fp-ts/lib/ReaderTask", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "ApT")
  @js.native
  val ApT: ReaderTask_[Any, js.Array[Any]] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "ApplicativePar")
  @js.native
  val ApplicativePar: Applicative2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "ApplicativeSeq")
  @js.native
  val ApplicativeSeq: Applicative2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "ApplyPar")
  @js.native
  val ApplyPar: Apply2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "ApplySeq")
  @js.native
  val ApplySeq: Apply2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "Chain")
  @js.native
  val Chain_ : Chain2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "Do")
  @js.native
  val Do: ReaderTask_[Any, js.Object] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "FromIO")
  @js.native
  val FromIO_ : FromIO2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "FromReader")
  @js.native
  val FromReader_ : FromReader2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "FromTask")
  @js.native
  val FromTask_ : FromTask2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "Monad")
  @js.native
  val Monad: Monad2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "MonadIO")
  @js.native
  val MonadIO: MonadIO2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "MonadTask")
  @js.native
  val MonadTask: MonadTask2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "Pointed")
  @js.native
  val Pointed: Pointed2[typings.fpTs.readerTaskMod.URI] = js.native
  
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
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[E, A], 
    ReaderTask_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  inline def apSW[A, N /* <: String */, R2, B](name: Exclude[N, /* keyof A */ String], fb: ReaderTask_[R2, B]): js.Function1[
    /* fa */ ReaderTask_[Any, A], 
    ReaderTask_[
      Any & R2, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[Any, A], 
    ReaderTask_[
      Any & R2, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
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
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* ma */ ReaderTask_[E, A], 
    ReaderTask_[
      E, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ ReaderTask_[Any, Any], 
    ReaderTask_[
      Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[Any, Any], 
    ReaderTask_[
      Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[Any]
    ]
  ]]
  
  inline def bindW[N /* <: String */, A, R2, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReaderTask_[R2, B]]): js.Function1[
    /* fa */ ReaderTask_[Any, A], 
    ReaderTask_[
      Any & R2, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[Any, A], 
    ReaderTask_[
      Any & R2, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ]]
  
  inline def chain[A, R, B](f: js.Function1[/* a */ A, ReaderTask_[R, B]]): js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, B]]]
  
  inline def chainFirst[A, E, B](f: js.Function1[/* a */ A, ReaderTask_[E, B]]): js.Function1[/* first */ ReaderTask_[E, A], ReaderTask_[E, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderTask_[E, A], ReaderTask_[E, A]]]
  
  inline def chainFirstIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, A]]]
  
  inline def chainFirstReaderK[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, A]]]
  
  inline def chainFirstReaderKW[A, R1, B](f: js.Function1[/* a */ A, Reader_[R1, B]]): js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[R1 & Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[R1 & Any, A]]]
  
  inline def chainFirstTaskK[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, A]]]
  
  inline def chainFirstW[R2, A, B](f: js.Function1[/* a */ A, ReaderTask_[R2, B]]): js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, A]]]
  
  inline def chainIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, B]]]
  
  inline def chainReaderK[A, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, B]]]
  
  inline def chainReaderKW[A, R1, B](f: js.Function1[/* a */ A, Reader_[R1, B]]): js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[R1 & Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderKW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[R1 & Any, B]]]
  
  inline def chainTaskK[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* first */ ReaderTask_[Any, A], ReaderTask_[Any, B]]]
  
  inline def chainW[R2, A, B](f: js.Function1[/* a */ A, ReaderTask_[R2, B]]): js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[Any, A], ReaderTask_[Any & R2, B]]]
  
  inline def flap[A](a: A): js.Function1[/* fab */ ReaderTask_[Any, js.Function1[/* a */ A, Any]], ReaderTask_[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flap")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ ReaderTask_[Any, js.Function1[/* a */ A, Any]], ReaderTask_[Any, Any]]]
  
  inline def flatten[R, A](mma: ReaderTask_[R, ReaderTask_[R, A]]): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  inline def flattenW[R1, R2, A](mma: ReaderTask_[R1, ReaderTask_[R2, A]]): ReaderTask_[R1 & R2, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenW")(mma.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R1 & R2, A]]
  
  @JSImport("fp-ts/lib/ReaderTask", "fromIO")
  @js.native
  val fromIO: NaturalTransformation12[typings.fpTs.iOMod.URI, typings.fpTs.readerTaskMod.URI] = js.native
  
  inline def fromIOK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, ReaderTask_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderTask_[Any, B]]]
  
  @JSImport("fp-ts/lib/ReaderTask", "fromReader")
  @js.native
  val fromReader: NaturalTransformation22[typings.fpTs.readerMod.URI, typings.fpTs.readerTaskMod.URI] = js.native
  
  inline def fromReaderK[A /* <: js.Array[Any] */, R, B](f: js.Function1[/* a */ A, Reader_[R, B]]): js.Function1[/* a */ A, ReaderTask_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderTask_[R, B]]]
  
  @JSImport("fp-ts/lib/ReaderTask", "fromTask")
  @js.native
  val fromTask: NaturalTransformation12[typings.fpTs.taskMod.URI, typings.fpTs.readerTaskMod.URI] = js.native
  
  inline def fromTaskK[A /* <: js.Array[Any] */, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* a */ A, ReaderTask_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderTask_[Any, B]]]
  
  inline def getMonoid[R, A](M: Monoid[A]): Monoid[ReaderTask_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[ReaderTask_[R, A]]]
  
  inline def getSemigroup[R, A](S: Semigroup[A]): Semigroup[ReaderTask_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[ReaderTask_[R, A]]]
  
  inline def local[R2, R1](f: js.Function1[/* r2 */ R2, R1]): js.Function1[/* ma */ ReaderTask_[R1, Any], ReaderTask_[R2, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[R1, Any], ReaderTask_[R2, Any]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ ReaderTask_[Any, A], ReaderTask_[Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderTask_[Any, A], ReaderTask_[Any, B]]]
  
  @JSImport("fp-ts/lib/ReaderTask", "of")
  @js.native
  val of: js.Function1[
    /* a */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
  ] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "readerTask")
  @js.native
  val readerTask: MonadTask2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "readerTaskSeq")
  @js.native
  val readerTaskSeq: MonadTask2[typings.fpTs.readerTaskMod.URI] = js.native
  
  inline def run[R, A](ma: ReaderTask_[R, A], r: R): js.Promise[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(ma.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[js.Promise[A]]
  
  inline def sequenceArray[R, A](arr: js.Array[ReaderTask_[R, A]]): ReaderTask_[R, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceArray")(arr.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, js.Array[A]]]
  
  inline def sequenceSeqArray[R, A](arr: js.Array[ReaderTask_[R, A]]): ReaderTask_[R, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceSeqArray")(arr.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, js.Array[A]]]
  
  inline def traverseArray[R, A, B](f: js.Function1[/* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]]]
  
  inline def traverseArrayWithIndex[R, A, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndex[A, R, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]]]
  
  inline def traverseReadonlyArrayWithIndexSeq[R, A, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndex[A, R, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], ReaderTask_[R, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], ReaderTask_[R, ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseReadonlyNonEmptyArrayWithIndexSeq[R, A, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ ReadonlyNonEmptyArray_[A], ReaderTask_[R, ReadonlyNonEmptyArray_[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseReadonlyNonEmptyArrayWithIndexSeq")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ ReadonlyNonEmptyArray_[A], ReaderTask_[R, ReadonlyNonEmptyArray_[B]]]]
  
  inline def traverseSeqArray[R, A, B](f: js.Function1[/* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArray")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]]]
  
  inline def traverseSeqArrayWithIndex[R, A, B](f: js.Function2[/* index */ Double, /* a */ A, ReaderTask_[R, B]]): js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverseSeqArrayWithIndex")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* as */ js.Array[A], ReaderTask_[R, js.Array[B]]]]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  type ReaderTask_[R, A] = js.Function1[/* r */ R, Task_[A]]
}
