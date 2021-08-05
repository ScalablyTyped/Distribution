package typings.fpTs.pipeableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableBifunctor3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E] extends StObject {
  
  def bimap[G, A, B](f: js.Function1[/* e */ E, G], g: js.Function1[/* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, G, B> */ js.Any
  ]
  
  def mapLeft[G](f: js.Function1[/* e */ E, G]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, G, A> */ js.Any
  ]
}
object PipeableBifunctor3C {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](
    bimap: (js.Function1[/* e */ E, js.Any], js.Function1[js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, G, B> */ js.Any
    ],
    mapLeft: js.Function1[/* e */ E, js.Any] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, G, A> */ js.Any
    ]
  ): PipeableBifunctor3C[F, E] = {
    val __obj = js.Dynamic.literal(bimap = js.Any.fromFunction2(bimap), mapLeft = js.Any.fromFunction1(mapLeft))
    __obj.asInstanceOf[PipeableBifunctor3C[F, E]]
  }
  
  extension [Self <: PipeableBifunctor3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ js.Any */, E](x: Self & (PipeableBifunctor3C[F, E])) {
    
    inline def setBimap(
      value: (js.Function1[/* e */ E, js.Any], js.Function1[js.Any, js.Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, G, B> */ js.Any
        ]
    ): Self = StObject.set(x, "bimap", js.Any.fromFunction2(value))
    
    inline def setMapLeft(
      value: js.Function1[/* e */ E, js.Any] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, G, A> */ js.Any
        ]
    ): Self = StObject.set(x, "mapLeft", js.Any.fromFunction1(value))
  }
}
