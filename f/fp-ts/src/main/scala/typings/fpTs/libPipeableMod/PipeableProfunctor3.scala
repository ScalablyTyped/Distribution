package typings.fpTs.libPipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableProfunctor3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */]
  extends StObject
     with PipeableFunctor3[F] {
  
  def promap[R, E, A, D, B](f: js.Function1[/* d */ D, E], g: js.Function1[/* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, D, B> */ Any
  ]
}
object PipeableProfunctor3 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
    map: js.Function1[Any, Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ],
    promap: (js.Function1[Any, Any], js.Function1[Any, Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fbc */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, D, B> */ Any
    ]
  ): PipeableProfunctor3[F] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), promap = js.Any.fromFunction2(promap))
    __obj.asInstanceOf[PipeableProfunctor3[F]]
  }
  
  extension [Self <: PipeableProfunctor3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & PipeableProfunctor3[F]) {
    
    inline def setPromap(
      value: (js.Function1[Any, Any], js.Function1[Any, Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fbc */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, D, B> */ Any
        ]
    ): Self = StObject.set(x, "promap", js.Any.fromFunction2(value))
  }
}
