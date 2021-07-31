package typings.fpTs.pipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableExtend4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */]
  extends StObject
     with PipeableFunctor4[F] {
  
  def duplicate[S, R, E, A](
    wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any
  ): js.Any
  
  def extend[S, R, E, A, B](
    f: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* wa */ js.Any, 
      B
    ]
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* wa */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
  ]
}
object PipeableExtend4 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */](
    duplicate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any => js.Any,
    extend: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* wa */ js.Any, 
      js.Any
    ] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* wa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
    ]
  ): PipeableExtend4[F] = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction1(duplicate), extend = js.Any.fromFunction1(extend), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[PipeableExtend4[F]]
  }
  
  @scala.inline
  implicit class PipeableExtend4MutableBuilder[Self <: PipeableExtend4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */] (val x: Self & PipeableExtend4[F]) extends AnyVal {
    
    @scala.inline
    def setDuplicate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ js.Any => js.Any
    ): Self = StObject.set(x, "duplicate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(
      value: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* wa */ js.Any, 
          js.Any
        ] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ js.Any
        ]
    ): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
  }
}
