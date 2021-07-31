package typings.fpTs.pipeableMod

import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableFoldableWithIndex4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */, I]
  extends StObject
     with PipeableFoldable4[F] {
  
  def foldMapWithIndex[M](M: Monoid[M]): js.Function1[
    /* f */ js.Function2[/* i */ I, /* a */ js.Any, M], 
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
      M
    ]
  ]
  
  def reduceRightWithIndex[A, B](b: B, f: js.Function3[/* i */ I, /* a */ A, /* b */ B, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
    B
  ]
  
  def reduceWithIndex[A, B](b: B, f: js.Function3[/* i */ I, /* b */ B, /* a */ A, B]): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
    B
  ]
}
object PipeableFoldableWithIndex4 {
  
  @scala.inline
  def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */, I](
    foldMap: Monoid[js.Any] => js.Function1[
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
        js.Any
      ]
    ],
    foldMapWithIndex: Monoid[js.Any] => js.Function1[
      /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
      js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
        js.Any
      ]
    ],
    reduce: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
      js.Any
    ],
    reduceRight: (js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
      js.Any
    ],
    reduceRightWithIndex: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
      js.Any
    ],
    reduceWithIndex: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
      js.Any
    ]
  ): PipeableFoldableWithIndex4[F, I] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), reduce = js.Any.fromFunction2(reduce), reduceRight = js.Any.fromFunction2(reduceRight), reduceRightWithIndex = js.Any.fromFunction2(reduceRightWithIndex), reduceWithIndex = js.Any.fromFunction2(reduceWithIndex))
    __obj.asInstanceOf[PipeableFoldableWithIndex4[F, I]]
  }
  
  @scala.inline
  implicit class PipeableFoldableWithIndex4MutableBuilder[Self <: PipeableFoldableWithIndex4[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ js.Any */, I] (val x: Self & (PipeableFoldableWithIndex4[F, I])) extends AnyVal {
    
    @scala.inline
    def setFoldMapWithIndex(
      value: Monoid[js.Any] => js.Function1[
          /* f */ js.Function2[/* i */ I, /* a */ js.Any, js.Any], 
          js.Function1[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
            js.Any
          ]
        ]
    ): Self = StObject.set(x, "foldMapWithIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReduceRightWithIndex(
      value: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
          js.Any
        ]
    ): Self = StObject.set(x, "reduceRightWithIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReduceWithIndex(
      value: (js.Any, js.Function3[/* i */ I, js.Any, js.Any, js.Any]) => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ /* fa */ js.Any, 
          js.Any
        ]
    ): Self = StObject.set(x, "reduceWithIndex", js.Any.fromFunction2(value))
  }
}
