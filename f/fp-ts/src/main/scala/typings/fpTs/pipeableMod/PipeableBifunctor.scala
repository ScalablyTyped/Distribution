package typings.fpTs.pipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableBifunctor[F] extends StObject {
  
  def bimap[E, G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ /* fa */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, G, B> */ js.Any
  ]
  
  def mapLeft[E, G](f: js.Function1[/* e */ E, G]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ /* fa */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, G, A> */ js.Any
  ]
}
object PipeableBifunctor {
  
  inline def apply[F](
    bimap: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, G, B> */ js.Any
    ],
    mapLeft: js.Function1[js.Any, js.Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, G, A> */ js.Any
    ]
  ): PipeableBifunctor[F] = {
    val __obj = js.Dynamic.literal(bimap = js.Any.fromFunction2(bimap), mapLeft = js.Any.fromFunction1(mapLeft))
    __obj.asInstanceOf[PipeableBifunctor[F]]
  }
  
  extension [Self <: PipeableBifunctor[?], F](x: Self & PipeableBifunctor[F]) {
    
    inline def setBimap(
      value: (js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ /* fa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, G, B> */ js.Any
        ]
    ): Self = StObject.set(x, "bimap", js.Any.fromFunction2(value))
    
    inline def setMapLeft(
      value: js.Function1[js.Any, js.Any] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ /* fa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, G, A> */ js.Any
        ]
    ): Self = StObject.set(x, "mapLeft", js.Any.fromFunction1(value))
  }
}
