package typings.fpTs.compactableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compactable[F] extends StObject {
  
  val URI: F
  
  /**
    * Compacts a data structure unwrapping inner Option
    */
  def compact[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ js.Any
  ): js.Any
  
  /**
    * Separates a data structure moving inner Left to the left side and inner Right to the right side of Separated
    */
  def separate[A, B](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<A, B>> */ js.Any
  ): Separated[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
  ]
}
object Compactable {
  
  @scala.inline
  def apply[F](
    URI: F,
    compact: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ js.Any => js.Any,
    separate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<A, B>> */ js.Any => Separated[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
    ]
  ): Compactable[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), separate = js.Any.fromFunction1(separate))
    __obj.asInstanceOf[Compactable[F]]
  }
  
  @scala.inline
  implicit class CompactableMutableBuilder[Self <: Compactable[?], F] (val x: Self & Compactable[F]) extends AnyVal {
    
    @scala.inline
    def setCompact(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Option<A>> */ js.Any => js.Any
    ): Self = StObject.set(x, "compact", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSeparate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, Either<A, B>> */ js.Any => Separated[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ]
    ): Self = StObject.set(x, "separate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
  }
}
