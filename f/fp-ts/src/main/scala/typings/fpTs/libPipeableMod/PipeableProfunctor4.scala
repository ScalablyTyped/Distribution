package typings.fpTs.libPipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableProfunctor4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */]
  extends StObject
     with PipeableFunctor4[F] {
  
  def promap[S, R, E, A, D, B](f: js.Function1[/* d */ D, E], g: js.Function1[/* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fbc */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, D, B> */ Any
  ]
}
object PipeableProfunctor4 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](
    map: js.Function1[Any, Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
    ],
    promap: (js.Function1[Any, Any], js.Function1[Any, Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fbc */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, D, B> */ Any
    ]
  ): PipeableProfunctor4[F] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), promap = js.Any.fromFunction2(promap))
    __obj.asInstanceOf[PipeableProfunctor4[F]]
  }
  
  extension [Self <: PipeableProfunctor4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](x: Self & PipeableProfunctor4[F]) {
    
    inline def setPromap(
      value: (js.Function1[Any, Any], js.Function1[Any, Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fbc */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, D, B> */ Any
        ]
    ): Self = StObject.set(x, "promap", js.Any.fromFunction2(value))
  }
}
