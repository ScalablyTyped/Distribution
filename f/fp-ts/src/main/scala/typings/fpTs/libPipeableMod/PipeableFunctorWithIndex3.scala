package typings.fpTs.libPipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableFunctorWithIndex3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, I]
  extends StObject
     with PipeableFunctor3[F] {
  
  def mapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
  ]
}
object PipeableFunctorWithIndex3 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, I](
    map: js.Function1[Any, Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ],
    mapWithIndex: js.Function2[/* i */ I, Any, Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
    ]
  ): PipeableFunctorWithIndex3[F, I] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), mapWithIndex = js.Any.fromFunction1(mapWithIndex))
    __obj.asInstanceOf[PipeableFunctorWithIndex3[F, I]]
  }
  
  extension [Self <: PipeableFunctorWithIndex3[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, I](x: Self & (PipeableFunctorWithIndex3[F, I])) {
    
    inline def setMapWithIndex(
      value: js.Function2[/* i */ I, Any, Any] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ]
    ): Self = StObject.set(x, "mapWithIndex", js.Any.fromFunction1(value))
  }
}
