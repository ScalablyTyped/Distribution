package typings.fpTs.libFunctorWithIndexMod

import typings.fpTs.libFunctorMod.FunctorComposition22
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorWithIndexComposition22[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, GI]
  extends StObject
     with FunctorComposition22[F, G] {
  
  def mapWithIndex[FE, GE, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ Any,
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): Any
}
object FunctorWithIndexComposition22 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, GI](
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ Any, js.Function1[Any, Any]) => Any,
    mapWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ Any, js.Function2[/* i */ js.Tuple2[FI, GI], Any, Any]) => Any
  ): FunctorWithIndexComposition22[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
    __obj.asInstanceOf[FunctorWithIndexComposition22[F, FI, G, GI]]
  }
  
  extension [Self <: FunctorWithIndexComposition22[?, ?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, GI](x: Self & (FunctorWithIndexComposition22[F, FI, G, GI])) {
    
    inline def setMapWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, FE, Kind2<G, GE, A>> */ Any, js.Function2[/* i */ js.Tuple2[FI, GI], Any, Any]) => Any
    ): Self = StObject.set(x, "mapWithIndex", js.Any.fromFunction2(value))
  }
}
