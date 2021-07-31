package typings.fpTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.functorMod.Functor2
import typings.fpTs.iOMod.IO_
import typings.fpTs.monadTaskMod.MonadTask2
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.readerMod.Reader_
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
  
  @JSImport("fp-ts/lib/ReaderTask", "ApplicativePar")
  @js.native
  val ApplicativePar: Applicative2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "ApplicativeSeq")
  @js.native
  val ApplicativeSeq: Applicative2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "Functor")
  @js.native
  val Functor: Functor2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "URI")
  @js.native
  val URI: /* "ReaderTask" */ String = js.native
  type URI = /* "ReaderTask" */ String
  
  @scala.inline
  def ap[R, A](fa: ReaderTask_[R, A]): js.Function1[/* fab */ ReaderTask_[R, js.Function1[/* a */ A, js.Any]], ReaderTask_[R, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ ReaderTask_[R, js.Function1[/* a */ A, js.Any]], ReaderTask_[R, js.Any]]]
  
  @scala.inline
  def apFirst[R, B](fb: ReaderTask_[R, B]): js.Function1[/* fa */ ReaderTask_[R, js.Any], ReaderTask_[R, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderTask_[R, js.Any], ReaderTask_[R, js.Any]]]
  
  @scala.inline
  def apS[A, N /* <: String */, R, B](name: Exclude[N, /* keyof A */ String], fb: ReaderTask_[R, B]): js.Function1[
    /* fa */ ReaderTask_[R, A], 
    ReaderTask_[
      R, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[R, A], 
    ReaderTask_[
      R, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def apSW[A, N /* <: String */, Q, B](name: Exclude[N, /* keyof A */ String], fb: ReaderTask_[Q, B]): js.Function1[
    /* fa */ ReaderTask_[js.Any, A], 
    ReaderTask_[
      Q & js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apSW")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[js.Any, A], 
    ReaderTask_[
      Q & js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apSW & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def apSecond[R, B](fb: ReaderTask_[R, B]): js.Function1[/* fa */ ReaderTask_[R, js.Any], ReaderTask_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderTask_[R, js.Any], ReaderTask_[R, B]]]
  
  @scala.inline
  def apW[Q, A](fa: ReaderTask_[Q, A]): js.Function1[
    /* fab */ ReaderTask_[js.Any, js.Function1[/* a */ A, js.Any]], 
    ReaderTask_[Q & js.Any, js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("apW")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fab */ ReaderTask_[js.Any, js.Function1[/* a */ A, js.Any]], 
    ReaderTask_[Q & js.Any, js.Any]
  ]]
  
  @scala.inline
  def ask[R](): ReaderTask_[R, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")().asInstanceOf[ReaderTask_[R, R]]
  
  @scala.inline
  def asks[R, A](f: js.Function1[/* r */ R, A]): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(f.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  @scala.inline
  def bind[N /* <: String */, A, R, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReaderTask_[R, B]]): js.Function1[
    /* fa */ ReaderTask_[R, A], 
    ReaderTask_[
      R, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[R, A], 
    ReaderTask_[
      R, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A | N ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ ReaderTask_[js.Any, js.Any], 
    ReaderTask_[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[js.Any, js.Any], 
    ReaderTask_[
      js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  @scala.inline
  def bindW[N /* <: String */, A, Q, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, ReaderTask_[Q, B]]): js.Function1[
    /* fa */ ReaderTask_[js.Any, A], 
    ReaderTask_[
      Q & js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bindW")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ ReaderTask_[js.Any, A], 
    ReaderTask_[
      Q & js.Any, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bindW & TopLevel[A]
    ]
  ]]
  
  @scala.inline
  def chain[A, R, B](f: js.Function1[/* a */ A, ReaderTask_[R, B]]): js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, B]]]
  
  @scala.inline
  def chainFirst[A, R, B](f: js.Function1[/* a */ A, ReaderTask_[R, B]]): js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[R, A], ReaderTask_[R, A]]]
  
  @scala.inline
  def chainIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ ReaderTask_[js.Any, A], ReaderTask_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[js.Any, A], ReaderTask_[js.Any, B]]]
  
  @scala.inline
  def chainTaskK[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* ma */ ReaderTask_[js.Any, A], ReaderTask_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[js.Any, A], ReaderTask_[js.Any, B]]]
  
  @scala.inline
  def chainW[R, A, B](f: js.Function1[/* a */ A, ReaderTask_[R, B]]): js.Function1[/* ma */ ReaderTask_[js.Any, A], ReaderTask_[js.Any & R, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainW")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[js.Any, A], ReaderTask_[js.Any & R, B]]]
  
  @scala.inline
  def flatten[R, A](mma: ReaderTask_[R, ReaderTask_[R, A]]): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  @scala.inline
  def fromIO[R, A](ma: IO_[A]): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIO")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  @scala.inline
  def fromIOK[A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, ReaderTask_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderTask_[js.Any, B]]]
  
  @scala.inline
  def fromReader[R, A](ma: Reader_[R, A]): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReader")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  @scala.inline
  def fromTask[R, A](ma: Task_[A]): ReaderTask_[R, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTask")(ma.asInstanceOf[js.Any]).asInstanceOf[ReaderTask_[R, A]]
  
  @scala.inline
  def fromTaskK[A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* a */ A, ReaderTask_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTaskK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, ReaderTask_[js.Any, B]]]
  
  @scala.inline
  def getMonoid[R, A](M: Monoid[A]): Monoid[ReaderTask_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[ReaderTask_[R, A]]]
  
  @scala.inline
  def getSemigroup[R, A](S: Semigroup[A]): Semigroup[ReaderTask_[R, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[ReaderTask_[R, A]]]
  
  @scala.inline
  def local[Q, R](f: js.Function1[/* f */ Q, R]): js.Function1[/* ma */ ReaderTask_[R, js.Any], ReaderTask_[Q, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("local")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ ReaderTask_[R, js.Any], ReaderTask_[Q, js.Any]]]
  
  @scala.inline
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ ReaderTask_[js.Any, A], ReaderTask_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ ReaderTask_[js.Any, A], ReaderTask_[js.Any, B]]]
  
  @JSImport("fp-ts/lib/ReaderTask", "of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
  ] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "readerTask")
  @js.native
  val readerTask: MonadTask2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @JSImport("fp-ts/lib/ReaderTask", "readerTaskSeq")
  @js.native
  val readerTaskSeq: MonadTask2[typings.fpTs.readerTaskMod.URI] = js.native
  
  @scala.inline
  def run[R, A](ma: ReaderTask_[R, A], r: R): js.Promise[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(ma.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[js.Promise[A]]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
  
  type ReaderTask_[R, A] = js.Function1[/* r */ R, Task_[A]]
}
