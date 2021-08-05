package typings.fpTs

import typings.fpTs.anon.`0`
import typings.fpTs.functorMod.Functor
import typings.fpTs.functorMod.Functor1
import typings.fpTs.functorMod.Functor2
import typings.fpTs.functorMod.Functor2C
import typings.fpTs.functorMod.Functor3
import typings.fpTs.functorMod.Functor3C
import typings.fpTs.functorMod.Functor4
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyMod {
  
  @JSImport("fp-ts/lib/Apply", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sequenceS[F](F: Apply[F]): js.Function1[
    /* r */ EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, any> */ js.Any
      ]
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, {[ K in keyof NER ]: [NER[K]] extends [HKT<F, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceS")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, any> */ js.Any
      ]
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, {[ K in keyof NER ]: [NER[K]] extends [HKT<F, infer A>]? A : never}> */ js.Any
  ]]
  inline def sequenceS[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Apply1[F]): js.Function1[
    /* r */ EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, any> */ js.Any
      ]
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, {[ K in keyof NER ]: [NER[K]] extends [Kind<F, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceS")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, any> */ js.Any
      ]
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, {[ K in keyof NER ]: [NER[K]] extends [Kind<F, infer A>]? A : never}> */ js.Any
  ]]
  inline def sequenceS[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Apply2[F]): js.Function1[
    /* r */ (EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, any> */ js.Any
      ]
    ]) & (Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, any> */ js.Any
    ]), 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {[ K in keyof NER ]: [NER[K]] extends [Kind2<F, any, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceS")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ (EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, any> */ js.Any
      ]
    ]) & (Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, any> */ js.Any
    ]), 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {[ K in keyof NER ]: [NER[K]] extends [Kind2<F, any, infer A>]? A : never}> */ js.Any
  ]]
  inline def sequenceS[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Apply3[F]): js.Function1[
    /* r */ (EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, any> */ js.Any
      ]
    ]) & (Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, any> */ js.Any
    ]), 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {[ K in keyof NER ]: [NER[K]] extends [Kind3<F, any, any, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceS")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ (EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, any> */ js.Any
      ]
    ]) & (Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, any> */ js.Any
    ]), 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {[ K in keyof NER ]: [NER[K]] extends [Kind3<F, any, any, infer A>]? A : never}> */ js.Any
  ]]
  inline def sequenceS[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](F: Apply4[F]): js.Function1[
    /* r */ (EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, any> */ js.Any
      ]
    ]) & (Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, any> */ js.Any
    ]), 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, {[ K in keyof NER ]: [NER[K]] extends [Kind4<F, any, any, any, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceS")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ (EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, any> */ js.Any
      ]
    ]) & (Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, any> */ js.Any
    ]), 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, {[ K in keyof NER ]: [NER[K]] extends [Kind4<F, any, any, any, infer A>]? A : never}> */ js.Any
  ]]
  inline def sequenceS[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Apply2C[F, E]): js.Function1[
    /* r */ EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, any> */ js.Any
      ]
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {[ K in keyof NER ]: [NER[K]] extends [Kind2<F, any, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceS")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, any> */ js.Any
      ]
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {[ K in keyof NER ]: [NER[K]] extends [Kind2<F, any, infer A>]? A : never}> */ js.Any
  ]]
  inline def sequenceS[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Apply3C[F, E]): js.Function1[
    /* r */ (EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, any> */ js.Any
      ]
    ]) & (Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, any> */ js.Any
    ]), 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {[ K in keyof NER ]: [NER[K]] extends [Kind3<F, any, any, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceS")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* r */ (EnforceNonEmptyRecord[
      Record[
        String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, any> */ js.Any
      ]
    ]) & (Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, any> */ js.Any
    ]), 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {[ K in keyof NER ]: [NER[K]] extends [Kind3<F, any, any, infer A>]? A : never}> */ js.Any
  ]]
  
  inline def sequenceT[F](F: Apply[F]): js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, {[ K in keyof T ]: [T[K]] extends [HKT<F, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceT")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, {[ K in keyof T ]: [T[K]] extends [HKT<F, infer A>]? A : never}> */ js.Any
  ]]
  inline def sequenceT[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Apply1[F]): js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, {[ K in keyof T ]: [T[K]] extends [Kind<F, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceT")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, {[ K in keyof T ]: [T[K]] extends [Kind<F, infer A>]? A : never}> */ js.Any
  ]]
  inline def sequenceT[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Apply2[F]): js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {[ K in keyof T ]: [T[K]] extends [Kind2<F, E, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceT")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {[ K in keyof T ]: [T[K]] extends [Kind2<F, E, infer A>]? A : never}> */ js.Any
  ]]
  inline def sequenceT[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Apply3[F]): js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {[ K in keyof T ]: [T[K]] extends [Kind3<F, R, E, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceT")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {[ K in keyof T ]: [T[K]] extends [Kind3<F, R, E, infer A>]? A : never}> */ js.Any
  ]]
  inline def sequenceT[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](F: Apply4[F]): js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, {[ K in keyof T ]: [T[K]] extends [Kind4<F, S, R, E, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceT")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, {[ K in keyof T ]: [T[K]] extends [Kind4<F, S, R, E, infer A>]? A : never}> */ js.Any
  ]]
  inline def sequenceT[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Apply2C[F, E]): js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {[ K in keyof T ]: [T[K]] extends [Kind2<F, E, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceT")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, {[ K in keyof T ]: [T[K]] extends [Kind2<F, E, infer A>]? A : never}> */ js.Any
  ]]
  inline def sequenceT[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Apply3C[F, E]): js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {[ K in keyof T ]: [T[K]] extends [Kind3<F, R, E, infer A>]? A : never}> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceT")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* t */ (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, any> */ js.Any
    ]) & `0`, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, {[ K in keyof T ]: [T[K]] extends [Kind3<F, R, E, infer A>]? A : never}> */ js.Any
  ]]
  
  trait Apply[F]
    extends StObject
       with Functor[F] {
    
    def ap[A, B](
      fab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ js.Any,
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any
    ): js.Any
  }
  object Apply {
    
    inline def apply[F](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Apply[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Apply[F]]
    }
    
    extension [Self <: Apply[?], F](x: Self & Apply[F]) {
      
      inline def setAp(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any) => js.Any
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    }
  }
  
  trait Apply1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */]
    extends StObject
       with Functor1[F] {
    
    def ap[A, B](
      fab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ js.Any,
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any
    ): js.Any
  }
  object Apply1 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Apply1[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Apply1[F]]
    }
    
    extension [Self <: Apply1[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](x: Self & Apply1[F]) {
      
      inline def setAp(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ js.Any) => js.Any
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    }
  }
  
  trait Apply2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
    extends StObject
       with Functor2[F] {
    
    def ap[E, A, B](
      fab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any,
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
    ): js.Any
  }
  object Apply2 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Apply2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Apply2[F]]
    }
    
    extension [Self <: Apply2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](x: Self & Apply2[F]) {
      
      inline def setAp(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    }
  }
  
  trait Apply2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E]
    extends StObject
       with Functor2C[F, E] {
    
    def ap[A, B](
      fab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any,
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
    ): js.Any
  }
  object Apply2C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
      URI: F,
      _E: E,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Apply2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Apply2C[F, E]]
    }
    
    extension [Self <: Apply2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](x: Self & (Apply2C[F, E])) {
      
      inline def setAp(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any) => js.Any
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    }
  }
  
  trait Apply3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */]
    extends StObject
       with Functor3[F] {
    
    def ap[R, E, A, B](
      fab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any,
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
    ): js.Any
  }
  object Apply3 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Apply3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Apply3[F]]
    }
    
    extension [Self <: Apply3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](x: Self & Apply3[F]) {
      
      inline def setAp(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any) => js.Any
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    }
  }
  
  trait Apply3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E]
    extends StObject
       with Functor3C[F, E] {
    
    def ap[R, A, B](
      fab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any,
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
    ): js.Any
  }
  object Apply3C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](
      URI: F,
      _E: E,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Apply3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Apply3C[F, E]]
    }
    
    extension [Self <: Apply3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](x: Self & (Apply3C[F, E])) {
      
      inline def setAp(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any) => js.Any
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    }
  }
  
  trait Apply4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */]
    extends StObject
       with Functor4[F] {
    
    def ap[S, R, E, A, B](
      fab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, (a : A): B> */ js.Any,
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any
    ): js.Any
  }
  object Apply4 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](
      URI: F,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any) => js.Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any
    ): Apply4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[Apply4[F]]
    }
    
    extension [Self <: Apply4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](x: Self & Apply4[F]) {
      
      inline def setAp(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, (a : A): B> */ js.Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any) => js.Any
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    }
  }
  
  type EnforceNonEmptyRecord[R] = R
}
