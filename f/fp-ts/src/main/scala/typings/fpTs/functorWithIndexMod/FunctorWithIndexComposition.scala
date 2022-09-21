package typings.fpTs.functorWithIndexMod

import typings.fpTs.functorMod.FunctorComposition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorWithIndexComposition[F, FI, G, GI]
  extends StObject
     with FunctorComposition[F, G] {
  
  def mapWithIndex[A, B](
    fga: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any,
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): Any
}
object FunctorWithIndexComposition {
  
  inline def apply[F, FI, G, GI](
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, js.Function1[Any, Any]) => Any,
    mapWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, js.Function2[/* i */ js.Tuple2[FI, GI], Any, Any]) => Any
  ): FunctorWithIndexComposition[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
    __obj.asInstanceOf[FunctorWithIndexComposition[F, FI, G, GI]]
  }
  
  extension [Self <: FunctorWithIndexComposition[?, ?, ?, ?], F, FI, G, GI](x: Self & (FunctorWithIndexComposition[F, FI, G, GI])) {
    
    inline def setMapWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, HKT<G, A>> */ Any, js.Function2[/* i */ js.Tuple2[FI, GI], Any, Any]) => Any
    ): Self = StObject.set(x, "mapWithIndex", js.Any.fromFunction2(value))
  }
}
