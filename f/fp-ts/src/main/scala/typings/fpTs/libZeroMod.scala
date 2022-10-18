package typings.fpTs

import typings.fpTs.libPointedMod.Pointed
import typings.fpTs.libPointedMod.Pointed1
import typings.fpTs.libPointedMod.Pointed2
import typings.fpTs.libPointedMod.Pointed2C
import typings.fpTs.libPointedMod.Pointed3
import typings.fpTs.libPointedMod.Pointed3C
import typings.fpTs.libPointedMod.Pointed4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libZeroMod {
  
  @JSImport("fp-ts/lib/Zero", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def guard[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Zero1[F], P: Pointed1[F]): js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, void> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("guard")(F.asInstanceOf[js.Any], P.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, void> */ Any
  ]]
  inline def guard[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Zero2[F], P: Pointed2[F]): js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, void> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("guard")(F.asInstanceOf[js.Any], P.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, void> */ Any
  ]]
  inline def guard[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Zero3[F], P: Pointed3[F]): js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, void> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("guard")(F.asInstanceOf[js.Any], P.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, void> */ Any
  ]]
  inline def guard[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Zero4[F], P: Pointed4[F]): js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, void> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("guard")(F.asInstanceOf[js.Any], P.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, void> */ Any
  ]]
  inline def guard[F](F: Zero[F], P: Pointed[F]): js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, void> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("guard")(F.asInstanceOf[js.Any], P.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, void> */ Any
  ]]
  inline def guard[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Zero2C[F, E], P: Pointed2C[F, E]): js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, void> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("guard")(F.asInstanceOf[js.Any], P.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, void> */ Any
  ]]
  inline def guard[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: Zero3C[F, E], P: Pointed3C[F, E]): js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, void> */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("guard")(F.asInstanceOf[js.Any], P.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* b */ Boolean, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, void> */ Any
  ]]
  
  trait Zero[F] extends StObject {
    
    val URI: F
    
    def zero[A](): Any
  }
  object Zero {
    
    inline def apply[F](URI: F, zero: () => Any): Zero[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], zero = js.Any.fromFunction0(zero))
      __obj.asInstanceOf[Zero[F]]
    }
    
    extension [Self <: Zero[?], F](x: Self & Zero[F]) {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setZero(value: () => Any): Self = StObject.set(x, "zero", js.Any.fromFunction0(value))
    }
  }
  
  trait Zero1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    val URI: F
    
    def zero[A](): Any
  }
  object Zero1 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](URI: F, zero: () => Any): Zero1[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], zero = js.Any.fromFunction0(zero))
      __obj.asInstanceOf[Zero1[F]]
    }
    
    extension [Self <: Zero1[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & Zero1[F]) {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setZero(value: () => Any): Self = StObject.set(x, "zero", js.Any.fromFunction0(value))
    }
  }
  
  trait Zero2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    val URI: F
    
    def zero[E, A](): Any
  }
  object Zero2 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](URI: F, zero: () => Any): Zero2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], zero = js.Any.fromFunction0(zero))
      __obj.asInstanceOf[Zero2[F]]
    }
    
    extension [Self <: Zero2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & Zero2[F]) {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setZero(value: () => Any): Self = StObject.set(x, "zero", js.Any.fromFunction0(value))
    }
  }
  
  trait Zero2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def zero[A](): Any
  }
  object Zero2C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](URI: F, _E: E, zero: () => Any): Zero2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], zero = js.Any.fromFunction0(zero))
      __obj.asInstanceOf[Zero2C[F, E]]
    }
    
    extension [Self <: Zero2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (Zero2C[F, E])) {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setZero(value: () => Any): Self = StObject.set(x, "zero", js.Any.fromFunction0(value))
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Zero3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    val URI: F
    
    def zero[R, E, A](): Any
  }
  object Zero3 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](URI: F, zero: () => Any): Zero3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], zero = js.Any.fromFunction0(zero))
      __obj.asInstanceOf[Zero3[F]]
    }
    
    extension [Self <: Zero3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & Zero3[F]) {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setZero(value: () => Any): Self = StObject.set(x, "zero", js.Any.fromFunction0(value))
    }
  }
  
  trait Zero3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def zero[R, A](): Any
  }
  object Zero3C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](URI: F, _E: E, zero: () => Any): Zero3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], zero = js.Any.fromFunction0(zero))
      __obj.asInstanceOf[Zero3C[F, E]]
    }
    
    extension [Self <: Zero3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (Zero3C[F, E])) {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setZero(value: () => Any): Self = StObject.set(x, "zero", js.Any.fromFunction0(value))
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Zero4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */] extends StObject {
    
    val URI: F
    
    def zero[S, R, E, A](): Any
  }
  object Zero4 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](URI: F, zero: () => Any): Zero4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], zero = js.Any.fromFunction0(zero))
      __obj.asInstanceOf[Zero4[F]]
    }
    
    extension [Self <: Zero4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](x: Self & Zero4[F]) {
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def setZero(value: () => Any): Self = StObject.set(x, "zero", js.Any.fromFunction0(value))
    }
  }
}
