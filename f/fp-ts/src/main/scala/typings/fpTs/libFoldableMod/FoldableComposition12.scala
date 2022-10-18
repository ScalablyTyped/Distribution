package typings.fpTs.libFoldableMod

import typings.fpTs.libMonoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldableComposition12[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
  
  def foldMap[M](M: Monoid[M]): js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ /* fa */ Any, 
    /* f */ js.Function1[/* a */ Any, M], 
    M
  ]
  
  def reduce[E, A, B](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any,
    b: B,
    f: js.Function2[/* b */ B, /* a */ A, B]
  ): B
  
  def reduceRight[E, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any,
    b: B,
    f: js.Function2[/* a */ A, /* b */ B, B]
  ): B
}
object FoldableComposition12 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
    foldMap: Monoid[Any] => js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ /* fa */ Any, 
      /* f */ js.Function1[/* a */ Any, Any], 
      Any
    ],
    reduce: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any, Any, js.Function2[Any, Any, Any]) => Any,
    reduceRight: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any, Any, js.Function2[Any, Any, Any]) => Any
  ): FoldableComposition12[F, G] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), reduce = js.Any.fromFunction3(reduce), reduceRight = js.Any.fromFunction3(reduceRight))
    __obj.asInstanceOf[FoldableComposition12[F, G]]
  }
  
  extension [Self <: FoldableComposition12[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & (FoldableComposition12[F, G])) {
    
    inline def setFoldMap(
      value: Monoid[Any] => js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ /* fa */ Any, 
          /* f */ js.Function1[/* a */ Any, Any], 
          Any
        ]
    ): Self = StObject.set(x, "foldMap", js.Any.fromFunction1(value))
    
    inline def setReduce(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any, Any, js.Function2[Any, Any, Any]) => Any
    ): Self = StObject.set(x, "reduce", js.Any.fromFunction3(value))
    
    inline def setReduceRight(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind2<G, E, A>> */ Any, Any, js.Function2[Any, Any, Any]) => Any
    ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction3(value))
  }
}
