package typings.fpTs.pipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableExtend[F]
  extends StObject
     with PipeableFunctor[F] {
  
  def duplicate[A](
    wa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any
  ): js.Any
  
  def extend[A, B](
    f: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* wa */ js.Any, 
      B
    ]
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* wa */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
  ]
}
object PipeableExtend {
  
  @scala.inline
  def apply[F](
    duplicate: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any => js.Any,
    extend: js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* wa */ js.Any, 
      js.Any
    ] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* wa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
    ],
    map: js.Function1[js.Any, js.Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
    ]
  ): PipeableExtend[F] = {
    val __obj = js.Dynamic.literal(duplicate = js.Any.fromFunction1(duplicate), extend = js.Any.fromFunction1(extend), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[PipeableExtend[F]]
  }
  
  @scala.inline
  implicit class PipeableExtendMutableBuilder[Self <: PipeableExtend[?], F] (val x: Self & PipeableExtend[F]) extends AnyVal {
    
    @scala.inline
    def setDuplicate(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ js.Any => js.Any
    ): Self = StObject.set(x, "duplicate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(
      value: js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* wa */ js.Any, 
          js.Any
        ] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* wa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ js.Any
        ]
    ): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
  }
}
