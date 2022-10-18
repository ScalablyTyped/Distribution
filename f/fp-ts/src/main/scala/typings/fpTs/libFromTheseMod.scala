package typings.fpTs

import typings.fpTs.libTheseMod.These_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFromTheseMod {
  
  @JSImport("fp-ts/lib/FromThese", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromTheseK[F](F: FromThese[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], These_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTheseK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], These_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, B> */ Any
    ]
  ]]
  inline def fromTheseK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: FromThese2[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], These_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTheseK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], These_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ]
  ]]
  inline def fromTheseK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: FromThese3[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], These_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTheseK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], These_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ]]
  inline def fromTheseK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: FromThese4[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], These_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTheseK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], These_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
    ]
  ]]
  inline def fromTheseK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: FromThese2C[F, E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], These_[E, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTheseK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], These_[E, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ]
  ]]
  inline def fromTheseK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: FromThese3C[F, E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], These_[E, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTheseK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], These_[E, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ]]
  
  trait FromThese[F] extends StObject {
    
    val URI: F
    
    def fromThese[E, A](e: These_[E, A]): Any
  }
  object FromThese {
    
    inline def apply[F](URI: F, fromThese: These_[Any, Any] => Any): FromThese[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], fromThese = js.Any.fromFunction1(fromThese))
      __obj.asInstanceOf[FromThese[F]]
    }
    
    extension [Self <: FromThese[?], F](x: Self & FromThese[F]) {
      
      inline def setFromThese(value: These_[Any, Any] => Any): Self = StObject.set(x, "fromThese", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromThese2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    val URI: F
    
    def fromThese[E, A](fa: These_[E, A]): Any
  }
  object FromThese2 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](URI: F, fromThese: These_[Any, Any] => Any): FromThese2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], fromThese = js.Any.fromFunction1(fromThese))
      __obj.asInstanceOf[FromThese2[F]]
    }
    
    extension [Self <: FromThese2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & FromThese2[F]) {
      
      inline def setFromThese(value: These_[Any, Any] => Any): Self = StObject.set(x, "fromThese", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromThese2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def fromThese[A](fa: These_[E, A]): Any
  }
  object FromThese2C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](URI: F, _E: E, fromThese: These_[E, Any] => Any): FromThese2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], fromThese = js.Any.fromFunction1(fromThese))
      __obj.asInstanceOf[FromThese2C[F, E]]
    }
    
    extension [Self <: FromThese2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (FromThese2C[F, E])) {
      
      inline def setFromThese(value: These_[E, Any] => Any): Self = StObject.set(x, "fromThese", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromThese3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    val URI: F
    
    def fromThese[E, A, R](fa: These_[E, A]): Any
  }
  object FromThese3 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](URI: F, fromThese: These_[Any, Any] => Any): FromThese3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], fromThese = js.Any.fromFunction1(fromThese))
      __obj.asInstanceOf[FromThese3[F]]
    }
    
    extension [Self <: FromThese3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & FromThese3[F]) {
      
      inline def setFromThese(value: These_[Any, Any] => Any): Self = StObject.set(x, "fromThese", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromThese3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def fromThese[A, R](fa: These_[E, A]): Any
  }
  object FromThese3C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](URI: F, _E: E, fromThese: These_[E, Any] => Any): FromThese3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], fromThese = js.Any.fromFunction1(fromThese))
      __obj.asInstanceOf[FromThese3C[F, E]]
    }
    
    extension [Self <: FromThese3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (FromThese3C[F, E])) {
      
      inline def setFromThese(value: These_[E, Any] => Any): Self = StObject.set(x, "fromThese", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromThese4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */] extends StObject {
    
    val URI: F
    
    def fromThese[E, A, S, R](fa: These_[E, A]): Any
  }
  object FromThese4 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](URI: F, fromThese: These_[Any, Any] => Any): FromThese4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], fromThese = js.Any.fromFunction1(fromThese))
      __obj.asInstanceOf[FromThese4[F]]
    }
    
    extension [Self <: FromThese4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](x: Self & FromThese4[F]) {
      
      inline def setFromThese(value: These_[Any, Any] => Any): Self = StObject.set(x, "fromThese", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
}
