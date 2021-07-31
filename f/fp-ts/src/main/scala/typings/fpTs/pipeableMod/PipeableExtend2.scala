package typings.fpTs.pipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableExtend2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */]
  extends StObject
     with PipeableFunctor2[F] {
  
  def duplicate[E, A](
    wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any
  ): js.Any
  
  def extend[E, A, B](
    f: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* wa */ js.Any, 
      B
    ]
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* wa */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
  ]
}
object PipeableExtend2 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](
    duplicate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any => js.Any,
    extend: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* wa */ js.Any, 
      js.Any
    ] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* wa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
    ]
  ): PipeableExtend2[F] = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction1(duplicate), extend = js.Any.fromFunction1(extend), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[PipeableExtend2[F]]
  }
  
  @scala.inline
  implicit class PipeableExtend2MutableBuilder[Self <: PipeableExtend2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */] (val x: Self & PipeableExtend2[F]) extends AnyVal {
    
    @scala.inline
    def setDuplicate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ js.Any => js.Any
    ): Self = StObject.set(x, "duplicate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(
      value: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* wa */ js.Any, 
          js.Any
        ] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ js.Any
        ]
    ): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
  }
}
