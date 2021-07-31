package typings.fpTs.pipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableFunctorWithIndex2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, I, E]
  extends StObject
     with PipeableFunctor2C[F, E] {
  
  def mapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
  ]
}
object PipeableFunctorWithIndex2C {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, I, E](
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ],
    mapWithIndex: js.Function2[/* i */ I, js.Any, js.Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ]
  ): PipeableFunctorWithIndex2C[F, I, E] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), mapWithIndex = js.Any.fromFunction1(mapWithIndex))
    __obj.asInstanceOf[PipeableFunctorWithIndex2C[F, I, E]]
  }
  
  @scala.inline
  implicit class PipeableFunctorWithIndex2CMutableBuilder[Self <: PipeableFunctorWithIndex2C[?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, I, E] (val x: Self & (PipeableFunctorWithIndex2C[F, I, E])) extends AnyVal {
    
    @scala.inline
    def setMapWithIndex(
      value: js.Function2[/* i */ I, js.Any, js.Any] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ]
    ): Self = StObject.set(x, "mapWithIndex", js.Any.fromFunction1(value))
  }
}
