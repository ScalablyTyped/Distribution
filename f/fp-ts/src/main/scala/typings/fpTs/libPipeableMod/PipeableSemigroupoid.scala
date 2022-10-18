package typings.fpTs.libPipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableSemigroupoid[F] extends StObject {
  
  def compose[E, A](
    la: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* ab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, B> */ Any
  ]
}
object PipeableSemigroupoid {
  
  inline def apply[F](
    compose: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* ab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, B> */ Any
    ]
  ): PipeableSemigroupoid[F] = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose))
    __obj.asInstanceOf[PipeableSemigroupoid[F]]
  }
  
  extension [Self <: PipeableSemigroupoid[?], F](x: Self & PipeableSemigroupoid[F]) {
    
    inline def setCompose(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ /* ab */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, B> */ Any
        ]
    ): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
  }
}
