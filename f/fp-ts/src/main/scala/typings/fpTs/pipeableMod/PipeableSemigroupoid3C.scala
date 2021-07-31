package typings.fpTs.pipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableSemigroupoid3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E] extends StObject {
  
  def compose[R, A](
    la: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* ab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
  ]
}
object PipeableSemigroupoid3C {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](
    compose: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* ab */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
    ]
  ): PipeableSemigroupoid3C[F, E] = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
    __obj.asInstanceOf[PipeableSemigroupoid3C[F, E]]
  }
  
  @scala.inline
  implicit class PipeableSemigroupoid3CMutableBuilder[Self <: PipeableSemigroupoid3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E] (val x: Self & (PipeableSemigroupoid3C[F, E])) extends AnyVal {
    
    @scala.inline
    def setCompose(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ js.Any => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ /* ab */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ js.Any
        ]
    ): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
  }
}
