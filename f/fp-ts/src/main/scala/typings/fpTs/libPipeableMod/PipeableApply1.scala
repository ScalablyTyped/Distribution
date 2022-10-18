package typings.fpTs.libPipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableApply1[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */]
  extends StObject
     with PipeableFunctor1[F] {
  
  def ap[A](
    fa: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ /* fab */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
  ]
  
  def apFirst[B](
    fb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
  ]
  
  def apSecond[B](
    fb: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
  ]
}
object PipeableApply1 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
    ap: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ /* fab */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ],
    apFirst: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
    ],
    apSecond: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ],
    map: js.Function1[Any, Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
    ]
  ): PipeableApply1[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction1(ap), apFirst = js.Any.fromFunction1(apFirst), apSecond = js.Any.fromFunction1(apSecond), map = js.Any.fromFunction1(map))
    __obj.asInstanceOf[PipeableApply1[F]]
  }
  
  extension [Self <: PipeableApply1[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & PipeableApply1[F]) {
    
    inline def setAp(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ /* fab */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ]
    ): Self = StObject.set(x, "ap", js.Any.fromFunction1(value))
    
    inline def setApFirst(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
        ]
    ): Self = StObject.set(x, "apFirst", js.Any.fromFunction1(value))
    
    inline def setApSecond(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ /* fa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ]
    ): Self = StObject.set(x, "apSecond", js.Any.fromFunction1(value))
  }
}
