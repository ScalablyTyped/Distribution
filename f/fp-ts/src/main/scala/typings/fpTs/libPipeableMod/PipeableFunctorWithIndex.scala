package typings.fpTs.libPipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableFunctorWithIndex[F, I]
  extends StObject
     with PipeableFunctor[F] {
  
  def mapWithIndex[A, B](f: js.Function2[/* i */ I, /* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
  ]
}
object PipeableFunctorWithIndex {
  
  inline def apply[F, I](
    map: js.Function1[Any, Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ],
    mapWithIndex: js.Function2[/* i */ I, Any, Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
    ]
  ): PipeableFunctorWithIndex[F, I] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), mapWithIndex = js.Any.fromFunction1(mapWithIndex))
    __obj.asInstanceOf[PipeableFunctorWithIndex[F, I]]
  }
  
  extension [Self <: PipeableFunctorWithIndex[?, ?], F, I](x: Self & (PipeableFunctorWithIndex[F, I])) {
    
    inline def setMapWithIndex(
      value: js.Function2[/* i */ I, Any, Any] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ /* fa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ]
    ): Self = StObject.set(x, "mapWithIndex", js.Any.fromFunction1(value))
  }
}
