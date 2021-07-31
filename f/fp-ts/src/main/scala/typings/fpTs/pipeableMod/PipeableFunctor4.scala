package typings.fpTs.pipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableFunctor4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */] extends StObject {
  
  def map[A, B](f: js.Function1[/* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
  ]
}
object PipeableFunctor4 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
    ]
  ): PipeableFunctor4[F] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[PipeableFunctor4[F]]
  }
  
  @scala.inline
  implicit class PipeableFunctor4MutableBuilder[Self <: PipeableFunctor4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */] (val x: Self & PipeableFunctor4[F]) extends AnyVal {
    
    @scala.inline
    def setMap(
      value: js.Function1[js.Any, js.Any] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
        ]
    ): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
  }
}
