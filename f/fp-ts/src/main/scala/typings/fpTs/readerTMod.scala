package typings.fpTs

import typings.fpTs.applyMod.Apply
import typings.fpTs.applyMod.Apply1
import typings.fpTs.applyMod.Apply2
import typings.fpTs.applyMod.Apply2C
import typings.fpTs.applyMod.Apply3
import typings.fpTs.applyMod.Apply3C
import typings.fpTs.applyMod.Apply4
import typings.fpTs.chainMod.Chain
import typings.fpTs.chainMod.Chain1
import typings.fpTs.chainMod.Chain2
import typings.fpTs.chainMod.Chain2C
import typings.fpTs.chainMod.Chain3
import typings.fpTs.chainMod.Chain3C
import typings.fpTs.chainMod.Chain4
import typings.fpTs.functorMod.Functor
import typings.fpTs.functorMod.Functor1
import typings.fpTs.functorMod.Functor2
import typings.fpTs.functorMod.Functor2C
import typings.fpTs.functorMod.Functor3
import typings.fpTs.functorMod.Functor3C
import typings.fpTs.functorMod.Functor4
import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadMod.Monad3
import typings.fpTs.naturalTransformationMod.NaturalTransformation
import typings.fpTs.naturalTransformationMod.NaturalTransformation11
import typings.fpTs.naturalTransformationMod.NaturalTransformation12
import typings.fpTs.naturalTransformationMod.NaturalTransformation22
import typings.fpTs.naturalTransformationMod.NaturalTransformation23R
import typings.fpTs.naturalTransformationMod.NaturalTransformation24S
import typings.fpTs.pointedMod.Pointed
import typings.fpTs.pointedMod.Pointed1
import typings.fpTs.pointedMod.Pointed2
import typings.fpTs.pointedMod.Pointed2C
import typings.fpTs.pointedMod.Pointed3
import typings.fpTs.pointedMod.Pointed3C
import typings.fpTs.pointedMod.Pointed4
import typings.fpTs.readerMod.Reader_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerTMod {
  
  @JSImport("fp-ts/lib/ReaderT", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ap[F](F: Apply[F]): js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
      ]
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Apply1[F]): js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
      ]
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Apply2[F]): js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
      ]
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Apply3[F]): js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
      ]
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Apply4[F]): js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, B> */ Any
      ]
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Apply2C[F, FE]): js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
      ]
    ]
  ]]
  inline def ap[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Apply3C[F, FE]): js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ap")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* fa */ Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
    ], 
    js.Function1[
      /* fab */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, (a : A): B> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
      ]
    ]
  ]]
  
  inline def chain[M](M: Chain[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ Any
      ]
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Chain1[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ Any
      ]
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Chain2[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
      ]
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Chain3[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, FR, FE, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, FR, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, FR, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, FR, FE, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, FR, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, FR, FE, B> */ Any
      ]
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](M: Chain4[M]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, FR, FE, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, FR, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, FR, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, FR, FE, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, FR, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<M, S, FR, FE, B> */ Any
      ]
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](M: Chain2C[M, FE]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, FE, B> */ Any
      ]
    ]
  ]]
  inline def chain[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](M: Chain3C[M, FE]): js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, FR, FE, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, FR, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, FR, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* a */ Any, 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, FR, FE, B> */ Any
      ]
    ], 
    js.Function1[
      /* ma */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, FR, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, FR, FE, B> */ Any
      ]
    ]
  ]]
  
  inline def fromNaturalTransformation[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](
    nt: (NaturalTransformation[F, G]) | (NaturalTransformation11[F, G]) | (NaturalTransformation12[F, G]) | (NaturalTransformation22[F, G]) | (NaturalTransformation23R[F, G]) | (NaturalTransformation24S[F, G])
  ): js.Function1[
    /* f */ js.Function1[
      /* r */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, S, A> */ Any
    ], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<G, S, R, E, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNaturalTransformation")(nt.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* r */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, S, A> */ Any
    ], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<G, S, R, E, A> */ Any
    ]
  ]]
  
  inline def fromReader[F](F: Pointed[F]): js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReader")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ]
  ]]
  inline def fromReader[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReader")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ]
  ]]
  inline def fromReader[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReader")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
    ]
  ]]
  inline def fromReader[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReader")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
    ]
  ]]
  inline def fromReader[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Pointed4[F]): js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReader")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, A> */ Any
    ]
  ]]
  inline def fromReader[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Pointed2C[F, FE]): js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReader")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
    ]
  ]]
  inline def fromReader[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Pointed3C[F, FE]): js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromReader")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* ma */ Reader_[Any, Any], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
    ]
  ]]
  
  inline def getReaderM[M](M: Monad[M]): ReaderM[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM[M]]
  inline def getReaderM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](M: Monad1[M]): ReaderM1[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM1[M]]
  inline def getReaderM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](M: Monad2[M]): ReaderM2[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM2[M]]
  inline def getReaderM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](M: Monad3[M]): ReaderM3[M] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM3[M]]
  inline def getReaderM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](M: Monad2C[M, E]): ReaderM2C[M, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReaderM")(M.asInstanceOf[js.Any]).asInstanceOf[ReaderM2C[M, E]]
  
  inline def map[F](F: Functor[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
      ]
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
      ]
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
      ]
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
      ]
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Functor4[F]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, B> */ Any
      ]
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Functor2C[F, FE]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, B> */ Any
      ]
    ]
  ]]
  inline def map[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Functor3C[F, FE]): js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* a */ Any, Any], 
    js.Function1[
      /* fa */ Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
      ], 
      Reader_[
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, B> */ Any
      ]
    ]
  ]]
  
  inline def of[F](F: Pointed[F]): js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ]
  ]]
  inline def of[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Pointed1[F]): js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ]
  ]]
  inline def of[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Pointed2[F]): js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
    ]
  ]]
  inline def of[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Pointed3[F]): js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
    ]
  ]]
  inline def of[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](F: Pointed4[F]): js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, FR, FE, A> */ Any
    ]
  ]]
  inline def of[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FE](F: Pointed2C[F, FE]): js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, A> */ Any
    ]
  ]]
  inline def of[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, FE](F: Pointed3C[F, FE]): js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* a */ Any, 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, FR, FE, A> */ Any
    ]
  ]]
  
  trait ReaderM[M] extends StObject {
    
    def ap[R, A, B](mab: ReaderT[M, R, js.Function1[/* a */ A, B]], ma: ReaderT[M, R, A]): ReaderT[M, R, B]
    
    def ask[R](): ReaderT[M, R, R]
    
    def asks[R, A](f: js.Function1[/* r */ R, A]): ReaderT[M, R, A]
    
    def chain[R, A, B](ma: ReaderT[M, R, A], f: js.Function1[/* a */ A, ReaderT[M, R, B]]): ReaderT[M, R, B]
    
    def fromM[R, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
    ): ReaderT[M, R, A]
    
    def fromReader[R, A](ma: Reader_[R, A]): ReaderT[M, R, A]
    
    def local[R1, A, R2](ma: ReaderT[M, R1, A], f: js.Function1[/* d */ R2, R1]): ReaderT[M, R2, A]
    
    def map[R, A, B](ma: ReaderT[M, R, A], f: js.Function1[/* a */ A, B]): ReaderT[M, R, B]
    
    def of[R, A](a: A): ReaderT[M, R, A]
  }
  object ReaderM {
    
    inline def apply[M](
      ap: (ReaderT[M, Any, js.Function1[Any, Any]], ReaderT[M, Any, Any]) => ReaderT[M, Any, Any],
      ask: () => ReaderT[M, Any, Any],
      asks: js.Function1[Any, Any] => ReaderT[M, Any, Any],
      chain: (ReaderT[M, Any, Any], js.Function1[Any, ReaderT[M, Any, Any]]) => ReaderT[M, Any, Any],
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any => ReaderT[M, Any, Any],
      fromReader: Reader_[Any, Any] => ReaderT[M, Any, Any],
      local: (ReaderT[M, Any, Any], js.Function1[Any, Any]) => ReaderT[M, Any, Any],
      map: (ReaderT[M, Any, Any], js.Function1[Any, Any]) => ReaderT[M, Any, Any],
      of: Any => ReaderT[M, Any, Any]
    ): ReaderM[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), ask = js.Any.fromFunction0(ask), asks = js.Any.fromFunction1(asks), chain = js.Any.fromFunction2(chain), fromM = js.Any.fromFunction1(fromM), fromReader = js.Any.fromFunction1(fromReader), local = js.Any.fromFunction2(local), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[ReaderM[M]]
    }
    
    extension [Self <: ReaderM[?], M](x: Self & ReaderM[M]) {
      
      inline def setAp(value: (ReaderT[M, Any, js.Function1[Any, Any]], ReaderT[M, Any, Any]) => ReaderT[M, Any, Any]): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setAsk(value: () => ReaderT[M, Any, Any]): Self = StObject.set(x, "ask", js.Any.fromFunction0(value))
      
      inline def setAsks(value: js.Function1[Any, Any] => ReaderT[M, Any, Any]): Self = StObject.set(x, "asks", js.Any.fromFunction1(value))
      
      inline def setChain(value: (ReaderT[M, Any, Any], js.Function1[Any, ReaderT[M, Any, Any]]) => ReaderT[M, Any, Any]): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any => ReaderT[M, Any, Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromReader(value: Reader_[Any, Any] => ReaderT[M, Any, Any]): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setLocal(value: (ReaderT[M, Any, Any], js.Function1[Any, Any]) => ReaderT[M, Any, Any]): Self = StObject.set(x, "local", js.Any.fromFunction2(value))
      
      inline def setMap(value: (ReaderT[M, Any, Any], js.Function1[Any, Any]) => ReaderT[M, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setOf(value: Any => ReaderT[M, Any, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    }
  }
  
  trait ReaderM1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */] extends StObject {
    
    def ap[R, A, B](mab: ReaderT1[M, R, js.Function1[/* a */ A, B]], ma: ReaderT1[M, R, A]): ReaderT1[M, R, B]
    
    def ask[R](): ReaderT1[M, R, R]
    
    def asks[R, A](f: js.Function1[/* r */ R, A]): ReaderT1[M, R, A]
    
    def chain[R, A, B](ma: ReaderT1[M, R, A], f: js.Function1[/* a */ A, ReaderT1[M, R, B]]): ReaderT1[M, R, B]
    
    def fromM[R, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
    ): ReaderT1[M, R, A]
    
    def fromReader[R, A](ma: Reader_[R, A]): ReaderT1[M, R, A]
    
    def local[R1, A, R2](ma: ReaderT1[M, R1, A], f: js.Function1[/* d */ R2, R1]): ReaderT1[M, R2, A]
    
    def map[R, A, B](ma: ReaderT1[M, R, A], f: js.Function1[/* a */ A, B]): ReaderT1[M, R, B]
    
    def of[R, A](a: A): ReaderT1[M, R, A]
  }
  object ReaderM1 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      ap: (ReaderT1[M, Any, js.Function1[Any, Any]], ReaderT1[M, Any, Any]) => ReaderT1[M, Any, Any],
      ask: () => ReaderT1[M, Any, Any],
      asks: js.Function1[Any, Any] => ReaderT1[M, Any, Any],
      chain: (ReaderT1[M, Any, Any], js.Function1[Any, ReaderT1[M, Any, Any]]) => ReaderT1[M, Any, Any],
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any => ReaderT1[M, Any, Any],
      fromReader: Reader_[Any, Any] => ReaderT1[M, Any, Any],
      local: (ReaderT1[M, Any, Any], js.Function1[Any, Any]) => ReaderT1[M, Any, Any],
      map: (ReaderT1[M, Any, Any], js.Function1[Any, Any]) => ReaderT1[M, Any, Any],
      of: Any => ReaderT1[M, Any, Any]
    ): ReaderM1[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), ask = js.Any.fromFunction0(ask), asks = js.Any.fromFunction1(asks), chain = js.Any.fromFunction2(chain), fromM = js.Any.fromFunction1(fromM), fromReader = js.Any.fromFunction1(fromReader), local = js.Any.fromFunction2(local), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[ReaderM1[M]]
    }
    
    extension [Self <: ReaderM1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & ReaderM1[M]) {
      
      inline def setAp(value: (ReaderT1[M, Any, js.Function1[Any, Any]], ReaderT1[M, Any, Any]) => ReaderT1[M, Any, Any]): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setAsk(value: () => ReaderT1[M, Any, Any]): Self = StObject.set(x, "ask", js.Any.fromFunction0(value))
      
      inline def setAsks(value: js.Function1[Any, Any] => ReaderT1[M, Any, Any]): Self = StObject.set(x, "asks", js.Any.fromFunction1(value))
      
      inline def setChain(value: (ReaderT1[M, Any, Any], js.Function1[Any, ReaderT1[M, Any, Any]]) => ReaderT1[M, Any, Any]): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any => ReaderT1[M, Any, Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromReader(value: Reader_[Any, Any] => ReaderT1[M, Any, Any]): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setLocal(value: (ReaderT1[M, Any, Any], js.Function1[Any, Any]) => ReaderT1[M, Any, Any]): Self = StObject.set(x, "local", js.Any.fromFunction2(value))
      
      inline def setMap(value: (ReaderT1[M, Any, Any], js.Function1[Any, Any]) => ReaderT1[M, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setOf(value: Any => ReaderT1[M, Any, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    }
  }
  
  trait ReaderM2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    def ap[R, E, A, B](mab: ReaderT2[M, R, E, js.Function1[/* a */ A, B]], ma: ReaderT2[M, R, E, A]): ReaderT2[M, R, E, B]
    
    def ask[R, E](): ReaderT2[M, R, E, R]
    
    def asks[R, E, A](f: js.Function1[/* r */ R, A]): ReaderT2[M, R, E, A]
    
    def chain[R, E, A, B](ma: ReaderT2[M, R, E, A], f: js.Function1[/* a */ A, ReaderT2[M, R, E, B]]): ReaderT2[M, R, E, B]
    
    def fromM[R, E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
    ): ReaderT2[M, R, E, A]
    
    def fromReader[R, E, A](ma: Reader_[R, A]): ReaderT2[M, R, E, A]
    
    def local[R1, E, A, R2](ma: ReaderT2[M, R1, E, A], f: js.Function1[/* d */ R2, R1]): ReaderT2[M, R2, E, A]
    
    def map[R, E, A, B](ma: ReaderT2[M, R, E, A], f: js.Function1[/* a */ A, B]): ReaderT2[M, R, E, B]
    
    def of[R, E, A](a: A): ReaderT2[M, R, E, A]
  }
  object ReaderM2 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      ap: (ReaderT2[M, Any, Any, js.Function1[Any, Any]], ReaderT2[M, Any, Any, Any]) => ReaderT2[M, Any, Any, Any],
      ask: () => ReaderT2[M, Any, Any, Any],
      asks: js.Function1[Any, Any] => ReaderT2[M, Any, Any, Any],
      chain: (ReaderT2[M, Any, Any, Any], js.Function1[Any, ReaderT2[M, Any, Any, Any]]) => ReaderT2[M, Any, Any, Any],
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any => ReaderT2[M, Any, Any, Any],
      fromReader: Reader_[Any, Any] => ReaderT2[M, Any, Any, Any],
      local: (ReaderT2[M, Any, Any, Any], js.Function1[Any, Any]) => ReaderT2[M, Any, Any, Any],
      map: (ReaderT2[M, Any, Any, Any], js.Function1[Any, Any]) => ReaderT2[M, Any, Any, Any],
      of: Any => ReaderT2[M, Any, Any, Any]
    ): ReaderM2[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), ask = js.Any.fromFunction0(ask), asks = js.Any.fromFunction1(asks), chain = js.Any.fromFunction2(chain), fromM = js.Any.fromFunction1(fromM), fromReader = js.Any.fromFunction1(fromReader), local = js.Any.fromFunction2(local), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[ReaderM2[M]]
    }
    
    extension [Self <: ReaderM2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & ReaderM2[M]) {
      
      inline def setAp(
        value: (ReaderT2[M, Any, Any, js.Function1[Any, Any]], ReaderT2[M, Any, Any, Any]) => ReaderT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setAsk(value: () => ReaderT2[M, Any, Any, Any]): Self = StObject.set(x, "ask", js.Any.fromFunction0(value))
      
      inline def setAsks(value: js.Function1[Any, Any] => ReaderT2[M, Any, Any, Any]): Self = StObject.set(x, "asks", js.Any.fromFunction1(value))
      
      inline def setChain(
        value: (ReaderT2[M, Any, Any, Any], js.Function1[Any, ReaderT2[M, Any, Any, Any]]) => ReaderT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any => ReaderT2[M, Any, Any, Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromReader(value: Reader_[Any, Any] => ReaderT2[M, Any, Any, Any]): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setLocal(value: (ReaderT2[M, Any, Any, Any], js.Function1[Any, Any]) => ReaderT2[M, Any, Any, Any]): Self = StObject.set(x, "local", js.Any.fromFunction2(value))
      
      inline def setMap(value: (ReaderT2[M, Any, Any, Any], js.Function1[Any, Any]) => ReaderT2[M, Any, Any, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setOf(value: Any => ReaderT2[M, Any, Any, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    }
  }
  
  trait ReaderM2C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    def ap[R, A, B](mab: ReaderT2[M, R, E, js.Function1[/* a */ A, B]], ma: ReaderT2[M, R, E, A]): ReaderT2[M, R, E, B]
    
    def ask[R](): ReaderT2[M, R, E, R]
    
    def asks[R, A](f: js.Function1[/* r */ R, A]): ReaderT2[M, R, E, A]
    
    def chain[R, A, B](ma: ReaderT2[M, R, E, A], f: js.Function1[/* a */ A, ReaderT2[M, R, E, B]]): ReaderT2[M, R, E, B]
    
    def fromM[R, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
    ): ReaderT2[M, R, E, A]
    
    def fromReader[R, A](ma: Reader_[R, A]): ReaderT2[M, R, E, A]
    
    def local[R1, A, R2](ma: ReaderT2[M, R1, E, A], f: js.Function1[/* d */ R2, R1]): ReaderT2[M, R2, E, A]
    
    def map[R, A, B](ma: ReaderT2[M, R, E, A], f: js.Function1[/* a */ A, B]): ReaderT2[M, R, E, B]
    
    def of[R, A](a: A): ReaderT2[M, R, E, A]
  }
  object ReaderM2C {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      ap: (ReaderT2[M, Any, E, js.Function1[Any, Any]], ReaderT2[M, Any, E, Any]) => ReaderT2[M, Any, E, Any],
      ask: () => ReaderT2[M, Any, E, Any],
      asks: js.Function1[Any, Any] => ReaderT2[M, Any, E, Any],
      chain: (ReaderT2[M, Any, E, Any], js.Function1[Any, ReaderT2[M, Any, E, Any]]) => ReaderT2[M, Any, E, Any],
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any => ReaderT2[M, Any, E, Any],
      fromReader: Reader_[Any, Any] => ReaderT2[M, Any, E, Any],
      local: (ReaderT2[M, Any, E, Any], js.Function1[Any, Any]) => ReaderT2[M, Any, E, Any],
      map: (ReaderT2[M, Any, E, Any], js.Function1[Any, Any]) => ReaderT2[M, Any, E, Any],
      of: Any => ReaderT2[M, Any, E, Any]
    ): ReaderM2C[M, E] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), ask = js.Any.fromFunction0(ask), asks = js.Any.fromFunction1(asks), chain = js.Any.fromFunction2(chain), fromM = js.Any.fromFunction1(fromM), fromReader = js.Any.fromFunction1(fromReader), local = js.Any.fromFunction2(local), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[ReaderM2C[M, E]]
    }
    
    extension [Self <: ReaderM2C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (ReaderM2C[M, E])) {
      
      inline def setAp(
        value: (ReaderT2[M, Any, E, js.Function1[Any, Any]], ReaderT2[M, Any, E, Any]) => ReaderT2[M, Any, E, Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setAsk(value: () => ReaderT2[M, Any, E, Any]): Self = StObject.set(x, "ask", js.Any.fromFunction0(value))
      
      inline def setAsks(value: js.Function1[Any, Any] => ReaderT2[M, Any, E, Any]): Self = StObject.set(x, "asks", js.Any.fromFunction1(value))
      
      inline def setChain(
        value: (ReaderT2[M, Any, E, Any], js.Function1[Any, ReaderT2[M, Any, E, Any]]) => ReaderT2[M, Any, E, Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any => ReaderT2[M, Any, E, Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromReader(value: Reader_[Any, Any] => ReaderT2[M, Any, E, Any]): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setLocal(value: (ReaderT2[M, Any, E, Any], js.Function1[Any, Any]) => ReaderT2[M, Any, E, Any]): Self = StObject.set(x, "local", js.Any.fromFunction2(value))
      
      inline def setMap(value: (ReaderT2[M, Any, E, Any], js.Function1[Any, Any]) => ReaderT2[M, Any, E, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setOf(value: Any => ReaderT2[M, Any, E, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    }
  }
  
  trait ReaderM3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    def ap[R, U, E, A, B](mab: ReaderT3[M, R, U, E, js.Function1[/* a */ A, B]], ma: ReaderT3[M, R, U, E, A]): ReaderT3[M, R, U, E, B]
    
    def ask[R, U, E](): ReaderT3[M, R, U, E, R]
    
    def asks[R, U, E, A](f: js.Function1[/* r */ R, A]): ReaderT3[M, R, U, E, A]
    
    def chain[R, U, E, A, B](ma: ReaderT3[M, R, U, E, A], f: js.Function1[/* a */ A, ReaderT3[M, R, U, E, B]]): ReaderT3[M, R, U, E, B]
    
    def fromM[R, U, E, A](
      ma: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, U, E, A> */ Any
    ): ReaderT3[M, R, U, E, A]
    
    def fromReader[R, U, E, A](ma: Reader_[R, A]): ReaderT3[M, R, U, E, A]
    
    def local[R1, U, E, A, R2](ma: ReaderT3[M, R1, U, E, A], f: js.Function1[/* d */ R2, R1]): ReaderT3[M, R2, U, E, A]
    
    def map[R, U, E, A, B](ma: ReaderT3[M, R, U, E, A], f: js.Function1[/* a */ A, B]): ReaderT3[M, R, U, E, B]
    
    def of[R, U, E, A](a: A): ReaderT3[M, R, U, E, A]
  }
  object ReaderM3 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
      ap: (ReaderT3[M, Any, Any, Any, js.Function1[Any, Any]], ReaderT3[M, Any, Any, Any, Any]) => ReaderT3[M, Any, Any, Any, Any],
      ask: () => ReaderT3[M, Any, Any, Any, Any],
      asks: js.Function1[Any, Any] => ReaderT3[M, Any, Any, Any, Any],
      chain: (ReaderT3[M, Any, Any, Any, Any], js.Function1[Any, ReaderT3[M, Any, Any, Any, Any]]) => ReaderT3[M, Any, Any, Any, Any],
      fromM: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, U, E, A> */ Any => ReaderT3[M, Any, Any, Any, Any],
      fromReader: Reader_[Any, Any] => ReaderT3[M, Any, Any, Any, Any],
      local: (ReaderT3[M, Any, Any, Any, Any], js.Function1[Any, Any]) => ReaderT3[M, Any, Any, Any, Any],
      map: (ReaderT3[M, Any, Any, Any, Any], js.Function1[Any, Any]) => ReaderT3[M, Any, Any, Any, Any],
      of: Any => ReaderT3[M, Any, Any, Any, Any]
    ): ReaderM3[M] = {
      val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), ask = js.Any.fromFunction0(ask), asks = js.Any.fromFunction1(asks), chain = js.Any.fromFunction2(chain), fromM = js.Any.fromFunction1(fromM), fromReader = js.Any.fromFunction1(fromReader), local = js.Any.fromFunction2(local), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[ReaderM3[M]]
    }
    
    extension [Self <: ReaderM3[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & ReaderM3[M]) {
      
      inline def setAp(
        value: (ReaderT3[M, Any, Any, Any, js.Function1[Any, Any]], ReaderT3[M, Any, Any, Any, Any]) => ReaderT3[M, Any, Any, Any, Any]
      ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
      
      inline def setAsk(value: () => ReaderT3[M, Any, Any, Any, Any]): Self = StObject.set(x, "ask", js.Any.fromFunction0(value))
      
      inline def setAsks(value: js.Function1[Any, Any] => ReaderT3[M, Any, Any, Any, Any]): Self = StObject.set(x, "asks", js.Any.fromFunction1(value))
      
      inline def setChain(
        value: (ReaderT3[M, Any, Any, Any, Any], js.Function1[Any, ReaderT3[M, Any, Any, Any, Any]]) => ReaderT3[M, Any, Any, Any, Any]
      ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
      
      inline def setFromM(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, U, E, A> */ Any => ReaderT3[M, Any, Any, Any, Any]
      ): Self = StObject.set(x, "fromM", js.Any.fromFunction1(value))
      
      inline def setFromReader(value: Reader_[Any, Any] => ReaderT3[M, Any, Any, Any, Any]): Self = StObject.set(x, "fromReader", js.Any.fromFunction1(value))
      
      inline def setLocal(
        value: (ReaderT3[M, Any, Any, Any, Any], js.Function1[Any, Any]) => ReaderT3[M, Any, Any, Any, Any]
      ): Self = StObject.set(x, "local", js.Any.fromFunction2(value))
      
      inline def setMap(
        value: (ReaderT3[M, Any, Any, Any, Any], js.Function1[Any, Any]) => ReaderT3[M, Any, Any, Any, Any]
      ): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
      
      inline def setOf(value: Any => ReaderT3[M, Any, Any, Any, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    }
  }
  
  type ReaderT[M, R, A] = js.Function1[
    /* r */ R, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, A> */ Any
  ]
  
  type ReaderT1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, R, A] = js.Function1[
    /* r */ R, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, A> */ Any
  ]
  
  type ReaderT2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, R, E, A] = js.Function1[
    /* r */ R, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, A> */ Any
  ]
  
  type ReaderT3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, R, U, E, A] = js.Function1[
    /* r */ R, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, U, E, A> */ Any
  ]
}
