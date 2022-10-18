package typings.fpTs.libPipeableMod

import typings.fpTs.libSeparatedMod.Separated_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableCompactable3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E] extends StObject {
  
  def compact[R, A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any
  ): Any
  
  def separate[R, A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<A, B>> */ Any
  ): Separated_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
  ]
}
object PipeableCompactable3C {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](
    compact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any => Any,
    separate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<A, B>> */ Any => Separated_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ): PipeableCompactable3C[F, E] = {
    val __obj = js.Dynamic.literal(compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
    __obj.asInstanceOf[PipeableCompactable3C[F, E]]
  }
  
  extension [Self <: PipeableCompactable3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (PipeableCompactable3C[F, E])) {
    
    inline def setCompact(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Option<A>> */ Any => Any
    ): Self = StObject.set(x, "compact", js.Any.fromFunction1(value))
    
    inline def setSeparate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, Either<A, B>> */ Any => Separated_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ]
    ): Self = StObject.set(x, "separate", js.Any.fromFunction1(value))
  }
}
