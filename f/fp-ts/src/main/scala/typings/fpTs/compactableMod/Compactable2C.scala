package typings.fpTs.compactableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compactable2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] extends StObject {
  
  val URI: F
  
  val _E: E
  
  def compact[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ js.Any
  ): js.Any
  
  def separate[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ js.Any
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
  ]
}
object Compactable2C {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E](
    URI: F,
    _E: E,
    compact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Option<A>> */ js.Any => js.Any,
    separate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, Either<A, B>> */ js.Any => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ]
  ): Compactable2C[F, E] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
    __obj.asInstanceOf[Compactable2C[F, E]]
  }
  
  @scala.inline
  implicit class Compactable2CMutableBuilder[Self <: Compactable2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */, E] (val x: Self & (Compactable2C[F, E])) extends AnyVal {
    
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
    
    @scala.inline
    def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
  }
}
