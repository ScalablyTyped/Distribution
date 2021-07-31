package typings.fpTs.foldableMod

import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldableComposition22[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
  
  def foldMap[M](M: Monoid[M]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ /* fa */ js.Any, 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ]
  
  def reduce[FE, GE, A, B](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any,
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
  
  def reduceRight[FE, GE, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any,
    b: B,
    f: js.Function2[/* a */ A, /* b */ B, B]
  ): B
}
object FoldableComposition22 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
    foldMap: Monoid[js.Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ /* fa */ js.Any, 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    reduce: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceRight: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): FoldableComposition22[F, G] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), reduce = js.Any.fromFunction3(reduce), reduceRight = js.Any.fromFunction3(reduceRight))
    __obj.asInstanceOf[FoldableComposition22[F, G]]
  }
  
  @scala.inline
  implicit class FoldableComposition22MutableBuilder[Self <: FoldableComposition22[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & (FoldableComposition22[F, G])) extends AnyVal {
    
    @scala.inline
    def setFoldMap(
      value: Monoid[js.Any] => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ /* fa */ js.Any, 
          /* f */ js.Function1[/* a */ js.Any, js.Any], 
          js.Any
        ]
    ): Self = StObject.set(x, "foldMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduce(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReduceRight(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction3(value))
  }
}
