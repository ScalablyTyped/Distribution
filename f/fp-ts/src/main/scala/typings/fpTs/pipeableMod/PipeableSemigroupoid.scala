package typings.fpTs.pipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableSemigroupoid[F] extends StObject {
  
  def compose[E, A](
    la: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ js.Any
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* ab */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, B> */ js.Any
  ]
}
object PipeableSemigroupoid {
  
  @scala.inline
  def apply[F](
    compose: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ js.Any => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* ab */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, B> */ js.Any
    ]
  ): PipeableSemigroupoid[F] = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
    __obj.asInstanceOf[PipeableSemigroupoid[F]]
  }
  
  @scala.inline
  implicit class PipeableSemigroupoidMutableBuilder[Self <: PipeableSemigroupoid[?], F] (val x: Self & PipeableSemigroupoid[F]) extends AnyVal {
    
    @scala.inline
    def setCompose(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ js.Any => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* ab */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, B> */ js.Any
        ]
    ): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
  }
}
