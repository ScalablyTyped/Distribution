package typings.fpTs.mod

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.functorMod.Functor1
import typings.fpTs.iOMod.IO_
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadTaskMod.MonadTask1
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.taskMod.Task_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object task {
  
  @JSImport("fp-ts", "task")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "task.ApplicativePar")
  @js.native
  val ApplicativePar: Applicative1[typings.fpTs.taskMod.URI] = js.native
  
  @JSImport("fp-ts", "task.ApplicativeSeq")
  @js.native
  val ApplicativeSeq: Applicative1[typings.fpTs.taskMod.URI] = js.native
  
  @JSImport("fp-ts", "task.Functor")
  @js.native
  val Functor: Functor1[typings.fpTs.taskMod.URI] = js.native
  
  @JSImport("fp-ts", "task.URI")
  @js.native
  val URI: /* "Task" */ String = js.native
  
  inline def ap[A](fa: Task_[A]): js.Function1[/* fab */ Task_[js.Function1[/* a */ A, js.Any]], Task_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(fa.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fab */ Task_[js.Function1[/* a */ A, js.Any]], Task_[js.Any]]]
  
  inline def apFirst[B](fb: Task_[B]): js.Function1[/* fa */ Task_[js.Any], Task_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apFirst")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Task_[js.Any], Task_[js.Any]]]
  
  inline def apS[A, N /* <: String */, B](name: Exclude[N, /* keyof A */ String], fb: Task_[B]): js.Function1[
    /* fa */ Task_[A], 
    Task_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("apS")(name.asInstanceOf[js.Any], fb.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Task_[A], 
    Task_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.apS & TopLevel[A]
    ]
  ]]
  
  inline def apSecond[B](fb: Task_[B]): js.Function1[/* fa */ Task_[js.Any], Task_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("apSecond")(fb.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Task_[js.Any], Task_[B]]]
  
  inline def bind[N /* <: String */, A, B](name: Exclude[N, /* keyof A */ String], f: js.Function1[/* a */ A, Task_[B]]): js.Function1[
    /* fa */ Task_[A], 
    Task_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(name.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* fa */ Task_[A], 
    Task_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N | keyof A ]: K extends keyof A? A[K] : B}
    */ typings.fpTs.fpTsStrings.bind & TopLevel[A]
    ]
  ]]
  
  inline def bindTo[N /* <: String */](name: N): js.Function1[
    /* fa */ Task_[js.Any], 
    Task_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("bindTo")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Task_[js.Any], 
    Task_[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in N ]: any}
    */ typings.fpTs.fpTsStrings.bindTo & TopLevel[js.Any]
    ]
  ]]
  
  inline def chain[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* ma */ Task_[A], Task_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Task_[A], Task_[B]]]
  
  inline def chainFirst[A, B](f: js.Function1[/* a */ A, Task_[B]]): js.Function1[/* ma */ Task_[A], Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainFirst")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Task_[A], Task_[A]]]
  
  inline def chainIOK[A, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* ma */ Task_[A], Task_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Task_[A], Task_[B]]]
  
  inline def delay(millis: Double): js.Function1[/* ma */ Task_[js.Any], Task_[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(millis.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ma */ Task_[js.Any], Task_[js.Any]]]
  
  inline def flatten[A](mma: Task_[Task_[A]]): Task_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(mma.asInstanceOf[js.Any]).asInstanceOf[Task_[A]]
  
  inline def fromIO[A](ma: IO_[A]): Task_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIO")(ma.asInstanceOf[js.Any]).asInstanceOf[Task_[A]]
  
  inline def fromIOK[A /* <: js.Array[js.Any] */, B](f: js.Function1[/* a */ A, IO_[B]]): js.Function1[/* a */ A, Task_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOK")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, Task_[B]]]
  
  @JSImport("fp-ts", "task.fromTask")
  @js.native
  val fromTask: js.Function1[
    /* fa */ Task_[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ js.Any
  ] = js.native
  
  inline def getMonoid[A](M: Monoid[A]): Monoid[Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonoid")(M.asInstanceOf[js.Any]).asInstanceOf[Monoid[Task_[A]]]
  
  inline def getRaceMonoid[A](): Monoid[Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRaceMonoid")().asInstanceOf[Monoid[Task_[A]]]
  
  inline def getSemigroup[A](S: Semigroup[A]): Semigroup[Task_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(S.asInstanceOf[js.Any]).asInstanceOf[Semigroup[Task_[A]]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ Task_[A], Task_[B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ Task_[A], Task_[B]]]
  
  @JSImport("fp-ts", "task.never")
  @js.native
  val never: Task_[scala.Nothing] = js.native
  
  @JSImport("fp-ts", "task.of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
  ] = js.native
  
  @JSImport("fp-ts", "task.task")
  @js.native
  val task: Monad1[typings.fpTs.taskMod.URI] & MonadTask1[typings.fpTs.taskMod.URI] = js.native
  
  @JSImport("fp-ts", "task.taskSeq")
  @js.native
  val taskSeq: Monad1[typings.fpTs.taskMod.URI] & MonadTask1[typings.fpTs.taskMod.URI] = js.native
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
