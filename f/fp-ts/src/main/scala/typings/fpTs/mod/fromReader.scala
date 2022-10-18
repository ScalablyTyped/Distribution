package typings.fpTs.mod

import typings.fpTs.libChainMod.Chain
import typings.fpTs.libChainMod.Chain2
import typings.fpTs.libChainMod.Chain3
import typings.fpTs.libChainMod.Chain3C
import typings.fpTs.libChainMod.Chain4
import typings.fpTs.libFromReaderMod.FromReader
import typings.fpTs.libFromReaderMod.FromReader2
import typings.fpTs.libFromReaderMod.FromReader3
import typings.fpTs.libFromReaderMod.FromReader3C
import typings.fpTs.libFromReaderMod.FromReader4
import typings.fpTs.libReaderMod.Reader_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromReader {
  
  @JSImport("fp-ts", "fromReader")
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
}
