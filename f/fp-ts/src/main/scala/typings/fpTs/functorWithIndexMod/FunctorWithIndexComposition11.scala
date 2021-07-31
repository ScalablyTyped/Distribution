package typings.fpTs.functorWithIndexMod

import typings.fpTs.functorMod.FunctorComposition11
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctorWithIndexComposition11[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, GI]
  extends StObject
     with FunctorComposition11[F, G] {
  
  def mapWithIndex[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ js.Any,
    f: js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ A, B]
  ): js.Any
}
object FunctorWithIndexComposition11 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, GI](
    map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ js.Any, js.Function1[js.Any, js.Any]) => js.Any,
    mapWithIndex: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ js.Any, js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any]) => js.Any
  ): FunctorWithIndexComposition11[F, FI, G, GI] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex))
    __obj.asInstanceOf[FunctorWithIndexComposition11[F, FI, G, GI]]
  }
  
  @scala.inline
  implicit class FunctorWithIndexComposition11MutableBuilder[Self <: FunctorWithIndexComposition11[?, ?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, FI, G /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */, GI] (val x: Self & (FunctorWithIndexComposition11[F, FI, G, GI])) extends AnyVal {
    
    @scala.inline
    def setMapWithIndex(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, Kind<G, A>> */ js.Any, js.Function2[/* i */ js.Tuple2[FI, GI], js.Any, js.Any]) => js.Any
    ): Self = StObject.set(x, "mapWithIndex", js.Any.fromFunction2(value))
  }
}
