package typings.fpTs.mod

import typings.fpTs.applicativeMod.Applicative
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applicativeMod.Applicative3
import typings.fpTs.foldableMod.Foldable
import typings.fpTs.foldableMod.Foldable1
import typings.fpTs.foldableMod.Foldable2
import typings.fpTs.foldableMod.Foldable2C
import typings.fpTs.foldableMod.Foldable3
import typings.fpTs.foldableMod.Foldable3C
import typings.fpTs.foldableMod.Foldable4
import typings.fpTs.foldableMod.FoldableComposition
import typings.fpTs.foldableMod.FoldableComposition11
import typings.fpTs.foldableMod.FoldableComposition12
import typings.fpTs.foldableMod.FoldableComposition12C
import typings.fpTs.foldableMod.FoldableComposition21
import typings.fpTs.foldableMod.FoldableComposition22
import typings.fpTs.foldableMod.FoldableComposition22C
import typings.fpTs.foldableMod.FoldableComposition2C1
import typings.fpTs.monadMod.Monad
import typings.fpTs.monadMod.Monad1
import typings.fpTs.monadMod.Monad2
import typings.fpTs.monadMod.Monad2C
import typings.fpTs.monadMod.Monad3
import typings.fpTs.monadMod.Monad3C
import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foldable {
  
  @JSImport("fp-ts", "foldable")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def foldM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M], F: Foldable1[F]): js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldM")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ js.Any
  ]]
  @scala.inline
  def foldM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad2[M], F: Foldable1[F]): js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldM")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
  ]]
  @scala.inline
  def foldM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad3[M], F: Foldable1[F]): js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldM")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
  ]]
  @scala.inline
  def foldM[M, F](M: Monad[M], F: Foldable[F]): js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ js.Any, 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldM")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ js.Any, 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ js.Any
  ]]
  @scala.inline
  def foldM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, E](M: Monad2C[M, E], F: Foldable1[F]): js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldM")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
  ]]
  @scala.inline
  def foldM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, E](M: Monad3C[M, E], F: Foldable1[F]): js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("foldM")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
  ]]
  
  @scala.inline
  def getFoldableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Foldable1[F], G: Foldable1[G]): FoldableComposition11[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFoldableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FoldableComposition11[F, G]]
  @scala.inline
  def getFoldableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Foldable1[F], G: Foldable2[G]): FoldableComposition12[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFoldableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FoldableComposition12[F, G]]
  @scala.inline
  def getFoldableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Foldable2[F], G: Foldable1[G]): FoldableComposition21[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFoldableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FoldableComposition21[F, G]]
  @scala.inline
  def getFoldableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Foldable2[F], G: Foldable2[G]): FoldableComposition22[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFoldableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FoldableComposition22[F, G]]
  @scala.inline
  def getFoldableComposition[F, G](F: Foldable[F], G: Foldable[G]): FoldableComposition[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFoldableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FoldableComposition[F, G]]
  @scala.inline
  def getFoldableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Foldable1[F], G: Foldable2C[G, E]): FoldableComposition12C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFoldableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FoldableComposition12C[F, G, E]]
  @scala.inline
  def getFoldableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, E](F: Foldable2C[F, E], G: Foldable1[G]): FoldableComposition2C1[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFoldableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FoldableComposition2C1[F, G, E]]
  @scala.inline
  def getFoldableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Foldable2[F], G: Foldable2C[G, E]): FoldableComposition22C[F, G, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFoldableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FoldableComposition22C[F, G, E]]
  
  @scala.inline
  def intercalate[M, F](M: Monoid[M], F: Foldable[F]): js.Function2[
    /* sep */ M, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, M> */ /* fm */ js.Any, 
    M
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("intercalate")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* sep */ M, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, M> */ /* fm */ js.Any, 
    M
  ]]
  @scala.inline
  def intercalate[M, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monoid[M], F: Foldable1[F]): js.Function2[
    /* sep */ M, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, M> */ /* fm */ js.Any, 
    M
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("intercalate")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* sep */ M, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, M> */ /* fm */ js.Any, 
    M
  ]]
  @scala.inline
  def intercalate[M, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](M: Monoid[M], F: Foldable2[F]): js.Function2[
    /* sep */ M, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, M> */ /* fm */ js.Any, 
    M
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("intercalate")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* sep */ M, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, M> */ /* fm */ js.Any, 
    M
  ]]
  @scala.inline
  def intercalate[M, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](M: Monoid[M], F: Foldable3[F]): js.Function2[
    /* sep */ M, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, M> */ /* fm */ js.Any, 
    M
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("intercalate")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* sep */ M, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, M> */ /* fm */ js.Any, 
    M
  ]]
  @scala.inline
  def intercalate[M, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](M: Monoid[M], F: Foldable2C[F, E]): js.Function2[
    /* sep */ M, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, M> */ /* fm */ js.Any, 
    M
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("intercalate")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* sep */ M, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, M> */ /* fm */ js.Any, 
    M
  ]]
  
  @scala.inline
  def reduceM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad1[M], F: Foldable1[F]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ js.Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceM")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ js.Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ js.Any
    ]
  ]]
  @scala.inline
  def reduceM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad2[M], F: Foldable1[F]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceM")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ]
  ]]
  @scala.inline
  def reduceM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Monad3[M], F: Foldable1[F]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceM")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ]
  ]]
  @scala.inline
  def reduceM[M, F](M: Monad[M], F: Foldable[F]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ js.Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceM")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ js.Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ js.Any
    ]
  ]]
  @scala.inline
  def reduceM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, E](M: Monad2C[M, E], F: Foldable1[F]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceM")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ]
  ]]
  @scala.inline
  def reduceM[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, E](M: Monad3C[M, E], F: Foldable1[F]): js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceM")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* b */ js.Any, 
    /* f */ js.Function2[
      /* b */ js.Any, 
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ]
  ]]
  
  @scala.inline
  def toArray[F](F: Foldable[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ]]
  @scala.inline
  def toArray[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](F: Foldable1[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ]]
  @scala.inline
  def toArray[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](F: Foldable2[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ]]
  @scala.inline
  def toArray[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */](F: Foldable3[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ]]
  @scala.inline
  def toArray[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](F: Foldable4[F]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ]]
  @scala.inline
  def toArray[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](F: Foldable2C[F, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ]]
  @scala.inline
  def toArray[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](F: Foldable3C[F, E]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
    js.Array[js.Any]
  ]]
  
  @scala.inline
  def traverse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Applicative1[M], F: Foldable1[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, void> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse_")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<M, void> */ js.Any
  ]]
  @scala.inline
  def traverse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Applicative2[M], F: Foldable1[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, void> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse_")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, void> */ js.Any
  ]]
  @scala.inline
  def traverse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](M: Applicative3[M], F: Foldable1[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, void> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse_")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<M, R, E, void> */ js.Any
  ]]
  @scala.inline
  def traverse[M, F](M: Applicative[M], F: Foldable[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, void> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse_")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<M, void> */ js.Any
  ]]
  @scala.inline
  def traverse[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, E](M: Applicative2C[M, E], F: Foldable1[F]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, void> */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse_")(M.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ js.Any, 
    /* f */ js.Function1[
      /* a */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, B> */ js.Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<M, E, void> */ js.Any
  ]]
}
