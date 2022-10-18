package typings.fpTs.libPipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableProfunctor[F] extends StObject {
  
  def promap[E, A, D, B](f: js.Function1[/* d */ D, E], g: js.Function1[/* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ /* fbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, D, B> */ Any
  ]
}
object PipeableProfunctor {
  
  inline def apply[F](
    promap: (js.Function1[Any, Any], js.Function1[Any, Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ /* fbc */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, D, B> */ Any
    ]
  ): PipeableProfunctor[F] = {
    val __obj = js.Dynamic.literal(promap = js.Any.fromFunction2(promap))
    __obj.asInstanceOf[PipeableProfunctor[F]]
  }
  
  extension [Self <: PipeableProfunctor[?], F](x: Self & PipeableProfunctor[F]) {
    
    inline def setPromap(
      value: (js.Function1[Any, Any], js.Function1[Any, Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ /* fbc */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, D, B> */ Any
        ]
    ): Self = StObject.set(x, "promap", js.Any.fromFunction2(value))
  }
}
