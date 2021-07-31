package typings.fpTs.foldableWithIndexMod

import typings.fpTs.foldableMod.FoldableComposition22C
import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldableWithIndexComposition22C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, GI, E]
  extends StObject
     with FoldableComposition22C[F, G, E] {
  
  def foldMapWithIndex[M](M: Monoid[M]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ /* fga */ js.Any, 
    /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, M], 
    M
  ]
  
  def reduceRightWithIndex[FE, A, B](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any,
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* a */ A, /* b */ B, B]
  ): B
  
  def reduceWithIndex[FE, A, B](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any,
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* b */ B, /* a */ A, B]
  ): B
}
object FoldableWithIndexComposition22C {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, GI, E](
    foldMap: Monoid[js.Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ /* fa */ js.Any, 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldMapWithIndex: Monoid[js.Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ /* fga */ js.Any, 
      /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, js.Any], 
      js.Any
    ],
    reduce: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceRight: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceRightWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any,
    reduceWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any
  ): FoldableWithIndexComposition22C[F, FI, G, GI, E] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), reduce = js.Any.fromFunction3(reduce), reduceRight = js.Any.fromFunction3(reduceRight), reduceRightWithIndex = js.Any.fromFunction3(reduceRightWithIndex), reduceWithIndex = js.Any.fromFunction3(reduceWithIndex))
    __obj.asInstanceOf[FoldableWithIndexComposition22C[F, FI, G, GI, E]]
  }
  
  @scala.inline
  implicit class FoldableWithIndexComposition22CMutableBuilder[Self <: FoldableWithIndexComposition22C[?, ?, ?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, GI, E] (val x: Self & (FoldableWithIndexComposition22C[F, FI, G, GI, E])) extends AnyVal {
    
    @scala.inline
    def setFoldMapWithIndex(
      value: Monoid[js.Any] => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ /* fga */ js.Any, 
          /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, js.Any], 
          js.Any
        ]
    ): Self = StObject.set(x, "foldMapWithIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduceRightWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "reduceRightWithIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReduceWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, E, A>> */ js.Any, js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "reduceWithIndex", js.Any.fromFunction3(value))
  }
}
