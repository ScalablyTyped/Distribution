package typings.fpTs

import typings.fpTs.iOMod.IO_
import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadMod.Monad3
import typings.fpTs.monadMod.Monad3C
import typings.fpTs.monadMod.Monad4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monadIOMod {
  
  trait MonadIO[M]
    extends StObject
       with Monad[M] {
    
    def fromIO[A](fa: IO_[A]): js.Any
  }
  object MonadIO {
    
    inline def apply[M](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadIO[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO[M]]
    }
    
    extension [Self <: MonadIO[?], M](x: Self & MonadIO[M]) {
      
      inline def setFromIO(value: IO_[js.Any] => js.Any): Self = StObject.set(x, "fromIO", js.Any.fromFunction1(value))
    }
  }
  
  trait MonadIO1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with Monad1[M] {
    
    def fromIO[A](fa: IO_[A]): js.Any
  }
  object MonadIO1 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadIO1[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO1[M]]
    }
    
    extension [Self <: MonadIO1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](x: Self & MonadIO1[M]) {
      
      inline def setFromIO(value: IO_[js.Any] => js.Any): Self = StObject.set(x, "fromIO", js.Any.fromFunction1(value))
    }
  }
  
  trait MonadIO2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with Monad2[M] {
    
    def fromIO[E, A](fa: IO_[A]): js.Any
  }
  object MonadIO2 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadIO2[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO2[M]]
    }
    
    extension [Self <: MonadIO2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](x: Self & MonadIO2[M]) {
      
      inline def setFromIO(value: IO_[js.Any] => js.Any): Self = StObject.set(x, "fromIO", js.Any.fromFunction1(value))
    }
  }
  
  trait MonadIO2C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E]
    extends StObject
       with Monad2C[M, E] {
    
    def fromIO[A](fa: IO_[A]): js.Any
  }
  object MonadIO2C {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      URI: M,
      _E: E,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadIO2C[M, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO2C[M, E]]
    }
    
    extension [Self <: MonadIO2C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](x: Self & (MonadIO2C[M, E])) {
      
      inline def setFromIO(value: IO_[js.Any] => js.Any): Self = StObject.set(x, "fromIO", js.Any.fromFunction1(value))
    }
  }
  
  trait MonadIO3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with Monad3[M] {
    
    def fromIO[R, E, A](fa: IO_[A]): js.Any
  }
  object MonadIO3 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadIO3[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO3[M]]
    }
    
    extension [Self <: MonadIO3[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](x: Self & MonadIO3[M]) {
      
      inline def setFromIO(value: IO_[js.Any] => js.Any): Self = StObject.set(x, "fromIO", js.Any.fromFunction1(value))
    }
  }
  
  trait MonadIO3C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E]
    extends StObject
       with Monad3C[M, E] {
    
    def fromIO[R, A](fa: IO_[A]): js.Any
  }
  object MonadIO3C {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](
      URI: M,
      _E: E,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadIO3C[M, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO3C[M, E]]
    }
    
    extension [Self <: MonadIO3C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](x: Self & (MonadIO3C[M, E])) {
      
      inline def setFromIO(value: IO_[js.Any] => js.Any): Self = StObject.set(x, "fromIO", js.Any.fromFunction1(value))
    }
  }
  
  trait MonadIO4[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */]
    extends StObject
       with Monad4[M] {
    
    def fromIO[S, R, E, A](fa: IO_[A]): js.Any
  }
  object MonadIO4 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any) => js.Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[
          js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
        ]) => js.Any,
      fromIO: IO_[js.Any] => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
      of: js.Any => js.Any
    ): MonadIO4[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO4[M]]
    }
    
    extension [Self <: MonadIO4[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](x: Self & MonadIO4[M]) {
      
      inline def setFromIO(value: IO_[js.Any] => js.Any): Self = StObject.set(x, "fromIO", js.Any.fromFunction1(value))
    }
  }
}
