package typings.fpTs

import typings.fpTs.iOMod.IO_
import typings.fpTs.monadIOMod.MonadIO
import typings.fpTs.monadIOMod.MonadIO1
import typings.fpTs.monadIOMod.MonadIO2
import typings.fpTs.monadIOMod.MonadIO2C
import typings.fpTs.monadIOMod.MonadIO3
import typings.fpTs.monadIOMod.MonadIO3C
import typings.fpTs.monadIOMod.MonadIO4
import typings.fpTs.taskMod.Task_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monadTaskMod {
  
  trait MonadTask[M]
    extends StObject
       with MonadIO[M] {
    
    def fromTask[A](fa: Task_[A]): js.Any
  }
  object MonadTask {
    
    inline def apply[M](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      fromTask: Task_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadTask[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), fromTask = js.Any.fromFunction1(fromTask), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadTask[M]]
    }
    
    extension [Self <: MonadTask[?], M](x: Self & MonadTask[M]) {
      
      inline def setFromTask(value: Task_[js.Any] => js.Any): Self = StObject.set(x, "fromTask", js.Any.fromFunction1(value))
    }
  }
  
  trait MonadTask1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with MonadIO1[M] {
    
    def fromTask[A](fa: Task_[A]): js.Any
  }
  object MonadTask1 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      fromTask: Task_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadTask1[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), fromTask = js.Any.fromFunction1(fromTask), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadTask1[M]]
    }
    
    extension [Self <: MonadTask1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](x: Self & MonadTask1[M]) {
      
      inline def setFromTask(value: Task_[js.Any] => js.Any): Self = StObject.set(x, "fromTask", js.Any.fromFunction1(value))
    }
  }
  
  trait MonadTask2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with MonadIO2[M] {
    
    def fromTask[E, A](fa: Task_[A]): js.Any
  }
  object MonadTask2 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      fromTask: Task_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadTask2[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), fromTask = js.Any.fromFunction1(fromTask), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadTask2[M]]
    }
    
    extension [Self <: MonadTask2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](x: Self & MonadTask2[M]) {
      
      inline def setFromTask(value: Task_[js.Any] => js.Any): Self = StObject.set(x, "fromTask", js.Any.fromFunction1(value))
    }
  }
  
  trait MonadTask2C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E]
    extends StObject
       with MonadIO2C[M, E] {
    
    def fromTask[A](fa: Task_[A]): js.Any
  }
  object MonadTask2C {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      URI: M,
      _E: E,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      fromTask: Task_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadTask2C[M, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), fromTask = js.Any.fromFunction1(fromTask), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadTask2C[M, E]]
    }
    
    extension [Self <: MonadTask2C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](x: Self & (MonadTask2C[M, E])) {
      
      inline def setFromTask(value: Task_[js.Any] => js.Any): Self = StObject.set(x, "fromTask", js.Any.fromFunction1(value))
    }
  }
  
  trait MonadTask3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with MonadIO3[M] {
    
    def fromTask[R, E, A](fa: Task_[A]): js.Any
  }
  object MonadTask3 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      fromTask: Task_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadTask3[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), fromTask = js.Any.fromFunction1(fromTask), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadTask3[M]]
    }
    
    extension [Self <: MonadTask3[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](x: Self & MonadTask3[M]) {
      
      inline def setFromTask(value: Task_[js.Any] => js.Any): Self = StObject.set(x, "fromTask", js.Any.fromFunction1(value))
    }
  }
  
  trait MonadTask3C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E]
    extends StObject
       with MonadIO3C[M, E] {
    
    def fromTask[R, A](fa: Task_[A]): js.Any
  }
  object MonadTask3C {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](
      URI: M,
      _E: E,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      fromTask: Task_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadTask3C[M, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), fromTask = js.Any.fromFunction1(fromTask), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadTask3C[M, E]]
    }
    
    extension [Self <: MonadTask3C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](x: Self & (MonadTask3C[M, E])) {
      
      inline def setFromTask(value: Task_[js.Any] => js.Any): Self = StObject.set(x, "fromTask", js.Any.fromFunction1(value))
    }
  }
  
  trait MonadTask4[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */]
    extends StObject
       with MonadIO4[M] {
    
    def fromTask[S, R, E, A](fa: Task_[A]): js.Any
  }
  object MonadTask4 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      fromTask: Task_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadTask4[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), fromTask = js.Any.fromFunction1(fromTask), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadTask4[M]]
    }
    
    extension [Self <: MonadTask4[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](x: Self & MonadTask4[M]) {
      
      inline def setFromTask(value: Task_[js.Any] => js.Any): Self = StObject.set(x, "fromTask", js.Any.fromFunction1(value))
    }
  }
}
