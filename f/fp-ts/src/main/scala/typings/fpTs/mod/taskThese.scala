package typings.fpTs.mod

import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applyMod.Apply1
import typings.fpTs.bifunctorMod.Bifunctor2
import typings.fpTs.functorMod.Functor2
import typings.fpTs.iOMod.IO_
import typings.fpTs.ioeitherMod.IOEither_
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadTaskMod.MonadTask2C
import typings.fpTs.semigroupMod.Semigroup
import typings.fpTs.taskMod.Task_
import typings.fpTs.taskTheseMod.TaskThese_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskThese {
  
  @JSImport("fp-ts", "taskThese")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts", "taskThese.URI")
  @js.native
  val URI: /* "TaskThese" */ String = js.native
  
  @JSImport("fp-ts", "taskThese.bifunctorTaskThese")
  @js.native
  val bifunctorTaskThese: Bifunctor2[typings.fpTs.taskTheseMod.URI] = js.native
  
  inline def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskThese_[E, A], TaskThese_[G, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("bimap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], TaskThese_[G, B]]]
  
  inline def both[E, A](e: E, a: A): TaskThese_[E, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("both")(e.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[TaskThese_[E, A]]
  
  inline def fold[E, B, A](
    onLeft: js.Function1[/* e */ E, Task_[B]],
    onRight: js.Function1[/* a */ A, Task_[B]],
    onBoth: js.Function2[/* e */ E, /* a */ A, Task_[B]]
  ): js.Function1[/* fa */ TaskThese_[E, A], Task_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fold")(onLeft.asInstanceOf[js.Any], onRight.asInstanceOf[js.Any], onBoth.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[B]]]
  
  @JSImport("fp-ts", "taskThese.fromIO")
  @js.native
  val fromIO: js.Function1[
    /* fa */ IO_[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
  ] = js.native
  
  inline def fromIOEither[E, A](fa: IOEither_[E, A]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIOEither")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  @JSImport("fp-ts", "taskThese.fromTask")
  @js.native
  val fromTask: js.Function1[
    /* fa */ Task_[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ js.Any
  ] = js.native
  
  @JSImport("fp-ts", "taskThese.functorTaskThese")
  @js.native
  val functorTaskThese: Functor2[typings.fpTs.taskTheseMod.URI] = js.native
  
  inline def getApplicative[E](A: Apply1[typings.fpTs.taskMod.URI], SE: Semigroup[E]): Applicative2C[typings.fpTs.taskTheseMod.URI, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicative")(A.asInstanceOf[js.Any], SE.asInstanceOf[js.Any])).asInstanceOf[Applicative2C[typings.fpTs.taskTheseMod.URI, E]]
  
  inline def getMonad[E](SE: Semigroup[E]): (Monad2C[typings.fpTs.taskTheseMod.URI, E]) & (MonadTask2C[typings.fpTs.taskTheseMod.URI, E]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonad")(SE.asInstanceOf[js.Any]).asInstanceOf[(Monad2C[typings.fpTs.taskTheseMod.URI, E]) & (MonadTask2C[typings.fpTs.taskTheseMod.URI, E])]
  
  inline def getSemigroup[E, A](SE: Semigroup[E], SA: Semigroup[A]): Semigroup[TaskThese_[E, A]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSemigroup")(SE.asInstanceOf[js.Any], SA.asInstanceOf[js.Any])).asInstanceOf[Semigroup[TaskThese_[E, A]]]
  
  inline def left[E, A](e: E): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(e.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def leftIO[E, A](me: IO_[E]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftIO")(me.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def leftTask[E, A](me: Task_[E]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("leftTask")(me.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[/* fa */ TaskThese_[js.Any, A], TaskThese_[js.Any, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskThese_[js.Any, A], TaskThese_[js.Any, B]]]
  
  inline def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[/* fa */ TaskThese_[E, js.Any], TaskThese_[G, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapLeft")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, js.Any], TaskThese_[G, js.Any]]]
  
  @JSImport("fp-ts", "taskThese.of")
  @js.native
  val of: js.Function1[
    /* a */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
  ] = js.native
  
  inline def right[E, A](a: A): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(a.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def rightIO[E, A](ma: IO_[A]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightIO")(ma.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def rightTask[E, A](ma: Task_[A]): TaskThese_[E, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("rightTask")(ma.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[E, A]]
  
  inline def swap[E, A](fa: TaskThese_[E, A]): TaskThese_[A, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("swap")(fa.asInstanceOf[js.Any]).asInstanceOf[TaskThese_[A, E]]
  
  @JSImport("fp-ts", "taskThese.taskThese")
  @js.native
  val taskThese: Functor2[typings.fpTs.taskTheseMod.URI] & Bifunctor2[typings.fpTs.taskTheseMod.URI] = js.native
  
  inline def toTuple[E, A](e: E, a: A): js.Function1[/* fa */ TaskThese_[E, A], Task_[js.Tuple2[E, A]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTuple")(e.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* fa */ TaskThese_[E, A], Task_[js.Tuple2[E, A]]]]
  
  object HKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
