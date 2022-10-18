package typings.fpTs.libPipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableFunctorWithIndex2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I, E]
  extends StObject
     with PipeableFunctor2C[F, E] {
  
  def mapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
  ]
}
object PipeableFunctorWithIndex2C {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I, E](
    map: js.Function1[Any, Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ],
    mapWithIndex: js.Function2[/* i */ I, Any, Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
    ]
  ): PipeableFunctorWithIndex2C[F, I, E] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), mapWithIndex = js.Any.fromFunction1(mapWithIndex))
    __obj.asInstanceOf[PipeableFunctorWithIndex2C[F, I, E]]
  }
  
  extension [Self <: PipeableFunctorWithIndex2C[?, ?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, I, E](x: Self & (PipeableFunctorWithIndex2C[F, I, E])) {
    
    inline def setMapWithIndex(
      value: js.Function2[/* i */ I, Any, Any] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ]
    ): Self = StObject.set(x, "mapWithIndex", js.Any.fromFunction1(value))
  }
}
