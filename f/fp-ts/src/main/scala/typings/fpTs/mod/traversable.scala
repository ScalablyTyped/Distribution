package typings.fpTs.mod

import typings.fpTs.anon.Fn35
import typings.fpTs.anon.FnCallF
import typings.fpTs.applicativeMod.Applicative
import typings.fpTs.traversableMod.Traversable
import typings.fpTs.traversableMod.Traversable1
import typings.fpTs.traversableMod.TraversableComposition
import typings.fpTs.traversableMod.TraversableComposition11
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traversable {
  
  @JSImport("fp-ts", "traversable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTraversableComposition[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Traversable1[F], G: Traversable1[G]): TraversableComposition11[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTraversableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[TraversableComposition11[F, G]]
  inline def getTraversableComposition[F, G](F: Traversable[F], G: Traversable[G]): TraversableComposition[F, G] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTraversableComposition")(F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[TraversableComposition[F, G]]
  
  inline def sequence[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T], G: Traversable1[G]): Fn35 = (^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(T.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[Fn35]
  inline def sequence[T, G](T: Traversable[T], G: Traversable[G]): js.Function1[
    /* F */ Applicative[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, HKT<G, HKT<F, A>>> */ /* tgfa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, HKT<G, A>>> */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(T.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* F */ Applicative[Any], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, HKT<G, HKT<F, A>>> */ /* tgfa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, HKT<G, A>>> */ Any
    ]
  ]]
  
  inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T], G: Traversable1[G]): FnCallF = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[FnCallF]
  inline def traverse[T, G](T: Traversable[T], G: Traversable[G]): js.Function1[
    /* F */ Applicative[Any], 
    js.Function1[
      /* f */ js.Function1[
        /* a */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
      ], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, HKT<G, A>> */ /* tga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, HKT<G, B>>> */ Any
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* F */ Applicative[Any], 
    js.Function1[
      /* f */ js.Function1[
        /* a */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
      ], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, HKT<G, A>> */ /* tga */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<T, HKT<G, B>>> */ Any
      ]
    ]
  ]]
}
