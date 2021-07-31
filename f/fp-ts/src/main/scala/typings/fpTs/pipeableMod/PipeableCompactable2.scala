package typings.fpTs.pipeableMod

import typings.fpTs.compactableMod.Separated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableCompactable2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] extends StObject {
  
  def compact[E, A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ js.Any
  ): js.Any
  
  def separate[E, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ js.Any
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
  ]
}
object PipeableCompactable2 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
    compact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ js.Any => js.Any,
    separate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ js.Any => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ]
  ): PipeableCompactable2[F] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
    __obj.asInstanceOf[PipeableCompactable2[F]]
  }
  
  @scala.inline
  implicit class PipeableCompactable2MutableBuilder[Self <: PipeableCompactable2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & PipeableCompactable2[F]) extends AnyVal {
    
    @scala.inline
    def setCompact(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ js.Any => js.Any
    ): Self = StObject.set(x, "compact", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeparate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ js.Any => Separated[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ]
    ): Self = StObject.set(x, "separate", js.Any.fromFunction1(value))
  }
}
