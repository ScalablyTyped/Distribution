package typings.fpTs.pipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableProfunctor3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E]
  extends StObject
     with PipeableFunctor3C[F, E] {
  
  def promap[R, A, D, B](f: js.Function1[/* d */ D, E], g: js.Function1[/* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, D, B> */ js.Any
  ]
}
object PipeableProfunctor3C {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
    ],
    promap: (js.Function1[js.Any, E], js.Function1[js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fbc */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, D, B> */ js.Any
    ]
  ): PipeableProfunctor3C[F, E] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), promap = js.Any.fromFunction2(promap))
    __obj.asInstanceOf[PipeableProfunctor3C[F, E]]
  }
  
  @scala.inline
  implicit class PipeableProfunctor3CMutableBuilder[Self <: PipeableProfunctor3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E] (val x: Self & (PipeableProfunctor3C[F, E])) extends AnyVal {
    
    @scala.inline
    def setPromap(
      value: (js.Function1[js.Any, E], js.Function1[js.Any, js.Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fbc */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, D, B> */ js.Any
        ]
    ): Self = StObject.set(x, "promap", js.Any.fromFunction2(value))
  }
}
