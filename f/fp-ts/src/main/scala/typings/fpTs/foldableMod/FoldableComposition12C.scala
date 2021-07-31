package typings.fpTs.foldableMod

import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldableComposition12C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
  
  def foldMap[M](M: Monoid[M]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ /* fa */ js.Any, 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ]
  
  def reduce[A, B](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ js.Any,
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
  
  def reduceRight[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ js.Any,
    b: B,
    f: js.Function2[/* a */ A, /* b */ B, B]
  ): B
}
object FoldableComposition12C {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
    foldMap: Monoid[js.Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ /* fa */ js.Any, 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    reduce: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceRight: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
  ): FoldableComposition12C[F, G, E] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), reduce = js.Any.fromFunction3(reduce), reduceRight = js.Any.fromFunction3(reduceRight))
    __obj.asInstanceOf[FoldableComposition12C[F, G, E]]
  }
  
  @scala.inline
  implicit class FoldableComposition12CMutableBuilder[Self <: FoldableComposition12C[?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (FoldableComposition12C[F, G, E])) extends AnyVal {
    
    @scala.inline
    def setFoldMap(
      value: Monoid[js.Any] => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ /* fa */ js.Any, 
          /* f */ js.Function1[/* a */ js.Any, js.Any], 
          js.Any
        ]
    ): Self = StObject.set(x, "foldMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduce(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction3(value))
    
    @scala.inline
    def setReduceRight(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ js.Any, js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction3(value))
  }
}
