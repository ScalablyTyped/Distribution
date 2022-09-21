package typings.fpTs.mod

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
import typings.fpTs.readerTMod.ReaderM
import typings.fpTs.readerTMod.ReaderM1
import typings.fpTs.readerTMod.ReaderM2
import typings.fpTs.readerTMod.ReaderM2C
import typings.fpTs.readerTMod.ReaderM3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerT {
  
  @JSImport("fp-ts", "readerT")
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
  
  inline def fromNaturalTransformation[F, G](nt: NaturalTransformation[F, G]): js.Function1[
    /* f */ js.Function1[
      /* r */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<G, A> */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNaturalTransformation")(nt.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[
      /* r */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
    ], 
    Reader_[
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<G, A> */ Any
    ]
  ]]
  
  inline def fromNaturalTransformation_F_AnyG_Any[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](
    nt: (NaturalTransformation11[F, G]) | (NaturalTransformation12[F, G]) | (NaturalTransformation22[F, G]) | (NaturalTransformation23R[F, G]) | (NaturalTransformation24S[F, G])
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
}
