package typings.fpTs.foldableWithIndexMod

import typings.fpTs.foldableMod.FoldableComposition2C1
import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldableWithIndexComposition2C1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, GI, FE]
  extends StObject
     with FoldableComposition2C1[F, G, FE] {
  
  def foldMapWithIndex[M](M: Monoid[M]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind<G, A>> */ /* fga */ js.Any, 
    /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, M], 
    M
  ]
  
  def reduceRightWithIndex[A, B](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind<G, A>> */ js.Any,
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* a */ A, /* b */ B, B]
  ): B
  
  def reduceWithIndex[A, B](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind<G, A>> */ js.Any,
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* b */ B, /* a */ A, B]
  ): B
}
object FoldableWithIndexComposition2C1 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, GI, FE](
    foldMap: Monoid[js.Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ /* fa */ js.Any, 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldMapWithIndex: Monoid[js.Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind<G, A>> */ /* fga */ js.Any, 
      /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, js.Any], 
      js.Any
    ],
    reduce: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceRight: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Kind<G, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceRightWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind<G, A>> */ js.Any, js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any,
    reduceWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind<G, A>> */ js.Any, js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any
  ): FoldableWithIndexComposition2C1[F, FI, G, GI, FE] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), reduce = js.Any.fromFunction3(reduce), reduceRight = js.Any.fromFunction3(reduceRight), reduceRightWithIndex = js.Any.fromFunction3(reduceRightWithIndex), reduceWithIndex = js.Any.fromFunction3(reduceWithIndex))
    __obj.asInstanceOf[FoldableWithIndexComposition2C1[F, FI, G, GI, FE]]
  }
  
  @scala.inline
  implicit class FoldableWithIndexComposition2C1MutableBuilder[Self <: FoldableWithIndexComposition2C1[?, ?, ?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, GI, FE] (val x: Self & (FoldableWithIndexComposition2C1[F, FI, G, GI, FE])) extends AnyVal {
    
    @scala.inline
    def setFoldMapWithIndex(
      value: Monoid[js.Any] => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind<G, A>> */ /* fga */ js.Any, 
          /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, js.Any], 
          js.Any
        ]
    ): Self = StObject.set(x, "foldMapWithIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduceRightWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind<G, A>> */ js.Any, js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "reduceRightWithIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReduceWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind<G, A>> */ js.Any, js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "reduceWithIndex", js.Any.fromFunction3(value))
  }
}
