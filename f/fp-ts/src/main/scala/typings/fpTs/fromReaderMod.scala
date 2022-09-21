package typings.fpTs

import typings.fpTs.chainMod.Chain
import typings.fpTs.chainMod.Chain2
import typings.fpTs.chainMod.Chain3
import typings.fpTs.chainMod.Chain3C
import typings.fpTs.chainMod.Chain4
import typings.fpTs.readerMod.Reader_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromReaderMod {
  
  @JSImport("fp-ts/lib/FromReader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ask[F](F: FromReader[F]): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, R, R> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, R, R> */ Any
  ]]
  inline def ask[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: FromReader2[F]): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, R> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, R> */ Any
  ]]
  inline def ask[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: FromReader3[F]): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, R> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, R> */ Any
  ]]
  inline def ask[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: FromReader4[F]): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, R> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, R> */ Any
  ]]
  inline def ask[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: FromReader3C[F, E]): js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, R> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ask")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, R> */ Any
  ]]
  
  inline def asks[F](F: FromReader[F]): js.Function1[
    /* f */ js.Function1[/* r */ Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, R, A> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* r */ Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, R, A> */ Any
  ]]
  inline def asks[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: FromReader2[F]): js.Function1[
    /* f */ js.Function1[/* r */ Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, A> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* r */ Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, A> */ Any
  ]]
  inline def asks[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: FromReader3[F]): js.Function1[
    /* f */ js.Function1[/* r */ Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* r */ Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
  ]]
  inline def asks[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: FromReader4[F]): js.Function1[
    /* f */ js.Function1[/* r */ Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* r */ Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any
  ]]
  inline def asks[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: FromReader3C[F, E]): js.Function1[
    /* f */ js.Function1[/* r */ Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("asks")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* r */ Any, Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
  ]]
  
  inline def chainFirstReaderK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: FromReader2[M], M: Chain2[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderK")(F.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ Any
    ]
  ]]
  inline def chainFirstReaderK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: FromReader3[M], M: Chain3[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderK")(F.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ]
  ]]
  inline def chainFirstReaderK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: FromReader4[M], M: Chain4[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderK")(F.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ Any
    ]
  ]]
  inline def chainFirstReaderK[M](F: FromReader[M], M: Chain[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<M, R, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<M, R, A> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderK")(F.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<M, R, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<M, R, A> */ Any
    ]
  ]]
  inline def chainFirstReaderK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: FromReader3C[M, E], M: Chain3C[M, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chainFirstReaderK")(F.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ Any
    ]
  ]]
  
  inline def chainReaderK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: FromReader2[M], M: Chain2[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderK")(F.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, R, B> */ Any
    ]
  ]]
  inline def chainReaderK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: FromReader3[M], M: Chain3[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderK")(F.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ]
  ]]
  inline def chainReaderK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: FromReader4[M], M: Chain4[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, B> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderK")(F.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, R, E, B> */ Any
    ]
  ]]
  inline def chainReaderK[M](F: FromReader[M], M: Chain[M]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<M, R, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<M, R, B> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderK")(F.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<M, R, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<M, R, B> */ Any
    ]
  ]]
  inline def chainReaderK[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: FromReader3C[M, E], M: Chain3C[M, E]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("chainReaderK")(F.asInstanceOf[js.Any], M.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Reader_[Any, Any]], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, A> */ /* ma */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ Any
    ]
  ]]
  
  inline def fromReaderK[F](F: FromReader[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Reader_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, R, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Reader_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, R, B> */ Any
    ]
  ]]
  inline def fromReaderK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: FromReader2[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Reader_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Reader_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, B> */ Any
    ]
  ]]
  inline def fromReaderK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: FromReader3[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Reader_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Reader_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ]]
  inline def fromReaderK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: FromReader4[F]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Reader_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Reader_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
    ]
  ]]
  inline def fromReaderK[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](F: FromReader3C[F, E]): js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Reader_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReaderK")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ js.Array[Any], Reader_[Any, Any]], 
    js.Function1[
      /* a */ js.Array[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ]]
  
  trait FromReader[F] extends StObject {
    
    val URI: F
    
    def fromReader[R, A](fa: Reader_[R, A]): Any
  }
  object FromReader {
    
    inline def apply[F](URI: F, fromReader: Reader_[Any, Any] => Any): FromReader[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], fromReader = js.Any.fromFunction1(fromReader))
      __obj.asInstanceOf[FromReader[F]]
    }
    
    extension [Self <: FromReader[?], F](x: Self & FromReader[F]) {
      
      inline def setFromReader(value: Reader_[Any, Any] => Any): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromReader2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    val URI: F
    
    def fromReader[E, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ): Any
  }
  object FromReader2 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      URI: F,
      fromReader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any => Any
    ): FromReader2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], fromReader = js.Any.fromFunction1(fromReader))
      __obj.asInstanceOf[FromReader2[F]]
    }
    
    extension [Self <: FromReader2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & FromReader2[F]) {
      
      inline def setFromReader(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any => Any
      ): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromReader3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    val URI: F
    
    def fromReader[R, A, E](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, A> */ Any
    ): Any
  }
  object FromReader3 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
      URI: F,
      fromReader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, A> */ Any => Any
    ): FromReader3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], fromReader = js.Any.fromFunction1(fromReader))
      __obj.asInstanceOf[FromReader3[F]]
    }
    
    extension [Self <: FromReader3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & FromReader3[F]) {
      
      inline def setFromReader(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, A> */ Any => Any
      ): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromReader3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def fromReader[R, A](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, A> */ Any
    ): Any
  }
  object FromReader3C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](
      URI: F,
      _E: E,
      fromReader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, A> */ Any => Any
    ): FromReader3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], fromReader = js.Any.fromFunction1(fromReader))
      __obj.asInstanceOf[FromReader3C[F, E]]
    }
    
    extension [Self <: FromReader3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (FromReader3C[F, E])) {
      
      inline def setFromReader(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, A> */ Any => Any
      ): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromReader4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */] extends StObject {
    
    val URI: F
    
    def fromReader[R, A, S, E](
      fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, A> */ Any
    ): Any
  }
  object FromReader4 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](
      URI: F,
      fromReader: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, A> */ Any => Any
    ): FromReader4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], fromReader = js.Any.fromFunction1(fromReader))
      __obj.asInstanceOf[FromReader4[F]]
    }
    
    extension [Self <: FromReader4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](x: Self & FromReader4[F]) {
      
      inline def setFromReader(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, R, A> */ Any => Any
      ): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
}
