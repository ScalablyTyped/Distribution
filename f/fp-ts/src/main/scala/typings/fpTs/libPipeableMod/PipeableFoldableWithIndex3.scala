package typings.fpTs.libPipeableMod

import typings.fpTs.libMonoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableFoldableWithIndex3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, I]
  extends StObject
     with PipeableFoldable3[F] {
  
  def foldMapWithIndex[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function2[/* i */ I, /* a */ Any, M], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      M
    ]
  ]
  
  def reduceRightWithIndex[A, B](b: B, f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
    B
  ]
  
  def reduceWithIndex[A, B](b: B, f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
    B
  ]
}
object PipeableFoldableWithIndex3 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, I](
    foldMap: Monoid[Any] => js.Function1[
      /* f */ js.Function1[/* a */ Any, Any], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
        Any
      ]
    ],
    foldMapWithIndex: Monoid[Any] => js.Function1[
      /* f */ js.Function2[/* i */ I, /* a */ Any, Any], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
        Any
      ]
    ],
    reduce: (Any, js.Function2[Any, Any, Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      Any
    ],
    reduceRight: (Any, js.Function2[Any, Any, Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      Any
    ],
    reduceRightWithIndex: (Any, js.Function3[/* i */ I, Any, Any, Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      Any
    ],
    reduceWithIndex: (Any, js.Function3[/* i */ I, Any, Any, Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
      Any
    ]
  ): PipeableFoldableWithIndex3[F, I] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), reduce = js.Any.fromFunction2(reduce), reduceRight = js.Any.fromFunction2(reduceRight), reduceRightWithIndex = js.Any.fromFunction2(reduceRightWithIndex), reduceWithIndex = js.Any.fromFunction2(reduceWithIndex))
    __obj.asInstanceOf[PipeableFoldableWithIndex3[F, I]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeableFoldableWithIndex3[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, I] (val x: Self & (PipeableFoldableWithIndex3[F, I])) extends AnyVal {
    
    inline def setFoldMapWithIndex(
      value: Monoid[Any] => js.Function1[
          /* f */ js.Function2[/* i */ I, /* a */ Any, Any], 
          js.Function1[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
            Any
          ]
        ]
    ): Self = StObject.set(x, "foldMapWithIndex", js.Any.fromFunction1(value))
    
    inline def setReduceRightWithIndex(
      value: (Any, js.Function3[/* i */ I, Any, Any, Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
          Any
        ]
    ): Self = StObject.set(x, "reduceRightWithIndex", js.Any.fromFunction2(value))
    
    inline def setReduceWithIndex(
      value: (Any, js.Function3[/* i */ I, Any, Any, Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ /* fa */ Any, 
          Any
        ]
    ): Self = StObject.set(x, "reduceWithIndex", js.Any.fromFunction2(value))
  }
}
