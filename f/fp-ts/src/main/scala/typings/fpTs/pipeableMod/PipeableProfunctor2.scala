package typings.fpTs.pipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableProfunctor2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
  extends StObject
     with PipeableFunctor2[F] {
  
  def promap[E, A, D, B](f: js.Function1[/* d */ D, E], g: js.Function1[/* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fbc */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, D, B> */ js.Any
  ]
}
object PipeableProfunctor2 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ],
    promap: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fbc */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, D, B> */ js.Any
    ]
  ): PipeableProfunctor2[F] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), promap = js.Any.fromFunction2(promap))
    __obj.asInstanceOf[PipeableProfunctor2[F]]
  }
  
  @scala.inline
  implicit class PipeableProfunctor2MutableBuilder[Self <: PipeableProfunctor2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & PipeableProfunctor2[F]) extends AnyVal {
    
    @scala.inline
    def setPromap(
      value: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fbc */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, D, B> */ js.Any
        ]
    ): Self = StObject.set(x, "promap", js.Any.fromFunction2(value))
  }
}
