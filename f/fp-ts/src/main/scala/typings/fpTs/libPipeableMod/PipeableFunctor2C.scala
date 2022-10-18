package typings.fpTs.libPipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableFunctor2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
  
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
  ]
}
object PipeableFunctor2C {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
    map: js.Function1[Any, Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ]
  ): PipeableFunctor2C[F, E] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[PipeableFunctor2C[F, E]]
  }
  
  extension [Self <: PipeableFunctor2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (PipeableFunctor2C[F, E])) {
    
    inline def setMap(
      value: js.Function1[Any, Any] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ]
    ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
  }
}
